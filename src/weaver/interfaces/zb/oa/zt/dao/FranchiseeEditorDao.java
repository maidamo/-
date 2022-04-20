package weaver.interfaces.zb.oa.zt.dao;

import weaver.conn.RecordSet;
import weaver.general.Util;
import weaver.interfaces.zb.oa.zt.bill.FranchiseeEditorBill;

public class FranchiseeEditorDao {

    RecordSet rs=new RecordSet();

    /**
     * 根据请求id和表名的到商变更数据
     * @param requestId
     * @param tableName
     * @return
     */
    public FranchiseeEditorBill getFranchiseeEditorMes(String requestId,String tableName){
        FranchiseeEditorBill franchiseeEditorBill=new FranchiseeEditorBill();
        String sql="select bh,jmsfm,zzlx,yyzzmc,khjc,tyshxydmzch,yyzzzcdz,xzqy,frjyzsfz,frjyz,sjkzrgs,xzqlb,sjkzrsfz,zt,sf,cs,qx,xzzrkh,sfmc,csmc,qxmc,lxhm,cfyzzd,accountSiteID,OPERATIONSTATUS,oldAccountNumber from "+tableName+" where requestid='"+requestId+"'";
        System.out.println("商编辑sql"+sql);
        rs.execute(sql);
        if(rs.next()){
            franchiseeEditorBill.setBh(Util.null2String(rs.getString("bh")));
            franchiseeEditorBill.setJmsfm(Util.null2String(rs.getString("jmsfm")));
            franchiseeEditorBill.setZzlx(Util.null2String(rs.getString("zzlx")));
            franchiseeEditorBill.setYyzzmc(Util.null2String(rs.getString("yyzzmc")));
            franchiseeEditorBill.setKhjc(Util.null2String(rs.getString("khjc")));
            franchiseeEditorBill.setTyshxydmzch(Util.null2String(rs.getString("tyshxydmzch")));
            franchiseeEditorBill.setYyzzzcdz(Util.null2String(rs.getString("yyzzzcdz")));
            franchiseeEditorBill.setXzqy(Util.null2String(rs.getString("xzqy")));
            franchiseeEditorBill.setFrjyzsfz(Util.null2String(rs.getString("frjyzsfz")));
            franchiseeEditorBill.setFrjyz(Util.null2String(rs.getString("frjyz")));
            franchiseeEditorBill.setSjkzrgs(Util.null2String(rs.getString("sjkzrgs")));
            franchiseeEditorBill.setXzqlb(Util.null2String(rs.getString("xzqlb")));
            franchiseeEditorBill.setSjkzrsfz(Util.null2String(rs.getString("sjkzrsfz")));
            franchiseeEditorBill.setZt(Util.null2String(rs.getString("zt")));
//            franchiseeEditorBill.setXgfjywzzsqbd(Util.null2String(rs.getString("xgfjywzzsqbd")));
            franchiseeEditorBill.setSf(Util.null2String(rs.getString("sf")));
            franchiseeEditorBill.setCs(Util.null2String(rs.getString("cs")));
            franchiseeEditorBill.setQx(Util.null2String(rs.getString("qx")));
            franchiseeEditorBill.setXzzrkh(Util.null2String(rs.getString("xzzrkh")));
            franchiseeEditorBill.setSfmc(Util.null2String(rs.getString("sfmc")));
            franchiseeEditorBill.setCsmc(Util.null2String(rs.getString("csmc")));
            franchiseeEditorBill.setQxmc(Util.null2String(rs.getString("qxmc")));
            franchiseeEditorBill.setLxhm(Util.null2String(rs.getString("lxhm")));
            franchiseeEditorBill.setCfyzzd(Util.null2String(rs.getString("cfyzzd")));
            franchiseeEditorBill.setAccountSiteID(Util.null2String(rs.getString("accountSiteID")));
            franchiseeEditorBill.setOPERATIONSTATUS(Util.null2String(rs.getString("OPERATIONSTATUS")));
            franchiseeEditorBill.setOldAccountNumber(Util.null2String(rs.getString("oldAccountNumber")));
        }
        return franchiseeEditorBill;
    }
}
