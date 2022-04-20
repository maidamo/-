package weaver.formmode.customjavacode.modeexpand.market.dao;

import weaver.conn.RecordSetDataSource;
import weaver.formmode.customjavacode.modeexpand.market.entity.ZTMarketOrgDtEntity;
import weaver.formmode.customjavacode.modeexpand.market.entity.ZTMarketOrgEntity;
import weaver.formmode.customjavacode.modeexpand.market.entity.ZTMarketOrgHrmEntity;
import weaver.general.Util;

import java.util.HashMap;
import java.util.Map;

public class ZTDao {

    RecordSetDataSource rs=new RecordSetDataSource("OMSPROD");

    /**
     * 插入中台主表数据
     * @param ztMarketOrgEntity
     * @return
     */
    public boolean insertMainData(ZTMarketOrgEntity ztMarketOrgEntity){
        boolean isSucccess=false;
        String sql="insert into MDM_CUST_TERRITORY_SOLUTIONS(SOLUTION_ID,UNIT_ID,SOLUTION_NAME,ENABLED_FLAG,CONTROL_LEVEL,VALUE_FROM1,VALUE_FROM2,VALUE_FROM3,VALUE_FROM4,VALUE_FROM5,VALUE_FROM6,VALUE_FROM7,VALUE_FROM8,VALUE_FROM9,VALUE_FROM10,ACTIVE_START_DATE,ACTIVE_END_DATE,OBJECT_VERSION_NUMBER,CREATION_DATE,CREATED_BY,LAST_UPDATED_BY,LAST_UPDATE_DATE,LAST_UPDATE_LOGIN,PROGRAM_APPLICATION_ID,PROGRAM_ID,PROGRAM_UPDATE_DATE,REQUEST_ID,ATTRIBUTE_CATEGORY,ATTRIBUTE1) values('"
                + Util.null2String(ztMarketOrgEntity.getSOLUTION_ID())+
                "','"+Util.null2String(ztMarketOrgEntity.getUNIT_ID())+
                "','"+Util.null2String(ztMarketOrgEntity.getSOLUTION_NAME())+
                "','"+Util.null2String(ztMarketOrgEntity.getENABLED_FLAG())+
                "','"+Util.null2String(ztMarketOrgEntity.getCONTROL_LEVEL())+
                "','"+Util.null2String(ztMarketOrgEntity.getVALUE_FROM1())+
                "','"+Util.null2String(ztMarketOrgEntity.getVALUE_FROM2())+
                "','"+Util.null2String(ztMarketOrgEntity.getVALUE_FROM3())+
                "','"+Util.null2String(ztMarketOrgEntity.getVALUE_FROM4())+
                "','"+Util.null2String(ztMarketOrgEntity.getVALUE_FROM5())+
                "','"+Util.null2String(ztMarketOrgEntity.getVALUE_FROM6())+
                "','"+Util.null2String(ztMarketOrgEntity.getVALUE_FROM7())+
                "','"+Util.null2String(ztMarketOrgEntity.getVALUE_FROM8())+
                "','"+Util.null2String(ztMarketOrgEntity.getVALUE_FROM9())+
                "','"+Util.null2String(ztMarketOrgEntity.getVALUE_FROM10())+
                "',to_date('"+Util.null2String(ztMarketOrgEntity.getACTIVE_START_DATE())+"','yyyy-MM-dd HH24:mi:ss')"+
                ",to_date('"+Util.null2String(ztMarketOrgEntity.getACTIVE_END_DATE())+"','yyyy-MM-dd HH24:mi:ss')"+
                ",'"+Util.null2String(ztMarketOrgEntity.getOBJECT_VERSION_NUMBER())+
                "',to_date('"+Util.null2String(ztMarketOrgEntity.getCREATION_DATE())+"','yyyy-MM-dd HH24:mi:ss')"+
                ",'"+Util.null2String(ztMarketOrgEntity.getCREATED_BY())+
                "','"+Util.null2String(ztMarketOrgEntity.getLAST_UPDATED_BY())+
                "',to_date('"+Util.null2String(ztMarketOrgEntity.getLAST_UPDATE_DATE())+"','yyyy-MM-dd HH24:mi:ss')"+
                ",'"+Util.null2String(ztMarketOrgEntity.getLAST_UPDATE_LOGIN())+
                "','"+Util.null2String(ztMarketOrgEntity.getPROGRAM_APPLICATION_ID())+
                "','"+Util.null2String(ztMarketOrgEntity.getPROGRAM_ID())+
                "','"+Util.null2String(ztMarketOrgEntity.getPROGRAM_UPDATE_DATE())+
                "','"+Util.null2String(ztMarketOrgEntity.getREQUEST_ID())+
                "','"+Util.null2String(ztMarketOrgEntity.getATTRIBUTE_CATEGORY())+
                "','"+Util.null2String(ztMarketOrgEntity.getATTRIBUTE1())+"')";
        isSucccess=rs.execute(sql);
        return isSucccess;
    }

    /**
     * 插入中台明细数据
     * @param ztMarketOrgDtEntity
     * @return
     */
    public boolean insertDetailData(ZTMarketOrgDtEntity ztMarketOrgDtEntity){
        boolean isSuccess=false;
        String sql="insert into MDM_CUST_TERRITORIES(TERRITORY_ID,SOLUTION_ID,UNIT_ID,TERRITORY_NAME,TERRITORY_CODE,SEGMENT1,SEGMENT2,SEGMENT3,SEGMENT4,SEGMENT5,ACTIVE_START_DATE,ACTIVE_END_DATE,OBJECT_VERSION_NUMBER,CREATION_DATE,CREATED_BY,LAST_UPDATED_BY,LAST_UPDATE_DATE,LAST_UPDATE_LOGIN,PROGRAM_APPLICATION_ID,PROGRAM_ID,PROGRAM_UPDATE_DATE,REQUEST_ID,ATTRIBUTE_CATEGORY,ATTRIBUTE1,ATTRIBUTE2) values('"
                +Util.null2String(ztMarketOrgDtEntity.getTERRITORY_ID())+
                "','"+Util.null2String(ztMarketOrgDtEntity.getSOLUTION_ID())+
                "','"+Util.null2String(ztMarketOrgDtEntity.getUNIT_ID())+
                "','"+Util.null2String(ztMarketOrgDtEntity.getTERRITORY_NAME())+
                "','"+Util.null2String(ztMarketOrgDtEntity.getTERRITORY_CODE())+
                "','"+Util.null2String(ztMarketOrgDtEntity.getSEGMENT1())+
                "','"+Util.null2String(ztMarketOrgDtEntity.getSEGMENT2())+
                "','"+Util.null2String(ztMarketOrgDtEntity.getSEGMENT3())+
                "','"+Util.null2String(ztMarketOrgDtEntity.getSEGMENT4())+
                "','"+Util.null2String(ztMarketOrgDtEntity.getSEGMENT5())+
                "',to_date('"+Util.null2String(ztMarketOrgDtEntity.getACTIVE_START_DATE())+"','yyyy-MM-dd HH24:mi:ss')"+
                ",to_date('"+Util.null2String(ztMarketOrgDtEntity.getACTIVE_END_DATE())+"','yyyy-MM-dd HH24:mi:ss')"+
                ",'"+Util.null2String(ztMarketOrgDtEntity.getOBJECT_VERSION_NUMBER())+
                "',to_date('"+Util.null2String(ztMarketOrgDtEntity.getCREATION_DATE())+"','yyyy-MM-dd HH24:mi:ss')"+
                ",'"+Util.null2String(ztMarketOrgDtEntity.getCREATED_BY())+
                "','"+Util.null2String(ztMarketOrgDtEntity.getLAST_UPDATED_BY())+
                "',to_date('"+Util.null2String(ztMarketOrgDtEntity.getLAST_UPDATE_DATE())+"','yyyy-MM-dd HH24:mi:ss')"+
                ",'"+Util.null2String(ztMarketOrgDtEntity.getLAST_UPDATE_LOGIN())+
                "','"+Util.null2String(ztMarketOrgDtEntity.getPROGRAM_APPLICATION_ID())+
                "','"+Util.null2String(ztMarketOrgDtEntity.getPROGRAM_ID())+
                "','"+Util.null2String(ztMarketOrgDtEntity.getPROGRAM_UPDATE_DATE())+
                "','"+Util.null2String(ztMarketOrgDtEntity.getREQUEST_ID())+
                "','"+Util.null2String(ztMarketOrgDtEntity.getATTRIBUTE_CATEGORY())+
                "','"+Util.null2String(ztMarketOrgDtEntity.getATTRIBUTE1())+
                "','"+Util.null2String(ztMarketOrgDtEntity.getATTRIBUTE2())+"')";
        isSuccess=rs.execute(sql);
        return isSuccess;
    }

    /**
     * oa建模主表id得到zt主表id
     * @param oaMD
     * @return
     */
    public String getMainId(String oaMD){
        String mainId="";
        String sql="select SOLUTION_ID from MDM_CUST_TERRITORY_SOLUTIONS where ATTRIBUTE1='"+oaMD+"'";
        rs.execute(sql);
        if(rs.next()){
            mainId=Util.null2String(rs.getString("SOLUTION_ID"));
        }
        return mainId;
    }

    /**
     * 删除中台主表数据
     * @param ztSolutionId
     * @return
     */
    public boolean deleteM(String ztSolutionId){
        boolean isSuccess=false;
        String sql="delete from MDM_CUST_TERRITORY_SOLUTIONS where SOLUTION_ID='"+ztSolutionId+"'";
        isSuccess=rs.execute(sql);
        return isSuccess;
    }

    /**
     * 删除中台明细数据
     * @param ztSolutionId
     * @return
     */
    public boolean delateD(String ztSolutionId){
        boolean isSuccess=false;
        String sql="delete from MDM_CUST_TERRITORIES where SOLUTION_ID='"+ztSolutionId+"'";
        isSuccess=rs.execute(sql);
        return isSuccess;
    }

    /**
     * oa建模主表id，明细id得到明细id
     * @param oaMD
     * @param oaDD
     * @return
     */
    public String getDetailId(String oaMD,String oaDD){
        String detailId="";
        String sql="select TERRITORY_ID from MDM_CUST_TERRITORIES where ATTRIBUTE1='"+oaMD+"' and ATTRIBUTE2='"+oaDD+"'";
        rs.execute(sql);
        if(rs.next()){
            detailId=Util.null2String(rs.getString("TERRITORY_ID"));
        }
        return detailId;
    }

    /**
     * 跟新中台主表数据
     * @param ztMarketOrgEntity
     * @return
     */
    public boolean updateMainData(ZTMarketOrgEntity ztMarketOrgEntity){
        boolean isSuccess=false;
        String sql="update MDM_CUST_TERRITORY_SOLUTIONS set UNIT_ID='"+ztMarketOrgEntity.getUNIT_ID()+
                "',SOLUTION_NAME='"+Util.null2String(ztMarketOrgEntity.getSOLUTION_NAME())+
                "',ENABLED_FLAG='"+Util.null2String(ztMarketOrgEntity.getENABLED_FLAG())+
                "',CONTROL_LEVEL='"+Util.null2String(ztMarketOrgEntity.getCONTROL_LEVEL())+
                "',VALUE_FROM1='"+Util.null2String(ztMarketOrgEntity.getVALUE_FROM1())+
                "',VALUE_FROM2='"+Util.null2String(ztMarketOrgEntity.getVALUE_FROM2())+
                "',VALUE_FROM3='"+Util.null2String(ztMarketOrgEntity.getVALUE_FROM3())+
                "',VALUE_FROM4='"+Util.null2String(ztMarketOrgEntity.getVALUE_FROM4())+
                "',VALUE_FROM5='"+Util.null2String(ztMarketOrgEntity.getVALUE_FROM5())+
                "',VALUE_FROM6='"+Util.null2String(ztMarketOrgEntity.getVALUE_FROM6())+
                "',VALUE_FROM7='"+Util.null2String(ztMarketOrgEntity.getVALUE_FROM7())+
                "',VALUE_FROM8='"+Util.null2String(ztMarketOrgEntity.getVALUE_FROM8())+
                "',VALUE_FROM9='"+Util.null2String(ztMarketOrgEntity.getVALUE_FROM9())+
                "',VALUE_FROM10='"+Util.null2String(ztMarketOrgEntity.getVALUE_FROM10())+
                "',ACTIVE_START_DATE=to_date('"+Util.null2String(ztMarketOrgEntity.getACTIVE_START_DATE())+"','yyyy-MM-dd HH24:mi:ss')"+
                ",ACTIVE_END_DATE=to_date('"+Util.null2String(ztMarketOrgEntity.getACTIVE_END_DATE())+"','yyyy-MM-dd HH24:mi:ss')"+
                ",OBJECT_VERSION_NUMBER='"+Util.null2String(ztMarketOrgEntity.getOBJECT_VERSION_NUMBER())+
//                "',CREATION_DATE='"+Util.null2String(ztMarketOrgEntity.getCREATION_DATE())+
//                "',CREATED_BY='"+Util.null2String(ztMarketOrgEntity.getCREATED_BY())+
//                "',LAST_UPDATED_BY='"+Util.null2String(ztMarketOrgEntity.getLAST_UPDATED_BY())+
                "',LAST_UPDATE_DATE=to_date('"+Util.null2String(ztMarketOrgEntity.getLAST_UPDATE_DATE())+"','yyyy-MM-dd HH24:mi:ss')"+
                ",LAST_UPDATE_LOGIN='"+Util.null2String(ztMarketOrgEntity.getLAST_UPDATE_LOGIN())+
                "',PROGRAM_APPLICATION_ID='"+Util.null2String(ztMarketOrgEntity.getPROGRAM_APPLICATION_ID())+
                "',PROGRAM_ID='"+Util.null2String(ztMarketOrgEntity.getPROGRAM_ID())+
                "',PROGRAM_UPDATE_DATE='"+Util.null2String(ztMarketOrgEntity.getPROGRAM_UPDATE_DATE())+
                "',REQUEST_ID='"+Util.null2String(ztMarketOrgEntity.getREQUEST_ID())+
                "',ATTRIBUTE_CATEGORY='"+Util.null2String(ztMarketOrgEntity.getATTRIBUTE_CATEGORY())+"' where ATTRIBUTE1='"+Util.null2String(ztMarketOrgEntity.getATTRIBUTE1())+"'";
        System.out.println("营销组织跟新主表sql为: "+sql);
        isSuccess=rs.execute(sql);
        return isSuccess;
    }

    /**
     * 跟新中台明细数据
     * @param ztMarketOrgDtEntity
     * @return
     */
    public boolean updateDetailData(ZTMarketOrgDtEntity ztMarketOrgDtEntity,String oaId){
        boolean isSuccess=false;
        String sql="update MDM_CUST_TERRITORIES set UNIT_ID='"+Util.null2String(ztMarketOrgDtEntity.getUNIT_ID())+
                "',TERRITORY_NAME='"+Util.null2String(ztMarketOrgDtEntity.getTERRITORY_NAME())+
                "',TERRITORY_CODE='"+Util.null2String(ztMarketOrgDtEntity.getTERRITORY_CODE())+
                "',SEGMENT1='"+Util.null2String(ztMarketOrgDtEntity.getSEGMENT1())+
                "',SEGMENT2='"+Util.null2String(ztMarketOrgDtEntity.getSEGMENT2())+
                "',SEGMENT3='"+Util.null2String(ztMarketOrgDtEntity.getSEGMENT3())+
                "',SEGMENT4='"+Util.null2String(ztMarketOrgDtEntity.getSEGMENT4())+
                "',SEGMENT5='"+Util.null2String(ztMarketOrgDtEntity.getSEGMENT5())+
                "',ACTIVE_START_DATE=to_date('"+Util.null2String(ztMarketOrgDtEntity.getACTIVE_START_DATE())+"','yyyy-MM-dd HH24:mi:ss')"+
                ",ACTIVE_END_DATE=to_date('"+Util.null2String(ztMarketOrgDtEntity.getACTIVE_END_DATE())+"','yyyy-MM-dd HH24:mi:ss')"+
                ",OBJECT_VERSION_NUMBER='"+Util.null2String(ztMarketOrgDtEntity.getOBJECT_VERSION_NUMBER())+
//                "',CREATION_DATE='"+Util.null2String(ztMarketOrgDtEntity.getCREATION_DATE())+
//                "',CREATED_BY='"+Util.null2String(ztMarketOrgDtEntity.getCREATED_BY())+
//                "',LAST_UPDATED_BY='"+Util.null2String(ztMarketOrgDtEntity.getLAST_UPDATED_BY())+
                "',LAST_UPDATE_DATE=to_date('"+Util.null2String(ztMarketOrgDtEntity.getLAST_UPDATE_DATE())+"','yyyy-MM-dd HH24:mi:ss')"+" where ATTRIBUTE1='"+oaId+"' and ATTRIBUTE2='"+ztMarketOrgDtEntity.getATTRIBUTE2()+"'";
//                "',LAST_UPDATE_LOGIN='"+Util.null2String(ztMarketOrgDtEntity.getLAST_UPDATE_LOGIN())+
//                "',PROGRAM_APPLICATION_ID='"+Util.null2String(ztMarketOrgDtEntity.getPROGRAM_APPLICATION_ID())+
//                "',PROGRAM_ID='"+Util.null2String(ztMarketOrgDtEntity.getPROGRAM_ID())+
//                "',PROGRAM_UPDATE_DATE='"+Util.null2String(ztMarketOrgDtEntity.getPROGRAM_UPDATE_DATE())+
//                "',REQUEST_ID='"+Util.null2String(ztMarketOrgDtEntity.getREQUEST_ID())+
//                "',ATTRIBUTE_CATEGORY='"+Util.null2String(ztMarketOrgDtEntity.getATTRIBUTE_CATEGORY())+
//                "',ATTRIBUTE1='"+Util.null2String(ztMarketOrgDtEntity.getATTRIBUTE1())+
//                "',ATTRIBUTE2='"+Util.null2String(ztMarketOrgDtEntity.getATTRIBUTE2())+
        System.out.println("营销组织跟新明细数据sql为: "+sql);
        isSuccess=rs.execute(sql);
        return isSuccess;
    }

    /**
     * 得到中台主表版本号
     * @param solutionId
     * @return
     */
    public String getVersionNumM(String solutionId){
        String versionNum="";
        String sql="select OBJECT_VERSION_NUMBER from MDM_CUST_TERRITORY_SOLUTIONS where SOLUTION_ID='"+solutionId+"'";
        rs.execute(sql);
        if(rs.next()){
            versionNum=Util.null2String(rs.getString("OBJECT_VERSION_NUMBER"));
        }
        return versionNum;
    }

    /**
     * 得到中台明细表版本号
     * @param territoryId
     * @return
     */
    public String getVersionNumD(String territoryId){
        String versionNum="";
        String sql="select OBJECT_VERSION_NUMBER from MDM_CUST_TERRITORIES where TERRITORY_ID='"+territoryId+"'";
        rs.execute(sql);
        if(rs.next()){
            versionNum=Util.null2String(rs.getString("OBJECT_VERSION_NUMBER"));
        }
        return versionNum;
    }

    /**
     * 删除明细数据
     * @param territoryId
     * @return
     */
    public boolean deleteDetailData(String territoryId){
        boolean isSuccess=false;
        String sql="delete from MDM_CUST_TERRITORIES where TERRITORY_ID='"+territoryId+"'";
        isSuccess=rs.execute(sql);
        return isSuccess;
    }

    /**
     * 插入中台人员数据
     * @param ztMarketOrgHrmEntity
     * @return
     */
    public boolean insertHrmData(ZTMarketOrgHrmEntity ztMarketOrgHrmEntity){
        boolean isSuccess=false;
        String sql="insert into OMS_SYS_TERRITORY_EMPLOYEES(TERRITORY_EMPLOYEE_ID,UNIT_ID,LOOKUP_LEVEL,TERRITORY_CODE,EMPLOYEE_ID,FUNCTION_PRIVILEGE,SOLUTION_ID,OBJECT_VERSION_NUMBER,CREATION_DATE,CREATED_BY,LAST_UPDATED_BY,LAST_UPDATE_DATE,LAST_UPDATE_LOGIN,PROGRAM_APPLICATION_ID,PROGRAM_ID,PROGRAM_UPDATE_DATE,REQUEST_ID,ATTRIBUTE_CATEGORY,ATTRIBUTE1,EMPLOYEE_ROLE) values('"
                +Util.null2String(ztMarketOrgHrmEntity.getTERRITORY_EMPLOYEE_ID())+
                "','"+Util.null2String(ztMarketOrgHrmEntity.getUNIT_ID())+
                "','"+Util.null2String(ztMarketOrgHrmEntity.getLOOKUP_LEVEL())+
                "','"+Util.null2String(ztMarketOrgHrmEntity.getTERRITORY_CODE())+
                "','"+Util.null2String(ztMarketOrgHrmEntity.getEMPLOYEE_ID())+
                "','"+Util.null2String(ztMarketOrgHrmEntity.getFUNCTION_PRIVILEGE())+
                "','"+Util.null2String(ztMarketOrgHrmEntity.getSOLUTION_ID())+
                "','"+Util.null2String(ztMarketOrgHrmEntity.getOBJECT_VERSION_NUMBER())+
                "',to_date('"+Util.null2String(ztMarketOrgHrmEntity.getCREATION_DATE())+"','yyyy-MM-dd HH24:mi:ss')"+
                ",'"+Util.null2String(ztMarketOrgHrmEntity.getCREATED_BY())+
                "','"+Util.null2String(ztMarketOrgHrmEntity.getLAST_UPDATED_BY())+
                "',to_date('"+Util.null2String(ztMarketOrgHrmEntity.getLAST_UPDATE_DATE())+"','yyyy-MM-dd HH24:mi:ss')"+
                ",'"+Util.null2String(ztMarketOrgHrmEntity.getLAST_UPDATE_LOGIN())+
                "','"+Util.null2String(ztMarketOrgHrmEntity.getPROGRAM_APPLICATION_ID())+
                "','"+Util.null2String(ztMarketOrgHrmEntity.getPROGRAM_ID())+
                "','"+Util.null2String(ztMarketOrgHrmEntity.getPROGRAM_UPDATE_DATE())+
                "','"+Util.null2String(ztMarketOrgHrmEntity.getREQUEST_ID())+
                "','"+Util.null2String(ztMarketOrgHrmEntity.getATTRIBUTE_CATEGORY())+
                "','"+Util.null2String(ztMarketOrgHrmEntity.getATTRIBUTE1())+
                "','"+Util.null2String(ztMarketOrgHrmEntity.getEMPLOYEE_ROLE())+ "')";
        System.out.println("插入中台人员sql为: "+sql);
        isSuccess=rs.execute(sql);
        return isSuccess;
    }

    /**
     * 得到营销区域人员id
     * @param oaId
     * @return
     */
    public String getHrmId(String oaId,String functionP,String marketArea){
        String territoryEmployeeId="";
        String sql="select TERRITORY_EMPLOYEE_ID from OMS_SYS_TERRITORY_EMPLOYEES where ATTRIBUTE1='"+oaId+"' and FUNCTION_PRIVILEGE='"+functionP+"' and TERRITORY_CODE='"+marketArea+"'";
        rs.execute(sql);
        if(rs.next()){
            territoryEmployeeId=Util.null2String(rs.getString("TERRITORY_EMPLOYEE_ID"));
        }
        return territoryEmployeeId;
    }

    /**
     * 得到中台人员id和功能权限
     * @param oaModeZTIds
     * @return
     */
    public Map<String,String> getZTIdAndFunctionP(String oaModeZTIds){
        Map<String,String> map=new HashMap<>();
        String sql="select TERRITORY_EMPLOYEE_ID,FUNCTION_PRIVILEGE from OMS_SYS_TERRITORY_EMPLOYEES where TERRITORY_EMPLOYEE_ID in ('"+oaModeZTIds+"')";
        rs.execute(sql);
        while(rs.next()){
            map.put(Util.null2String(rs.getString("TERRITORY_EMPLOYEE_ID")),Util.null2String(rs.getString("FUNCTION_PRIVILEGE")));
        }
        return map;
    }

    /**
     * 跟新中台人员数据
     * @param ztMarketOrgHrmEntity
     * @return
     */
    public boolean updateHrmData(ZTMarketOrgHrmEntity ztMarketOrgHrmEntity,String territoryEmployeeId){
        boolean isSuccess=false;
        String sql="update OMS_SYS_TERRITORY_EMPLOYEES set UNIT_ID='"+Util.null2String(ztMarketOrgHrmEntity.getUNIT_ID())+
                "',LOOKUP_LEVEL='"+Util.null2String(ztMarketOrgHrmEntity.getLOOKUP_LEVEL())+
                "',TERRITORY_CODE='"+Util.null2String(ztMarketOrgHrmEntity.getTERRITORY_CODE())+
                "',EMPLOYEE_ID='"+Util.null2String(ztMarketOrgHrmEntity.getEMPLOYEE_ID())+
                "',FUNCTION_PRIVILEGE='"+Util.null2String(ztMarketOrgHrmEntity.getFUNCTION_PRIVILEGE())+
                "',SOLUTION_ID='"+Util.null2String(ztMarketOrgHrmEntity.getSOLUTION_ID())+
                "',OBJECT_VERSION_NUMBER='"+Util.null2String(ztMarketOrgHrmEntity.getOBJECT_VERSION_NUMBER())+
//                "',CREATION_DATE=to_date('"+Util.null2String(ztMarketOrgHrmEntity.getCREATION_DATE())+"','yyyy-MM-dd HH24:mi:ss')"+
                "',CREATED_BY='"+Util.null2String(ztMarketOrgHrmEntity.getCREATED_BY())+
                "',LAST_UPDATED_BY='"+Util.null2String(ztMarketOrgHrmEntity.getLAST_UPDATED_BY())+
                "',LAST_UPDATE_DATE=to_date('"+Util.null2String(ztMarketOrgHrmEntity.getLAST_UPDATE_DATE())+"','yyyy-MM-dd HH24:mi:ss')"+
                ",LAST_UPDATE_LOGIN='"+Util.null2String(ztMarketOrgHrmEntity.getLAST_UPDATE_LOGIN())+
                "',PROGRAM_APPLICATION_ID='"+Util.null2String(ztMarketOrgHrmEntity.getPROGRAM_APPLICATION_ID())+
                "',PROGRAM_ID='"+Util.null2String(ztMarketOrgHrmEntity.getPROGRAM_ID())+
                "',PROGRAM_UPDATE_DATE='"+Util.null2String(ztMarketOrgHrmEntity.getPROGRAM_UPDATE_DATE())+
                "',REQUEST_ID='"+Util.null2String(ztMarketOrgHrmEntity.getREQUEST_ID())+
                "',ATTRIBUTE_CATEGORY='"+Util.null2String(ztMarketOrgHrmEntity.getATTRIBUTE_CATEGORY())+
                "',ATTRIBUTE1='"+Util.null2String(ztMarketOrgHrmEntity.getATTRIBUTE1())+
                "',EMPLOYEE_ROLE='"+Util.null2String(ztMarketOrgHrmEntity.getEMPLOYEE_ROLE())+"' where TERRITORY_EMPLOYEE_ID='"+territoryEmployeeId+"'";
        isSuccess=rs.execute(sql);
        return isSuccess;
    }

    /**
     * 删除营销区域人员数据
     * @param id
     * @return
     */
    public boolean deleteHrmData(String id){
        boolean isSuccess=false;
        String sql="delete from OMS_SYS_TERRITORY_EMPLOYEES where TERRITORY_EMPLOYEE_ID='"+id+"'";
        isSuccess=rs.execute(sql);
        return isSuccess;
    }

    /**
     * 得到营销组织架构主表序列号
     * @return
     */
    public String getSequenceOrgM(){
        String sequence="";
        String sql="select MDM_CUST_TERRITORY_SOLUTIONS_s.NEXTVAL sequence from dual";
        rs.execute(sql);
        if(rs.next()){
            sequence=Util.null2String(rs.getString("sequence"));
        }
        return sequence;
    }

    /**
     * 得到营销组织架构明细序列号
     * @return
     */
    public String getSequenceOrgD(){
        String sequence="";
        String sql="select MDM_CUST_TERRITORIES_s.NEXTVAL sequence from dual";
        rs.execute(sql);
        if(rs.next()){
            sequence=Util.null2String(rs.getString("sequence"));
        }
        return sequence;
    }

    /**
     * 得到营销区域人员序列号
     * @return
     */
    public String getSequenceOrgHrm(){
        String sequence="";
        String sql="select OMS_SYS_TERRITORY_EMPLOYEES_s.NEXTVAL sequence from dual";
        rs.execute(sql);
        if(rs.next()){
            sequence=Util.null2String(rs.getString("sequence"));
        }
        return sequence;
    }

    /**
     * 中台id转value值
     * @param id
     * @return
     */
    public String getTransferValue(String id){
        String transferValue="";
        String sql="select value from OMS_FND_LOOKUP_VALUE_V where code_value_id='"+id+"'";
        rs.execute(sql);
        if(rs.next()){
            transferValue=Util.null2String(rs.getString("value"));
        }
        return transferValue;
    }

    /**
     * 得到中台营销区域人员版本号
     * @param employeeId
     * @param functionP
     * @return
     */
    public String getVersionNumHrm(String employeeId,String functionP){
        String versionNum="";
        String sql="select OBJECT_VERSION_NUMBER from OMS_SYS_TERRITORY_EMPLOYEES where TERRITORY_EMPLOYEE_ID='"+employeeId+"' and FUNCTION_PRIVILEGE='"+functionP+"'";
        rs.execute(sql);
        if(rs.next()){
            versionNum=Util.null2String(rs.getString("OBJECT_VERSION_NUMBER"));
        }
        return versionNum;
    }

    /**
     * 得到中台人员id
     * @param oaHrmCode
     * @return
     */
    public String getZTHrmId(String oaHrmCode){
        String ztHrmId="";
        String sql="select EMPLOYEE_ID from hr_employee where EMPLOYEE_CODE ='"+oaHrmCode+"'";
        rs.execute(sql);
        if(rs.next()){
            ztHrmId=Util.null2String(rs.getString("EMPLOYEE_ID"));
        }
        return ztHrmId;
    }

    /**
     * 根据层级id得到层级名称()
     * @param id
     * @return
     */
    public String getStoreyName(String id){
        String storeyValue="";
        String sql="select meaning from sys_code_value_b where CODE_VALUE_ID ='"+id+"'";
        rs.execute(sql);
        if(rs.next()){
            storeyValue=Util.null2String(rs.getString("meaning"));
        }
        return storeyValue;
    }

    /**
     * 删除营销组织人员中台数据
     * @return
     */
    public boolean delete(String id){
        boolean isSuccess=false;
        String sql="delete from OMS_SYS_TERRITORY_EMPLOYEES where TERRITORY_EMPLOYEE_ID='"+id+"'";
        isSuccess=rs.execute(sql);
        System.out.println("删除是否成功: "+isSuccess);
        return isSuccess;
    }





}
