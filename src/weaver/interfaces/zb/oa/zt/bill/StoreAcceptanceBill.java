package weaver.interfaces.zb.oa.zt.bill;

/**
 * 店面验收
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/17
 * Time: 2:51
 * Description: No Description
 */
public class StoreAcceptanceBill {
    /**
     * requestid
     */
    private String requestid;
    /**
     * id
     */
    private String id;
    /**
     * 加盟商编码
     */
    private String accountNumber;
    /**
     * 来源系统名称下单
     */
    private String sourceSystem;
    /**
     * 下单系统唯一标识码
     */
    private String sourceid;
    /**
     * 店面名称必传
     */
    private String shopFullName;
    /**
     * 店面简称
     */
    private String shopShortName;
    /**
     * 展厅地址必传
     */
    private String shopAddress;
    /**
     * 店面负责人
     */
    private String shopOwner;
    /**
     * 负责人电话
     */
    private String shopOwnerPhone;
    /**
     * 店面电话
     */
    private String shopPhone;
    /**
     * 净面积
     */
    private String shopUseArea;
    /**
     * 开业日期
     */
    private String openDate;
    /**
     * 终止日期
     */
    private String terminateDate;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 实体店面编码必传
     */
    private String entityNo;
    /**
     * 中台店面id
     */
    private String shopId;
    /**
     * 建店类型必传
     */
    private String storeType;
    /**
     * 流程类型
     */
    private String lclx;
    /**
     * 流程状态
     */
    private String lczt;
    /**
     * 加盟品类
     */
    private String unitCode;
    /**
     * 运营类型
     */
    private String operateType;
    /**
     * 运营状态
     */
    private String operationStatus;
    /**
     * 店面类型
     */
    private String shopType;
    /**
     * 开展业务
     */
    private String businessChannel;
    /**
     * 加盟品类ID
     */
    private String jmplid;
    /**说明*/private String nodeDescription;
    /**统计调整状态*/private String statisticsAdjust;
    /**统计调整开始时间*/private String adjustStartDate;
    /**统计调整结束时间*/private String adjustEndDate;

    public String getNodeDescription() {
        return nodeDescription;
    }

    public void setNodeDescription(String nodeDescription) {
        this.nodeDescription = nodeDescription;
    }

    public String getStatisticsAdjust() {
        return statisticsAdjust;
    }

    public void setStatisticsAdjust(String statisticsAdjust) {
        this.statisticsAdjust = statisticsAdjust;
    }

    public String getAdjustStartDate() {
        return adjustStartDate;
    }

    public void setAdjustStartDate(String adjustStartDate) {
        this.adjustStartDate = adjustStartDate;
    }

    public String getAdjustEndDate() {
        return adjustEndDate;
    }

    public void setAdjustEndDate(String adjustEndDate) {
        this.adjustEndDate = adjustEndDate;
    }

    public String getRequestid() {
        return requestid;
    }

    public void setRequestid(String requestid) {
        this.requestid = requestid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public String getSourceid() {
        return sourceid;
    }

    public void setSourceid(String sourceid) {
        this.sourceid = sourceid;
    }

    public String getShopFullName() {
        return shopFullName;
    }

    public void setShopFullName(String shopFullName) {
        this.shopFullName = shopFullName;
    }

    public String getShopShortName() {
        return shopShortName;
    }

    public void setShopShortName(String shopShortName) {
        this.shopShortName = shopShortName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getShopOwner() {
        return shopOwner;
    }

    public void setShopOwner(String shopOwner) {
        this.shopOwner = shopOwner;
    }

    public String getShopOwnerPhone() {
        return shopOwnerPhone;
    }

    public void setShopOwnerPhone(String shopOwnerPhone) {
        this.shopOwnerPhone = shopOwnerPhone;
    }

    public String getShopPhone() {
        return shopPhone;
    }

    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone;
    }

    public String getShopUseArea() {
        return shopUseArea;
    }

    public void setShopUseArea(String shopUseArea) {
        this.shopUseArea = shopUseArea;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getTerminateDate() {
        return terminateDate;
    }

    public void setTerminateDate(String terminateDate) {
        this.terminateDate = terminateDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getEntityNo() {
        return entityNo;
    }

    public void setEntityNo(String entityNo) {
        this.entityNo = entityNo;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    public String getLclx() {
        return lclx;
    }

    public void setLclx(String lclx) {
        this.lclx = lclx;
    }

    public String getLczt() {
        return lczt;
    }

    public void setLczt(String lczt) {
        this.lczt = lczt;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public String getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public String getBusinessChannel() {
        return businessChannel;
    }

    public void setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
    }

    public String getJmplid() {
        return jmplid;
    }

    public void setJmplid(String jmplid) {
        this.jmplid = jmplid;
    }

    @Override
    public String toString() {
        return "StoreAcceptanceBill{" +
                "requestid='" + requestid + '\'' +
                ", id='" + id + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", sourceSystem='" + sourceSystem + '\'' +
                ", sourceid='" + sourceid + '\'' +
                ", shopFullName='" + shopFullName + '\'' +
                ", shopShortName='" + shopShortName + '\'' +
                ", shopAddress='" + shopAddress + '\'' +
                ", shopOwner='" + shopOwner + '\'' +
                ", shopOwnerPhone='" + shopOwnerPhone + '\'' +
                ", shopPhone='" + shopPhone + '\'' +
                ", shopUseArea='" + shopUseArea + '\'' +
                ", openDate='" + openDate + '\'' +
                ", terminateDate='" + terminateDate + '\'' +
                ", remarks='" + remarks + '\'' +
                ", entityNo='" + entityNo + '\'' +
                ", shopId='" + shopId + '\'' +
                ", storeType='" + storeType + '\'' +
                ", lclx='" + lclx + '\'' +
                ", lczt='" + lczt + '\'' +
                ", unitCode='" + unitCode + '\'' +
                ", operateType='" + operateType + '\'' +
                ", operationStatus='" + operationStatus + '\'' +
                ", shopType='" + shopType + '\'' +
                ", businessChannel='" + businessChannel + '\'' +
                ", jmplid='" + jmplid + '\'' +
                ", nodeDescription='" + nodeDescription + '\'' +
                ", statisticsAdjust='" + statisticsAdjust + '\'' +
                ", adjustStartDate='" + adjustStartDate + '\'' +
                ", adjustEndDate='" + adjustEndDate + '\'' +
                '}';
    }
}
