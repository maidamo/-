package weaver.interfaces.zb.oa.zt.service;

import weaver.general.Util;
import weaver.interfaces.zb.oa.zt.bill.MarketAreaOaEntity;
import weaver.interfaces.zb.oa.zt.dao.BaseDao;

public class BaseService {

    BaseDao baseDao=new BaseDao();

    /**
     * 根据中台返回的区域id得到oa营销区域的value值
     * @param territoryId
     * @return
     */
    public String transferMarketAreaToOa(String territoryId){
        String marketAreaOa="2508";
        MarketAreaOaEntity marketAreaOaEntity=baseDao.getMarketAreaOa(territoryId);
        System.out.println("MarketAreaOaEntity: "+marketAreaOaEntity);
        String mainid=marketAreaOaEntity.getMAINID();
        String segment1=marketAreaOaEntity.getSEGMENT1();
        String segment2=marketAreaOaEntity.getSEGMENT2();
        String segment3=marketAreaOaEntity.getSEGMENT3();
        String segment4=marketAreaOaEntity.getSEGMENT4();
        String segment5=marketAreaOaEntity.getSEGMENT5();
        if (!"".equals(Util.null2String(mainid))){
            marketAreaOa=marketAreaOa+"_"+mainid;
            if(!"".equals(Util.null2String(segment1))){
                marketAreaOa=marketAreaOa+";"+segment1;
                if(!"".equals(Util.null2String(segment2))){
                    marketAreaOa=marketAreaOa+";"+segment2;
                    if(!"".equals(Util.null2String(segment3))){
                        marketAreaOa=marketAreaOa+";"+segment3;
                        if(!"".equals(Util.null2String(segment4))){
                            marketAreaOa=marketAreaOa+";"+segment4;
                            if(!"".equals(Util.null2String(segment5))){
                                marketAreaOa=marketAreaOa+";"+segment5;
                            }
                        }
                    }
                }
            }
        }
        return marketAreaOa;
    }
}
