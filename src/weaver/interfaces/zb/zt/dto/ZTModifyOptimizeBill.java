package weaver.interfaces.zb.zt.dto;


/**
 * 商变更优化主表
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/8
 * Time: 17:38
 * Description: No Description
 */
public class ZTModifyOptimizeBill {
    /**组织类型*/private String organizationType;
    /**国家*/private String country;
    /**市名称*/private String cityName;
    /**区名称*/private String countyName;
    /**省市区县合并*/private String mergingArea;
    /**省*/private String province;
    /**市*/private String city;
    /**区*/private String county;
    /**加盟商F码*/private String accountNumber;
    /**客户名称*/private String accountName;
    /**客户简称*/private String accountShortName;
    /**纳税登记证号码*/private String taxRegistrationNum;
    /**法人/经营者*/private String legalPerson;
    /**身份证号码*/private String legalIdentification;
    /**地址？*/private String registrationAddress;
    /**联系号码*/private String contactPhone;
    /**实际控制人/公司*/private String accountOwner;
    /**品牌编码*/private String siteCode;
    /**要变更或优化的加盟商*/private String oldcustAccountId;
    /**需要变更或优化的加盟商*/private String oldAccountNumber;
    /**要变更或优化的加盟商品牌*/private String dyAccountSiteId;
    /**需要转移的附属信息*/private String copyStr;
    /**加盟商id*/private String custAccountId;
    /**品牌*/private String unitId;

    /**行政区域类别*/private String accountLevel;
    /**行政区域*/private String administrativeArea;
    /**实际控制人证件号*/private String accountIdentification;

    public String getAccountLevel() {
        return accountLevel;
    }

    public void setAccountLevel(String accountLevel) {
        this.accountLevel = accountLevel;
    }

    public String getAdministrativeArea() {
        return administrativeArea;
    }

    public void setAdministrativeArea(String administrativeArea) {
        this.administrativeArea = administrativeArea;
    }

    public String getAccountIdentification() {
        return accountIdentification;
    }

    public void setAccountIdentification(String accountIdentification) {
        this.accountIdentification = accountIdentification;
    }

    private ZTModifyOptimizeDto sitesAll;

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getCustAccountId() {
        return custAccountId;
    }

    public void setCustAccountId(String custAccountId) {
        this.custAccountId = custAccountId;
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getMergingArea() {
        return mergingArea;
    }

    public void setMergingArea(String mergingArea) {
        this.mergingArea = mergingArea;
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

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountShortName() {
        return accountShortName;
    }

    public void setAccountShortName(String accountShortName) {
        this.accountShortName = accountShortName;
    }

    public String getTaxRegistrationNum() {
        return taxRegistrationNum;
    }

    public void setTaxRegistrationNum(String taxRegistrationNum) {
        this.taxRegistrationNum = taxRegistrationNum;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getLegalIdentification() {
        return legalIdentification;
    }

    public void setLegalIdentification(String legalIdentification) {
        this.legalIdentification = legalIdentification;
    }

    public String getRegistrationAddress() {
        return registrationAddress;
    }

    public void setRegistrationAddress(String registrationAddress) {
        this.registrationAddress = registrationAddress;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    public String getOldcustAccountId() {
        return oldcustAccountId;
    }

    public void setOldcustAccountId(String oldcustAccountId) {
        this.oldcustAccountId = oldcustAccountId;
    }

    public String getOldAccountNumber() {
        return oldAccountNumber;
    }

    public void setOldAccountNumber(String oldAccountNumber) {
        this.oldAccountNumber = oldAccountNumber;
    }

    public String getDyAccountSiteId() {
        return dyAccountSiteId;
    }

    public void setDyAccountSiteId(String dyAccountSiteId) {
        this.dyAccountSiteId = dyAccountSiteId;
    }

    public String getCopyStr() {
        return copyStr;
    }

    public void setCopyStr(String copyStr) {
        this.copyStr = copyStr;
    }

    public ZTModifyOptimizeDto getSitesAll() {
        return sitesAll;
    }

    public void setSitesAll(ZTModifyOptimizeDto sitesAll) {
        this.sitesAll = sitesAll;
    }
}
