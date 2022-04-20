package weaver.formmode.customjavacode.modeexpand.market.service;

import weaver.formmode.customjavacode.modeexpand.market.dao.MarketOrgDao;
import weaver.formmode.customjavacode.modeexpand.market.dao.ZTDao;
import weaver.formmode.customjavacode.modeexpand.market.entity.MarketOrgHrmEntity;

public class EditHrmService {
    MarketOrgDao marketOrgDao = new MarketOrgDao();

    ZTDao ztDao = new ZTDao();

    public void edit(String id) throws Exception {
        MarketOrgHrmEntity marketOrgHrmEntity = marketOrgDao.getMarketOrgHrmMes(id);
        String territoryEmployeeId = marketOrgHrmEntity.getTERRITORY_EMPLOYEE_ID();
        if (!"".equals(territoryEmployeeId)) {
            if(territoryEmployeeId.contains(",")){
                String[] ids=territoryEmployeeId.split(",");
                for(int i=0;i<ids.length;i++){
                    ztDao.deleteHrmData(ids[i]);
                }
            }else{
                ztDao.deleteHrmData(territoryEmployeeId);
            }
            InsertHrmService insertHrmService=new InsertHrmService();
            insertHrmService.insert(id);
        }else{
            throw new Exception("建模回写的中台用户id为空，不允许编辑!");
        }

//        MarketOrgHrmEntity marketOrgHrmEntity = marketOrgDao.getMarketOrgHrmMes(id);
//        //编辑的功能特权
//        String functionP = marketOrgHrmEntity.getFUNCTION_PRIVILEGE();
//        //回写的中台id
//        String territoryEmployeeId = marketOrgHrmEntity.getTERRITORY_EMPLOYEE_ID();
//        if (!"".equals(territoryEmployeeId)) {
//            //得到建店人员id和功能权限map
//            Map<String, String> map = ztDao.getZTIdAndFunctionP(territoryEmployeeId);
//            System.out.println("编辑前map数据条数为: "+map.size());
//            String needUpdateStr="";
//            if (!"".equals(functionP)) {
//                //多个功能权限
//                if (functionP.contains(",")) {
//                    String[] functions = functionP.split(",");
//                    for (int i = 0; i < functions.length; i++) {
//                        //建模表单功能权限
//                        String function = functions[i];
//                        //校验功能权限
//                        String ztId = IsContainUtil.isContain(map, function);
//                        //存在
//                        if (!"".equals(ztId)) {
//                            String versionNum=ztDao.getVersionNumHrm(ztId,function);
//                            versionNum=(Integer.parseInt(versionNum)+1)+"";
//                            System.out.println("多功能权限版本号为: "+versionNum);
//                            ZTMarketOrgHrmEntity ztMarketOrgHrmEntity = baseService.getHrmData(marketOrgHrmEntity, function,versionNum);
//                            //移除跟新的中台营销区域人员
//                            map.remove(ztId);
//                            //跟新
//                            boolean isSuccess1 = ztDao.updateHrmData(ztMarketOrgHrmEntity, ztId);
//                            System.out.println("跟新营销区域人员是否成功: " + isSuccess1);
//                            if(isSuccess1){
//                                needUpdateStr=needUpdateStr+ztId+",";
//                            }
//                        } else {
//                            ZTMarketOrgHrmEntity ztMarketOrgHrmEntity = baseService.getHrmData(marketOrgHrmEntity, function,"1");
//                            //不存在
//                            //插入
//                            boolean isSuccess2=ztDao.insertHrmData(ztMarketOrgHrmEntity);
//                            System.out.println("插入营销区域人员是否成功: "+isSuccess2);
//                            if(isSuccess2){
//                                String territoryEmpId=ztDao.getHrmId(marketOrgHrmEntity.getId(),function);
//                                if(!"".equals(territoryEmpId)){
//                                    needUpdateStr=needUpdateStr+ztId+",";
//                                }
//                            }
//                        }
//                    }
//                } else {
//                    //一个功能权限
//
//                    //校验功能权限
//                    String ztId = IsContainUtil.isContain(map, functionP);
//                    //存在
//                    if (!"".equals(ztId)) {
//                        String versionNum=ztDao.getVersionNumHrm(ztId,functionP);
//                        versionNum=(Integer.parseInt(versionNum)+1)+"";
//                        System.out.println("单功能权限版本号为: "+versionNum);
//                        ZTMarketOrgHrmEntity ztMarketOrgHrmEntity = baseService.getHrmData(marketOrgHrmEntity, functionP,versionNum);
//                        //移除跟新的中台营销区域人员
//                        map.remove(ztId);
//                        //跟新
//                        boolean isSuccess1 = ztDao.updateHrmData(ztMarketOrgHrmEntity, ztId);
//                        System.out.println("跟新营销区域人员是否成功: " + isSuccess1);
//                        if(isSuccess1){
//                            needUpdateStr=needUpdateStr+ztId+",";
//                        }
//                    } else {
//                        ZTMarketOrgHrmEntity ztMarketOrgHrmEntity = baseService.getHrmData(marketOrgHrmEntity, functionP,"1");
//                        //不存在
//                        //插入
//                        boolean isSuccess2=ztDao.insertHrmData(ztMarketOrgHrmEntity);
//                        System.out.println("插入营销区域人员是否成功: "+isSuccess2);
//                        if(isSuccess2){
//                            String territoryEmpId=ztDao.getHrmId(marketOrgHrmEntity.getId(),functionP);
//                            if(!"".equals(territoryEmpId)){
//                                needUpdateStr=needUpdateStr+ztId+",";
//                            }
//                        }
//                    }
//                }
//                //编辑后
//                System.out.println("编辑后map数据条数为: "+map.size());
//                if(map.size()>0){
//                    for(String key:map.keySet()){
//                        System.out.println("需要删除的营销区域人员id为: "+key);
//                        boolean isSuccess5=ztDao.deleteHrmData(key);
//                        System.out.println("删除营销区域人员数据是否成功: "+isSuccess5);
//                    }
//                }
//                //跟新编辑后的营销区域人员id到建模
//                System.out.println("编辑后需要跟新的人员id为: "+needUpdateStr);
//                if(!"".equals(needUpdateStr)){
//                    boolean isSuccess6=marketOrgDao.updateHrmData(needUpdateStr.substring(0,needUpdateStr.lastIndexOf(",")),id);
//                    System.out.println("编辑后需要跟新的人员id跟新是否成功: "+isSuccess6);
//                }
//            }
//        } else {
//            throw new Exception("建模回写的中台用户id为空，不允许编辑!");
//        }
    }
}
