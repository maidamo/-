package weaver.interfaces.zb.oa.zt.service;

import weaver.interfaces.zb.oa.zt.bill.FranchiseeAreaEditDtEntity;
import weaver.interfaces.zb.oa.zt.dao.BaseDao;
import weaver.interfaces.zb.oa.zt.dao.FranchiseeAreaEditDao;
import weaver.interfaces.zb.zt.dto.ZTCategoryEditBill;
import weaver.interfaces.zb.zt.service.ZTService;

import java.util.List;

public class FranchiseeAreaEditServcie {

    BaseDao baseDao=new BaseDao();

    FranchiseeAreaEditDao franchiseeAreaEditDao=new FranchiseeAreaEditDao();

    public void exec(String requestid,String tableName) throws Exception {
        ZTService ztService=new ZTService();
        String mainId=baseDao.getMainId(tableName,requestid);
        System.out.println("主表id为: "+mainId);
        List<FranchiseeAreaEditDtEntity> list=franchiseeAreaEditDao.getFranchiseeAreaEditDtMes(mainId,tableName+"_dt1");
        for(FranchiseeAreaEditDtEntity franchiseeAreaEditDtEntity:list){
            ZTCategoryEditBill ztCategoryEditBill=getZTCategoryEditBill(franchiseeAreaEditDtEntity);
            boolean isSuccess=ztService.categoryEdit(ztCategoryEditBill);
            if(isSuccess){
                CategoryInformationService categoryInformationService=new CategoryInformationService();
                String accoutSiteId=franchiseeAreaEditDtEntity.getAccountSiteId();
                categoryInformationService.exec(accoutSiteId);
                String FNumber=franchiseeAreaEditDtEntity.getAccountNumber();//F码
                String custAccountId=baseDao.getCustAccountId(FNumber);
                if(!"".equals(custAccountId)){
                    FranchiseeInformationService franchiseeInformationService=new FranchiseeInformationService();
                    franchiseeInformationService.exec(FNumber);
                    List<String> shopId=baseDao.getShopId(custAccountId);
                    StoreInformationService storeInformationService=new StoreInformationService();
                    storeInformationService.exec(shopId);

                    List<String> accountSiteId=baseDao.getAccountSiteId(custAccountId);
                    for(String str:accountSiteId){
                        String oldAccountNumber=baseDao.getOldAccountNumber(str);
                        boolean isSuccess0=baseDao.updateOldAccountNumber(oldAccountNumber,str);
                        System.out.println("跟新建模品类oldAccountNumber是否成功: "+isSuccess0);
                    }
                }
            }
        }
    }
    public ZTCategoryEditBill getZTCategoryEditBill(FranchiseeAreaEditDtEntity franchiseeAreaEditDtEntity) throws Exception {
        ZTCategoryEditBill ztCategoryEditBill=new ZTCategoryEditBill();
        ztCategoryEditBill.setCustAccountId(franchiseeAreaEditDtEntity.getXzzrkh());
        ztCategoryEditBill.setAccountName(franchiseeAreaEditDtEntity.getAccountName());
        ztCategoryEditBill.setAccountShortName(franchiseeAreaEditDtEntity.getAccountShortName999());
        ztCategoryEditBill.setAccountSiteId(franchiseeAreaEditDtEntity.getAccountSiteId());
        ztCategoryEditBill.setUnitId(franchiseeAreaEditDtEntity.getUnitId());
        ztCategoryEditBill.setCurrencyCode(franchiseeAreaEditDtEntity.getCurrencyCode());
        ztCategoryEditBill.setCountry(franchiseeAreaEditDtEntity.getCountry());
        ztCategoryEditBill.setProvince(franchiseeAreaEditDtEntity.getProvince());
        ztCategoryEditBill.setCity(franchiseeAreaEditDtEntity.getCity());
        ztCategoryEditBill.setCounty(franchiseeAreaEditDtEntity.getCounty());
        if(!"".equals(franchiseeAreaEditDtEntity.getJoinDate())){
            ztCategoryEditBill.setJoinDate(franchiseeAreaEditDtEntity.getJoinDate()+" 00:00:00");
        }
        if(!"".equals(franchiseeAreaEditDtEntity.getRECORD_DATE())){
            ztCategoryEditBill.setRecordDate(franchiseeAreaEditDtEntity.getRECORD_DATE()+" 00:00:00");
        }
        ztCategoryEditBill.setCreditAmount(franchiseeAreaEditDtEntity.getCreditAmount());
        ztCategoryEditBill.setOperationStatus(franchiseeAreaEditDtEntity.getOperationStatus());
        ztCategoryEditBill.setCreditMode(franchiseeAreaEditDtEntity.getCreditMode());
        ztCategoryEditBill.setAccountNumber(franchiseeAreaEditDtEntity.getAccountNumber());
        ztCategoryEditBill.setProvinceName(franchiseeAreaEditDtEntity.getProvinceName());
        ztCategoryEditBill.setCityName(franchiseeAreaEditDtEntity.getCityName());
        ztCategoryEditBill.setCountyName(franchiseeAreaEditDtEntity.getCountyName());
        ztCategoryEditBill.setMergingArea(franchiseeAreaEditDtEntity.getProvinceName()+"/"+franchiseeAreaEditDtEntity.getCityName()+"/"+franchiseeAreaEditDtEntity.getCountyName());
        ztCategoryEditBill.setRelevance("1");
        if(!"".equals(franchiseeAreaEditDtEntity.getYxqy())){
            String ztTerritory=baseDao.getTerritoryId(franchiseeAreaEditDtEntity.getYxqy());
            if("".equals(ztTerritory)){
                throw new Exception("营销区域转换异常!");
            }else{
                ztCategoryEditBill.setTerritoryId(ztTerritory);
            }
        }

        ztCategoryEditBill.setOldAccountNumber(franchiseeAreaEditDtEntity.getOldAccountNumber());

        ztCategoryEditBill.setAuthorizationNo(franchiseeAreaEditDtEntity.getSqh());
        ztCategoryEditBill.setShipToAddress(franchiseeAreaEditDtEntity.getShdz());
        ztCategoryEditBill.setShipToPerson(franchiseeAreaEditDtEntity.getShr());
        ztCategoryEditBill.setShipToPhone(franchiseeAreaEditDtEntity.getLxdh());
        ztCategoryEditBill.setBankAccountName(franchiseeAreaEditDtEntity.getKhyx());
        ztCategoryEditBill.setBankBranchName(franchiseeAreaEditDtEntity.getYxfx());
        ztCategoryEditBill.setBankAccountNum(franchiseeAreaEditDtEntity.getYxzh());
        ztCategoryEditBill.setSiteCode(franchiseeAreaEditDtEntity.getKhlx());
        if(!"".equals(franchiseeAreaEditDtEntity.getDzkssj())){
            ztCategoryEditBill.setAdjustStartDate(franchiseeAreaEditDtEntity.getDzkssj()+" 00:00:00");
        }
        if(!"".equals(franchiseeAreaEditDtEntity.getDzjssj())){
            ztCategoryEditBill.setAdjustEndDate(franchiseeAreaEditDtEntity.getDzjssj()+" 00:00:00");
        }
        ztCategoryEditBill.setStatisticsAdjust(franchiseeAreaEditDtEntity.getTjdz());
        ztCategoryEditBill.setRealEstateRanking(franchiseeAreaEditDtEntity.getDcbqpm());
        ztCategoryEditBill.setTown(franchiseeAreaEditDtEntity.getZ());
        ztCategoryEditBill.setRecordNumber(franchiseeAreaEditDtEntity.getDabh());
        ztCategoryEditBill.setPropertyStrategy(franchiseeAreaEditDtEntity.getSsdczl());
        ztCategoryEditBill.setIsEliminate(franchiseeAreaEditDtEntity.getIS_ELIMINATE());
        ztCategoryEditBill.setCityAddress(franchiseeAreaEditDtEntity.getCITY_ADDRESS());
        ztCategoryEditBill.setSourceType(franchiseeAreaEditDtEntity.getSOURCE_TYPE());
        ztCategoryEditBill.setIsRecord(franchiseeAreaEditDtEntity.getSfgd());
        ztCategoryEditBill.setRemarks(franchiseeAreaEditDtEntity.getBz());
        if(!"".equals(franchiseeAreaEditDtEntity.getXtsxrq())){
            ztCategoryEditBill.setEndDate(franchiseeAreaEditDtEntity.getXtsxrq());
        }
        return ztCategoryEditBill;
    }
}
