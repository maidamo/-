package weaver.interfaces.zb.zt.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * 中台开户主表数据
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/8
 * Time: 15:21
 * Description: No Description
 */
public class ZTOpenAccounBill {
    /**加盟商编码(如果是存在的商必须有)*/private String accountNumber;
    /**加盟商名称*/private String accountName;
    /**实际控制人/公司*/private String accountOwner;
    /**实际控制人/公司证件号*/private String accountIdentification;
    /**客户简称*/private String accountShortName;
    /**行政区域*/private String administrativeArea;
    /**身份证号码*/private String legalIdentification;
    /**法人/经营者*/private String legalPerson;
    /**组织类型:0：个体 / 1：公司*/private String organizationType;
    /**纳税登记证号码*/private String taxRegistrationNum;
    /**注册地址*/private String registrationAddress;
    /**国家*/private String country;
    /**省*/private String province;
    /**市*/private String city;
    /**区/县*/private String county;
    /**镇*/private String town;
    /**申请提交人*/private String submitter;
    /**来源id*/private String sourceid;
    /**法人手机号*/private String contactPhone;
    /**选择合并的老商F码*/private String oldAccountNumber;
    /**加盟商id*/private String custAccountId;
    /**行政区域类别*/private String accountLevel;
    /**品牌集合*/ private List<ZTOpenAccounDto> custAccountSitesAll = new ArrayList<>();

    public String getAccountLevel() {
        return accountLevel;
    }

    public void setAccountLevel(String accountLevel) {
        this.accountLevel = accountLevel;
    }

    public String getCustAccountId() {
        return custAccountId;
    }

    public void setCustAccountId(String custAccountId) {
        this.custAccountId = custAccountId;
    }

    public String getOldAccountNumber() {
        return oldAccountNumber;
    }

    public void setOldAccountNumber(String oldAccountNumber) {
        this.oldAccountNumber = oldAccountNumber;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
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

    public String getAccountShortName() {
        return accountShortName;
    }

    public void setAccountShortName(String accountShortName) {
        this.accountShortName = accountShortName;
    }

    public String getAdministrativeArea() {
        return administrativeArea;
    }

    public void setAdministrativeArea(String administrativeArea) {
        this.administrativeArea = administrativeArea;
    }

    public String getLegalIdentification() {
        return legalIdentification;
    }

    public void setLegalIdentification(String legalIdentification) {
        this.legalIdentification = legalIdentification;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
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

    /**
     * 获取 国家
     *
     * @return country 国家
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * 设置 国家
     *
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取 省
     *
     * @return province 省
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * 设置 省
     *
     * @param province 省
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取 市
     *
     * @return city 市
     */
    public String getCity() {
        return this.city;
    }

    /**
     * 设置 市
     *
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取 区县
     *
     * @return county 区县
     */
    public String getCounty() {
        return this.county;
    }

    /**
     * 设置 区县
     *
     * @param county 区县
     */
    public void setCounty(String county) {
        this.county = county;
    }

    /**
     * 获取 镇
     *
     * @return town 镇
     */
    public String getTown() {
        return this.town;
    }

    /**
     * 设置 镇
     *
     * @param town 镇
     */
    public void setTown(String town) {
        this.town = town;
    }

    /**
     * 获取 申请提交人
     *
     * @return submitter 申请提交人
     */
    public String getSubmitter() {
        return this.submitter;
    }

    /**
     * 设置 申请提交人
     *
     * @param submitter 申请提交人
     */
    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }

    /**
     * 获取 来源id
     *
     * @return sourceid 来源id
     */
    public String getSourceid() {
        return this.sourceid;
    }

    /**
     * 设置 来源id
     *
     * @param sourceid 来源id
     */
    public void setSourceid(String sourceid) {
        this.sourceid = sourceid;
    }

    /**
     * 获取 品牌集合
     *
     * @return custAccountSitesAll 品牌集合
     */
    public List<ZTOpenAccounDto> getCustAccountSitesAll() {
        return this.custAccountSitesAll;
    }

    /**
     * 设置 品牌集合
     *
     * @param custAccountSitesAll 品牌集合
     */
    public void setCustAccountSitesAll(List<ZTOpenAccounDto> custAccountSitesAll) {
        this.custAccountSitesAll = custAccountSitesAll;
    }
}
