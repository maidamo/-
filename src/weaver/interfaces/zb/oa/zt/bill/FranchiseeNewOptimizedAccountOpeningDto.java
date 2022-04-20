package weaver.interfaces.zb.oa.zt.bill;

/**
 * 加盟商新建/优化开户申请
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/12
 * Time: 0:04
 * Description: No Description
 */
public class FranchiseeNewOptimizedAccountOpeningDto {
    /**mainid*/private String mainid;
    /**id*/private String id;
    /**地址*/private String dz;
    /**收货人联系方式*/private String shrlxfs;
    /**纸质档案编号*/private String zzdabh;
    /**是否已转档*/private String sfyzd;
    /**加盟日期*/private String jmrq;
    /**收货人*/private String shr1;
    /**收货电话*/private String shdh;
    /**收货地址*/private String shdz;
    /**信用限额*/private String xyxe;
    /**银行分支*/private String yxfz;
    /**开户行*/private String khx;
    /**系统失效日期*/private String xtsxrq;
    /**建档日期*/private String jdrq;
    /**失效原因*/private String sxyy;
    /**初期保证金*/private String cqbzj;
    /**当前保证金*/private String dqbzj;
    /**运营城市*/private String yycs;
    /**品类*/private String pl;
    /**信用模式*/private String xyms;
    /**币种*/private String bz;
    /**客户类型*/private String khlx;
    /**备注*/private String bz1;
    /**统计调整状态*/private String tjdzzt;
    /**统计调整开始时间*/private String tjdzkssj;
    /**统计调整结束时间*/private String tjdzjssj;
    /**授权号  */private String sqh;
    /**业务状态 */private String OPERATION_STATUS;
    /**银行账号 */private String yxzh;
    /**是否归档 */private String isrecord;
    /**营销区域 */private String yxqy;
    /**选择客户*/private String oldAccountNumber;

    /**地产百强排名*/private String dcbqpm;
    /**地产所属战略*/private String ssdczl;

    public String getDcbqpm() {
        return dcbqpm;
    }

    public void setDcbqpm(String dcbqpm) {
        this.dcbqpm = dcbqpm;
    }

    public String getSsdczl() {
        return ssdczl;
    }

    public void setSsdczl(String ssdczl) {
        this.ssdczl = ssdczl;
    }

    public String getOldAccountNumber() {
        return oldAccountNumber;
    }

    public void setOldAccountNumber(String oldAccountNumber) {
        this.oldAccountNumber = oldAccountNumber;
    }

    public String getSqh() {
        return sqh;
    }

    public void setSqh(String sqh) {
        this.sqh = sqh;
    }

    public String getOPERATION_STATUS() {
        return OPERATION_STATUS;
    }

    public void setOPERATION_STATUS(String OPERATION_STATUS) {
        this.OPERATION_STATUS = OPERATION_STATUS;
    }

    public String getYxzh() {
        return yxzh;
    }

    public void setYxzh(String yxzh) {
        this.yxzh = yxzh;
    }

    public String getIsrecord() {
        return isrecord;
    }

    public void setIsrecord(String isrecord) {
        this.isrecord = isrecord;
    }

    public String getYxqy() {
        return yxqy;
    }

    public void setYxqy(String yxqy) {
        this.yxqy = yxqy;
    }

    public String getTjdzzt() {
        return tjdzzt;
    }

    public void setTjdzzt(String tjdzzt) {
        this.tjdzzt = tjdzzt;
    }

    public String getTjdzkssj() {
        return tjdzkssj;
    }

    public void setTjdzkssj(String tjdzkssj) {
        this.tjdzkssj = tjdzkssj;
    }

    public String getTjdzjssj() {
        return tjdzjssj;
    }

    public void setTjdzjssj(String tjdzjssj) {
        this.tjdzjssj = tjdzjssj;
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
     * 获取 收货人联系方式
     *
     * @return shrlxfs 收货人联系方式
     */
    public String getShrlxfs() {
        return this.shrlxfs;
    }

    /**
     * 设置 收货人联系方式
     *
     * @param shrlxfs 收货人联系方式
     */
    public void setShrlxfs(String shrlxfs) {
        this.shrlxfs = shrlxfs;
    }

    /**
     * 获取 纸质档案编号
     *
     * @return zzdabh 纸质档案编号
     */
    public String getZzdabh() {
        return this.zzdabh;
    }

    /**
     * 设置 纸质档案编号
     *
     * @param zzdabh 纸质档案编号
     */
    public void setZzdabh(String zzdabh) {
        this.zzdabh = zzdabh;
    }

    /**
     * 获取 是否已转档
     *
     * @return sfyzd 是否已转档
     */
    public String getSfyzd() {
        return this.sfyzd;
    }

    /**
     * 设置 是否已转档
     *
     * @param sfyzd 是否已转档
     */
    public void setSfyzd(String sfyzd) {
        this.sfyzd = sfyzd;
    }

    /**
     * 获取 加盟日期
     *
     * @return jmrq 加盟日期
     */
    public String getJmrq() {
        return this.jmrq;
    }

    /**
     * 设置 加盟日期
     *
     * @param jmrq 加盟日期
     */
    public void setJmrq(String jmrq) {
        this.jmrq = jmrq;
    }

    /**
     * 获取 收货人
     *
     * @return shr1 收货人
     */
    public String getShr1() {
        return this.shr1;
    }

    /**
     * 设置 收货人
     *
     * @param shr1 收货人
     */
    public void setShr1(String shr1) {
        this.shr1 = shr1;
    }

    /**
     * 获取 收货电话
     *
     * @return shdh 收货电话
     */
    public String getShdh() {
        return this.shdh;
    }

    /**
     * 设置 收货电话
     *
     * @param shdh 收货电话
     */
    public void setShdh(String shdh) {
        this.shdh = shdh;
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
     * 获取 信用限额
     *
     * @return xyxe 信用限额
     */
    public String getXyxe() {
        return this.xyxe;
    }

    /**
     * 设置 信用限额
     *
     * @param xyxe 信用限额
     */
    public void setXyxe(String xyxe) {
        this.xyxe = xyxe;
    }

    /**
     * 获取 银行分支
     *
     * @return yxfz 银行分支
     */
    public String getYxfz() {
        return this.yxfz;
    }

    /**
     * 设置 银行分支
     *
     * @param yxfz 银行分支
     */
    public void setYxfz(String yxfz) {
        this.yxfz = yxfz;
    }

    /**
     * 获取 开户行
     *
     * @return khx 开户行
     */
    public String getKhx() {
        return this.khx;
    }

    /**
     * 设置 开户行
     *
     * @param khx 开户行
     */
    public void setKhx(String khx) {
        this.khx = khx;
    }

    /**
     * 获取 系统失效日期
     *
     * @return xtsxrq 系统失效日期
     */
    public String getXtsxrq() {
        return this.xtsxrq;
    }

    /**
     * 设置 系统失效日期
     *
     * @param xtsxrq 系统失效日期
     */
    public void setXtsxrq(String xtsxrq) {
        this.xtsxrq = xtsxrq;
    }

    /**
     * 获取 建档日期
     *
     * @return jdrq 建档日期
     */
    public String getJdrq() {
        return this.jdrq;
    }

    /**
     * 设置 建档日期
     *
     * @param jdrq 建档日期
     */
    public void setJdrq(String jdrq) {
        this.jdrq = jdrq;
    }

    /**
     * 获取 失效原因
     *
     * @return sxyy 失效原因
     */
    public String getSxyy() {
        return this.sxyy;
    }

    /**
     * 设置 失效原因
     *
     * @param sxyy 失效原因
     */
    public void setSxyy(String sxyy) {
        this.sxyy = sxyy;
    }

    /**
     * 获取 初期保证金
     *
     * @return cqbzj 初期保证金
     */
    public String getCqbzj() {
        return this.cqbzj;
    }

    /**
     * 设置 初期保证金
     *
     * @param cqbzj 初期保证金
     */
    public void setCqbzj(String cqbzj) {
        this.cqbzj = cqbzj;
    }

    /**
     * 获取 当前保证金
     *
     * @return dqbzj 当前保证金
     */
    public String getDqbzj() {
        return this.dqbzj;
    }

    /**
     * 设置 当前保证金
     *
     * @param dqbzj 当前保证金
     */
    public void setDqbzj(String dqbzj) {
        this.dqbzj = dqbzj;
    }

    /**
     * 获取 运营城市
     *
     * @return yycs 运营城市
     */
    public String getYycs() {
        return this.yycs;
    }

    /**
     * 设置 运营城市
     *
     * @param yycs 运营城市
     */
    public void setYycs(String yycs) {
        this.yycs = yycs;
    }

    /**
     * 获取 品类
     *
     * @return pl 品类
     */
    public String getPl() {
        return this.pl;
    }

    /**
     * 设置 品类
     *
     * @param pl 品类
     */
    public void setPl(String pl) {
        this.pl = pl;
    }

    /**
     * 获取 信用模式
     *
     * @return xyms 信用模式
     */
    public String getXyms() {
        return this.xyms;
    }

    /**
     * 设置 信用模式
     *
     * @param xyms 信用模式
     */
    public void setXyms(String xyms) {
        this.xyms = xyms;
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

    @Override
    public String toString() {
        return "FranchiseeNewOptimizedAccountOpeningDto{" +
                "mainid='" + mainid + '\'' +
                ", id='" + id + '\'' +
                ", dz='" + dz + '\'' +
                ", shrlxfs='" + shrlxfs + '\'' +
                ", zzdabh='" + zzdabh + '\'' +
                ", sfyzd='" + sfyzd + '\'' +
                ", jmrq='" + jmrq + '\'' +
                ", shr1='" + shr1 + '\'' +
                ", shdh='" + shdh + '\'' +
                ", shdz='" + shdz + '\'' +
                ", xyxe='" + xyxe + '\'' +
                ", yxfz='" + yxfz + '\'' +
                ", khx='" + khx + '\'' +
                ", xtsxrq='" + xtsxrq + '\'' +
                ", jdrq='" + jdrq + '\'' +
                ", sxyy='" + sxyy + '\'' +
                ", cqbzj='" + cqbzj + '\'' +
                ", dqbzj='" + dqbzj + '\'' +
                ", yycs='" + yycs + '\'' +
                ", pl='" + pl + '\'' +
                ", xyms='" + xyms + '\'' +
                ", bz='" + bz + '\'' +
                ", khlx='" + khlx + '\'' +
                ", bz1='" + bz1 + '\'' +
                ", tjdzzt='" + tjdzzt + '\'' +
                ", tjdzkssj='" + tjdzkssj + '\'' +
                ", tjdzjssj='" + tjdzjssj + '\'' +
                ", sqh='" + sqh + '\'' +
                ", OPERATION_STATUS='" + OPERATION_STATUS + '\'' +
                ", yxzh='" + yxzh + '\'' +
                ", isrecord='" + isrecord + '\'' +
                ", yxqy='" + yxqy + '\'' +
                ", oldAccountNumber='" + oldAccountNumber + '\'' +
                ", dcbqpm='" + dcbqpm + '\'' +
                ", ssdczl='" + ssdczl + '\'' +
                '}';
    }
}
