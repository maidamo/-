package weaver.interfaces.zb.oa.zt.bill;

public class CategoryInformationBill {
    /** 客户组织ID*/private String ACCOUNT_SITE_ID;
    /** 品类ID*/private String  UNIT_ID;
    /** 客户ID*/private String  CUST_ACCOUNT_ID;
    /**客户类型*/private String  khlx;
    /** 币种*/private String  CURRENCY_CODE;
    /**省*/private String s;
    /** 城市*/private String  cs;
    /** 区县*/private String  qx;
    /** 收货地址*/private String  shdz;
    /**收货人*/private String  shr;
    /**收货电话*/private String  shdh;
    /** 授权号*/private String  sqh;
    /** 加盟日期*/private String  jmrq;
    /** 建档日期*/private String jdrq;
    /** 纸质档案编号*/private String  zzdabh;
    /** 信用限额*/private String  xyxe;
    /** 开户行*/private String  khx;
    /** 银行分支*/private String yxfz;
    /**账号*/private String zhanghao;
    /** 银联号*/private String  ylh;
    /**状态*/private String status;
    /**业务状态*/private String ywzt;
    /**发布日期*/private String PUBLISH_DATE;
    /**终止日期*/private String TERMINATE_DATE;
    /**行版本号*/private String xbbhOBJECT_VERSION_NUMBER;
    /**创建日期*/private String CREATION_DATE;
    /**创建人*/private String CREATED_BY;
    /**最后更新人*/private String LAST_UPDATED_BY;
    /**最后更新日期*/private String LAST_UPDATE_DATE;
    /**LAST_UPDATE_LOGIN*/private String LAST_UPDATE_LOGIN;
    /**PROGRAM_APPLICATION_ID*/private String PROGRAM_APPLICATION_ID;
    /**PROGRAM_ID*/private String PROGRAM_ID;
    /**PROGRAM_UPDATE_DATE*/private String PROGRAM_UPDATE_DATE;
    /**REQUEST_ID*/private String REQUEST_ID;
    /**ATTRIBUTE_CATEGORY*/private String ATTRIBUTE_CATEGORY;
    /**信用模式*/private String xyms;
    /**营销区域*/private String  yxqy;
    /**省份简称*/private String SHORT_NAME;
    /** 运营城市*/private String yycs;
    /** 备注*/private String  bz;
    /**统计调整*/private String STATISTICS_ADJUST;
    /**调整开始时间*/private String ADJUST_START_DATE;
    /**调整结束时间*/private String ADJUST_END_DATE;
    /**建模数据创建人*/private String modedatacreater;
    /**建模数据创建人类型*/private String modedatacreatertype;
    /**建模数据创建日期*/private String modedatacreatedate;
    /**建模数据创建时间*/private String modedatacreatetime;
    /**modeUUID*/private String modeUUID;
    /**formmodeid*/private String formmodeid;
    /**加盟品类*/private String jmpinl;

    /**地产百强排名*/private String REAL_ESTATE_RANKING;
    /**镇*/private String TOWN;
    /**所属地产战略*/private String PROPERTY_STRATEGY;
    /**是否淘汰加盟商*/private String IS_ELIMINATE;
    /**数据来源*/private String SOURCE_TYPE;
    /**国家*/private String gj;

    /**是否归档*/private String IS_RECORD;

    /**失效日期*/private String xtsxrq;

    public String getXtsxrq() {
        return xtsxrq;
    }

    public void setXtsxrq(String xtsxrq) {
        this.xtsxrq = xtsxrq;
    }

    public String getIS_RECORD() {
        return IS_RECORD;
    }

    public void setIS_RECORD(String IS_RECORD) {
        this.IS_RECORD = IS_RECORD;
    }

    public String getREAL_ESTATE_RANKING() {
        return REAL_ESTATE_RANKING;
    }

    public void setREAL_ESTATE_RANKING(String REAL_ESTATE_RANKING) {
        this.REAL_ESTATE_RANKING = REAL_ESTATE_RANKING;
    }

    public String getTOWN() {
        return TOWN;
    }

    public void setTOWN(String TOWN) {
        this.TOWN = TOWN;
    }

    public String getPROPERTY_STRATEGY() {
        return PROPERTY_STRATEGY;
    }

    public void setPROPERTY_STRATEGY(String PROPERTY_STRATEGY) {
        this.PROPERTY_STRATEGY = PROPERTY_STRATEGY;
    }

    public String getIS_ELIMINATE() {
        return IS_ELIMINATE;
    }

    public void setIS_ELIMINATE(String IS_ELIMINATE) {
        this.IS_ELIMINATE = IS_ELIMINATE;
    }

    public String getSOURCE_TYPE() {
        return SOURCE_TYPE;
    }

    public void setSOURCE_TYPE(String SOURCE_TYPE) {
        this.SOURCE_TYPE = SOURCE_TYPE;
    }

    public String getGj() {
        return gj;
    }

    public void setGj(String gj) {
        this.gj = gj;
    }

    public String getJmpinl() {
        return jmpinl;
    }

    public void setJmpinl(String jmpinl) {
        this.jmpinl = jmpinl;
    }

    public String getModedatacreater() {
        return modedatacreater;
    }

    public void setModedatacreater(String modedatacreater) {
        this.modedatacreater = modedatacreater;
    }

    public String getModedatacreatertype() {
        return modedatacreatertype;
    }

    public void setModedatacreatertype(String modedatacreatertype) {
        this.modedatacreatertype = modedatacreatertype;
    }

    public String getModedatacreatedate() {
        return modedatacreatedate;
    }

    public void setModedatacreatedate(String modedatacreatedate) {
        this.modedatacreatedate = modedatacreatedate;
    }

    public String getModedatacreatetime() {
        return modedatacreatetime;
    }

    public void setModedatacreatetime(String modedatacreatetime) {
        this.modedatacreatetime = modedatacreatetime;
    }

    public String getModeUUID() {
        return modeUUID;
    }

    public void setModeUUID(String modeUUID) {
        this.modeUUID = modeUUID;
    }

    public String getFormmodeid() {
        return formmodeid;
    }

    public void setFormmodeid(String formmodeid) {
        this.formmodeid = formmodeid;
    }

    public String getACCOUNT_SITE_ID() {
        return ACCOUNT_SITE_ID;
    }

    public void setACCOUNT_SITE_ID(String ACCOUNT_SITE_ID) {
        this.ACCOUNT_SITE_ID = ACCOUNT_SITE_ID;
    }

    public String getUNIT_ID() {
        return UNIT_ID;
    }

    public void setUNIT_ID(String UNIT_ID) {
        this.UNIT_ID = UNIT_ID;
    }

    public String getCUST_ACCOUNT_ID() {
        return CUST_ACCOUNT_ID;
    }

    public void setCUST_ACCOUNT_ID(String CUST_ACCOUNT_ID) {
        this.CUST_ACCOUNT_ID = CUST_ACCOUNT_ID;
    }

    public String getKhlx() {
        return khlx;
    }

    public void setKhlx(String khlx) {
        this.khlx = khlx;
    }

    public String getCURRENCY_CODE() {
        return CURRENCY_CODE;
    }

    public void setCURRENCY_CODE(String CURRENCY_CODE) {
        this.CURRENCY_CODE = CURRENCY_CODE;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getCs() {
        return cs;
    }

    public void setCs(String cs) {
        this.cs = cs;
    }

    public String getQx() {
        return qx;
    }

    public void setQx(String qx) {
        this.qx = qx;
    }

    public String getShdz() {
        return shdz;
    }

    public void setShdz(String shdz) {
        this.shdz = shdz;
    }

    public String getShr() {
        return shr;
    }

    public void setShr(String shr) {
        this.shr = shr;
    }

    public String getShdh() {
        return shdh;
    }

    public void setShdh(String shdh) {
        this.shdh = shdh;
    }

    public String getSqh() {
        return sqh;
    }

    public void setSqh(String sqh) {
        this.sqh = sqh;
    }

    public String getJmrq() {
        return jmrq;
    }

    public void setJmrq(String jmrq) {
        this.jmrq = jmrq;
    }

    public String getJdrq() {
        return jdrq;
    }

    public void setJdrq(String jdrq) {
        this.jdrq = jdrq;
    }

    public String getZzdabh() {
        return zzdabh;
    }

    public void setZzdabh(String zzdabh) {
        this.zzdabh = zzdabh;
    }

    public String getXyxe() {
        return xyxe;
    }

    public void setXyxe(String xyxe) {
        this.xyxe = xyxe;
    }

    public String getKhx() {
        return khx;
    }

    public void setKhx(String khx) {
        this.khx = khx;
    }

    public String getYxfz() {
        return yxfz;
    }

    public void setYxfz(String yxfz) {
        this.yxfz = yxfz;
    }

    public String getZhanghao() {
        return zhanghao;
    }

    public void setZhanghao(String zhanghao) {
        this.zhanghao = zhanghao;
    }

    public String getYlh() {
        return ylh;
    }

    public void setYlh(String ylh) {
        this.ylh = ylh;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getYwzt() {
        return ywzt;
    }

    public void setYwzt(String ywzt) {
        this.ywzt = ywzt;
    }

    public String getPUBLISH_DATE() {
        return PUBLISH_DATE;
    }

    public void setPUBLISH_DATE(String PUBLISH_DATE) {
        this.PUBLISH_DATE = PUBLISH_DATE;
    }

    public String getTERMINATE_DATE() {
        return TERMINATE_DATE;
    }

    public void setTERMINATE_DATE(String TERMINATE_DATE) {
        this.TERMINATE_DATE = TERMINATE_DATE;
    }

    public String getXbbhOBJECT_VERSION_NUMBER() {
        return xbbhOBJECT_VERSION_NUMBER;
    }

    public void setXbbhOBJECT_VERSION_NUMBER(String xbbhOBJECT_VERSION_NUMBER) {
        this.xbbhOBJECT_VERSION_NUMBER = xbbhOBJECT_VERSION_NUMBER;
    }

    public String getCREATION_DATE() {
        return CREATION_DATE;
    }

    public void setCREATION_DATE(String CREATION_DATE) {
        this.CREATION_DATE = CREATION_DATE;
    }

    public String getCREATED_BY() {
        return CREATED_BY;
    }

    public void setCREATED_BY(String CREATED_BY) {
        this.CREATED_BY = CREATED_BY;
    }

    public String getLAST_UPDATED_BY() {
        return LAST_UPDATED_BY;
    }

    public void setLAST_UPDATED_BY(String LAST_UPDATED_BY) {
        this.LAST_UPDATED_BY = LAST_UPDATED_BY;
    }

    public String getLAST_UPDATE_DATE() {
        return LAST_UPDATE_DATE;
    }

    public void setLAST_UPDATE_DATE(String LAST_UPDATE_DATE) {
        this.LAST_UPDATE_DATE = LAST_UPDATE_DATE;
    }

    public String getLAST_UPDATE_LOGIN() {
        return LAST_UPDATE_LOGIN;
    }

    public void setLAST_UPDATE_LOGIN(String LAST_UPDATE_LOGIN) {
        this.LAST_UPDATE_LOGIN = LAST_UPDATE_LOGIN;
    }

    public String getPROGRAM_APPLICATION_ID() {
        return PROGRAM_APPLICATION_ID;
    }

    public void setPROGRAM_APPLICATION_ID(String PROGRAM_APPLICATION_ID) {
        this.PROGRAM_APPLICATION_ID = PROGRAM_APPLICATION_ID;
    }

    public String getPROGRAM_ID() {
        return PROGRAM_ID;
    }

    public void setPROGRAM_ID(String PROGRAM_ID) {
        this.PROGRAM_ID = PROGRAM_ID;
    }

    public String getPROGRAM_UPDATE_DATE() {
        return PROGRAM_UPDATE_DATE;
    }

    public void setPROGRAM_UPDATE_DATE(String PROGRAM_UPDATE_DATE) {
        this.PROGRAM_UPDATE_DATE = PROGRAM_UPDATE_DATE;
    }

    public String getREQUEST_ID() {
        return REQUEST_ID;
    }

    public void setREQUEST_ID(String REQUEST_ID) {
        this.REQUEST_ID = REQUEST_ID;
    }

    public String getATTRIBUTE_CATEGORY() {
        return ATTRIBUTE_CATEGORY;
    }

    public void setATTRIBUTE_CATEGORY(String ATTRIBUTE_CATEGORY) {
        this.ATTRIBUTE_CATEGORY = ATTRIBUTE_CATEGORY;
    }

    public String getXyms() {
        return xyms;
    }

    public void setXyms(String xyms) {
        this.xyms = xyms;
    }

    public String getYxqy() {
        return yxqy;
    }

    public void setYxqy(String yxqy) {
        this.yxqy = yxqy;
    }

    public String getSHORT_NAME() {
        return SHORT_NAME;
    }

    public void setSHORT_NAME(String SHORT_NAME) {
        this.SHORT_NAME = SHORT_NAME;
    }

    public String getYycs() {
        return yycs;
    }

    public void setYycs(String yycs) {
        this.yycs = yycs;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getSTATISTICS_ADJUST() {
        return STATISTICS_ADJUST;
    }

    public void setSTATISTICS_ADJUST(String STATISTICS_ADJUST) {
        this.STATISTICS_ADJUST = STATISTICS_ADJUST;
    }

    public String getADJUST_START_DATE() {
        return ADJUST_START_DATE;
    }

    public void setADJUST_START_DATE(String ADJUST_START_DATE) {
        this.ADJUST_START_DATE = ADJUST_START_DATE;
    }

    public String getADJUST_END_DATE() {
        return ADJUST_END_DATE;
    }

    public void setADJUST_END_DATE(String ADJUST_END_DATE) {
        this.ADJUST_END_DATE = ADJUST_END_DATE;
    }

    @Override
    public String toString() {
        return "CategoryInformationBill{" +
                "ACCOUNT_SITE_ID='" + ACCOUNT_SITE_ID + '\'' +
                ", UNIT_ID='" + UNIT_ID + '\'' +
                ", CUST_ACCOUNT_ID='" + CUST_ACCOUNT_ID + '\'' +
                ", khlx='" + khlx + '\'' +
                ", CURRENCY_CODE='" + CURRENCY_CODE + '\'' +
                ", s='" + s + '\'' +
                ", cs='" + cs + '\'' +
                ", qx='" + qx + '\'' +
                ", shdz='" + shdz + '\'' +
                ", shr='" + shr + '\'' +
                ", shdh='" + shdh + '\'' +
                ", sqh='" + sqh + '\'' +
                ", jmrq='" + jmrq + '\'' +
                ", jdrq='" + jdrq + '\'' +
                ", zzdabh='" + zzdabh + '\'' +
                ", xyxe='" + xyxe + '\'' +
                ", khx='" + khx + '\'' +
                ", yxfz='" + yxfz + '\'' +
                ", zhanghao='" + zhanghao + '\'' +
                ", ylh='" + ylh + '\'' +
                ", status='" + status + '\'' +
                ", ywzt='" + ywzt + '\'' +
                ", PUBLISH_DATE='" + PUBLISH_DATE + '\'' +
                ", TERMINATE_DATE='" + TERMINATE_DATE + '\'' +
                ", xbbhOBJECT_VERSION_NUMBER='" + xbbhOBJECT_VERSION_NUMBER + '\'' +
                ", CREATION_DATE='" + CREATION_DATE + '\'' +
                ", CREATED_BY='" + CREATED_BY + '\'' +
                ", LAST_UPDATED_BY='" + LAST_UPDATED_BY + '\'' +
                ", LAST_UPDATE_DATE='" + LAST_UPDATE_DATE + '\'' +
                ", LAST_UPDATE_LOGIN='" + LAST_UPDATE_LOGIN + '\'' +
                ", PROGRAM_APPLICATION_ID='" + PROGRAM_APPLICATION_ID + '\'' +
                ", PROGRAM_ID='" + PROGRAM_ID + '\'' +
                ", PROGRAM_UPDATE_DATE='" + PROGRAM_UPDATE_DATE + '\'' +
                ", REQUEST_ID='" + REQUEST_ID + '\'' +
                ", ATTRIBUTE_CATEGORY='" + ATTRIBUTE_CATEGORY + '\'' +
                ", xyms='" + xyms + '\'' +
                ", yxqy='" + yxqy + '\'' +
                ", SHORT_NAME='" + SHORT_NAME + '\'' +
                ", yycs='" + yycs + '\'' +
                ", bz='" + bz + '\'' +
                ", STATISTICS_ADJUST='" + STATISTICS_ADJUST + '\'' +
                ", ADJUST_START_DATE='" + ADJUST_START_DATE + '\'' +
                ", ADJUST_END_DATE='" + ADJUST_END_DATE + '\'' +
                ", modedatacreater='" + modedatacreater + '\'' +
                ", modedatacreatertype='" + modedatacreatertype + '\'' +
                ", modedatacreatedate='" + modedatacreatedate + '\'' +
                ", modedatacreatetime='" + modedatacreatetime + '\'' +
                ", modeUUID='" + modeUUID + '\'' +
                ", formmodeid='" + formmodeid + '\'' +
                ", jmpinl='" + jmpinl + '\'' +
                ", REAL_ESTATE_RANKING='" + REAL_ESTATE_RANKING + '\'' +
                ", TOWN='" + TOWN + '\'' +
                ", PROPERTY_STRATEGY='" + PROPERTY_STRATEGY + '\'' +
                ", IS_ELIMINATE='" + IS_ELIMINATE + '\'' +
                ", SOURCE_TYPE='" + SOURCE_TYPE + '\'' +
                ", gj='" + gj + '\'' +
                ", IS_RECORD='" + IS_RECORD + '\'' +
                ", xtsxrq='" + xtsxrq + '\'' +
                '}';
    }
}
