package weaver.interfaces.zb.oa.zt.bill;

/**
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/17
 * Time: 1:26
 * Description: No Description
 */
public class FranchiseeChangeApplicationDto {
    /**mainid*/private String mainid;
    /**id*/private String id;
    /**省份*/private String sf;
    /**城市*/private String cs;
    /**国家*/private String gj;
    /**区县*/private String qx;
    /**客户类型*/private String khlx;
    /**品类id*/private String plid;
    /**统计调整状态*/private String tjdzzt;
    /**统计调整开始时间*/private String tjdzkssj;
    /**统计调整结束时间*/private String tjdzjssj;
    /**业务状态*/private String ywzt;


    /**授权号*/private String AUTHORIZATION_NO;
    /**备注*/private String REMARKS;
    /**收货人*/private String SHIP_TO_PERSON;
    /**收货地址*/private String SHIP_TO_ADDRESS;
    /**收货人联系号码*/private String SHIP_TO_PHONE;
    /**信用模式*/private String CREDIT_MODE;
    /**信用额度*/private String CREDIT_AMOUNT;
    /**币种*/private String CURRENCY_CODE;
    /**营销区域*/private String TERRITORY_ID;
    /**加盟日期*/private String JOIN_DATE;
    /**是否归档*/private String IS_RECORD;
    /**档案编号*/private String RECORD_NUMBER;
    /**建档日期*/private String RECORD_DATE;
    /**开户银行*/private String BANK_ACCOUNT_NAME;
    /**银行分支*/private String BANK_BRANCH_NAME;
    /**银行账号*/private String BANK_ACCOUNT_NUM;

    /**营运城市*/private String CITY_ADDRESS;

    public String getCITY_ADDRESS() {
        return CITY_ADDRESS;
    }

    public void setCITY_ADDRESS(String CITY_ADDRESS) {
        this.CITY_ADDRESS = CITY_ADDRESS;
    }

    public String getAUTHORIZATION_NO() {
        return AUTHORIZATION_NO;
    }

    public void setAUTHORIZATION_NO(String AUTHORIZATION_NO) {
        this.AUTHORIZATION_NO = AUTHORIZATION_NO;
    }

    public String getREMARKS() {
        return REMARKS;
    }

    public void setREMARKS(String REMARKS) {
        this.REMARKS = REMARKS;
    }

    public String getSHIP_TO_PERSON() {
        return SHIP_TO_PERSON;
    }

    public void setSHIP_TO_PERSON(String SHIP_TO_PERSON) {
        this.SHIP_TO_PERSON = SHIP_TO_PERSON;
    }

    public String getSHIP_TO_ADDRESS() {
        return SHIP_TO_ADDRESS;
    }

    public void setSHIP_TO_ADDRESS(String SHIP_TO_ADDRESS) {
        this.SHIP_TO_ADDRESS = SHIP_TO_ADDRESS;
    }

    public String getSHIP_TO_PHONE() {
        return SHIP_TO_PHONE;
    }

    public void setSHIP_TO_PHONE(String SHIP_TO_PHONE) {
        this.SHIP_TO_PHONE = SHIP_TO_PHONE;
    }

    public String getCREDIT_MODE() {
        return CREDIT_MODE;
    }

    public void setCREDIT_MODE(String CREDIT_MODE) {
        this.CREDIT_MODE = CREDIT_MODE;
    }

    public String getCREDIT_AMOUNT() {
        return CREDIT_AMOUNT;
    }

    public void setCREDIT_AMOUNT(String CREDIT_AMOUNT) {
        this.CREDIT_AMOUNT = CREDIT_AMOUNT;
    }

    public String getCURRENCY_CODE() {
        return CURRENCY_CODE;
    }

    public void setCURRENCY_CODE(String CURRENCY_CODE) {
        this.CURRENCY_CODE = CURRENCY_CODE;
    }

    public String getTERRITORY_ID() {
        return TERRITORY_ID;
    }

    public void setTERRITORY_ID(String TERRITORY_ID) {
        this.TERRITORY_ID = TERRITORY_ID;
    }

    public String getJOIN_DATE() {
        return JOIN_DATE;
    }

    public void setJOIN_DATE(String JOIN_DATE) {
        this.JOIN_DATE = JOIN_DATE;
    }

    public String getIS_RECORD() {
        return IS_RECORD;
    }

    public void setIS_RECORD(String IS_RECORD) {
        this.IS_RECORD = IS_RECORD;
    }

    public String getRECORD_NUMBER() {
        return RECORD_NUMBER;
    }

    public void setRECORD_NUMBER(String RECORD_NUMBER) {
        this.RECORD_NUMBER = RECORD_NUMBER;
    }

    public String getRECORD_DATE() {
        return RECORD_DATE;
    }

    public void setRECORD_DATE(String RECORD_DATE) {
        this.RECORD_DATE = RECORD_DATE;
    }

    public String getBANK_ACCOUNT_NAME() {
        return BANK_ACCOUNT_NAME;
    }

    public void setBANK_ACCOUNT_NAME(String BANK_ACCOUNT_NAME) {
        this.BANK_ACCOUNT_NAME = BANK_ACCOUNT_NAME;
    }

    public String getBANK_BRANCH_NAME() {
        return BANK_BRANCH_NAME;
    }

    public void setBANK_BRANCH_NAME(String BANK_BRANCH_NAME) {
        this.BANK_BRANCH_NAME = BANK_BRANCH_NAME;
    }

    public String getBANK_ACCOUNT_NUM() {
        return BANK_ACCOUNT_NUM;
    }

    public void setBANK_ACCOUNT_NUM(String BANK_ACCOUNT_NUM) {
        this.BANK_ACCOUNT_NUM = BANK_ACCOUNT_NUM;
    }

    /**
     * 获取 mainid
     *
     * @return mainid mainid
     */
    public String getMainid() {
        return this.mainid;
    }

    /**
     * 设置 mainid
     *
     * @param mainid mainid
     */
    public void setMainid(String mainid) {
        this.mainid = mainid;
    }

    /**
     * 获取 id
     *
     * @return id id
     */
    public String getId() {
        return this.id;
    }

    /**
     * 设置 id
     *
     * @param id id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取 省份
     *
     * @return sf 省份
     */
    public String getSf() {
        return this.sf;
    }

    /**
     * 设置 省份
     *
     * @param sf 省份
     */
    public void setSf(String sf) {
        this.sf = sf;
    }

    /**
     * 获取 城市
     *
     * @return cs 城市
     */
    public String getCs() {
        return this.cs;
    }

    /**
     * 设置 城市
     *
     * @param cs 城市
     */
    public void setCs(String cs) {
        this.cs = cs;
    }

    /**
     * 获取 国家
     *
     * @return gj 国家
     */
    public String getGj() {
        return this.gj;
    }

    /**
     * 设置 国家
     *
     * @param gj 国家
     */
    public void setGj(String gj) {
        this.gj = gj;
    }

    /**
     * 获取 区县
     *
     * @return qx 区县
     */
    public String getQx() {
        return this.qx;
    }

    /**
     * 设置 区县
     *
     * @param qx 区县
     */
    public void setQx(String qx) {
        this.qx = qx;
    }

    /**
     * 获取 客户类型
     *
     * @return khlx 客户类型
     */
    public String getKhlx() {
        return this.khlx;
    }

    /**
     * 设置 客户类型
     *
     * @param khlx 客户类型
     */
    public void setKhlx(String khlx) {
        this.khlx = khlx;
    }

    /**
     * 获取 品类id
     *
     * @return plid 品类id
     */
    public String getPlid() {
        return this.plid;
    }

    /**
     * 设置 品类id
     *
     * @param plid 品类id
     */
    public void setPlid(String plid) {
        this.plid = plid;
    }

    /**
     * 获取 统计调整状态
     *
     * @return tjdzzt 统计调整状态
     */
    public String getTjdzzt() {
        return this.tjdzzt;
    }

    /**
     * 设置 统计调整状态
     *
     * @param tjdzzt 统计调整状态
     */
    public void setTjdzzt(String tjdzzt) {
        this.tjdzzt = tjdzzt;
    }

    /**
     * 获取 统计调整开始时间
     *
     * @return tjdzkssj 统计调整开始时间
     */
    public String getTjdzkssj() {
        return this.tjdzkssj;
    }

    /**
     * 设置 统计调整开始时间
     *
     * @param tjdzkssj 统计调整开始时间
     */
    public void setTjdzkssj(String tjdzkssj) {
        this.tjdzkssj = tjdzkssj;
    }

    /**
     * 获取 统计调整结束时间
     *
     * @return tjdzjssj 统计调整结束时间
     */
    public String getTjdzjssj() {
        return this.tjdzjssj;
    }

    /**
     * 设置 统计调整结束时间
     *
     * @param tjdzjssj 统计调整结束时间
     */
    public void setTjdzjssj(String tjdzjssj) {
        this.tjdzjssj = tjdzjssj;
    }

    /**
     * 获取 业务状态
     *
     * @return ywzt 业务状态
     */
    public String getYwzt() {
        return this.ywzt;
    }

    /**
     * 设置 业务状态
     *
     * @param ywzt 业务状态
     */
    public void setYwzt(String ywzt) {
        this.ywzt = ywzt;
    }

    @Override
    public String toString() {
        return "FranchiseeChangeApplicationDto{" +
                "mainid='" + mainid + '\'' +
                ", id='" + id + '\'' +
                ", sf='" + sf + '\'' +
                ", cs='" + cs + '\'' +
                ", gj='" + gj + '\'' +
                ", qx='" + qx + '\'' +
                ", khlx='" + khlx + '\'' +
                ", plid='" + plid + '\'' +
                ", tjdzzt='" + tjdzzt + '\'' +
                ", tjdzkssj='" + tjdzkssj + '\'' +
                ", tjdzjssj='" + tjdzjssj + '\'' +
                ", ywzt='" + ywzt + '\'' +
                ", AUTHORIZATION_NO='" + AUTHORIZATION_NO + '\'' +
                ", REMARKS='" + REMARKS + '\'' +
                ", SHIP_TO_PERSON='" + SHIP_TO_PERSON + '\'' +
                ", SHIP_TO_ADDRESS='" + SHIP_TO_ADDRESS + '\'' +
                ", SHIP_TO_PHONE='" + SHIP_TO_PHONE + '\'' +
                ", CREDIT_MODE='" + CREDIT_MODE + '\'' +
                ", CREDIT_AMOUNT='" + CREDIT_AMOUNT + '\'' +
                ", CURRENCY_CODE='" + CURRENCY_CODE + '\'' +
                ", TERRITORY_ID='" + TERRITORY_ID + '\'' +
                ", JOIN_DATE='" + JOIN_DATE + '\'' +
                ", IS_RECORD='" + IS_RECORD + '\'' +
                ", RECORD_NUMBER='" + RECORD_NUMBER + '\'' +
                ", RECORD_DATE='" + RECORD_DATE + '\'' +
                ", BANK_ACCOUNT_NAME='" + BANK_ACCOUNT_NAME + '\'' +
                ", BANK_BRANCH_NAME='" + BANK_BRANCH_NAME + '\'' +
                ", BANK_ACCOUNT_NUM='" + BANK_ACCOUNT_NUM + '\'' +
                ", CITY_ADDRESS='" + CITY_ADDRESS + '\'' +
                '}';
    }
}
