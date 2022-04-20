package weaver.interfaces.zb.oa.zt.service;

import weaver.conn.RecordSet;
import weaver.general.Util;
import weaver.interfaces.zb.oa.zt.dao.BaseDao;
import weaver.interfaces.zb.zt.dto.ZTStoreStopBill;
import weaver.interfaces.zb.zt.service.ZTService;

import java.util.List;

/**
 * 商终止
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/17
 * Time: 22:11
 * Description: No Description
 */
public class StoreTerminateService {
    public void exec(String requestid,String tableName) throws Exception {
        BaseDao baseDao=new BaseDao();
        RecordSet rs = new RecordSet();
        ZTService ztService = new ZTService();
        String sql = "select a.pl,b.jmsfm,a.remarks from "+tableName+"_dt1 a left join "+tableName+" b on a.mainid = b.id where requestid = "+requestid+" and a.sfyzd = 0";
        System.out.println("商终止sql为:"+sql);
        rs.execute(sql);
        String pl = "";
        String jmsfm = "";
        String remarks="";
        while (rs.next()){
            pl = rs.getString("pl");
            jmsfm = rs.getString("jmsfm");
            remarks=rs.getString("remarks");
            ZTStoreStopBill ztStoreModifyBill = new ZTStoreStopBill();
            ztStoreModifyBill.setAccountSiteId(pl);
            ztStoreModifyBill.setCustAccountId(baseDao.getFranchiseeId(jmsfm));
            ztStoreModifyBill.setRemarks(Util.null2String(remarks));
            ztStoreModifyBill.setOperationStatus("NO-ORDER");
            System.out.println("商终止json类:"+ztStoreModifyBill);
            boolean isSuccess = ztService.storeStopBill(ztStoreModifyBill);
            System.out.println("商终止发送后返回:"+isSuccess);
            if(isSuccess){
                FranchiseeInformationService franchiseeInformationService=new FranchiseeInformationService();
                franchiseeInformationService.exec(jmsfm);
                String custAccountId=baseDao.getCustAccountId(jmsfm);
                if(!"".equals(custAccountId)){
                    List<String> accountSiteId=baseDao.getAccountSiteId(custAccountId);
                    for(String str:accountSiteId){
                        CategoryInformationService categoryInformationService=new CategoryInformationService();
                        categoryInformationService.exec(str);
                    }
                    List<String> shopId=baseDao.getShopId(custAccountId);
                    StoreInformationService storeInformationService=new StoreInformationService();
                    storeInformationService.exec(shopId);
                }
            }
        }
    }
}
