package weaver.interfaces.zb.oa.zt.dao;

import weaver.conn.RecordSet;
import weaver.general.Util;
import weaver.interfaces.zb.oa.zt.bill.FranchiseeAreaEditDtEntity;

import java.util.ArrayList;
import java.util.List;

public class FranchiseeAreaEditDao {
    RecordSet rs=new RecordSet();

    public List<FranchiseeAreaEditDtEntity> getFranchiseeAreaEditDtMes(String mainId, String tableName){
        List<FranchiseeAreaEditDtEntity> list=new ArrayList<>();
        String sql="select xzzrkh,zt,unitId,accountSiteId,accountName,accountShortName999,currencyCode,country,province,city,county,joinDate,RECORD_DATE,creditAmount,status,operationStatus,creditMode,accountNumber,provinceName,cityName,countyName,MERGING_AREA,xzpl,yxqy,oldAccountNumber,sqh,shdz,shr,lxdh,khyx,yxfx,yxzh,khlx,dzkssj,dzjssj,tjdz,dcbqpm,z,dabh,ssdczl,IS_ELIMINATE,CITY_ADDRESS,SOURCE_TYPE,sfgd,bz,xtsxrq from "+tableName+" where mainid='"+mainId+"'";
        rs.execute(sql);
        while(rs.next()){
            FranchiseeAreaEditDtEntity franchiseeAreaEditDtEntity=new FranchiseeAreaEditDtEntity();
            franchiseeAreaEditDtEntity.setXzzrkh(Util.null2String(rs.getString("xzzrkh")));
            franchiseeAreaEditDtEntity.setZt(Util.null2String(rs.getString("zt")));
            franchiseeAreaEditDtEntity.setUnitId(Util.null2String(rs.getString("unitId")));
            franchiseeAreaEditDtEntity.setAccountSiteId(Util.null2String(rs.getString("accountSiteId")));
            franchiseeAreaEditDtEntity.setAccountName(Util.null2String(rs.getString("accountName")));
            franchiseeAreaEditDtEntity.setAccountShortName999(Util.null2String(rs.getString("accountShortName999")));
            franchiseeAreaEditDtEntity.setCurrencyCode(Util.null2String(rs.getString("currencyCode")));
            franchiseeAreaEditDtEntity.setCountry(Util.null2String(rs.getString("country")));
            franchiseeAreaEditDtEntity.setProvince(Util.null2String(rs.getString("province")));
            franchiseeAreaEditDtEntity.setCity(Util.null2String(rs.getString("city")));
            franchiseeAreaEditDtEntity.setCounty(Util.null2String(rs.getString("county")));
            franchiseeAreaEditDtEntity.setJoinDate(Util.null2String(rs.getString("joinDate")));
            franchiseeAreaEditDtEntity.setRECORD_DATE(Util.null2String(rs.getString("RECORD_DATE")));
            franchiseeAreaEditDtEntity.setCreditAmount(Util.null2String(rs.getString("creditAmount")));
            franchiseeAreaEditDtEntity.setStatus(Util.null2String(rs.getString("status")));
            franchiseeAreaEditDtEntity.setOperationStatus(Util.null2String(rs.getString("operationStatus")));
            franchiseeAreaEditDtEntity.setCreditMode(Util.null2String(rs.getString("creditMode")));
            franchiseeAreaEditDtEntity.setAccountNumber(Util.null2String(rs.getString("accountNumber")));
            franchiseeAreaEditDtEntity.setProvinceName(Util.null2String(rs.getString("provinceName")));
            franchiseeAreaEditDtEntity.setCityName(Util.null2String(rs.getString("cityName")));
            franchiseeAreaEditDtEntity.setCountyName(Util.null2String(rs.getString("countyName")));
            franchiseeAreaEditDtEntity.setMERGING_AREA(Util.null2String(rs.getString("MERGING_AREA")));
            franchiseeAreaEditDtEntity.setXzpl(Util.null2String(rs.getString("xzpl")));
            franchiseeAreaEditDtEntity.setYxqy(Util.null2String(rs.getString("yxqy")));
            franchiseeAreaEditDtEntity.setOldAccountNumber(Util.null2String(rs.getString("oldAccountNumber")));
            franchiseeAreaEditDtEntity.setSqh(Util.null2String(rs.getString("sqh")));
            franchiseeAreaEditDtEntity.setShdz(Util.null2String(rs.getString("shdz")));
            franchiseeAreaEditDtEntity.setShr(Util.null2String(rs.getString("shr")));
            franchiseeAreaEditDtEntity.setLxdh(Util.null2String(rs.getString("lxdh")));
            franchiseeAreaEditDtEntity.setKhyx(Util.null2String(rs.getString("khyx")));
            franchiseeAreaEditDtEntity.setYxfx(Util.null2String(rs.getString("yxfx")));
            franchiseeAreaEditDtEntity.setYxzh(Util.null2String(rs.getString("yxzh")));
            franchiseeAreaEditDtEntity.setKhlx(Util.null2String(rs.getString("khlx")));
            franchiseeAreaEditDtEntity.setDzkssj(Util.null2String(rs.getString("dzkssj")));
            franchiseeAreaEditDtEntity.setDzjssj(Util.null2String(rs.getString("dzjssj")));
            franchiseeAreaEditDtEntity.setTjdz(Util.null2String(rs.getString("tjdz")));
            franchiseeAreaEditDtEntity.setDcbqpm(Util.null2String(rs.getString("dcbqpm")));
            franchiseeAreaEditDtEntity.setZ(Util.null2String(rs.getString("z")));
            franchiseeAreaEditDtEntity.setDabh(Util.null2String(rs.getString("dabh")));
            franchiseeAreaEditDtEntity.setSsdczl(Util.null2String(rs.getString("ssdczl")));
            franchiseeAreaEditDtEntity.setIS_ELIMINATE(Util.null2String(rs.getString("IS_ELIMINATE")));
            franchiseeAreaEditDtEntity.setCITY_ADDRESS(Util.null2String(rs.getString("CITY_ADDRESS")));
            franchiseeAreaEditDtEntity.setSOURCE_TYPE(Util.null2String(rs.getString("SOURCE_TYPE")));
            franchiseeAreaEditDtEntity.setSfgd(Util.null2String(rs.getString("sfgd")));
            franchiseeAreaEditDtEntity.setBz(Util.null2String(rs.getString("bz")));
            franchiseeAreaEditDtEntity.setXtsxrq(Util.null2String(rs.getString("xtsxrq")));
            System.out.println("加盟商区域编辑明细数据为: "+franchiseeAreaEditDtEntity);
            list.add(franchiseeAreaEditDtEntity);
        }
        return list;
    }
}
