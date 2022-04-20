package weaver.interfaces.zb.oa.zt.dao;

import weaver.conn.RecordSet;
import weaver.general.Util;
import weaver.interfaces.zb.oa.zt.bill.FranchiseeChangeApplicationBill;
import weaver.interfaces.zb.oa.zt.bill.FranchiseeChangeApplicationDto;
import weaver.interfaces.zb.oa.zt.bill.FranchiseeChangeApplicationDto2;

import java.util.ArrayList;
import java.util.List;

/**
 * 加盟商变更
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/11
 * Time: 23:00
 * Description: No Description
 */
public class FranchiseeChangeApplicationDao {
    RecordSet rs = new RecordSet();

    public FranchiseeChangeApplicationBill getFranchiseeChangeApplicationBill(String requestid,String tableName) {

        FranchiseeChangeApplicationBill franchiseeChangeApplicationBill = new FranchiseeChangeApplicationBill();
        String sql = "select requestid,id,bgztlx,bh,jmsfm,zzlx,khjc,yyzzmc,tyshxydmzch,yyzzzcdz,xzqy,frjyzsjh,frjyzsfz,frjyz,sjkzrgs,xzqlb,sjkzrsfz,zzjyzt,zt,zrkzxx,xgfjywzzsqbd,xtgbrq,pl,dz1,shr1,shrlxfs,zzdabh,sfyzd,jmrq,bz1,shr,shdh,shdz,xyxe,xyms,yxfz,khx,yxqy,xtsxrq,jdrq,sxyy,cqbzj,dqbzj,jmf,yycs,bz,xsyyzzzp,xsfrsfzzp,bzjyssjzp,gxzmwj,gsbgwj,gj,smc,qmc,sf,cs,qx,qlj,khmc,dz,xzzrkh,zrpl,bgjmsid,bgjmsfm,bgkzxx,bghyhdjmsppid,xzjms from "+tableName+" where requestid = "+requestid;
        rs.execute(sql);
        if (rs.next()){
            franchiseeChangeApplicationBill.setRequestid(rs.getString("requestid"));//requestid
            franchiseeChangeApplicationBill.setId(rs.getString("id"));//id
            franchiseeChangeApplicationBill.setBgztlx(rs.getString("bgztlx"));//变更主体类型
            franchiseeChangeApplicationBill.setBh(rs.getString("bh"));//编号
            franchiseeChangeApplicationBill.setJmsfm(rs.getString("jmsfm"));//加盟商F码
            franchiseeChangeApplicationBill.setZzlx(rs.getString("zzlx"));//组织类型
            franchiseeChangeApplicationBill.setKhjc(rs.getString("khjc"));//客户简称
            franchiseeChangeApplicationBill.setYyzzmc(rs.getString("yyzzmc"));//营业执照名称
            franchiseeChangeApplicationBill.setTyshxydmzch(rs.getString("tyshxydmzch"));//统一社会信用代码/注册号
            franchiseeChangeApplicationBill.setYyzzzcdz(rs.getString("yyzzzcdz"));//营业执照注册地址
            franchiseeChangeApplicationBill.setXzqy(rs.getString("xzqy"));//行政区域
            franchiseeChangeApplicationBill.setFrjyzsjh(rs.getString("frjyzsjh"));//法人/经营者手机号
            franchiseeChangeApplicationBill.setFrjyzsfz(rs.getString("frjyzsfz"));//法人/经营者身份证
            franchiseeChangeApplicationBill.setFrjyz(rs.getString("frjyz"));//法人/经营者
            franchiseeChangeApplicationBill.setSjkzrgs(rs.getString("sjkzrgs"));//实际控制人/公司
            franchiseeChangeApplicationBill.setXzqlb(rs.getString("xzqlb"));//行政区类别
            franchiseeChangeApplicationBill.setSjkzrsfz(rs.getString("sjkzrsfz"));//实际控制人身份证
            franchiseeChangeApplicationBill.setZzjyzt(rs.getString("zzjyzt"));//执照经营状态
            franchiseeChangeApplicationBill.setZt(rs.getString("zt"));//状态
            franchiseeChangeApplicationBill.setZrkzxx(rs.getString("zrkzxx"));//转让扩展信息
            franchiseeChangeApplicationBill.setXgfjywzzsqbd(rs.getString("xgfjywzzsqbd"));//相关附件（业务终止申请表等
            franchiseeChangeApplicationBill.setXtgbrq(rs.getString("xtgbrq"));//系统关闭日期
            franchiseeChangeApplicationBill.setPl(rs.getString("pl"));//品类
            franchiseeChangeApplicationBill.setDz1(rs.getString("dz1"));//地址
            franchiseeChangeApplicationBill.setShr1(rs.getString("shr1"));//收货人
            franchiseeChangeApplicationBill.setShrlxfs(rs.getString("shrlxfs"));//收货人联系方式
            franchiseeChangeApplicationBill.setZzdabh(rs.getString("zzdabh"));//纸质档案编号
            franchiseeChangeApplicationBill.setSfyzd(rs.getString("sfyzd"));//是否已转档
            franchiseeChangeApplicationBill.setJmrq(rs.getString("jmrq"));//加盟日期
            franchiseeChangeApplicationBill.setBz1(rs.getString("bz1"));//币种
            franchiseeChangeApplicationBill.setShr(rs.getString("shr"));//收货人
            franchiseeChangeApplicationBill.setShdh(rs.getString("shdh"));//收货电话
            franchiseeChangeApplicationBill.setShdz(rs.getString("shdz"));//收货地址
            franchiseeChangeApplicationBill.setXyxe(rs.getString("xyxe"));//信用限额
            franchiseeChangeApplicationBill.setXyms(rs.getString("xyms"));//信用模式
            franchiseeChangeApplicationBill.setYxfz(rs.getString("yxfz"));//银行分支
            franchiseeChangeApplicationBill.setKhx(rs.getString("khx"));//开户行
            franchiseeChangeApplicationBill.setYxqy(rs.getString("yxqy"));//营销区域
            franchiseeChangeApplicationBill.setXtsxrq(rs.getString("xtsxrq"));//系统失效日期
            franchiseeChangeApplicationBill.setJdrq(rs.getString("jdrq"));//建档日期
            franchiseeChangeApplicationBill.setSxyy(rs.getString("sxyy"));//失效原因
            franchiseeChangeApplicationBill.setCqbzj(rs.getString("cqbzj"));//初期保证金
            franchiseeChangeApplicationBill.setDqbzj(rs.getString("dqbzj"));//当前保证金
            franchiseeChangeApplicationBill.setJmf(rs.getString("jmf"));//加盟费
            franchiseeChangeApplicationBill.setYycs(rs.getString("yycs"));//运营城市
            franchiseeChangeApplicationBill.setBz(rs.getString("bz"));//备注
            franchiseeChangeApplicationBill.setXsyyzzzp(rs.getString("xsyyzzzp"));//新商营业执照照片
            franchiseeChangeApplicationBill.setXsfrsfzzp(rs.getString("xsfrsfzzp"));//新商法人身份证照片
            franchiseeChangeApplicationBill.setBzjyssjzp(rs.getString("bzjyssjzp"));//保证金原始收据照片
            franchiseeChangeApplicationBill.setGxzmwj(rs.getString("gxzmwj"));//关系证明文件
            franchiseeChangeApplicationBill.setGsbgwj(rs.getString("gsbgwj"));//工商变更文件
            franchiseeChangeApplicationBill.setGj(rs.getString("gj"));//国家
            franchiseeChangeApplicationBill.setSmc(rs.getString("smc"));//市名称
            franchiseeChangeApplicationBill.setQmc(rs.getString("qmc"));//区名称
            franchiseeChangeApplicationBill.setSf(rs.getString("sf"));//省份
            franchiseeChangeApplicationBill.setCs(rs.getString("cs"));//城市
            franchiseeChangeApplicationBill.setQx(rs.getString("qx"));//区县
            franchiseeChangeApplicationBill.setQlj(rs.getString("qlj"));//全路径
            franchiseeChangeApplicationBill.setKhmc(rs.getString("khmc"));//客户名称
            franchiseeChangeApplicationBill.setDz(rs.getString("dz"));//地址
            franchiseeChangeApplicationBill.setXzzrkh(rs.getString("xzzrkh"));//选择转让客户
            franchiseeChangeApplicationBill.setZrpl(rs.getString("zrpl"));//转让品类
            franchiseeChangeApplicationBill.setBgjmsid(rs.getString("bgjmsid"));//变更加盟商id
            franchiseeChangeApplicationBill.setBgjmsfm(rs.getString("bgjmsfm"));//变更加盟商F码
            franchiseeChangeApplicationBill.setBgkzxx(rs.getString("bgkzxx"));//变更扩展信息
            franchiseeChangeApplicationBill.setBghyhdjmsppid(rs.getString("bghyhdjmsppid"));//变更或优化的加盟商品牌id
            franchiseeChangeApplicationBill.setXzjms(Util.null2String(rs.getString("xzjms")));

        }

        return franchiseeChangeApplicationBill;
    }
    public List<FranchiseeChangeApplicationDto> getFranchiseeChangeApplicationDtos(String mainid,String tableName){

        List<FranchiseeChangeApplicationDto> franchiseeChangeApplicationDtos = new ArrayList<>();
        String sql = "select mainid,id,sf,cs,gj,qx,khlx,plid,tjdzzt,tjdzkssj,tjdzjssj,ywzt,AUTHORIZATION_NO,REMARKS,SHIP_TO_PERSON,SHIP_TO_ADDRESS,SHIP_TO_PHONE,CREDIT_MODE,CREDIT_AMOUNT,CURRENCY_CODE,TERRITORY_ID,JOIN_DATE,IS_RECORD,RECORD_NUMBER,RECORD_DATE,BANK_ACCOUNT_NAME,BANK_BRANCH_NAME,BANK_ACCOUNT_NUM,CITY_ADDRESS from "+tableName+"_dt1 where mainid = "+mainid;
        rs.execute(sql);
        while (rs.next()){
            FranchiseeChangeApplicationDto franchiseeChangeApplicationDto = new FranchiseeChangeApplicationDto();
            franchiseeChangeApplicationDto.setMainid(rs.getString("mainid"));//mainid
            franchiseeChangeApplicationDto.setId(rs.getString("id"));//id
            franchiseeChangeApplicationDto.setSf(rs.getString("sf"));//省份
            franchiseeChangeApplicationDto.setCs(rs.getString("cs"));//城市
            franchiseeChangeApplicationDto.setGj(rs.getString("gj"));//国家
            franchiseeChangeApplicationDto.setQx(rs.getString("qx"));//区县
            franchiseeChangeApplicationDto.setKhlx(rs.getString("khlx"));//客户类型
            franchiseeChangeApplicationDto.setPlid(rs.getString("plid"));//品类id
            franchiseeChangeApplicationDto.setTjdzzt(rs.getString("tjdzzt"));//统计调整状态
            franchiseeChangeApplicationDto.setTjdzkssj(rs.getString("tjdzkssj"));//统计调整开始时间
            franchiseeChangeApplicationDto.setTjdzjssj(rs.getString("tjdzjssj"));//统计调整结束时间
            franchiseeChangeApplicationDto.setYwzt(rs.getString("ywzt"));//业务状态

            franchiseeChangeApplicationDto.setAUTHORIZATION_NO(Util.null2String(rs.getString("AUTHORIZATION_NO")));
            franchiseeChangeApplicationDto.setREMARKS(Util.null2String(rs.getString("REMARKS")));
            franchiseeChangeApplicationDto.setSHIP_TO_PERSON(Util.null2String(rs.getString("SHIP_TO_PERSON")));
            franchiseeChangeApplicationDto.setSHIP_TO_ADDRESS(Util.null2String(rs.getString("SHIP_TO_ADDRESS")));
            franchiseeChangeApplicationDto.setSHIP_TO_PHONE(Util.null2String(rs.getString("SHIP_TO_PHONE")));
            franchiseeChangeApplicationDto.setCREDIT_MODE(Util.null2String(rs.getString("CREDIT_MODE")));
            franchiseeChangeApplicationDto.setCREDIT_AMOUNT(Util.null2String(rs.getString("CREDIT_AMOUNT")));
            franchiseeChangeApplicationDto.setCURRENCY_CODE(Util.null2String(rs.getString("CURRENCY_CODE")));
            franchiseeChangeApplicationDto.setTERRITORY_ID(Util.null2String(rs.getString("TERRITORY_ID")));
            franchiseeChangeApplicationDto.setJOIN_DATE(Util.null2String(rs.getString("JOIN_DATE")));
            franchiseeChangeApplicationDto.setIS_RECORD(Util.null2String(rs.getString("IS_RECORD")));
            franchiseeChangeApplicationDto.setRECORD_NUMBER(Util.null2String(rs.getString("RECORD_NUMBER")));
            franchiseeChangeApplicationDto.setRECORD_DATE(Util.null2String(rs.getString("RECORD_DATE")));
            franchiseeChangeApplicationDto.setBANK_ACCOUNT_NAME(Util.null2String(rs.getString("BANK_ACCOUNT_NAME")));
            franchiseeChangeApplicationDto.setBANK_BRANCH_NAME(Util.null2String(rs.getString("BANK_BRANCH_NAME")));
            franchiseeChangeApplicationDto.setBANK_ACCOUNT_NUM(Util.null2String(rs.getString("BANK_ACCOUNT_NUM")));

            franchiseeChangeApplicationDto.setCITY_ADDRESS(Util.null2String(rs.getString("CITY_ADDRESS")));
            franchiseeChangeApplicationDtos.add(franchiseeChangeApplicationDto);
        }


        return franchiseeChangeApplicationDtos;

    }

    public List<FranchiseeChangeApplicationDto2> getFranchiseeChangeApplicationDto2(String mainid,String tableName){
        List<FranchiseeChangeApplicationDto2> list=new ArrayList<>();
        String sql="select mainid,id,dmmc,tjdzzt from "+tableName+"_dt2 where mainid = "+mainid;
        rs.execute(sql);
        while(rs.next()){
            FranchiseeChangeApplicationDto2 franchiseeChangeApplicationDto2=new FranchiseeChangeApplicationDto2();
            franchiseeChangeApplicationDto2.setMainid(rs.getString("mainid"));//mainid
            franchiseeChangeApplicationDto2.setId(rs.getString("id"));//id
            franchiseeChangeApplicationDto2.setDmmc(Util.null2String(rs.getString("dmmc")));
            franchiseeChangeApplicationDto2.setTjdzzt(Util.null2String(rs.getString("tjdzzt")));
            list.add(franchiseeChangeApplicationDto2);
        }
        return list;
    }
}
