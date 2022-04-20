package weaver.interfaces.zb.oa.zt.dao;

import weaver.conn.RecordSet;
import weaver.general.Util;
import weaver.interfaces.zb.oa.zt.bill.CategoryEditBill;

public class CategoryEditDao {

    RecordSet rs=new RecordSet();

    /**
     * 根据请求id和表名得到品类信息
     * @param requestId
     * @param tableName
     * @return
     */
    public CategoryEditBill getCategoryEditMes(String requestId,String tableName){
        CategoryEditBill categoryEditBill=new CategoryEditBill();
        String sql="select xzzrkh,zrpl,accountName,accountShortName,accountSiteId,unitId,currencyCode,country,province,city,county,joinDate,RECORD_DATE,creditAmount,status,operationStatus,creditMode,accountNumber,provinceName,cityName,countyName,MERGING_AREA,relevance,yxqy,oldAccountNumber,sqh,shdz,shr,lxdh,khyx,yxfx,yxzh,khlx,dzkssj,dzjssj,tjdz,dcbqpm,z,dabh,ssdczl,IS_ELIMINATE,CITY_ADDRESS,SOURCE_TYPE,sfgd,bz,xtsxrq from "+tableName+" where requestid='"+requestId+"'";
        rs.execute(sql);
        if(rs.next()){
            categoryEditBill.setXzzrkh(Util.null2String(rs.getString("xzzrkh")));
            categoryEditBill.setZrpl(Util.null2String(rs.getString("zrpl")));
            categoryEditBill.setAccountName(Util.null2String(rs.getString("accountName")));
            categoryEditBill.setAccountShortName(Util.null2String(rs.getString("accountShortName")));
            categoryEditBill.setAccountSiteId(Util.null2String(rs.getString("accountSiteId")));
            categoryEditBill.setUnitId(Util.null2String(rs.getString("unitId")));
            categoryEditBill.setCurrencyCode(Util.null2String(rs.getString("currencyCode")));
            categoryEditBill.setCountry(Util.null2String(rs.getString("country")));
            categoryEditBill.setProvince(Util.null2String(rs.getString("province")));
            categoryEditBill.setCity(Util.null2String(rs.getString("city")));
            categoryEditBill.setCounty(Util.null2String(rs.getString("county")));
            categoryEditBill.setJoinDate(Util.null2String(rs.getString("joinDate")));
            categoryEditBill.setRECORD_DATE(Util.null2String(rs.getString("RECORD_DATE")));
            categoryEditBill.setCreditAmount(Util.null2String(rs.getString("creditAmount")));
            categoryEditBill.setStatus(Util.null2String(rs.getString("status")));
            categoryEditBill.setOperationStatus(Util.null2String(rs.getString("operationStatus")));
            categoryEditBill.setCreditMode(Util.null2String(rs.getString("creditMode")));
            categoryEditBill.setAccountNumber(Util.null2String(rs.getString("accountNumber")));
            categoryEditBill.setProvinceName(Util.null2String(rs.getString("provinceName")));
            categoryEditBill.setCityName(Util.null2String(rs.getString("cityName")));
            categoryEditBill.setCountyName(Util.null2String(rs.getString("countyName")));
            categoryEditBill.setMERGING_AREA(Util.null2String(rs.getString("MERGING_AREA")));
            categoryEditBill.setRelevance(Util.null2String(rs.getString("relevance")));
            categoryEditBill.setYxqy(Util.null2String(rs.getString("yxqy")));
            categoryEditBill.setOldAccountNumber(Util.null2String(rs.getString("oldAccountNumber")));
            categoryEditBill.setSqh(Util.null2String(rs.getString("sqh")));
            categoryEditBill.setShdz(Util.null2String(rs.getString("shdz")));
            categoryEditBill.setShr(Util.null2String(rs.getString("shr")));
            categoryEditBill.setLxdh(Util.null2String(rs.getString("lxdh")));
            categoryEditBill.setKhyx(Util.null2String(rs.getString("khyx")));
            categoryEditBill.setYxfx(Util.null2String(rs.getString("yxfx")));
            categoryEditBill.setYxzh(Util.null2String(rs.getString("yxzh")));
            categoryEditBill.setKhlx(Util.null2String(rs.getString("khlx")));
            categoryEditBill.setDzkssj(Util.null2String(rs.getString("dzkssj")));
            categoryEditBill.setDzjssj(Util.null2String(rs.getString("dzjssj")));
            categoryEditBill.setTjdz(Util.null2String(rs.getString("tjdz")));
            categoryEditBill.setDcbqpm(Util.null2String(rs.getString("dcbqpm")));
            categoryEditBill.setZ(Util.null2String(rs.getString("z")));
            categoryEditBill.setDabh(Util.null2String(rs.getString("dabh")));
            categoryEditBill.setSsdczl(Util.null2String(rs.getString("ssdczl")));
            categoryEditBill.setIS_ELIMINATE(Util.null2String(rs.getString("IS_ELIMINATE")));
            categoryEditBill.setCITY_ADDRESS(Util.null2String(rs.getString("CITY_ADDRESS")));
            categoryEditBill.setSOURCE_TYPE(Util.null2String(rs.getString("SOURCE_TYPE")));
            categoryEditBill.setSfgd(Util.null2String(rs.getString("sfgd")));
            categoryEditBill.setBz(Util.null2String(rs.getString("bz")));
            categoryEditBill.setXtsxrq(Util.null2String(rs.getString("xtsxrq")));
        }
        return categoryEditBill;
    }
}
