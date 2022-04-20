package weaver.interfaces.zb.oa.zt.dao;

import weaver.conn.RecordSet;
import weaver.general.Util;
import weaver.interfaces.zb.oa.zt.bill.FranchiseeNewOptimizedAccountOpeningBill;
import weaver.interfaces.zb.oa.zt.bill.FranchiseeNewOptimizedAccountOpeningDto;

import java.util.ArrayList;
import java.util.List;

/**
 * 加盟商新建/优化开户申请
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/12
 * Time: 0:04
 * Description: No Description
 */
public class FranchiseeNewOptimizedAccountOpeningDao {

    public FranchiseeNewOptimizedAccountOpeningBill getFranchiseeNewOptimizedAccountOpeningBill(String requestid,String tableName){
        RecordSet rs = new RecordSet();
        FranchiseeNewOptimizedAccountOpeningBill franchiseeNewOptimizedAccountOpeningBill = new FranchiseeNewOptimizedAccountOpeningBill();
        String sql = "select requestid,id,bh,jmsfm,khjc,yyzzmc,tyshxydmzch,zzlx,yyzzzcdz,frjyz,frjyzsjh,frjyzsfz,sjkzrgs,sjkzrsfz,zzjyzt,zt,xzqy,xzqlb,sf,cs,qx,z,bz,bz1,shdz,shr,shrsjhm,khlx,pp,zs,dz,kh,sourceid,gj,oldAccountNumber,custAccountId from "+tableName+" where requestid = "+requestid;
        rs.execute(sql);
        if (rs.next()){
            franchiseeNewOptimizedAccountOpeningBill.setRequestid(rs.getString("requestid"));//requestid
            franchiseeNewOptimizedAccountOpeningBill.setId(rs.getString("id"));//id
            franchiseeNewOptimizedAccountOpeningBill.setBh(rs.getString("bh"));//编号
            franchiseeNewOptimizedAccountOpeningBill.setJmsfm(rs.getString("jmsfm"));//加盟商F码
            franchiseeNewOptimizedAccountOpeningBill.setKhjc(rs.getString("khjc"));//客户简称
            franchiseeNewOptimizedAccountOpeningBill.setYyzzmc(rs.getString("yyzzmc"));//营业执照名称
            franchiseeNewOptimizedAccountOpeningBill.setTyshxydmzch(rs.getString("tyshxydmzch"));//统一社会信用代码/注册号
            franchiseeNewOptimizedAccountOpeningBill.setZzlx(rs.getString("zzlx"));//组织类型
            franchiseeNewOptimizedAccountOpeningBill.setYyzzzcdz(rs.getString("yyzzzcdz"));//营业执照注册地址
            franchiseeNewOptimizedAccountOpeningBill.setFrjyz(rs.getString("frjyz"));//法人/经营者
            franchiseeNewOptimizedAccountOpeningBill.setFrjyzsjh(rs.getString("frjyzsjh"));//法人/经营者手机号
            franchiseeNewOptimizedAccountOpeningBill.setFrjyzsfz(rs.getString("frjyzsfz"));//法人/经营者身份证
            franchiseeNewOptimizedAccountOpeningBill.setSjkzrgs(rs.getString("sjkzrgs"));//实际控制人/公司
            franchiseeNewOptimizedAccountOpeningBill.setSjkzrsfz(rs.getString("sjkzrsfz"));//实际控制人身份证
            franchiseeNewOptimizedAccountOpeningBill.setZzjyzt(rs.getString("zzjyzt"));//执照经营状态
            franchiseeNewOptimizedAccountOpeningBill.setZt(rs.getString("zt"));//状态
            franchiseeNewOptimizedAccountOpeningBill.setXzqy(rs.getString("xzqy"));//行政区域
            franchiseeNewOptimizedAccountOpeningBill.setXzqlb(rs.getString("xzqlb"));//行政区类别
            franchiseeNewOptimizedAccountOpeningBill.setSf(rs.getString("sf"));//省区
            franchiseeNewOptimizedAccountOpeningBill.setCs(rs.getString("cs"));//城市
            franchiseeNewOptimizedAccountOpeningBill.setQx(rs.getString("qx"));//区县
            franchiseeNewOptimizedAccountOpeningBill.setZ(rs.getString("z"));//镇
            franchiseeNewOptimizedAccountOpeningBill.setBz(rs.getString("bz"));//币种
            franchiseeNewOptimizedAccountOpeningBill.setBz1(rs.getString("bz1"));//备注
            franchiseeNewOptimizedAccountOpeningBill.setShdz(rs.getString("shdz"));//收货地址
            franchiseeNewOptimizedAccountOpeningBill.setShr(rs.getString("shr"));//收货人
            franchiseeNewOptimizedAccountOpeningBill.setShrsjhm(rs.getString("shrsjhm"));//收货人手机号码
            franchiseeNewOptimizedAccountOpeningBill.setKhlx(rs.getString("khlx"));//客户类型
            franchiseeNewOptimizedAccountOpeningBill.setPp(rs.getString("pp"));//品牌
            franchiseeNewOptimizedAccountOpeningBill.setZs(rs.getString("zs"));//招商
            franchiseeNewOptimizedAccountOpeningBill.setDz(rs.getString("dz"));//地址
            franchiseeNewOptimizedAccountOpeningBill.setKh(rs.getString("kh"));//客户
            franchiseeNewOptimizedAccountOpeningBill.setSourceId(rs.getString("sourceid"));
            franchiseeNewOptimizedAccountOpeningBill.setGj(Util.null2String(rs.getString("gj")));
            franchiseeNewOptimizedAccountOpeningBill.setOldAccountNumber(Util.null2String(rs.getString("oldAccountNumber")));
            franchiseeNewOptimizedAccountOpeningBill.setCustAccountId(Util.null2String(rs.getString("custAccountId")));
        }
        return franchiseeNewOptimizedAccountOpeningBill;

    }

    public List<FranchiseeNewOptimizedAccountOpeningDto> getFranchiseeNewOptimizedAccountOpeningDtoList(String mainid,String tableName){
        List<FranchiseeNewOptimizedAccountOpeningDto> franchiseeNewOptimizedAccountOpeningDtos = new ArrayList<>();

        RecordSet rs = new RecordSet();
//原始数据2022-04-20
//        String sql = "select mainid,id,dz,shrlxfs,zzdabh,sfyzd,jmrq,shr1,shdh,shdz,xyxe,yxfz,khx,xtsxrq,jdrq,sxyy,cqbzj,dqbzj,yycs,pl,xyms,bz,khlx,bz1,tjdzzt,tjdzkssj,tjdzjssj,sqh,OPERATION_STATUS,yxzh,isrecord,yxqy,oldAccountNumber,dcbqpm,ssdczl from "+tableName+"_dt1 where mainid = "+mainid;

        String sql = "select mainid,id,dz,shrlxfs,zzdabh,sfyzd,jmrq,shr1,shdh,shdz,xyxe,yxfz,khx,xtsxrq,jdrq,sxyy,cqbzj,dqbzj,yycs,pl,xyms,bz,khlx,bz1,tjdzzt,tjdzkssj,tjdzjssj,sqh,OPERATION_STATUS,yxzh,isrecord,yxqy,oldAccountNumber from "+tableName+"_dt1 where mainid = "+mainid;
        rs.execute(sql);
        while (rs.next()){
            FranchiseeNewOptimizedAccountOpeningDto franchiseeNewOptimizedAccountOpeningDto = new FranchiseeNewOptimizedAccountOpeningDto();
            franchiseeNewOptimizedAccountOpeningDto.setMainid(rs.getString("mainid"));//mainid
            franchiseeNewOptimizedAccountOpeningDto.setId(rs.getString("id"));//id
            franchiseeNewOptimizedAccountOpeningDto.setDz(rs.getString("dz"));//地址
            franchiseeNewOptimizedAccountOpeningDto.setShrlxfs(rs.getString("shrlxfs"));//收货人联系方式
            franchiseeNewOptimizedAccountOpeningDto.setZzdabh(rs.getString("zzdabh"));//纸质档案编号
            franchiseeNewOptimizedAccountOpeningDto.setSfyzd(rs.getString("sfyzd"));//是否已转档
            franchiseeNewOptimizedAccountOpeningDto.setJmrq(rs.getString("jmrq"));//加盟日期
            franchiseeNewOptimizedAccountOpeningDto.setShr1(rs.getString("shr1"));//收货人
            franchiseeNewOptimizedAccountOpeningDto.setShdh(rs.getString("shdh"));//收货电话
            franchiseeNewOptimizedAccountOpeningDto.setShdz(rs.getString("shdz"));//收货地址
            franchiseeNewOptimizedAccountOpeningDto.setXyxe(rs.getString("xyxe"));//信用限额
            franchiseeNewOptimizedAccountOpeningDto.setYxfz(rs.getString("yxfz"));//银行分支
            franchiseeNewOptimizedAccountOpeningDto.setKhx(rs.getString("khx"));//开户行
            franchiseeNewOptimizedAccountOpeningDto.setXtsxrq(rs.getString("xtsxrq"));//系统失效日期
            franchiseeNewOptimizedAccountOpeningDto.setJdrq(rs.getString("jdrq"));//建档日期
            franchiseeNewOptimizedAccountOpeningDto.setSxyy(rs.getString("sxyy"));//失效原因
            franchiseeNewOptimizedAccountOpeningDto.setCqbzj(rs.getString("cqbzj"));//初期保证金
            franchiseeNewOptimizedAccountOpeningDto.setDqbzj(rs.getString("dqbzj"));//当前保证金
            franchiseeNewOptimizedAccountOpeningDto.setYycs(rs.getString("yycs"));//运营城市
            franchiseeNewOptimizedAccountOpeningDto.setPl(rs.getString("pl"));//品类
            franchiseeNewOptimizedAccountOpeningDto.setXyms(rs.getString("xyms"));//信用模式
            franchiseeNewOptimizedAccountOpeningDto.setBz(rs.getString("bz"));//币种
            franchiseeNewOptimizedAccountOpeningDto.setKhlx(rs.getString("khlx"));//客户类型
            franchiseeNewOptimizedAccountOpeningDto.setBz1(rs.getString("bz1"));//备注
            franchiseeNewOptimizedAccountOpeningDto.setTjdzzt(Util.null2String(rs.getString("tjdzzt")));
            franchiseeNewOptimizedAccountOpeningDto.setTjdzkssj(Util.null2String(rs.getString("tjdzkssj")));
            franchiseeNewOptimizedAccountOpeningDto.setTjdzjssj(Util.null2String(rs.getString("tjdzjssj")));
            franchiseeNewOptimizedAccountOpeningDto.setSqh(Util.null2String(rs.getString("sqh")));
            franchiseeNewOptimizedAccountOpeningDto.setOPERATION_STATUS(Util.null2String(rs.getString("OPERATION_STATUS")));
            franchiseeNewOptimizedAccountOpeningDto.setYxzh(Util.null2String(rs.getString("yxzh")));
            franchiseeNewOptimizedAccountOpeningDto.setIsrecord(Util.null2String(rs.getString("isrecord")));
            franchiseeNewOptimizedAccountOpeningDto.setYxqy(Util.null2String(rs.getString("yxqy")));
            franchiseeNewOptimizedAccountOpeningDto.setOldAccountNumber(rs.getString("oldAccountNumber"));

            franchiseeNewOptimizedAccountOpeningDto.setDcbqpm(Util.null2String(rs.getString("dcbqpm")));
            franchiseeNewOptimizedAccountOpeningDto.setSsdczl(Util.null2String(rs.getString("ssdczl")));
            franchiseeNewOptimizedAccountOpeningDtos.add(franchiseeNewOptimizedAccountOpeningDto);
        }
        return franchiseeNewOptimizedAccountOpeningDtos;
    }


}
