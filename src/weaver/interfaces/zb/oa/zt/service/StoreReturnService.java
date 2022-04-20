package weaver.interfaces.zb.oa.zt.service;

import weaver.interfaces.zb.oa.zt.bill.StoreAcceptanceBill;
import weaver.interfaces.zb.oa.zt.dao.StoreAcceptanceDao;
import weaver.interfaces.zb.zt.service.ZTService;

public class StoreReturnService {

    StoreAcceptanceDao storeAcceptanceDao = new StoreAcceptanceDao();

    public boolean exc(String requestid,String tableName,String remark) throws Exception {
        boolean isSuccess=false;
        StoreAcceptanceBill storeAcceptanceBill =  storeAcceptanceDao.getStoreAcceptanceBill(requestid,tableName);
        ZTService ztService = new ZTService();
        String sourceId=storeAcceptanceBill.getSourceid();
        System.out.println("sourceId: "+sourceId);
        String shopFullName=storeAcceptanceBill.getShopFullName();
        System.out.println("shopFullName: "+shopFullName);
        String shopId=storeAcceptanceBill.getShopId();
        System.out.println("shopId: "+shopId);
        if("".equals(sourceId)){
            throw new Exception("sourceId为空值!");
        }
        if("".equals(shopFullName)){
            throw new Exception("shopFullName为空值!");
        }
        isSuccess=ztService.returnJDStore(sourceId,shopFullName,shopId,"3",remark);
        return isSuccess;
    }
}
