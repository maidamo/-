package weaver.interfaces.zb.oa.zt.service;

import weaver.interfaces.zb.oa.zt.bill.FranchiseeChangeApplicationBill;
import weaver.interfaces.zb.oa.zt.bill.FranchiseeChangeApplicationDto2;
import weaver.interfaces.zb.oa.zt.dao.BaseDao;
import weaver.interfaces.zb.oa.zt.dao.FranchiseeChangeApplicationDao;
import weaver.interfaces.zb.zt.dto.ZTStoreCopyBill;
import weaver.interfaces.zb.zt.dto.ZTStoreCopyDto;
import weaver.interfaces.zb.zt.service.ZTService;

import java.util.ArrayList;
import java.util.List;

public class StoreCopyOptimizationService {

    FranchiseeChangeApplicationDao franchiseeChangeApplicationDao = new FranchiseeChangeApplicationDao();

    public void exec(String requestid, String tableName) throws Exception {
        FranchiseeChangeApplicationBill franchiseeChangeApplicationBill = franchiseeChangeApplicationDao.getFranchiseeChangeApplicationBill(requestid, tableName);
        List<FranchiseeChangeApplicationDto2> list=franchiseeChangeApplicationDao.getFranchiseeChangeApplicationDto2(franchiseeChangeApplicationBill.getId(),tableName);
        ZTStoreCopyBill ztStoreCopyBill=getZTStoreCopyBill(franchiseeChangeApplicationBill);
        List<ZTStoreCopyDto> ztStoreCopyDtoList=getZTStoreCopyDto(list);
        ztStoreCopyBill.setData(ztStoreCopyDtoList);
        ZTService ztService=new ZTService();
        boolean isSuccess=ztService.storeCopy(ztStoreCopyBill);
        if(isSuccess){
            FranchiseeInformationService franchiseeInformationService=new FranchiseeInformationService();
            StoreInformationService storeInformationService=new StoreInformationService();
            BaseDao baseDao=new BaseDao();
            String oldFNumber=franchiseeChangeApplicationBill.getJmsfm();
            if(!"".equals(oldFNumber)){
                franchiseeInformationService.exec(oldFNumber);
                String oldcustAccountId = baseDao.getCustAccountId(oldFNumber);
                if (!"".equals(oldcustAccountId)) {
                    List<String> oldaccountSiteId = baseDao.getAccountSiteId(oldcustAccountId);
                    for (String str : oldaccountSiteId) {
                        CategoryInformationService categoryInformationService = new CategoryInformationService();
                        categoryInformationService.exec(str);
                    }
                    List<String> oldshopId = baseDao.getShopId(oldcustAccountId);

                    storeInformationService.exec(oldshopId);
                }
            }
        }
    }

    public ZTStoreCopyBill getZTStoreCopyBill(FranchiseeChangeApplicationBill franchiseeChangeApplicationBill){
        ZTStoreCopyBill ztStoreCopyBill=new ZTStoreCopyBill();
        ztStoreCopyBill.setOldAccountNumber(franchiseeChangeApplicationBill.getBgjmsfm());
        ztStoreCopyBill.setAccountNumber(franchiseeChangeApplicationBill.getJmsfm());
        ztStoreCopyBill.setRelevance("4");
        ztStoreCopyBill.setUnitId(franchiseeChangeApplicationBill.getPl());
        return ztStoreCopyBill;
    }

    public List<ZTStoreCopyDto> getZTStoreCopyDto(List<FranchiseeChangeApplicationDto2> list){
        List<ZTStoreCopyDto> list1=new ArrayList<>();
        for(FranchiseeChangeApplicationDto2 franchiseeChangeApplicationDto2:list){
            ZTStoreCopyDto ztStoreCopyDto=new ZTStoreCopyDto();
            ztStoreCopyDto.setOperationStatus(franchiseeChangeApplicationDto2.getTjdzzt());
            ztStoreCopyDto.setShopId(franchiseeChangeApplicationDto2.getDmmc());
            list1.add(ztStoreCopyDto);
        }
        return list1;
    }
}
