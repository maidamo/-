package weaver.interfaces.zb.oa.zt.bill;

public class LetterEntity {
    /**加盟商F码*/private String jmsfm;
    /**加盟商id*/private String jmsid;
    /**函件类型*/private String hjlx;
    /**经办人*/private String jbr;
    /**函件编号*/private String hjbh;
    /**发件日期*/private String fjrq;
    /**生效日期*/private String sxrq;
    /**登记日期*/private String djrq;
    /**签订日期*/private String qdrq;
    /**函件简要内容*/private String hjjynr;
    /**存档日期*/private String cdrq;
    /**物料退回接收日期*/private String wlthjsrq;
    /**退回物料名称*/private String thwlmc;
    /**备注*/private String bz;
    /**附件*/private String fj;
    /**业务实体ID*/private String ACCOUNT_SITE_ID;
    /**品类ID*/private String UNIT_ID;
    /**加盟商名称*/private String jmsmc;

    /**建模数据创建人*/private String modedatacreater;
    /**建模数据创建人类型*/private String modedatacreatertype;
    /**建模数据创建日期*/private String modedatacreatedate;
    /**建模数据创建时间*/private String modedatacreatetime;
    /**modeUUID*/private String modeUUID;
    /**formmodeid*/private String formmodeid;

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

    public String getJmsfm() {
        return jmsfm;
    }

    public void setJmsfm(String jmsfm) {
        this.jmsfm = jmsfm;
    }

    public String getJmsid() {
        return jmsid;
    }

    public void setJmsid(String jmsid) {
        this.jmsid = jmsid;
    }

    public String getHjlx() {
        return hjlx;
    }

    public void setHjlx(String hjlx) {
        this.hjlx = hjlx;
    }

    public String getJbr() {
        return jbr;
    }

    public void setJbr(String jbr) {
        this.jbr = jbr;
    }

    public String getHjbh() {
        return hjbh;
    }

    public void setHjbh(String hjbh) {
        this.hjbh = hjbh;
    }

    public String getFjrq() {
        return fjrq;
    }

    public void setFjrq(String fjrq) {
        this.fjrq = fjrq;
    }

    public String getSxrq() {
        return sxrq;
    }

    public void setSxrq(String sxrq) {
        this.sxrq = sxrq;
    }

    public String getDjrq() {
        return djrq;
    }

    public void setDjrq(String djrq) {
        this.djrq = djrq;
    }

    public String getQdrq() {
        return qdrq;
    }

    public void setQdrq(String qdrq) {
        this.qdrq = qdrq;
    }

    public String getHjjynr() {
        return hjjynr;
    }

    public void setHjjynr(String hjjynr) {
        this.hjjynr = hjjynr;
    }

    public String getCdrq() {
        return cdrq;
    }

    public void setCdrq(String cdrq) {
        this.cdrq = cdrq;
    }

    public String getWlthjsrq() {
        return wlthjsrq;
    }

    public void setWlthjsrq(String wlthjsrq) {
        this.wlthjsrq = wlthjsrq;
    }

    public String getThwlmc() {
        return thwlmc;
    }

    public void setThwlmc(String thwlmc) {
        this.thwlmc = thwlmc;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getFj() {
        return fj;
    }

    public void setFj(String fj) {
        this.fj = fj;
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

    public String getJmsmc() {
        return jmsmc;
    }

    public void setJmsmc(String jmsmc) {
        this.jmsmc = jmsmc;
    }

    @Override
    public String toString() {
        return "LetterEntity{" +
                "jmsfm='" + jmsfm + '\'' +
                ", jmsid='" + jmsid + '\'' +
                ", hjlx='" + hjlx + '\'' +
                ", jbr='" + jbr + '\'' +
                ", hjbh='" + hjbh + '\'' +
                ", fjrq='" + fjrq + '\'' +
                ", sxrq='" + sxrq + '\'' +
                ", djrq='" + djrq + '\'' +
                ", qdrq='" + qdrq + '\'' +
                ", hjjynr='" + hjjynr + '\'' +
                ", cdrq='" + cdrq + '\'' +
                ", wlthjsrq='" + wlthjsrq + '\'' +
                ", thwlmc='" + thwlmc + '\'' +
                ", bz='" + bz + '\'' +
                ", fj='" + fj + '\'' +
                ", ACCOUNT_SITE_ID='" + ACCOUNT_SITE_ID + '\'' +
                ", UNIT_ID='" + UNIT_ID + '\'' +
                ", jmsmc='" + jmsmc + '\'' +
                ", modedatacreater='" + modedatacreater + '\'' +
                ", modedatacreatertype='" + modedatacreatertype + '\'' +
                ", modedatacreatedate='" + modedatacreatedate + '\'' +
                ", modedatacreatetime='" + modedatacreatetime + '\'' +
                ", modeUUID='" + modeUUID + '\'' +
                ", formmodeid='" + formmodeid + '\'' +
                '}';
    }
}
