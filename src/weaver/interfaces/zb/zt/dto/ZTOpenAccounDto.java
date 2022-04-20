package weaver.interfaces.zb.zt.dto;

/**
 * 中台开户明细数据
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/8
 * Time: 15:21
 * Description: No Description
 */
public class ZTOpenAccounDto {
    /**
     * 品牌
     */
    private String unitId;
    /**
     * 国家
     */
    private String country;
    /**币种*/
    private String currencyCode;
    /**
     * 收货人
     */
    private String shipToPerson;
    /**
     * 联系电话
     */
    private String shipToPhone;
    /**
     * 收货地址
     */
    private String shipToAddress;
    /**
     * 客户类型
     */
    private String siteCode;
    /**
     * 省
     */
    private String province;
    /**
     * 市
     */
    private String city;
    /**
     * 区/县/镇
     */
    private String county;
    /**
     * 镇
     */
    private String town;
    /**
     * 信用限额
     */
    private String creditAmount;
    /**
     * 信用模式:独占 single  / 共享 share
     */
    private String creditMode;
    /**
     * 统计调整状态 ：1 新增 2 持续  3 撤销  4 不计入
     */
    private String statisticsAdjust;
    /**
     * 统计调整开始时间
     */
    private String adjustStartDate;
    /**
     * 统计调整结束时间
     */
    private String adjustEndDate;
    /**授权号  */private String authorizationNo;
    /**业务状态 */private String operationStatus;
    /**开户银行 */private String bankAccountName;
    /**银行分行 */private String bankBranchName;
    /**银行账号 */private String bankAccountNum;
    /**加盟日期 */private String joinDate;
    /**建档日期 */private String recordDate;
    /**是否归档 */private String isRecord;
    /**档案编号 */private String recordNumber;
    /**营销区域 */private String territoryId;
    /**运营城市 */private String cityAddress;
    /**选择客户*/private String oldAccountNumber;


    /**地产百强排名*/private String realEstateRanking;
    /**地产所属战略*/private String propertyStartegy;

    public String getRealEstateRanking() {
        return realEstateRanking;
    }

    public void setRealEstateRanking(String realEstateRanking) {
        this.realEstateRanking = realEstateRanking;
    }

    public String getPropertyStartegy() {
        return propertyStartegy;
    }

    public void setPropertyStartegy(String propertyStartegy) {
        this.propertyStartegy = propertyStartegy;
    }

    public String getOldAccountNumber() {
        return oldAccountNumber;
    }

    public void setOldAccountNumber(String oldAccountNumber) {
        this.oldAccountNumber = oldAccountNumber;
    }

    public String getAuthorizationNo() {
        return authorizationNo;
    }

    public void setAuthorizationNo(String authorizationNo) {
        this.authorizationNo = authorizationNo;
    }

    public String getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
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

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
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

    public String getTerritoryId() {
        return territoryId;
    }

    public void setTerritoryId(String territoryId) {
        this.territoryId = territoryId;
    }

    public String getCityAddress() {
        return cityAddress;
    }

    public void setCityAddress(String cityAddress) {
        this.cityAddress = cityAddress;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getShipToPerson() {
        return shipToPerson;
    }

    public void setShipToPerson(String shipToPerson) {
        this.shipToPerson = shipToPerson;
    }

    public String getShipToPhone() {
        return shipToPhone;
    }

    public void setShipToPhone(String shipToPhone) {
        this.shipToPhone = shipToPhone;
    }

    public String getShipToAddress() {
        return shipToAddress;
    }

    public void setShipToAddress(String shipToAddress) {
        this.shipToAddress = shipToAddress;
    }

    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
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

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getCreditMode() {
        return creditMode;
    }

    public void setCreditMode(String creditMode) {
        this.creditMode = creditMode;
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

    @Override
    public String toString() {
        return "ZTOpenAccounDto{" +
                "unitId='" + unitId + '\'' +
                ", country='" + country + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", shipToPerson='" + shipToPerson + '\'' +
                ", shipToPhone='" + shipToPhone + '\'' +
                ", shipToAddress='" + shipToAddress + '\'' +
                ", siteCode='" + siteCode + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", town='" + town + '\'' +
                ", creditAmount='" + creditAmount + '\'' +
                ", creditMode='" + creditMode + '\'' +
                ", statisticsAdjust='" + statisticsAdjust + '\'' +
                ", adjustStartDate='" + adjustStartDate + '\'' +
                ", adjustEndDate='" + adjustEndDate + '\'' +
                ", authorizationNo='" + authorizationNo + '\'' +
                ", operationStatus='" + operationStatus + '\'' +
                ", bankAccountName='" + bankAccountName + '\'' +
                ", bankBranchName='" + bankBranchName + '\'' +
                ", bankAccountNum='" + bankAccountNum + '\'' +
                ", joinDate='" + joinDate + '\'' +
                ", recordDate='" + recordDate + '\'' +
                ", isRecord='" + isRecord + '\'' +
                ", recordNumber='" + recordNumber + '\'' +
                ", territoryId='" + territoryId + '\'' +
                ", cityAddress='" + cityAddress + '\'' +
                ", oldAccountNumber='" + oldAccountNumber + '\'' +
                ", realEstateRanking='" + realEstateRanking + '\'' +
                ", propertyStartegy='" + propertyStartegy + '\'' +
                '}';
    }
}
