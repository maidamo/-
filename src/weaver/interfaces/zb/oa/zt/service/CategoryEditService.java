package weaver.interfaces.zb.oa.zt.service;

import weaver.interfaces.zb.oa.zt.bill.CategoryEditBill;
import weaver.interfaces.zb.oa.zt.dao.BaseDao;
import weaver.interfaces.zb.oa.zt.dao.CategoryEditDao;
import weaver.interfaces.zb.zt.dto.ZTCategoryEditBill;
import weaver.interfaces.zb.zt.service.ZTService;

import java.util.List;

public class CategoryEditService {

    BaseDao baseDao=new BaseDao();

    public void exec(String requestid,String tableName) throws Exception {
        ZTService ztService=new ZTService();
        CategoryEditDao categoryEditDao=new CategoryEditDao();
        CategoryEditBill categoryEditBill=categoryEditDao.getCategoryEditMes(requestid,tableName);
        System.out.println("CategoryEditBill: "+categoryEditBill);
        ZTCategoryEditBill ztCategoryEditBill=getZTCategoryEdit(categoryEditBill);
        System.out.println("ZTCategoryEditBill: "+ztCategoryEditBill);
        boolean isSuccess=ztService.categoryEdit(ztCategoryEditBill);
        if(isSuccess){
            CategoryInformationService categoryInformationService=new CategoryInformationService();
            String accoutSiteId=categoryEditBill.getAccountSiteId();
            categoryInformationService.exec(accoutSiteId);
//            boolean isSuccess1=baseDao.updateYxqy(accoutSiteId,categoryEditBill.getYxqy());
//            System.out.println("品类营销区域跟新是否成功: "+isSuccess1);
            String FNumber=categoryEditBill.getAccountNumber();//F码
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
    public ZTCategoryEditBill getZTCategoryEdit(CategoryEditBill categoryEditBilld) throws Exception {
        ZTCategoryEditBill ztCategoryEditBill=new ZTCategoryEditBill();
        ztCategoryEditBill.setCustAccountId(categoryEditBilld.getXzzrkh());
        ztCategoryEditBill.setAccountName(categoryEditBilld.getAccountName());
        ztCategoryEditBill.setAccountShortName(categoryEditBilld.getAccountShortName());
        ztCategoryEditBill.setAccountSiteId(categoryEditBilld.getAccountSiteId());
        ztCategoryEditBill.setUnitId(categoryEditBilld.getUnitId());
        ztCategoryEditBill.setCurrencyCode(categoryEditBilld.getCurrencyCode());
        ztCategoryEditBill.setCountry(categoryEditBilld.getCountry());
        ztCategoryEditBill.setProvince(categoryEditBilld.getProvince());
        ztCategoryEditBill.setCity(categoryEditBilld.getCity());
        ztCategoryEditBill.setCounty(categoryEditBilld.getCounty());
        if(!"".equals(categoryEditBilld.getJoinDate())){
            ztCategoryEditBill.setJoinDate(categoryEditBilld.getJoinDate()+" 00:00:00");
        }
        if(!"".equals(categoryEditBilld.getRECORD_DATE())){
            ztCategoryEditBill.setRecordDate(categoryEditBilld.getRECORD_DATE()+" 00:00:00");
        }
        ztCategoryEditBill.setCreditAmount(categoryEditBilld.getCreditAmount());
        ztCategoryEditBill.setOperationStatus(categoryEditBilld.getOperationStatus());
        ztCategoryEditBill.setCreditMode(categoryEditBilld.getCreditMode());
        ztCategoryEditBill.setAccountNumber(categoryEditBilld.getAccountNumber());
        ztCategoryEditBill.setProvinceName(categoryEditBilld.getProvinceName());
        ztCategoryEditBill.setCityName(categoryEditBilld.getCityName());
        ztCategoryEditBill.setCountyName(categoryEditBilld.getCountyName());
        ztCategoryEditBill.setMergingArea(categoryEditBilld.getProvinceName()+"/"+categoryEditBilld.getCityName()+"/"+categoryEditBilld.getCountyName());
//        ztCategoryEditBill.setRelevance(categoryEditBilld.getRelevance());
        ztCategoryEditBill.setRelevance("1");
        if(!"".equals(categoryEditBilld.getYxqy())){
            String ztTerritory=baseDao.getTerritoryId(categoryEditBilld.getYxqy());
            if("".equals(ztTerritory)){
                throw new Exception("营销区域转换失败!");
            }else{
                ztCategoryEditBill.setTerritoryId(ztTerritory);
            }
        }

        ztCategoryEditBill.setOldAccountNumber(categoryEditBilld.getOldAccountNumber());
        ztCategoryEditBill.setAuthorizationNo(categoryEditBilld.getSqh());
        ztCategoryEditBill.setShipToAddress(categoryEditBilld.getShdz());
        ztCategoryEditBill.setShipToPerson(categoryEditBilld.getShr());
        ztCategoryEditBill.setShipToPhone(categoryEditBilld.getLxdh());
        ztCategoryEditBill.setBankAccountName(categoryEditBilld.getKhyx());
        ztCategoryEditBill.setBankBranchName(categoryEditBilld.getYxfx());
        ztCategoryEditBill.setBankAccountNum(categoryEditBilld.getYxzh());
        ztCategoryEditBill.setSiteCode(categoryEditBilld.getKhlx());
        if(!"".equals(categoryEditBilld.getDzkssj())){
            ztCategoryEditBill.setAdjustStartDate(categoryEditBilld.getDzkssj()+" 00:00:00");
        }
        if(!"".equals(categoryEditBilld.getDzjssj())){
            ztCategoryEditBill.setAdjustEndDate(categoryEditBilld.getDzjssj()+" 00:00:00");
        }
        ztCategoryEditBill.setStatisticsAdjust(categoryEditBilld.getTjdz());
        ztCategoryEditBill.setRealEstateRanking(categoryEditBilld.getDcbqpm());
        ztCategoryEditBill.setTown(categoryEditBilld.getZ());
        ztCategoryEditBill.setRecordNumber(categoryEditBilld.getDabh());
        ztCategoryEditBill.setPropertyStrategy(categoryEditBilld.getSsdczl());
        ztCategoryEditBill.setIsEliminate(categoryEditBilld.getIS_ELIMINATE());
        ztCategoryEditBill.setCityAddress(categoryEditBilld.getCITY_ADDRESS());
        ztCategoryEditBill.setSourceType(categoryEditBilld.getSOURCE_TYPE());
        ztCategoryEditBill.setIsRecord(categoryEditBilld.getSfgd());
        ztCategoryEditBill.setRemarks(categoryEditBilld.getBz());
        if(!"".equals(categoryEditBilld.getXtsxrq())){
            ztCategoryEditBill.setEndDate(categoryEditBilld.getXtsxrq()+" 00:00:00");
        }
        return ztCategoryEditBill;
    }
}
