package weaver.interfaces.zb.zt.dto;

/**
 * 商变更优化明细
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/8
 * Time: 17:38
 * Description: No Description
 */
public class ZTModifyOptimizeDto {
    /**运营状态*/private String operationStatus;
    /**省*/private String province;
    /**市*/private String city;
    /**国家*/private String country;
    /**区/县*/private String county;
    /**客户类型*/private String siteCode;
    /**品牌*/private String unitId;
    /**统计调整状态 ：1 新增 2 持续  3 撤销  4 不计入*/private String statisticsAdjust;
    /**统计调整开始时间*/private String adjustStartDate;
    /**统计调整结束时间*/private String adjustEndDate;
    /**3变更 ，4 优化*/private String relevance;

    /**授权号*/private String authorizationNo;
    /**备注*/private String remarks;
    /**收货人*/private String shipToPerson;
    /**收货地址*/private String shipToAddress;
    /**收货人联系号码*/private String shipToPhone;
    /**信用模式*/private String creditMode;
    /**信用额度*/private String creditAmount;
    /**币种*/private String currencyCode;
    /**营销区域*/private String territoryId;
    /**加盟日期*/private String joinDate;
    /**是否归档*/private String isRecord;
    /**档案编号*/private String recordNumber;
    /**建档日期*/private String recordDate;
    /**开户银行*/private String bankAccountName;
    /**银行分支*/private String bankBranchName;
    /**银行账号*/private String bankAccountNum;

    /**运营城市*/private String cityAddress;

    public String getCityAddress() {
        return cityAddress;
    }

    public void setCityAddress(String cityAddress) {
        this.cityAddress = cityAddress;
    }

    public String getAuthorizationNo() {
        return authorizationNo;
    }

    public void setAuthorizationNo(String authorizationNo) {
        this.authorizationNo = authorizationNo;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getShipToPerson() {
        return shipToPerson;
    }

    public void setShipToPerson(String shipToPerson) {
        this.shipToPerson = shipToPerson;
    }

    public String getShipToAddress() {
        return shipToAddress;
    }

    public void setShipToAddress(String shipToAddress) {
        this.shipToAddress = shipToAddress;
    }

    public String getShipToPhone() {
        return shipToPhone;
    }

    public void setShipToPhone(String shipToPhone) {
        this.shipToPhone = shipToPhone;
    }

    public String getCreditMode() {
        return creditMode;
    }

    public void setCreditMode(String creditMode) {
        this.creditMode = creditMode;
    }

    public String getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getTerritoryId() {
        return territoryId;
    }

    public void setTerritoryId(String territoryId) {
        this.territoryId = territoryId;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getIsRecord() {
        return isRecord;
    }

    public void setIsRecord(String isRecord) {
        this.isRecord = isRecord;
    }

    public String getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public String getBankBranchName() {
        return bankBranchName;
    }

    public void setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }

    public String getBankAccountNum() {
        return bankAccountNum;
    }

    public void setBankAccountNum(String bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
    }

    public String getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
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

    public String getRelevance() {
        return relevance;
    }

    public void setRelevance(String relevance) {
        this.relevance = relevance;
    }

    @Override
    public String toString() {
        return "ZTModifyOptimizeDto{" +
                "operationStatus='" + operationStatus + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", county='" + county + '\'' +
                ", siteCode='" + siteCode + '\'' +
                ", unitId='" + unitId + '\'' +
                ", statisticsAdjust='" + statisticsAdjust + '\'' +
                ", adjustStartDate='" + adjustStartDate + '\'' +
                ", adjustEndDate='" + adjustEndDate + '\'' +
                ", relevance='" + relevance + '\'' +
                ", authorizationNo='" + authorizationNo + '\'' +
                ", remarks='" + remarks + '\'' +
                ", shipToPerson='" + shipToPerson + '\'' +
                ", shipToAddress='" + shipToAddress + '\'' +
                ", shipToPhone='" + shipToPhone + '\'' +
                ", creditMode='" + creditMode + '\'' +
                ", creditAmount='" + creditAmount + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", territoryId='" + territoryId + '\'' +
                ", joinDate='" + joinDate + '\'' +
                ", isRecord='" + isRecord + '\'' +
                ", recordNumber='" + recordNumber + '\'' +
                ", recordDate='" + recordDate + '\'' +
                ", bankAccountName='" + bankAccountName + '\'' +
                ", bankBranchName='" + bankBranchName + '\'' +
                ", bankAccountNum='" + bankAccountNum + '\'' +
                ", cityAddress='" + cityAddress + '\'' +
                '}';
    }
}
