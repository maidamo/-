package weaver.interfaces.zb.oa.zt.service;

import weaver.interfaces.zb.oa.zt.bill.FranchiseeNewOptimizedAccountOpeningBill;
import weaver.interfaces.zb.oa.zt.dao.FranchiseeNewOptimizedAccountOpeningDao;
import weaver.interfaces.zb.zt.service.ZTService;

public class FranchiseeReturnService {
    FranchiseeNewOptimizedAccountOpeningDao franchiseeNewOptimizedAccountOpeningDao = new FranchiseeNewOptimizedAccountOpeningDao();
    public boolean exc(String requestid,String tableName,String remark) throws Exception {
        boolean isSuccess=false;
        FranchiseeNewOptimizedAccountOpeningBill franchiseeNewOptimizedAccountOpeningBill = franchiseeNewOptimizedAccountOpeningDao.getFranchiseeNewOptimizedAccountOpeningBill(requestid,tableName);
        ZTService ztService = new ZTService();
        String sourceId=franchiseeNewOptimizedAccountOpeningBill.getSourceId();
        if(!"".equals(sourceId)){
            isSuccess=ztService.returnJD("","",remark,sourceId,"2");
        }else{
            throw new Exception("sourceId为空值!");
        }
        return isSuccess;
    }
}
