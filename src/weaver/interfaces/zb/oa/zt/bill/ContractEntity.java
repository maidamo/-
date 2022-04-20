package weaver.interfaces.zb.oa.zt.bill;

public class ContractEntity {
    /**授权品类*/private String sqpl;
//    /**加盟商F码*/private String jmsfm;
    /**合同名称*/private String htmc;
    /**加盟日期*/private String sxrq;
    /**合同编号*/private String htbh;
    /**签订日期*/private String qxz1;
    /**结束日期*/private String qxz;
    /**合同签订人*/private String htqdr;
    /**是否授权*/private String sfsq;
    /**合同业绩目标*/private String htyjmb;
    /**合同性质*/private String htxz;
    /**月度考核指标*/private String ydkhzb;
    /**合同附件*/private String htfj;
    /**合同补充协议*/private String htbcxy;
    /**备注*/private String bz;

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

    public String getSqpl() {
        return sqpl;
    }

    public void setSqpl(String sqpl) {
        this.sqpl = sqpl;
    }

//    public String getJmsfm() {
//        return jmsfm;
//    }
//
//    public void setJmsfm(String jmsfm) {
//        this.jmsfm = jmsfm;
//    }

    public String getHtmc() {
        return htmc;
    }

    public void setHtmc(String htmc) {
        this.htmc = htmc;
    }

    public String getSxrq() {
        return sxrq;
    }

    public void setSxrq(String sxrq) {
        this.sxrq = sxrq;
    }

    public String getHtbh() {
        return htbh;
    }

    public void setHtbh(String htbh) {
        this.htbh = htbh;
    }

    public String getQxz1() {
        return qxz1;
    }

    public void setQxz1(String qxz1) {
        this.qxz1 = qxz1;
    }

    public String getQxz() {
        return qxz;
    }

    public void setQxz(String qxz) {
        this.qxz = qxz;
    }

    public String getHtqdr() {
        return htqdr;
    }

    public void setHtqdr(String htqdr) {
        this.htqdr = htqdr;
    }

    public String getSfsq() {
        return sfsq;
    }

    public void setSfsq(String sfsq) {
        this.sfsq = sfsq;
    }

    public String getHtyjmb() {
        return htyjmb;
    }

    public void setHtyjmb(String htyjmb) {
        this.htyjmb = htyjmb;
    }

    public String getHtxz() {
        return htxz;
    }

    public void setHtxz(String htxz) {
        this.htxz = htxz;
    }

    public String getYdkhzb() {
        return ydkhzb;
    }

    public void setYdkhzb(String ydkhzb) {
        this.ydkhzb = ydkhzb;
    }

    public String getHtfj() {
        return htfj;
    }

    public void setHtfj(String htfj) {
        this.htfj = htfj;
    }

    public String getHtbcxy() {
        return htbcxy;
    }

    public void setHtbcxy(String htbcxy) {
        this.htbcxy = htbcxy;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    @Override
    public String toString() {
        return "ContractEntity{" +
                "sqpl='" + sqpl + '\'' +
                ", htmc='" + htmc + '\'' +
                ", sxrq='" + sxrq + '\'' +
                ", htbh='" + htbh + '\'' +
                ", qxz1='" + qxz1 + '\'' +
                ", qxz='" + qxz + '\'' +
                ", htqdr='" + htqdr + '\'' +
                ", sfsq='" + sfsq + '\'' +
                ", htyjmb='" + htyjmb + '\'' +
                ", htxz='" + htxz + '\'' +
                ", ydkhzb='" + ydkhzb + '\'' +
                ", htfj='" + htfj + '\'' +
                ", htbcxy='" + htbcxy + '\'' +
                ", bz='" + bz + '\'' +
                ", modedatacreater='" + modedatacreater + '\'' +
                ", modedatacreatertype='" + modedatacreatertype + '\'' +
                ", modedatacreatedate='" + modedatacreatedate + '\'' +
                ", modedatacreatetime='" + modedatacreatetime + '\'' +
                ", modeUUID='" + modeUUID + '\'' +
                ", formmodeid='" + formmodeid + '\'' +
                '}';
    }
}
