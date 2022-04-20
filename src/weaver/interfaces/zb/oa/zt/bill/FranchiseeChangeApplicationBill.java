package weaver.interfaces.zb.oa.zt.bill;

/**
 * 加盟商变更申请
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/11
 * Time: 17:59
 * Description: No Description
 */
public class FranchiseeChangeApplicationBill {
    /**requestid*/private String requestid;
    /**id*/private String id;
    /**变更主体类型*/private String bgztlx;
    /**编号*/private String bh;
    /**加盟商F码*/private String jmsfm;
    /**组织类型*/private String zzlx;
    /**客户简称*/private String khjc;
    /**营业执照名称*/private String yyzzmc;
    /**统一社会信用代码/注册号*/private String tyshxydmzch;
    /**营业执照注册地址*/private String yyzzzcdz;
    /**行政区域*/private String xzqy;
    /**法人/经营者手机号*/private String frjyzsjh;
    /**法人/经营者身份证*/private String frjyzsfz;
    /**法人/经营者*/private String frjyz;
    /**实际控制人/公司*/private String sjkzrgs;
    /**行政区类别*/private String xzqlb;
    /**实际控制人身份证*/private String sjkzrsfz;
    /**执照经营状态*/private String zzjyzt;
    /**状态*/private String zt;
    /**转让扩展信息*/private String zrkzxx;
    /**相关附件（业务终止申请表等*/private String xgfjywzzsqbd;
    /**系统关闭日期*/private String xtgbrq;
    /**品类*/private String pl;
    /**地址*/private String dz1;
    /**收货人*/private String shr1;
    /**收货人联系方式*/private String shrlxfs;
    /**纸质档案编号*/private String zzdabh;
    /**是否已转档*/private String sfyzd;
    /**加盟日期*/private String jmrq;
    /**币种*/private String bz1;
    /**收货人*/private String shr;
    /**收货电话*/private String shdh;
    /**收货地址*/private String shdz;
    /**信用限额*/private String xyxe;
    /**信用模式*/private String xyms;
    /**银行分支*/private String yxfz;
    /**开户行*/private String khx;
    /**营销区域*/private String yxqy;
    /**系统失效日期*/private String xtsxrq;
    /**建档日期*/private String jdrq;
    /**失效原因*/private String sxyy;
    /**初期保证金*/private String cqbzj;
    /**当前保证金*/private String dqbzj;
    /**加盟费*/private String jmf;
    /**运营城市*/private String yycs;
    /**备注*/private String bz;
    /**新商营业执照照片*/private String xsyyzzzp;
    /**新商法人身份证照片*/private String xsfrsfzzp;
    /**保证金原始收据照片*/private String bzjyssjzp;
    /**关系证明文件*/private String gxzmwj;
    /**工商变更文件*/private String gsbgwj;
    /**国家*/private String gj;
    /**市名称*/private String smc;
    /**区名称*/private String qmc;
    /**省份*/private String sf;
    /**城市*/private String cs;
    /**区县*/private String qx;
    /**全路径*/private String qlj;
    /**客户名称*/private String khmc;
    /**地址*/private String dz;
    /**选择转让客户*/private String xzzrkh;
    /**转让品类*/private String zrpl;
    /**变更加盟商id*/private String bgjmsid;
    /**变更加盟商F码*/private String bgjmsfm;
    /**变更扩展信息*/private String bgkzxx;
    /**选择加盟商*/private String xzjms;
    /**变更或优化的加盟商品牌id*/private String bghyhdjmsppid;


    public String getXzjms() {
        return xzjms;
    }

    public void setXzjms(String xzjms) {
        this.xzjms = xzjms;
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
     * 获取 变更主体类型
     *
     * @return bgztlx 变更主体类型
     */
    public String getBgztlx() {
        return this.bgztlx;
    }

    /**
     * 设置 变更主体类型
     *
     * @param bgztlx 变更主体类型
     */
    public void setBgztlx(String bgztlx) {
        this.bgztlx = bgztlx;
    }

    /**
     * 获取 选择转让客户
     *
     * @return xzzrkh 选择转让客户
     */
    public String getXzzrkh() {
        return this.xzzrkh;
    }

    /**
     * 设置 选择转让客户
     *
     * @param xzzrkh 选择转让客户
     */
    public void setXzzrkh(String xzzrkh) {
        this.xzzrkh = xzzrkh;
    }

    /**
     * 获取 转让品类
     *
     * @return zrpl 转让品类
     */
    public String getZrpl() {
        return this.zrpl;
    }

    /**
     * 设置 转让品类
     *
     * @param zrpl 转让品类
     */
    public void setZrpl(String zrpl) {
        this.zrpl = zrpl;
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
     * 获取 转让扩展信息
     *
     * @return zrkzxx 转让扩展信息
     */
    public String getZrkzxx() {
        return this.zrkzxx;
    }

    /**
     * 设置 转让扩展信息
     *
     * @param zrkzxx 转让扩展信息
     */
    public void setZrkzxx(String zrkzxx) {
        this.zrkzxx = zrkzxx;
    }

    /**
     * 获取 相关附件（业务终止申请表等
     *
     * @return xgfjywzzsqbd 相关附件（业务终止申请表等
     */
    public String getXgfjywzzsqbd() {
        return this.xgfjywzzsqbd;
    }

    /**
     * 设置 相关附件（业务终止申请表等
     *
     * @param xgfjywzzsqbd 相关附件（业务终止申请表等
     */
    public void setXgfjywzzsqbd(String xgfjywzzsqbd) {
        this.xgfjywzzsqbd = xgfjywzzsqbd;
    }

    /**
     * 获取 系统关闭日期
     *
     * @return xtgbrq 系统关闭日期
     */
    public String getXtgbrq() {
        return this.xtgbrq;
    }

    /**
     * 设置 系统关闭日期
     *
     * @param xtgbrq 系统关闭日期
     */
    public void setXtgbrq(String xtgbrq) {
        this.xtgbrq = xtgbrq;
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
     * 获取 地址
     *
     * @return dz1 地址
     */
    public String getDz1() {
        return this.dz1;
    }

    /**
     * 设置 地址
     *
     * @param dz1 地址
     */
    public void setDz1(String dz1) {
        this.dz1 = dz1;
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
     * 获取 币种
     *
     * @return bz1 币种
     */
    public String getBz1() {
        return this.bz1;
    }

    /**
     * 设置 币种
     *
     * @param bz1 币种
     */
    public void setBz1(String bz1) {
        this.bz1 = bz1;
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
     * 获取 营销区域
     *
     * @return yxqy 营销区域
     */
    public String getYxqy() {
        return this.yxqy;
    }

    /**
     * 设置 营销区域
     *
     * @param yxqy 营销区域
     */
    public void setYxqy(String yxqy) {
        this.yxqy = yxqy;
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
     * 获取 加盟费
     *
     * @return jmf 加盟费
     */
    public String getJmf() {
        return this.jmf;
    }

    /**
     * 设置 加盟费
     *
     * @param jmf 加盟费
     */
    public void setJmf(String jmf) {
        this.jmf = jmf;
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
     * 获取 备注
     *
     * @return bz 备注
     */
    public String getBz() {
        return this.bz;
    }

    /**
     * 设置 备注
     *
     * @param bz 备注
     */
    public void setBz(String bz) {
        this.bz = bz;
    }

    /**
     * 获取 新商营业执照照片
     *
     * @return xsyyzzzp 新商营业执照照片
     */
    public String getXsyyzzzp() {
        return this.xsyyzzzp;
    }

    /**
     * 设置 新商营业执照照片
     *
     * @param xsyyzzzp 新商营业执照照片
     */
    public void setXsyyzzzp(String xsyyzzzp) {
        this.xsyyzzzp = xsyyzzzp;
    }

    /**
     * 获取 新商法人身份证照片
     *
     * @return xsfrsfzzp 新商法人身份证照片
     */
    public String getXsfrsfzzp() {
        return this.xsfrsfzzp;
    }

    /**
     * 设置 新商法人身份证照片
     *
     * @param xsfrsfzzp 新商法人身份证照片
     */
    public void setXsfrsfzzp(String xsfrsfzzp) {
        this.xsfrsfzzp = xsfrsfzzp;
    }

    /**
     * 获取 保证金原始收据照片
     *
     * @return bzjyssjzp 保证金原始收据照片
     */
    public String getBzjyssjzp() {
        return this.bzjyssjzp;
    }

    /**
     * 设置 保证金原始收据照片
     *
     * @param bzjyssjzp 保证金原始收据照片
     */
    public void setBzjyssjzp(String bzjyssjzp) {
        this.bzjyssjzp = bzjyssjzp;
    }

    /**
     * 获取 关系证明文件
     *
     * @return gxzmwj 关系证明文件
     */
    public String getGxzmwj() {
        return this.gxzmwj;
    }

    /**
     * 设置 关系证明文件
     *
     * @param gxzmwj 关系证明文件
     */
    public void setGxzmwj(String gxzmwj) {
        this.gxzmwj = gxzmwj;
    }

    /**
     * 获取 工商变更文件
     *
     * @return gsbgwj 工商变更文件
     */
    public String getGsbgwj() {
        return this.gsbgwj;
    }

    /**
     * 设置 工商变更文件
     *
     * @param gsbgwj 工商变更文件
     */
    public void setGsbgwj(String gsbgwj) {
        this.gsbgwj = gsbgwj;
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
     * 获取 市名称
     *
     * @return smc 市名称
     */
    public String getSmc() {
        return this.smc;
    }

    /**
     * 设置 市名称
     *
     * @param smc 市名称
     */
    public void setSmc(String smc) {
        this.smc = smc;
    }

    /**
     * 获取 区名称
     *
     * @return qmc 区名称
     */
    public String getQmc() {
        return this.qmc;
    }

    /**
     * 设置 区名称
     *
     * @param qmc 区名称
     */
    public void setQmc(String qmc) {
        this.qmc = qmc;
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
     * 获取 全路径
     *
     * @return qlj 全路径
     */
    public String getQlj() {
        return this.qlj;
    }

    /**
     * 设置 全路径
     *
     * @param qlj 全路径
     */
    public void setQlj(String qlj) {
        this.qlj = qlj;
    }

    /**
     * 获取 客户名称
     *
     * @return khmc 客户名称
     */
    public String getKhmc() {
        return this.khmc;
    }

    /**
     * 设置 客户名称
     *
     * @param khmc 客户名称
     */
    public void setKhmc(String khmc) {
        this.khmc = khmc;
    }

    /**
     * 获取 变更加盟商id
     *
     * @return bgjmsid 变更加盟商id
     */
    public String getBgjmsid() {
        return this.bgjmsid;
    }

    /**
     * 设置 变更加盟商id
     *
     * @param bgjmsid 变更加盟商id
     */
    public void setBgjmsid(String bgjmsid) {
        this.bgjmsid = bgjmsid;
    }

    /**
     * 获取 变更加盟商F码
     *
     * @return bgjmsfm 变更加盟商F码
     */
    public String getBgjmsfm() {
        return this.bgjmsfm;
    }

    /**
     * 设置 变更加盟商F码
     *
     * @param bgjmsfm 变更加盟商F码
     */
    public void setBgjmsfm(String bgjmsfm) {
        this.bgjmsfm = bgjmsfm;
    }

    /**
     * 获取 变更扩展信息
     *
     * @return bgkzxx 变更扩展信息
     */
    public String getBgkzxx() {
        return this.bgkzxx;
    }

    /**
     * 设置 变更扩展信息
     *
     * @param bgkzxx 变更扩展信息
     */
    public void setBgkzxx(String bgkzxx) {
        this.bgkzxx = bgkzxx;
    }

    /**
     * 获取 变更或优化的加盟商品牌id
     *
     * @return bghyhdjmsppid 变更或优化的加盟商品牌id
     */
    public String getBghyhdjmsppid() {
        return this.bghyhdjmsppid;
    }

    /**
     * 设置 变更或优化的加盟商品牌id
     *
     * @param bghyhdjmsppid 变更或优化的加盟商品牌id
     */
    public void setBghyhdjmsppid(String bghyhdjmsppid) {
        this.bghyhdjmsppid = bghyhdjmsppid;
    }
}
