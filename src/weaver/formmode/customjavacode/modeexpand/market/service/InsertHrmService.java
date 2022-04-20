package weaver.formmode.customjavacode.modeexpand.market.service;

import weaver.formmode.customjavacode.modeexpand.market.dao.MarketOrgDao;
import weaver.formmode.customjavacode.modeexpand.market.dao.ZTDao;
import weaver.formmode.customjavacode.modeexpand.market.entity.MarketAreaMesEntity;
import weaver.formmode.customjavacode.modeexpand.market.entity.MarketOrgHrmEntity;
import weaver.formmode.customjavacode.modeexpand.market.entity.ZTMarketOrgHrmEntity;

public class InsertHrmService {
    MarketOrgDao marketOrgDao=new MarketOrgDao();

    ZTDao ztDao=new ZTDao();

    BaseService baseService=new BaseService();

    public boolean insert(String id) throws Exception {
        boolean isSuccess=false;
        MarketOrgHrmEntity marketOrgHrmEntity=marketOrgDao.getMarketOrgHrmMes(id);
        System.out.println("MarketOrgHrmEntity: "+marketOrgHrmEntity);
        String marketArea=marketOrgHrmEntity.getYxqy();
        System.out.println("营销区域为: "+marketArea);
        String functionP=marketOrgHrmEntity.getFUNCTION_PRIVILEGE();
        System.out.println("营销区域人员功能权限为: "+functionP);
        String territoryEmployeeId="";
        if(marketArea.contains(",")){
            String[] marketAreas=marketArea.split(",");
            for(int i=0;i<marketAreas.length;i++){
                String area=marketAreas[i];
                MarketAreaMesEntity marketAreaMesEntity=baseService.getMarketAreaMes(area);
                if(functionP.contains(",")){
                    String[] functionPs=functionP.split(",");
                    for(String str:functionPs){
                        ZTMarketOrgHrmEntity ztMarketOrgHrmEntity=baseService.getHrmData(marketOrgHrmEntity,marketAreaMesEntity,str);
                        System.out.println("插入中台人员数据为: "+ztMarketOrgHrmEntity);
                        boolean isSuccessMS=ztDao.insertHrmData(ztMarketOrgHrmEntity);
                        System.out.println("插入中台人员数据是否成功: "+isSuccessMS);
                        if(isSuccessMS){
                            territoryEmployeeId=territoryEmployeeId+ztDao.getHrmId(marketOrgHrmEntity.getId(),str,marketAreaMesEntity.getTerrritoryCode())+",";
                        }else{
                            throw new Exception("中台数据插入失败!");
                        }
                    }
                }else{
                    ZTMarketOrgHrmEntity ztMarketOrgHrmEntity=baseService.getHrmData(marketOrgHrmEntity,marketAreaMesEntity,functionP);
                    boolean isSuccessM=ztDao.insertHrmData(ztMarketOrgHrmEntity);
                    if(isSuccessM){
                        territoryEmployeeId=territoryEmployeeId+ztDao.getHrmId(marketOrgHrmEntity.getId(),functionP,marketAreaMesEntity.getTerrritoryCode())+",";
                    }else{
                        throw new Exception("中台数据插入失败!");
                    }

                }
            }
        }else{
            MarketAreaMesEntity marketAreaMesEntity=baseService.getMarketAreaMes(marketArea);
            if(functionP.contains(",")){
                String[] functionPs=functionP.split(",");
                for(String str:functionPs){
                    ZTMarketOrgHrmEntity ztMarketOrgHrmEntity=baseService.getHrmData(marketOrgHrmEntity,marketAreaMesEntity,str);
                    System.out.println("插入中台人员数据为: "+ztMarketOrgHrmEntity);
                    boolean isSuccessMS=ztDao.insertHrmData(ztMarketOrgHrmEntity);
                    System.out.println("插入中台人员数据是否成功: "+isSuccessMS);
                    if(isSuccessMS){
                        territoryEmployeeId=territoryEmployeeId+ztDao.getHrmId(marketOrgHrmEntity.getId(),str,marketAreaMesEntity.getTerrritoryCode())+",";
                    }else{
                        throw new Exception("中台数据插入失败!");
                    }
                }
            }else{
                ZTMarketOrgHrmEntity ztMarketOrgHrmEntity=baseService.getHrmData(marketOrgHrmEntity,marketAreaMesEntity,functionP);
                boolean isSuccessM=ztDao.insertHrmData(ztMarketOrgHrmEntity);
                if(isSuccessM){
                    territoryEmployeeId=territoryEmployeeId+ztDao.getHrmId(marketOrgHrmEntity.getId(),functionP,marketAreaMesEntity.getTerrritoryCode())+",";
                }else{
                    throw new Exception("中台数据插入失败!");
                }
            }
        }
        System.out.println("回写oa建模的区域人员id为: "+territoryEmployeeId);
        boolean isSuccessR=marketOrgDao.updateHrmData(territoryEmployeeId.substring(0,territoryEmployeeId.lastIndexOf(",")),id);
        System.out.println("回写oa建模区域人员id是否成功: "+isSuccessR);
        isSuccess=true;
        return isSuccess;
    }
}
