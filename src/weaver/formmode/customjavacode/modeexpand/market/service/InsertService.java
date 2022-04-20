package weaver.formmode.customjavacode.modeexpand.market.service;

import weaver.formmode.customjavacode.modeexpand.market.dao.MarketOrgDao;
import weaver.formmode.customjavacode.modeexpand.market.dao.ZTDao;
import weaver.formmode.customjavacode.modeexpand.market.entity.MarketOrgDtEntity;
import weaver.formmode.customjavacode.modeexpand.market.entity.MarketOrgEntity;
import weaver.formmode.customjavacode.modeexpand.market.entity.ZTMarketOrgDtEntity;
import weaver.formmode.customjavacode.modeexpand.market.entity.ZTMarketOrgEntity;

import java.util.List;

public class InsertService {

    MarketOrgDao marketOrgDao=new MarketOrgDao();

    ZTDao ztDao=new ZTDao();

    BaseService baseService=new BaseService();

    /**
     * zt营销组织插入数据
     * @param id  oa建模数据id
     * @return
     */
    public boolean insert(String id) throws Exception {
        boolean isSuccess=false;
        MarketOrgEntity marketOrgEntity=marketOrgDao.getMarketOrgMes(id);
        String uniteId=marketOrgEntity.getUNIT_ID();
        ZTMarketOrgEntity ztMarketOrgEntity=baseService.getZTMainData(marketOrgEntity,"1");
        boolean isSuccessM=ztDao.insertMainData(ztMarketOrgEntity);
        System.out.println("营销组织插入主表数据是否成功: "+isSuccessM);
        //主表数据插入成功
        if(isSuccessM){
            //中台方案id
            String mainIdZT=ztDao.getMainId(id);
            System.out.println("中台方案id为: "+mainIdZT);
            //oa建模明细数据
            List<MarketOrgDtEntity> list=marketOrgDao.getMarketOrgDtMes(id);
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

                ZTMarketOrgDtEntity ztMarketOrgDtEntity=baseService.getZTDetailData(marketOrgDtEntity,id,mainIdZT,"1",uniteId);
                //插入中台明细数据
                boolean isSuccessD=ztDao.insertDetailData(ztMarketOrgDtEntity);
                System.out.println("插入中台明细数据是否成功: "+isSuccessD);
                //成功
                if(isSuccessD){
                    //zt区域id
                    String detailIdZT=ztDao.getDetailId(id,marketOrgDtEntity.getId());
                    if(!"".equals(detailIdZT)&&!"".equals(mainIdZT)){
                        boolean isSuccess4=marketOrgDao.updateTerritorySolutionIdById(detailIdZT,mainIdZT,marketOrgDtEntity.getId());
                        System.out.println("跟新oa建模明细数据是否成功: "+isSuccess4);
                    }
                //失败
                }else{
                    boolean isSuccess1=ztDao.deleteM(mainIdZT);
                    System.out.println("删除中台主表数据是否成功: "+isSuccess1);
                    boolean isSuccess2=ztDao.delateD(mainIdZT);
                    System.out.println("删除中台明细数据是否成功: "+isSuccess2);
                    boolean isSuccess3=marketOrgDao.updateTerritorySolutionIdByMId("","",id);
                    System.out.println("将oa建模明细数据置空是否成功: "+isSuccess3);
                    throw new Exception("oa建模明细id为:"+marketOrgDtEntity.getId()+"的数据插入失败!");
                }
            }
            boolean isSuccess3=marketOrgDao.updateSolutionIdM(mainIdZT,marketOrgEntity.getId());
            System.out.println("跟新oa建模主表数据是否成功: "+isSuccess3);
            isSuccess=true;
        //主表数据插入失败
        }else{
            throw new Exception("插入营销组织主表数据失败!");
        }
        return isSuccess;
    }
}
