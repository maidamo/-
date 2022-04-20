package weaver.interfaces.zb.oa.zt.dao;

import weaver.conn.RecordSet;
import weaver.general.Util;
import weaver.interfaces.zb.oa.zt.bill.StoreAcceptanceBill;

/**
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/17
 * Time: 2:51
 * Description: No Description
 */
public class StoreAcceptanceDao {

    public StoreAcceptanceBill getStoreAcceptanceBill(String requestid, String tableName) {
        RecordSet rs = new RecordSet();
        StoreAcceptanceBill storeAcceptanceBill = new StoreAcceptanceBill();
        String sql = "select requestid,id,accountNumber,sourceSystem,sourceid,shopFullName,shopShortName,shopAddress,shopOwner,shopOwnerPhone,shopPhone,shopUseArea,openDate,terminateDate,remarks,entityNo,shopId,storeType,lclx,lczt,unitCode,operateType,operationStatus,shopType,businessChannel,jmplid,nodeDescription,statisticsAdjust,adjustStartDate,adjustEndDate from "+tableName+" where requestid='"+requestid+"'";
        System.out.println("建店sql:"+sql);
        rs.execute(sql);
        if (rs.next()){
            storeAcceptanceBill.setRequestid(Util.null2String(rs.getString("requestid")));
            storeAcceptanceBill.setId(Util.null2String(rs.getString("id")));
            storeAcceptanceBill.setAccountNumber(Util.null2String(rs.getString("accountNumber")));
            storeAcceptanceBill.setSourceSystem(Util.null2String(rs.getString("sourceSystem")));
            storeAcceptanceBill.setSourceid(Util.null2String(rs.getString("sourceid")));
            storeAcceptanceBill.setShopFullName(Util.null2String(rs.getString("shopFullName")));
            storeAcceptanceBill.setShopShortName(Util.null2String(rs.getString("shopShortName")));
            storeAcceptanceBill.setShopAddress(Util.null2String(rs.getString("shopAddress")));
            storeAcceptanceBill.setShopOwner(Util.null2String(rs.getString("shopOwner")));
            storeAcceptanceBill.setShopOwnerPhone(Util.null2String(rs.getString("shopOwnerPhone")));
            storeAcceptanceBill.setShopPhone(Util.null2String(rs.getString("shopPhone")));
            storeAcceptanceBill.setShopUseArea(Util.null2String(rs.getString("shopUseArea")));
            storeAcceptanceBill.setOpenDate(Util.null2String(rs.getString("openDate")));
            storeAcceptanceBill.setTerminateDate(Util.null2String(rs.getString("terminateDate")));
            storeAcceptanceBill.setRemarks(Util.null2String(rs.getString("remarks")));
            storeAcceptanceBill.setEntityNo(Util.null2String(rs.getString("entityNo")));
            storeAcceptanceBill.setShopId(Util.null2String(rs.getString("shopId")));
            storeAcceptanceBill.setStoreType(Util.null2String(rs.getString("storeType")));
            storeAcceptanceBill.setLclx(Util.null2String(rs.getString("lclx")));
            storeAcceptanceBill.setLczt(Util.null2String(rs.getString("lczt")));
            storeAcceptanceBill.setUnitCode(Util.null2String(rs.getString("unitCode")));
            storeAcceptanceBill.setOperateType(Util.null2String(rs.getString("operateType")));
            storeAcceptanceBill.setOperationStatus(Util.null2String(rs.getString("operationStatus")));
            storeAcceptanceBill.setShopType(Util.null2String(rs.getString("shopType")));
            storeAcceptanceBill.setBusinessChannel(Util.null2String(rs.getString("businessChannel")));
            storeAcceptanceBill.setJmplid(Util.null2String(rs.getString("jmplid")));
            storeAcceptanceBill.setNodeDescription(Util.null2String(rs.getString("nodeDescription")));
            storeAcceptanceBill.setStatisticsAdjust(Util.null2String(rs.getString("statisticsAdjust")));
            storeAcceptanceBill.setAdjustStartDate(Util.null2String(rs.getString("adjustStartDate")));
            storeAcceptanceBill.setAdjustEndDate(Util.null2String(rs.getString("adjustEndDate")));

        }

        return storeAcceptanceBill;
    }

}
