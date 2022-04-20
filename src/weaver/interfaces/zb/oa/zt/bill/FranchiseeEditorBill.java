package weaver.interfaces.zb.oa.zt.bill;

public class FranchiseeEditorBill {
    /**编号*/private String bh;
    /**加盟商F码*/private String jmsfm;
    /**组织类型*/private String zzlx;
    /**营业执照名称*/private String yyzzmc;
    /**客户简称*/private String khjc;
    /**统一社会信用代码/注册号*/private String tyshxydmzch;
    /**营业执照注册地址*/private String yyzzzcdz;
    /**行政区域*/private String xzqy;
    /**法人/经营者身份证*/private String frjyzsfz;
    /**法人/经营者*/private String frjyz;
    /**实际控制人/公司*/private String sjkzrgs;
    /**行政区类别*/private String xzqlb;
    /**实际控制人身份证*/private String sjkzrsfz;
    /**状态*/private String zt;
    /**相关附件（业务终止申请表等*/private String xgfjywzzsqbd;
    /**省份*/private String sf;
    /**城市*/private String cs;
    /**区县*/private String qx;
    /**选择转让客户*/private String xzzrkh;
    /**省份名称*/private String sfmc;
    /**城市名称*/private String csmc;
    /**区县名称*/private String qxmc;
    /**联系号码*/private String lxhm;
    /**重复验证字段*/private String cfyzzd;
    /**组织id*/private String accountSiteID;
    /**业务状态*/private String OPERATIONSTATUS;
    /**对应客户*/private String oldAccountNumber;

    public String getOldAccountNumber() {
        return oldAccountNumber;
    }

    public void setOldAccountNumber(String oldAccountNumber) {
        this.oldAccountNumber = oldAccountNumber;
    }

    public String getOPERATIONSTATUS() {
        return OPERATIONSTATUS;
    }

    public void setOPERATIONSTATUS(String OPERATIONSTATUS) {
        this.OPERATIONSTATUS = OPERATIONSTATUS;
    }

    public String getAccountSiteID() {
        return accountSiteID;
    }

    public void setAccountSiteID(String accountSiteID) {
        this.accountSiteID = accountSiteID;
    }

    public String getCfyzzd() {
        return cfyzzd;
    }

    public void setCfyzzd(String cfyzzd) {
        this.cfyzzd = cfyzzd;
    }

    public String getBh() {
        return bh;
    }

    public void setBh(String bh) {
        this.bh = bh;
    }

    public String getJmsfm() {
        return jmsfm;
    }

    public void setJmsfm(String jmsfm) {
        this.jmsfm = jmsfm;
    }

    public String getZzlx() {
        return zzlx;
    }

    public void setZzlx(String zzlx) {
        this.zzlx = zzlx;
    }

    public String getYyzzmc() {
        return yyzzmc;
    }

    public void setYyzzmc(String yyzzmc) {
        this.yyzzmc = yyzzmc;
    }

    public String getKhjc() {
        return khjc;
    }

    public void setKhjc(String khjc) {
        this.khjc = khjc;
    }

    public String getTyshxydmzch() {
        return tyshxydmzch;
    }

    public void setTyshxydmzch(String tyshxydmzch) {
        this.tyshxydmzch = tyshxydmzch;
    }

    public String getYyzzzcdz() {
        return yyzzzcdz;
    }

    public void setYyzzzcdz(String yyzzzcdz) {
        this.yyzzzcdz = yyzzzcdz;
    }

    public String getXzqy() {
        return xzqy;
    }

    public void setXzqy(String xzqy) {
        this.xzqy = xzqy;
    }

    public String getFrjyzsfz() {
        return frjyzsfz;
    }

    public void setFrjyzsfz(String frjyzsfz) {
        this.frjyzsfz = frjyzsfz;
    }

    public String getFrjyz() {
        return frjyz;
    }

    public void setFrjyz(String frjyz) {
        this.frjyz = frjyz;
    }

    public String getSjkzrgs() {
        return sjkzrgs;
    }

    public void setSjkzrgs(String sjkzrgs) {
        this.sjkzrgs = sjkzrgs;
    }

    public String getXzqlb() {
        return xzqlb;
    }

    public void setXzqlb(String xzqlb) {
        this.xzqlb = xzqlb;
    }

    public String getSjkzrsfz() {
        return sjkzrsfz;
    }

    public void setSjkzrsfz(String sjkzrsfz) {
        this.sjkzrsfz = sjkzrsfz;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }

    public String getXgfjywzzsqbd() {
        return xgfjywzzsqbd;
    }

    public void setXgfjywzzsqbd(String xgfjywzzsqbd) {
        this.xgfjywzzsqbd = xgfjywzzsqbd;
    }

    public String getSf() {
        return sf;
    }

    public void setSf(String sf) {
        this.sf = sf;
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

    public String getXzzrkh() {
        return xzzrkh;
    }

    public void setXzzrkh(String xzzrkh) {
        this.xzzrkh = xzzrkh;
    }

    public String getSfmc() {
        return sfmc;
    }

    public void setSfmc(String sfmc) {
        this.sfmc = sfmc;
    }

    public String getCsmc() {
        return csmc;
    }

    public void setCsmc(String csmc) {
        this.csmc = csmc;
    }

    public String getQxmc() {
        return qxmc;
    }

    public void setQxmc(String qxmc) {
        this.qxmc = qxmc;
    }

    public String getLxhm() {
        return lxhm;
    }

    public void setLxhm(String lxhm) {
        this.lxhm = lxhm;
    }

    @Override
    public String toString() {
        return "FranchiseeEditorBill{" +
                "bh='" + bh + '\'' +
                ", jmsfm='" + jmsfm + '\'' +
                ", zzlx='" + zzlx + '\'' +
                ", yyzzmc='" + yyzzmc + '\'' +
                ", khjc='" + khjc + '\'' +
                ", tyshxydmzch='" + tyshxydmzch + '\'' +
                ", yyzzzcdz='" + yyzzzcdz + '\'' +
                ", xzqy='" + xzqy + '\'' +
                ", frjyzsfz='" + frjyzsfz + '\'' +
                ", frjyz='" + frjyz + '\'' +
                ", sjkzrgs='" + sjkzrgs + '\'' +
                ", xzqlb='" + xzqlb + '\'' +
                ", sjkzrsfz='" + sjkzrsfz + '\'' +
                ", zt='" + zt + '\'' +
                ", xgfjywzzsqbd='" + xgfjywzzsqbd + '\'' +
                ", sf='" + sf + '\'' +
                ", cs='" + cs + '\'' +
                ", qx='" + qx + '\'' +
                ", xzzrkh='" + xzzrkh + '\'' +
                ", sfmc='" + sfmc + '\'' +
                ", csmc='" + csmc + '\'' +
                ", qxmc='" + qxmc + '\'' +
                ", lxhm='" + lxhm + '\'' +
                ", cfyzzd='" + cfyzzd + '\'' +
                ", accountSiteID='" + accountSiteID + '\'' +
                ", OPERATIONSTATUS='" + OPERATIONSTATUS + '\'' +
                ", oldAccountNumber='" + oldAccountNumber + '\'' +
                '}';
    }
}
