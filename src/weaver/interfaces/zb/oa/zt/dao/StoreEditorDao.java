package weaver.interfaces.zb.oa.zt.dao;

import weaver.conn.RecordSet;
import weaver.interfaces.zb.oa.zt.bill.StoreAcceptanceBill;
import weaver.interfaces.zb.oa.zt.bill.StoreEditorBill;

/**
 * 店编辑
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/17
 * Time: 10:56
 * Description: No Description
 */
public class StoreEditorDao {

    public StoreEditorBill getStoreEditorBill(String requestid, String tableName) {
        RecordSet rs = new RecordSet();
        StoreEditorBill storeEditorBill = new StoreEditorBill();
        String sql = "select requestid,id,accountNumber,sourceSystem,sourceid,shopFullName,shopShortName,unitCode,businessChannel,shopAddress,shopOwner,shopOwnerPhone,shopPhone,shopUseArea,openDate,terminateDate,remarks,entityNo,shopId,storeType,unitid,statisticsAdjust,adjustStartDate,adjustEndDate,yylx,yyzt,dmlx,storeName from "+tableName+" where requestid = "+requestid;
        rs.execute(sql);
        if (rs.next()){
            storeEditorBill.setRequestid(rs.getString("requestid"));//requestid
            storeEditorBill.setId(rs.getString("id"));//id
            storeEditorBill.setAccountnumber(rs.getString("accountNumber"));//加盟商编码
            storeEditorBill.setSourcesystem(rs.getString("sourceSystem"));//来源系统名称下单
            storeEditorBill.setSourceid(rs.getString("sourceid"));//下单系统唯一标识码
            storeEditorBill.setShopfullname(rs.getString("shopFullName"));//店面名称必传
            storeEditorBill.setShopshortname(rs.getString("shopShortName"));//店面简称
            storeEditorBill.setUnitcode(rs.getString("unitCode"));//品牌编码必传
            storeEditorBill.setBusinesschannel(rs.getString("businessChannel"));//开展业务必传
            storeEditorBill.setShopaddress(rs.getString("shopAddress"));//展厅地址必传
            storeEditorBill.setShopowner(rs.getString("shopOwner"));//店面负责人
            storeEditorBill.setShopownerphone(rs.getString("shopOwnerPhone"));//负责人电话
            storeEditorBill.setShopphone(rs.getString("shopPhone"));//店面电话
            storeEditorBill.setShopusearea(rs.getString("shopUseArea"));//净面积
            storeEditorBill.setOpendate(rs.getString("openDate"));//开业日期
            storeEditorBill.setTerminatedate(rs.getString("terminateDate"));//终止日期
            storeEditorBill.setRemarks(rs.getString("remarks"));//备注
            storeEditorBill.setEntityno(rs.getString("entityNo"));//实体店面编码必传
            storeEditorBill.setShopid(rs.getString("shopId"));//中台店面id
            storeEditorBill.setStoretype(rs.getString("storeType"));//建店类型必传
            storeEditorBill.setUnitid(rs.getString("unitid"));//品牌ID
            storeEditorBill.setStatisticsadjust(rs.getString("statisticsAdjust"));//统计调整状态
            storeEditorBill.setAdjuststartdate(rs.getString("adjustStartDate"));//统计调整开始时间
            storeEditorBill.setAdjustenddate(rs.getString("adjustEndDate"));//统计调整结束时间
            storeEditorBill.setYylx(rs.getString("yylx"));//运营类型
            storeEditorBill.setYyzt(rs.getString("yyzt"));//运营状态
            storeEditorBill.setDmlx(rs.getString("dmlx"));//店面类型
            storeEditorBill.setStorename(rs.getString("storeName"));//卖场名称
        }

        return storeEditorBill;
    }

}
