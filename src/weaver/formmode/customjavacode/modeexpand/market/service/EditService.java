package weaver.formmode.customjavacode.modeexpand.market.service;

import weaver.formmode.customjavacode.modeexpand.market.dao.MarketOrgDao;
import weaver.formmode.customjavacode.modeexpand.market.dao.ZTDao;
import weaver.formmode.customjavacode.modeexpand.market.entity.MarketOrgDtEntity;
import weaver.formmode.customjavacode.modeexpand.market.entity.MarketOrgEntity;
import weaver.formmode.customjavacode.modeexpand.market.entity.ZTMarketOrgDtEntity;
import weaver.formmode.customjavacode.modeexpand.market.entity.ZTMarketOrgEntity;

import java.util.List;

public class EditService {

    MarketOrgDao marketOrgDao=new MarketOrgDao();

    ZTDao ztDao=new ZTDao();

    BaseService baseService=new BaseService();
    /**
     *         判断主表中台id是否为空    为空抛方案i为d空不能编辑异常  不为空可以编辑
     *         得到主表的版本号
     *         得到中台主表跟新数据
     *         执行跟新sql,跟新中台主表数据     跟新成功:将版本号增加1回写至中台主表
     *         明细数据跟新编辑的数据
     *         判断建模回写的方案id和区域id是否为空
     *         为空的话为新增的数据   走新建的逻辑
     *         不为空且明细删除check框为选择状态   删除中台相应的数据和oa建模的数据
     *         不为空且check框不是选择状态    跟新中台的数据
     */
    public boolean edit(String id) throws Exception {
        boolean isSuccess=false;
        MarketOrgEntity marketOrgEntity=marketOrgDao.getMarketOrgMes(id);
        //oa表单方案id
        String solutionIdM=marketOrgEntity.getSOLUTION_ID();
        System.out.println("编辑时主表回写的方案id为: "+solutionIdM);
        String uniteId=marketOrgEntity.getUNIT_ID();
        if(!"".equals(solutionIdM)){
            //中台版本号
            String versionIdM=ztDao.getVersionNumM(solutionIdM);
            System.out.println("主表版本号为: "+versionIdM);
            if(!"".equals(versionIdM)){
                //版本号+1
                versionIdM=(Integer.parseInt(versionIdM)+1)+"";
                //主表数据
                ZTMarketOrgEntity ztMarketOrgEntity=baseService.getZTMainData(marketOrgEntity,versionIdM);
                System.out.println("ZTMarketOrgEntity: "+ztMarketOrgEntity);
                boolean isSuccessM=ztDao.updateMainData(ztMarketOrgEntity);
                System.out.println("跟新中台主表数据是否成功: "+isSuccessM);
                if(isSuccessM){
                    //明细数据
                    List<MarketOrgDtEntity> list=marketOrgDao.getMarketOrgDtMes(id);
                    System.out.println("明细条数为: "+list.size());
                    //跟新明细数据
                    for(MarketOrgDtEntity marketOrgDtEntity:list){
                        String idD=marketOrgDtEntity.getId();
                        marketOrgDao.updateDetail(idD,uniteId,"UNIT_ID");
                        if(!"".equals(marketOrgDtEntity.getSEGMENT1())){
                            marketOrgDao.updateDetail(idD,ztDao.getStoreyName(marketOrgDtEntity.getSEGMENT1()),"dz1mc");
                        }
                        if(!"".equals(marketOrgDtEntity.getSEGMENT2())){
                            marketOrgDao.updateDetail(idD,ztDao.getStoreyName(marketOrgDtEntity.getSEGMENT2()),"dz2mc");
                        }
                        if(!"".equals(marketOrgDtEntity.getSEGMENT3())){
                            marketOrgDao.updateDetail(idD,ztDao.getStoreyName(marketOrgDtEntity.getSEGMENT3()),"dz3mc");
                        }
                        if(!"".equals(marketOrgDtEntity.getSEGMENT4())){
                            marketOrgDao.updateDetail(idD,ztDao.getStoreyName(marketOrgDtEntity.getSEGMENT4()),"dz4mc");
                        }
                        if(!"".equals(marketOrgDtEntity.getSEGMENT5())){
                            marketOrgDao.updateDetail(idD,ztDao.getStoreyName(marketOrgDtEntity.getSEGMENT5()),"dz5mc");
                        }
                    }
                    for(MarketOrgDtEntity marketOrgDtEntity:list){
                        String isDelete=marketOrgDtEntity.getSc();
                        System.out.println("是否删除: "+isDelete);
                        String territoryId=marketOrgDtEntity.getTERRITORY_ID();
                        System.out.println("回写的明细区域id为: "+territoryId);
                        String solutionIdD=marketOrgDtEntity.getSOLUTION_ID();
                        System.out.println("回写的明细方案id为: "+solutionIdD);
                        //新增的
                        if("".equals(territoryId)&&"".equals(solutionIdD)&&"0".equals(isDelete)){
                            ZTMarketOrgDtEntity ztMarketOrgDtEntity=baseService.getZTDetailData(marketOrgDtEntity,id,solutionIdM,"1",uniteId);
                            boolean isSuccessD=ztDao.insertDetailData(ztMarketOrgDtEntity);
                            System.out.println("插入中台明细数据是否成功: "+isSuccessD);
                            //zt区域id
                            String detailIdZT=ztDao.getDetailId(id,marketOrgDtEntity.getId());
                            if(!"".equals(detailIdZT)){
                                boolean isSuccess4=marketOrgDao.updateTerritorySolutionIdById(detailIdZT,solutionIdM,marketOrgDtEntity.getId());
                                System.out.println("跟新oa建模明细数据是否成功: "+isSuccess4);
                            }
                        }
                        //跟新的
                        if(!"".equals(territoryId)&&!"".equals(solutionIdD)&&"0".equals(isDelete)){
                            String versionIdD=ztDao.getVersionNumD(territoryId);
                            versionIdD=(Integer.parseInt(versionIdD)+1)+"";
                            System.out.println("明细版本号为: "+versionIdD);
                            ZTMarketOrgDtEntity ztMarketOrgDtEntity=baseService.getZTDetailData(marketOrgDtEntity,"","",versionIdD,uniteId);
                            System.out.println("ZTMarketOrgDtEntity: "+ztMarketOrgDtEntity);
                            ztDao.updateDetailData(ztMarketOrgDtEntity,id);
                        }
                        //删除的
                        if(!"".equals(territoryId)&&!"".equals(solutionIdD)&&"1".equals(isDelete)){
                            ztDao.deleteDetailData(territoryId);
                            marketOrgDao.daleteDetailData(marketOrgDtEntity.getId());
                        }
                        if("".equals(territoryId)&&"".equals(solutionIdD)&&"1".equals(isDelete)){
                            marketOrgDao.daleteDetailData(marketOrgDtEntity.getId());
                        }
                    }
                }else{
                    throw new Exception("中台主表数据跟新失败!");
                }
            }else{
                throw new Exception("中台主表版本号没有获取到!");
            }
        }else{
            throw new Exception("方案id为空不能编辑数据!");
        }
        isSuccess=true;
        return isSuccess;
    }
}
