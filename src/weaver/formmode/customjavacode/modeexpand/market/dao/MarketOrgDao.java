package weaver.formmode.customjavacode.modeexpand.market.dao;

import weaver.conn.RecordSet;
import weaver.formmode.customjavacode.modeexpand.market.entity.MarketOrgDtEntity;
import weaver.formmode.customjavacode.modeexpand.market.entity.MarketOrgEntity;
import weaver.formmode.customjavacode.modeexpand.market.entity.MarketOrgHrmEntity;
import weaver.general.Util;

import java.util.ArrayList;
import java.util.List;

public class MarketOrgDao {

    RecordSet rs=new RecordSet();

    /**
     * 数据id得到营销主表数据(营销组织)
     * @param id
     * @return
     */
    public MarketOrgEntity getMarketOrgMes(String id){
        MarketOrgEntity marketOrgEntity=new MarketOrgEntity();
        String sql="select id,SOLUTION_ID,UNIT_ID,SOLUTION_NAME,ENABLED_FLAG,CONTROL_LEVEL,VALUE_FROM1,VALUE_FROM2,VALUE_FROM3,VALUE_FROM4,VALUE_FROM5,VALUE_FROM6,VALUE_FROM7,VALUE_FROM8,VALUE_FROM9,VALUE_FROM10,ACTIVE_START_DATE,ACTIVE_END_DATE,OBJECT_VERSION_NUMBER,LAST_UPDATE_LOGIN,PROGRAM_APPLICATION_ID,PROGRAM_ID,PROGRAM_UPDATE_DATE,REQUEST_ID,ATTRIBUTE_CATEGORY from uf_yxqyjgzb where id='"+id+"'";
        System.out.println("营销组织主表查询数据sql为: "+sql);
        rs.execute(sql);
        if(rs.next()){
            marketOrgEntity.setId(Util.null2String(rs.getString("id")));
            marketOrgEntity.setSOLUTION_ID(Util.null2String(rs.getString("SOLUTION_ID")));
            marketOrgEntity.setUNIT_ID(Util.null2String(rs.getString("UNIT_ID")));
            marketOrgEntity.setSOLUTION_NAME(Util.null2String(rs.getString("SOLUTION_NAME")));
            marketOrgEntity.setENABLED_FLAG(Util.null2String(rs.getString("ENABLED_FLAG")));
            marketOrgEntity.setCONTROL_LEVEL(Util.null2String(rs.getString("CONTROL_LEVEL")));
            marketOrgEntity.setVALUE_FROM1(Util.null2String(rs.getString("VALUE_FROM1")));
            marketOrgEntity.setVALUE_FROM2(Util.null2String(rs.getString("VALUE_FROM2")));
            marketOrgEntity.setVALUE_FROM3(Util.null2String(rs.getString("VALUE_FROM3")));
            marketOrgEntity.setVALUE_FROM4(Util.null2String(rs.getString("VALUE_FROM4")));
            marketOrgEntity.setVALUE_FROM5(Util.null2String(rs.getString("VALUE_FROM5")));
            marketOrgEntity.setVALUE_FROM6(Util.null2String(rs.getString("VALUE_FROM6")));
            marketOrgEntity.setVALUE_FROM7(Util.null2String(rs.getString("VALUE_FROM7")));
            marketOrgEntity.setVALUE_FROM8(Util.null2String(rs.getString("VALUE_FROM8")));
            marketOrgEntity.setVALUE_FROM9(Util.null2String(rs.getString("VALUE_FROM9")));
            marketOrgEntity.setVALUE_FROM10(Util.null2String(rs.getString("VALUE_FROM10")));
            marketOrgEntity.setACTIVE_START_DATE(Util.null2String(rs.getString("ACTIVE_START_DATE")));
            marketOrgEntity.setACTIVE_END_DATE(Util.null2String(rs.getString("ACTIVE_END_DATE")));
            marketOrgEntity.setOBJECT_VERSION_NUMBER(Util.null2String(rs.getString("OBJECT_VERSION_NUMBER")));
            marketOrgEntity.setLAST_UPDATE_LOGIN(Util.null2String(rs.getString("LAST_UPDATE_LOGIN")));
            marketOrgEntity.setPROGRAM_APPLICATION_ID(Util.null2String(rs.getString("PROGRAM_APPLICATION_ID")));
            marketOrgEntity.setPROGRAM_ID(Util.null2String(rs.getString("PROGRAM_ID")));
            marketOrgEntity.setPROGRAM_UPDATE_DATE(Util.null2String(rs.getString("PROGRAM_UPDATE_DATE")));
            marketOrgEntity.setREQUEST_ID(Util.null2String(rs.getString("REQUEST_ID")));
            marketOrgEntity.setATTRIBUTE_CATEGORY(Util.null2String(rs.getString("ATTRIBUTE_CATEGORY")));
        }
        return marketOrgEntity;
    }

    /**
     * 主表id得到营销明细数据(营销组织)
     * @param mainId
     * @return
     */
    public List<MarketOrgDtEntity> getMarketOrgDtMes(String mainId){
        List<MarketOrgDtEntity> list=new ArrayList<>();
        String sql="select id,TERRITORY_ID,SOLUTION_ID,UNIT_ID,TERRITORY_NAME,TERRITORY_CODE,SEGMENT1,SEGMENT2,SEGMENT3,SEGMENT4,SEGMENT5,ACTIVE_START_DATE,ACTIVE_END_DATE,OBJECT_VERSION_NUMBER,dz1mc,dz2mc,dz3mc,dz4mc,dz5mc,sc from UF_YXQYJGZB_DT1 where mainid='"+mainId+"'";
        System.out.println("营销组织明细数据查询sql为: "+sql);
        rs.execute(sql);
        while(rs.next()){
            MarketOrgDtEntity marketOrgDtEntity=new MarketOrgDtEntity();
            marketOrgDtEntity.setId(Util.null2String(rs.getString("id")));
            marketOrgDtEntity.setTERRITORY_ID(Util.null2String(rs.getString("TERRITORY_ID")));
            marketOrgDtEntity.setSOLUTION_ID(Util.null2String(rs.getString("SOLUTION_ID")));
            marketOrgDtEntity.setUNIT_ID(Util.null2String(rs.getString("UNIT_ID")));
            marketOrgDtEntity.setTERRITORY_NAME(Util.null2String(rs.getString("TERRITORY_NAME")));
            marketOrgDtEntity.setTERRITORY_CODE(Util.null2String(rs.getString("TERRITORY_CODE")));
            marketOrgDtEntity.setSEGMENT1(Util.null2String(rs.getString("SEGMENT1")));
            marketOrgDtEntity.setSEGMENT2(Util.null2String(rs.getString("SEGMENT2")));
            marketOrgDtEntity.setSEGMENT3(Util.null2String(rs.getString("SEGMENT3")));
            marketOrgDtEntity.setSEGMENT4(Util.null2String(rs.getString("SEGMENT4")));
            marketOrgDtEntity.setSEGMENT5(Util.null2String(rs.getString("SEGMENT5")));
            marketOrgDtEntity.setACTIVE_START_DATE(Util.null2String(rs.getString("ACTIVE_START_DATE")));
            marketOrgDtEntity.setACTIVE_END_DATE(Util.null2String(rs.getString("ACTIVE_END_DATE")));
            marketOrgDtEntity.setOBJECT_VERSION_NUMBER(Util.null2String(rs.getString("OBJECT_VERSION_NUMBER")));
            marketOrgDtEntity.setDz1mc(Util.null2String(rs.getString("dz1mc")));
            marketOrgDtEntity.setDz2mc(Util.null2String(rs.getString("dz2mc")));
            marketOrgDtEntity.setDz3mc(Util.null2String(rs.getString("dz3mc")));
            marketOrgDtEntity.setDz4mc(Util.null2String(rs.getString("dz4mc")));
            marketOrgDtEntity.setDz5mc(Util.null2String(rs.getString("dz5mc")));
            marketOrgDtEntity.setSc(Util.null2String(rs.getString("sc")));
            list.add(marketOrgDtEntity);
        }
        return list;
    }

    /**
     * 数据id得到营销主表数据(营销组织人员)
     * @param id
     * @return
     */
    public MarketOrgHrmEntity getMarketOrgHrmMes(String id){
        MarketOrgHrmEntity marketOrgHrmEntity=new MarketOrgHrmEntity();
        String sql="select id,yxqyryjs,TERRITORY_EMPLOYEE_ID,UNIT_ID,LOOKUP_LEVEL,TERRITORY_CODE,EMPLOYEE_ID,FUNCTION_PRIVILEGE,SOLUTION_ID,OBJECT_VERSION_NUMBER,yxqy from uf_yxqyry where id='"+id+"'";
        rs.execute(sql);
        if(rs.next()){
            marketOrgHrmEntity.setId(Util.null2String(rs.getString("id")));
            marketOrgHrmEntity.setYxqyryjs(Util.null2String(rs.getString("yxqyryjs")));
            marketOrgHrmEntity.setTERRITORY_EMPLOYEE_ID(Util.null2String(rs.getString("TERRITORY_EMPLOYEE_ID")));
            marketOrgHrmEntity.setUNIT_ID(Util.null2String(rs.getString("UNIT_ID")));
            marketOrgHrmEntity.setLOOKUP_LEVEL(Util.null2String(rs.getString("LOOKUP_LEVEL")));
            marketOrgHrmEntity.setTERRITORY_CODE(Util.null2String(rs.getString("TERRITORY_CODE")));
            marketOrgHrmEntity.setEMPLOYEE_ID(Util.null2String(rs.getString("EMPLOYEE_ID")));
            marketOrgHrmEntity.setFUNCTION_PRIVILEGE(Util.null2String(rs.getString("FUNCTION_PRIVILEGE")));
            marketOrgHrmEntity.setSOLUTION_ID(Util.null2String(rs.getString("SOLUTION_ID")));
            marketOrgHrmEntity.setYxqy(Util.null2String(rs.getString("yxqy")));
        }
        return marketOrgHrmEntity;
    }

    /**
     * 跟新oa建模主表方案id
     * @param ztSolutionId
     * @param idM  oa主表id
     * @return
     */
    public boolean updateSolutionIdM(String ztSolutionId,String idM){
        boolean isSuccess=false;
        String sql="update uf_yxqyjgzb set SOLUTION_ID='"+ztSolutionId+"' where id='"+idM+"'";
        isSuccess=rs.execute(sql);
        return isSuccess;
    }

    /**
     * 跟新oa建模明细方案id和区域id
     * @param ztTerritoryId
     * @param ztSolutionId
     * @param idD oa明细id
     * @return
     */
    public boolean updateTerritorySolutionIdById(String ztTerritoryId,String ztSolutionId,String idD){
        boolean isSuccess=false;
        String sql="update UF_YXQYJGZB_DT1 set TERRITORY_ID='"+ztTerritoryId+"',SOLUTION_ID='"+ztSolutionId+"' where id='"+idD+"'";
        System.out.println("跟新oa明细数据sql: "+sql);
        isSuccess=rs.execute(sql);
        return isSuccess;
    }

    /**
     * 跟新oa建模明细方案id和区域id
     * @param ztTerritoryId
     * @param ztSolutionId
     * @param oaMainId oa主表id
     * @return
     */
    public boolean updateTerritorySolutionIdByMId(String ztTerritoryId,String ztSolutionId,String oaMainId){
        boolean isSuccess=false;
        String sql="update UF_YXQYJGZB_DT1 set TERRITORY_ID='"+ztTerritoryId+"',SOLUTION_ID='"+ztSolutionId+"' where mainid='"+oaMainId+"'";
        isSuccess=rs.execute(sql);
        return isSuccess;
    }

    /**
     * 建模主表是否存在方案id
     * @param id
     * @return
     */
    public String getSolutionId(String id){
        String solutionId="";
        String sql="select SOLUTION_ID from uf_yxqyjgzb where id='"+id+"'";
        rs.execute(sql);
        if(rs.next()){
            solutionId=Util.null2String(rs.getString("SOLUTION_ID"));
        }
        return solutionId;
    }

    /**
     * 删除建模明细数据
     * @param id
     * @return
     */
    public boolean daleteDetailData(String id){
        boolean isSuccess=false;
        String sql="delete from UF_YXQYJGZB_DT1 where id='"+id+"'";
        isSuccess=rs.execute(sql);
        return isSuccess;
    }

    /**
     * 跟新营销区域人员id
     * @param ztId
     * @return
     */
    public boolean updateHrmData(String ztId,String id){
        boolean isSuccess=false;
        String sql="update uf_yxqyry set TERRITORY_EMPLOYEE_ID='"+ztId+"' where id='"+id+"'";
        isSuccess=rs.execute(sql);
        return isSuccess;
    }

    /**
     * 得到oa工号
     * @param id
     * @return
     */
    public String getWorkCode(String id){
        String workcode="";
        String sql="select workcode from hrmresource where id='"+id+"'";
        rs.execute(sql);
        if(rs.next()){
            workcode=Util.null2String(rs.getString("workcode"));
        }
        return workcode;
    }

    /**
     * 根据明细id跟新明细字段值(营销组织架构)
     * @param id
     * @return
     */
    public boolean updateDetail(String id,String fieldValue,String fieldName){
        boolean isSuccess=false;
        String sql="update UF_YXQYJGZB_DT1 set "+fieldName+"='"+fieldValue+"' where id='"+id+"'";
        isSuccess=rs.execute(sql);
        return isSuccess;
    }

    /**
     * 得到回写中台的人员组织架构id
     */
    public List<String> getTERRITORY_EMPLOYEE_ID(String id){
        List<String> TERRITORY_EMPLOYEE_ID=new ArrayList<>();
        String sql="select TERRITORY_EMPLOYEE_ID from uf_yxqyry where id in ("+id+")";
        System.out.println("查询oa回写的中台id的sql为:" +sql);
        rs.execute(sql);
        while(rs.next()){
            System.out.println("中台id为: "+rs.getString("TERRITORY_EMPLOYEE_ID"));
            TERRITORY_EMPLOYEE_ID.add(Util.null2String(rs.getString("TERRITORY_EMPLOYEE_ID")));
        }
        return TERRITORY_EMPLOYEE_ID;
    }

    /**
     * 删除营销组织人员数据
     * @return
     */
    public boolean delete(String id){
        boolean isSuccess=false;
        String sql="delete from uf_yxqyry where id in ("+id+")";
        isSuccess=rs.execute(sql);
        return isSuccess;
    }





}
