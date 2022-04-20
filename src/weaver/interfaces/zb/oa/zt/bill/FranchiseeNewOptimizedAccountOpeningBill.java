package weaver.interfaces.zb.oa.zt.bill;

/**
 * 加盟商新建/优化开户申请
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/12
 * Time: 0:04
 * Description: No Description
 */
public class FranchiseeNewOptimizedAccountOpeningBill {
    /**requestid*/private String requestid;
    /**id*/private String id;
    /**编号*/private String bh;
    /**加盟商F码*/private String jmsfm;
    /**客户简称*/private String khjc;
    /**营业执照名称*/private String yyzzmc;
    /**统一社会信用代码/注册号*/private String tyshxydmzch;
    /**组织类型*/private String zzlx;
    /**营业执照注册地址*/private String yyzzzcdz;
    /**法人/经营者*/private String frjyz;
    /**法人/经营者手机号*/private String frjyzsjh;
    /**法人/经营者身份证*/private String frjyzsfz;
    /**实际控制人/公司*/private String sjkzrgs;
    /**实际控制人身份证*/private String sjkzrsfz;
    /**执照经营状态*/private String zzjyzt;
    /**状态*/private String zt;
    /**行政区域*/private String xzqy;
    /**行政区类别*/private String xzqlb;
    /**省区*/private String sf;
    /**城市*/private String cs;
    /**区县*/private String qx;
    /**镇*/private String z;
    /**币种*/private String bz;
    /**备注*/private String bz1;
    /**收货地址*/private String shdz;
    /**收货人*/private String shr;
    /**收货人手机号码*/private String shrsjhm;
    /**客户类型*/private String khlx;
    /**品牌*/private String pp;
    /**招商*/private String zs;
    /**地址*/private String dz;
    /**客户*/private String kh;
    /**建店唯一标识*/private String sourceId;
    /**国家*/private String gj;
    /**对应客户*/private String oldAccountNumber;
    /**加盟商id*/private String custAccountId;

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

    public String getGj() {
        return gj;
    }

    public void setGj(String gj) {
        this.gj = gj;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * 获取 requestid
     *
     * @return requestid requestid
     */
    public String getRequestid() {
        return this.requestid;
    }

    /**
     * 设置 requestid
     *
     * @param requestid requestid
     */
    public void setRequestid(String requestid) {
        this.requestid = requestid;
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
     * 获取 编号
     *
     * @return bh 编号
     */
    public String getBh() {
        return this.bh;
    }

    /**
     * 设置 编号
     *
     * @param bh 编号
     */
    public void setBh(String bh) {
        this.bh = bh;
    }

    /**
     * 获取 加盟商F码
     *
     * @return jmsfm 加盟商F码
     */
    public String getJmsfm() {
        return this.jmsfm;
    }

    /**
     * 设置 加盟商F码
     *
     * @param jmsfm 加盟商F码
     */
    public void setJmsfm(String jmsfm) {
        this.jmsfm = jmsfm;
    }

    /**
     * 获取 客户简称
     *
     * @return khjc 客户简称
     */
    public String getKhjc() {
        return this.khjc;
    }

    /**
     * 设置 客户简称
     *
     * @param khjc 客户简称
     */
    public void setKhjc(String khjc) {
        this.khjc = khjc;
    }

    /**
     * 获取 营业执照名称
     *
     * @return yyzzmc 营业执照名称
     */
    public String getYyzzmc() {
        return this.yyzzmc;
    }

    /**
     * 设置 营业执照名称
     *
     * @param yyzzmc 营业执照名称
     */
    public void setYyzzmc(String yyzzmc) {
        this.yyzzmc = yyzzmc;
    }

    /**
     * 获取 统一社会信用代码注册号
     *
     * @return tyshxydmzch 统一社会信用代码注册号
     */
    public String getTyshxydmzch() {
        return this.tyshxydmzch;
    }

    /**
     * 设置 统一社会信用代码注册号
     *
     * @param tyshxydmzch 统一社会信用代码注册号
     */
    public void setTyshxydmzch(String tyshxydmzch) {
        this.tyshxydmzch = tyshxydmzch;
    }

    /**
     * 获取 组织类型
     *
     * @return zzlx 组织类型
     */
    public String getZzlx() {
        return this.zzlx;
    }

    /**
     * 设置 组织类型
     *
     * @param zzlx 组织类型
     */
    public void setZzlx(String zzlx) {
        this.zzlx = zzlx;
    }

    /**
     * 获取 营业执照注册地址
     *
     * @return yyzzzcdz 营业执照注册地址
     */
    public String getYyzzzcdz() {
        return this.yyzzzcdz;
    }

    /**
     * 设置 营业执照注册地址
     *
     * @param yyzzzcdz 营业执照注册地址
     */
    public void setYyzzzcdz(String yyzzzcdz) {
        this.yyzzzcdz = yyzzzcdz;
    }

    /**
     * 获取 法人经营者
     *
     * @return frjyz 法人经营者
     */
    public String getFrjyz() {
        return this.frjyz;
    }

    /**
     * 设置 法人经营者
     *
     * @param frjyz 法人经营者
     */
    public void setFrjyz(String frjyz) {
        this.frjyz = frjyz;
    }

    /**
     * 获取 法人经营者手机号
     *
     * @return frjyzsjh 法人经营者手机号
     */
    public String getFrjyzsjh() {
        return this.frjyzsjh;
    }

    /**
     * 设置 法人经营者手机号
     *
     * @param frjyzsjh 法人经营者手机号
     */
    public void setFrjyzsjh(String frjyzsjh) {
        this.frjyzsjh = frjyzsjh;
    }

    /**
     * 获取 法人经营者身份证
     *
     * @return frjyzsfz 法人经营者身份证
     */
    public String getFrjyzsfz() {
        return this.frjyzsfz;
    }

    /**
     * 设置 法人经营者身份证
     *
     * @param frjyzsfz 法人经营者身份证
     */
    public void setFrjyzsfz(String frjyzsfz) {
        this.frjyzsfz = frjyzsfz;
    }

    /**
     * 获取 实际控制人公司
     *
     * @return sjkzrgs 实际控制人公司
     */
    public String getSjkzrgs() {
        return this.sjkzrgs;
    }

    /**
     * 设置 实际控制人公司
     *
     * @param sjkzrgs 实际控制人公司
     */
    public void setSjkzrgs(String sjkzrgs) {
        this.sjkzrgs = sjkzrgs;
    }

    /**
     * 获取 实际控制人身份证
     *
     * @return sjkzrsfz 实际控制人身份证
     */
    public String getSjkzrsfz() {
        return this.sjkzrsfz;
    }

    /**
     * 设置 实际控制人身份证
     *
     * @param sjkzrsfz 实际控制人身份证
     */
    public void setSjkzrsfz(String sjkzrsfz) {
        this.sjkzrsfz = sjkzrsfz;
    }

    /**
     * 获取 执照经营状态
     *
     * @return zzjyzt 执照经营状态
     */
    public String getZzjyzt() {
        return this.zzjyzt;
    }

    /**
     * 设置 执照经营状态
     *
     * @param zzjyzt 执照经营状态
     */
    public void setZzjyzt(String zzjyzt) {
        this.zzjyzt = zzjyzt;
    }

    /**
     * 获取 状态
     *
     * @return zt 状态
     */
    public String getZt() {
        return this.zt;
    }

    /**
     * 设置 状态
     *
     * @param zt 状态
     */
    public void setZt(String zt) {
        this.zt = zt;
    }

    /**
     * 获取 行政区域
     *
     * @return xzqy 行政区域
     */
    public String getXzqy() {
        return this.xzqy;
    }

    /**
     * 设置 行政区域
     *
     * @param xzqy 行政区域
     */
    public void setXzqy(String xzqy) {
        this.xzqy = xzqy;
    }

    /**
     * 获取 行政区类别
     *
     * @return xzqlb 行政区类别
     */
    public String getXzqlb() {
        return this.xzqlb;
    }

    /**
     * 设置 行政区类别
     *
     * @param xzqlb 行政区类别
     */
    public void setXzqlb(String xzqlb) {
        this.xzqlb = xzqlb;
    }

    /**
     * 获取 省区
     *
     * @return sq 省区
     */
    public String getSf() {
        return this.sf;
    }

    /**
     * 设置 省区
     *
     * @param sf 省区
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
     * 获取 镇
     *
     * @return z 镇
     */
    public String getZ() {
        return this.z;
    }

    /**
     * 设置 镇
     *
     * @param z 镇
     */
    public void setZ(String z) {
        this.z = z;
    }

    /**
     * 获取 币种
     *
     * @return bz 币种
     */
    public String getBz() {
        return this.bz;
    }

    /**
     * 设置 币种
     *
     * @param bz 币种
     */
    public void setBz(String bz) {
        this.bz = bz;
    }

    /**
     * 获取 备注
     *
     * @return bz1 备注
     */
    public String getBz1() {
        return this.bz1;
    }

    /**
     * 设置 备注
     *
     * @param bz1 备注
     */
    public void setBz1(String bz1) {
        this.bz1 = bz1;
    }

    /**
     * 获取 收货地址
     *
     * @return shdz 收货地址
     */
    public String getShdz() {
        return this.shdz;
    }

    /**
     * 设置 收货地址
     *
     * @param shdz 收货地址
     */
    public void setShdz(String shdz) {
        this.shdz = shdz;
    }

    /**
     * 获取 收货人
     *
     * @return shr 收货人
     */
    public String getShr() {
        return this.shr;
    }

    /**
     * 设置 收货人
     *
     * @param shr 收货人
     */
    public void setShr(String shr) {
        this.shr = shr;
    }

    /**
     * 获取 收货人手机号码
     *
     * @return shrsjhm 收货人手机号码
     */
    public String getShrsjhm() {
        return this.shrsjhm;
    }

    /**
     * 设置 收货人手机号码
     *
     * @param shrsjhm 收货人手机号码
     */
    public void setShrsjhm(String shrsjhm) {
        this.shrsjhm = shrsjhm;
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
     * 获取 品牌
     *
     * @return pp 品牌
     */
    public String getPp() {
        return this.pp;
    }

    /**
     * 设置 品牌
     *
     * @param pp 品牌
     */
    public void setPp(String pp) {
        this.pp = pp;
    }

    /**
     * 获取 招商
     *
     * @return zs 招商
     */
    public String getZs() {
        return this.zs;
    }

    /**
     * 设置 招商
     *
     * @param zs 招商
     */
    public void setZs(String zs) {
        this.zs = zs;
    }

    /**
     * 获取 地址
     *
     * @return dz 地址
     */
    public String getDz() {
        return this.dz;
    }

    /**
     * 设置 地址
     *
     * @param dz 地址
     */
    public void setDz(String dz) {
        this.dz = dz;
    }

    /**
     * 获取 客户
     *
     * @return kh 客户
     */
    public String getKh() {
        return this.kh;
    }

    /**
     * 设置 客户
     *
     * @param kh 客户
     */
    public void setKh(String kh) {
        this.kh = kh;
    }

    @Override
    public String toString() {
        return "FranchiseeNewOptimizedAccountOpeningBill{" +
                "requestid='" + requestid + '\'' +
                ", id='" + id + '\'' +
                ", bh='" + bh + '\'' +
                ", jmsfm='" + jmsfm + '\'' +
                ", khjc='" + khjc + '\'' +
                ", yyzzmc='" + yyzzmc + '\'' +
                ", tyshxydmzch='" + tyshxydmzch + '\'' +
                ", zzlx='" + zzlx + '\'' +
                ", yyzzzcdz='" + yyzzzcdz + '\'' +
                ", frjyz='" + frjyz + '\'' +
                ", frjyzsjh='" + frjyzsjh + '\'' +
                ", frjyzsfz='" + frjyzsfz + '\'' +
                ", sjkzrgs='" + sjkzrgs + '\'' +
                ", sjkzrsfz='" + sjkzrsfz + '\'' +
                ", zzjyzt='" + zzjyzt + '\'' +
                ", zt='" + zt + '\'' +
                ", xzqy='" + xzqy + '\'' +
                ", xzqlb='" + xzqlb + '\'' +
                ", sf='" + sf + '\'' +
                ", cs='" + cs + '\'' +
                ", qx='" + qx + '\'' +
                ", z='" + z + '\'' +
                ", bz='" + bz + '\'' +
                ", bz1='" + bz1 + '\'' +
                ", shdz='" + shdz + '\'' +
                ", shr='" + shr + '\'' +
                ", shrsjhm='" + shrsjhm + '\'' +
                ", khlx='" + khlx + '\'' +
                ", pp='" + pp + '\'' +
                ", zs='" + zs + '\'' +
                ", dz='" + dz + '\'' +
                ", kh='" + kh + '\'' +
                ", sourceId='" + sourceId + '\'' +
                ", gj='" + gj + '\'' +
                ", oldAccountNumber='" + oldAccountNumber + '\'' +
                '}';
    }
}
