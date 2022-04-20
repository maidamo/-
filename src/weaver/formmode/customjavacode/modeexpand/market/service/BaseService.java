package weaver.formmode.customjavacode.modeexpand.market.service;


import weaver.formmode.customjavacode.modeexpand.market.dao.MarketOrgDao;
import weaver.formmode.customjavacode.modeexpand.market.dao.ZTDao;
import weaver.formmode.customjavacode.modeexpand.market.entity.*;
import weaver.formmode.customjavacode.modeexpand.market.util.GetDateUtil;

public class BaseService {

    ZTDao ztDao=new ZTDao();

    MarketOrgDao marketOrgDao=new MarketOrgDao();

    /**
     * 得到中台营销组织主表数据
     * @param marketOrgEntity
     * @param versionNum
     * @return
     */
    public ZTMarketOrgEntity getZTMainData(MarketOrgEntity marketOrgEntity,String versionNum){
        ZTMarketOrgEntity ztMarketOrgEntity=new ZTMarketOrgEntity();
        String sequence=ztDao.getSequenceOrgM();
        ztMarketOrgEntity.setSOLUTION_ID(sequence);
        ztMarketOrgEntity.setUNIT_ID(marketOrgEntity.getUNIT_ID());
        ztMarketOrgEntity.setSOLUTION_NAME(marketOrgEntity.getSOLUTION_NAME());
        ztMarketOrgEntity.setENABLED_FLAG(marketOrgEntity.getENABLED_FLAG());
        ztMarketOrgEntity.setCONTROL_LEVEL(marketOrgEntity.getCONTROL_LEVEL());
        ztMarketOrgEntity.setVALUE_FROM1(marketOrgEntity.getVALUE_FROM1());
        ztMarketOrgEntity.setVALUE_FROM2(marketOrgEntity.getVALUE_FROM2());
        ztMarketOrgEntity.setVALUE_FROM3(marketOrgEntity.getVALUE_FROM3());
        ztMarketOrgEntity.setVALUE_FROM4(marketOrgEntity.getVALUE_FROM4());
        ztMarketOrgEntity.setVALUE_FROM5(marketOrgEntity.getVALUE_FROM5());
        ztMarketOrgEntity.setVALUE_FROM6(marketOrgEntity.getVALUE_FROM6());
        ztMarketOrgEntity.setVALUE_FROM7(marketOrgEntity.getVALUE_FROM7());
        ztMarketOrgEntity.setVALUE_FROM8(marketOrgEntity.getVALUE_FROM8());
        ztMarketOrgEntity.setVALUE_FROM9(marketOrgEntity.getVALUE_FROM9());
        ztMarketOrgEntity.setVALUE_FROM10(marketOrgEntity.getVALUE_FROM10());
        if(!"".equals(marketOrgEntity.getACTIVE_START_DATE())){
            ztMarketOrgEntity.setACTIVE_START_DATE(marketOrgEntity.getACTIVE_START_DATE()+" 00:00:00");
        }
        if(!"".equals(marketOrgEntity.getACTIVE_END_DATE())){
            ztMarketOrgEntity.setACTIVE_END_DATE(marketOrgEntity.getACTIVE_END_DATE()+" 00:00:00");
        }
        ztMarketOrgEntity.setOBJECT_VERSION_NUMBER(versionNum);
        ztMarketOrgEntity.setCREATION_DATE(GetDateUtil.getDate());
        ztMarketOrgEntity.setCREATED_BY("10001");
        ztMarketOrgEntity.setLAST_UPDATED_BY("10001");
        ztMarketOrgEntity.setLAST_UPDATE_DATE(GetDateUtil.getDate());
        ztMarketOrgEntity.setLAST_UPDATE_LOGIN(marketOrgEntity.getLAST_UPDATE_LOGIN());
        ztMarketOrgEntity.setPROGRAM_APPLICATION_ID(marketOrgEntity.getPROGRAM_APPLICATION_ID());
        ztMarketOrgEntity.setPROGRAM_ID(marketOrgEntity.getPROGRAM_ID());
        ztMarketOrgEntity.setPROGRAM_UPDATE_DATE(marketOrgEntity.getPROGRAM_UPDATE_DATE());
        ztMarketOrgEntity.setREQUEST_ID(marketOrgEntity.getREQUEST_ID());
        ztMarketOrgEntity.setATTRIBUTE_CATEGORY(marketOrgEntity.getATTRIBUTE_CATEGORY());
        ztMarketOrgEntity.setATTRIBUTE1(marketOrgEntity.getId());
        return ztMarketOrgEntity;
    }

    /**
     * 得到中台营销组据织明细数
     * @param marketOrgDtEntity
     * @param id
     * @param ztId
     * @param versionNum
     * @return
     */
    public ZTMarketOrgDtEntity getZTDetailData(MarketOrgDtEntity marketOrgDtEntity, String id, String ztId,String versionNum,String uniteId){
        ZTMarketOrgDtEntity ztMarketOrgDtEntity=new ZTMarketOrgDtEntity();
        String sequence=ztDao.getSequenceOrgD();
        ztMarketOrgDtEntity.setTERRITORY_ID(sequence);
        ztMarketOrgDtEntity.setSOLUTION_ID(ztId);
        ztMarketOrgDtEntity.setUNIT_ID(uniteId);
        ztMarketOrgDtEntity.setTERRITORY_NAME(marketOrgDtEntity.getTERRITORY_NAME());
        ztMarketOrgDtEntity.setTERRITORY_CODE(marketOrgDtEntity.getTERRITORY_CODE());
        if(!"".equals(marketOrgDtEntity.getSEGMENT1())){
            ztMarketOrgDtEntity.setSEGMENT1(ztDao.getTransferValue(marketOrgDtEntity.getSEGMENT1()));
        }else{
            ztMarketOrgDtEntity.setSEGMENT1("");
        }
        if(!"".equals(marketOrgDtEntity.getSEGMENT2())){
            ztMarketOrgDtEntity.setSEGMENT2(ztDao.getTransferValue(marketOrgDtEntity.getSEGMENT2()));
        }else{
            ztMarketOrgDtEntity.setSEGMENT2("");
        }
        if(!"".equals(marketOrgDtEntity.getSEGMENT3())){
            ztMarketOrgDtEntity.setSEGMENT3(ztDao.getTransferValue(marketOrgDtEntity.getSEGMENT3()));
        }else{
            ztMarketOrgDtEntity.setSEGMENT3("");
        }
        if(!"".equals(marketOrgDtEntity.getSEGMENT4())){
            ztMarketOrgDtEntity.setSEGMENT4(ztDao.getTransferValue(marketOrgDtEntity.getSEGMENT4()));
        }else{
            ztMarketOrgDtEntity.setSEGMENT4("");
        }
        if(!"".equals(marketOrgDtEntity.getSEGMENT5())){
            ztMarketOrgDtEntity.setSEGMENT5(ztDao.getTransferValue(marketOrgDtEntity.getSEGMENT5()));
        }else{
            ztMarketOrgDtEntity.setSEGMENT5("");
        }
        if(!"".equals(marketOrgDtEntity.getACTIVE_START_DATE())){
            ztMarketOrgDtEntity.setACTIVE_START_DATE(marketOrgDtEntity.getACTIVE_START_DATE()+" 00:00:00");
        }
        if(!"".equals(marketOrgDtEntity.getACTIVE_END_DATE())){
            ztMarketOrgDtEntity.setACTIVE_END_DATE(marketOrgDtEntity.getACTIVE_END_DATE()+" 00:00:00");
        }
        ztMarketOrgDtEntity.setOBJECT_VERSION_NUMBER(versionNum);
        ztMarketOrgDtEntity.setCREATION_DATE(GetDateUtil.getDate());
        ztMarketOrgDtEntity.setCREATED_BY("10001");
        ztMarketOrgDtEntity.setLAST_UPDATED_BY("10001");
        ztMarketOrgDtEntity.setLAST_UPDATE_DATE(GetDateUtil.getDate());
        ztMarketOrgDtEntity.setLAST_UPDATE_LOGIN("");
        ztMarketOrgDtEntity.setPROGRAM_APPLICATION_ID("");
        ztMarketOrgDtEntity.setPROGRAM_ID("");
        ztMarketOrgDtEntity.setPROGRAM_UPDATE_DATE("");
        ztMarketOrgDtEntity.setREQUEST_ID("");
        ztMarketOrgDtEntity.setATTRIBUTE_CATEGORY("");
        ztMarketOrgDtEntity.setATTRIBUTE1(id);
        ztMarketOrgDtEntity.setATTRIBUTE2(marketOrgDtEntity.getId());
        return ztMarketOrgDtEntity;
    }

    /**
     * 得到中台营销区域人员信息
     * @param marketOrgHrmEntity
     * @param functionP  功能权限
     * @return
     */
    public ZTMarketOrgHrmEntity getHrmData(MarketOrgHrmEntity marketOrgHrmEntity,MarketAreaMesEntity marketAreaMesEntity,String functionP){
        ZTMarketOrgHrmEntity ztMarketOrgHrmEntity=new ZTMarketOrgHrmEntity();
        String sequence=ztDao.getSequenceOrgHrm();
        ztMarketOrgHrmEntity.setTERRITORY_EMPLOYEE_ID(sequence);
        ztMarketOrgHrmEntity.setUNIT_ID(marketOrgHrmEntity.getUNIT_ID());
        ztMarketOrgHrmEntity.setLOOKUP_LEVEL(marketAreaMesEntity.getLevel());
        ztMarketOrgHrmEntity.setTERRITORY_CODE(marketAreaMesEntity.getTerrritoryCode());
        ztMarketOrgHrmEntity.setEMPLOYEE_ID(ztDao.getZTHrmId(marketOrgDao.getWorkCode(marketOrgHrmEntity.getEMPLOYEE_ID())));
        ztMarketOrgHrmEntity.setFUNCTION_PRIVILEGE(functionP);
        ztMarketOrgHrmEntity.setSOLUTION_ID(marketAreaMesEntity.getSolutionId());
        ztMarketOrgHrmEntity.setOBJECT_VERSION_NUMBER("1");
        ztMarketOrgHrmEntity.setCREATION_DATE(GetDateUtil.getDate());
        ztMarketOrgHrmEntity.setCREATED_BY("10065");
        ztMarketOrgHrmEntity.setLAST_UPDATED_BY("10065");
        ztMarketOrgHrmEntity.setLAST_UPDATE_DATE(GetDateUtil.getDate());
        ztMarketOrgHrmEntity.setLAST_UPDATE_LOGIN("10065");
        ztMarketOrgHrmEntity.setPROGRAM_APPLICATION_ID("");
        ztMarketOrgHrmEntity.setPROGRAM_ID("-1");
        ztMarketOrgHrmEntity.setPROGRAM_UPDATE_DATE("");
        ztMarketOrgHrmEntity.setREQUEST_ID("-1");
        ztMarketOrgHrmEntity.setATTRIBUTE_CATEGORY("");
        ztMarketOrgHrmEntity.setATTRIBUTE1(marketOrgHrmEntity.getId());
        ztMarketOrgHrmEntity.setEMPLOYEE_ROLE(marketOrgHrmEntity.getYxqyryjs());
        return ztMarketOrgHrmEntity;
    }

    /**
     * 得到插入中台的营销区域数据
     * @param marketAreaId
     * @return
     */
    public MarketAreaMesEntity getMarketAreaMes(String marketAreaId) throws Exception {
        MarketAreaMesEntity marketAreaMesEntity=new MarketAreaMesEntity();
        if(!"".equals(marketAreaId)){
            String[] area=marketAreaId.split("_");
            String[] areas=area[1].split(";");
            String solutionId=marketOrgDao.getSolutionId(areas[0]);
            if(!"".equals(solutionId)){
                marketAreaMesEntity.setSolutionId(solutionId);
            }else{
                throw new Exception("方案id不能为空值!");
            }
            String territoryCodes="";
            for(int i=1;i<areas.length;i++){
                String ztTerritoryCode=ztDao.getTransferValue(areas[i]);
                territoryCodes=territoryCodes+ztTerritoryCode+".";
            }
            marketAreaMesEntity.setTerrritoryCode(territoryCodes.substring(0,territoryCodes.lastIndexOf(".")));
            marketAreaMesEntity.setLevel((areas.length-1)+"");
        }else{
            throw new Exception("营销区域为空!");
        }
        return marketAreaMesEntity;
    }
}
