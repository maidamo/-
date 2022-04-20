package weaver.interfaces.zb.zt.dto;

public class ZTFranchiseeEditorBill {
    /**加盟商id*/private String custAccountId;
    /**加盟商F码*/private String accountNumber;
    /**加盟商名称*/private String accountName;
    /**客户简称*/private String accountShortName;
    /**纳税登记证号码*/private String taxRegistrationNum;
    /**注册地址*/private String registrationAddress;
    /**法人/经营者*/private String legalPerson;
    /**联系号码*/private String contactPhone;
    /**组织类型:0：个体 / 1：公司*/private String organizationType;
    /**国家*/private String country;
    /**省*/private String province;
    /**市*/private String city;
    /**状态*/private String status;
    /**行政区域*/private String administrativeArea;
    /**区/县*/private String county;
    /**重复字段*/private String repeatField;
    /**省市区县合并*/private String mergingArea;
    /**省名称*/private String provinceName;
    /**市名称*/private String cityName;
    /**区/县名称*/private String countyName;
    /**组织id*/private String accountSiteId;
    /**操作状态*/private String operationStatus;
    /**法人身份证号*/private String legalIdentification;
    /**选择合并的老商F码*/private String oldAccountNumber;


    /**实际控制人/公司*/private String accountOwner;
    /**实际控制人证件号*/private String accountIdentification;
    /**行政区域类别*/private String accountLevel;

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public String getAccountIdentification() {
        return accountIdentification;
    }

    public void setAccountIdentification(String accountIdentification) {
        this.accountIdentification = accountIdentification;
    }

    public String getAccountLevel() {
        return accountLevel;
    }

    public void setAccountLevel(String accountLevel) {
        this.accountLevel = accountLevel;
    }

    public String getOldAccountNumber() {
        return oldAccountNumber;
    }

    public void setOldAccountNumber(String oldAccountNumber) {
        this.oldAccountNumber = oldAccountNumber;
    }

    public String getLegalIdentification() {
        return legalIdentification;
    }

    public void setLegalIdentification(String legalIdentification) {
        this.legalIdentification = legalIdentification;
    }

    public String getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
    }

    public String getAccountSiteId() {
        return accountSiteId;
    }

    public void setAccountSiteId(String accountSiteId) {
        this.accountSiteId = accountSiteId;
    }

    public String getCustAccountId() {
        return custAccountId;
    }

    public void setCustAccountId(String custAccountId) {
        this.custAccountId = custAccountId;
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

    public String getRegistrationAddress() {
        return registrationAddress;
    }

    public void setRegistrationAddress(String registrationAddress) {
        this.registrationAddress = registrationAddress;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAdministrativeArea() {
        return administrativeArea;
    }

    public void setAdministrativeArea(String administrativeArea) {
        this.administrativeArea = administrativeArea;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getRepeatField() {
        return repeatField;
    }

    public void setRepeatField(String repeatField) {
        this.repeatField = repeatField;
    }

    public String getMergingArea() {
        return mergingArea;
    }

    public void setMergingArea(String mergingArea) {
        this.mergingArea = mergingArea;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
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

    @Override
    public String toString() {
        return "ZTFranchiseeEditorBill{" +
                "custAccountId='" + custAccountId + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountName='" + accountName + '\'' +
                ", accountShortName='" + accountShortName + '\'' +
                ", taxRegistrationNum='" + taxRegistrationNum + '\'' +
                ", registrationAddress='" + registrationAddress + '\'' +
                ", legalPerson='" + legalPerson + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", organizationType='" + organizationType + '\'' +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", status='" + status + '\'' +
                ", administrativeArea='" + administrativeArea + '\'' +
                ", county='" + county + '\'' +
                ", repeatField='" + repeatField + '\'' +
                ", mergingArea='" + mergingArea + '\'' +
                ", provinceName='" + provinceName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", countyName='" + countyName + '\'' +
                ", accountSiteId='" + accountSiteId + '\'' +
                ", operationStatus='" + operationStatus + '\'' +
                ", legalIdentification='" + legalIdentification + '\'' +
                ", oldAccountNumber='" + oldAccountNumber + '\'' +
                ", accountOwner='" + accountOwner + '\'' +
                ", accountIdentification='" + accountIdentification + '\'' +
                ", accountLevel='" + accountLevel + '\'' +
                '}';
    }
}
