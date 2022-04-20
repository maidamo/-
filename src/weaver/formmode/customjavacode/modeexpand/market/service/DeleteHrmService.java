package weaver.formmode.customjavacode.modeexpand.market.service;

import weaver.formmode.customjavacode.modeexpand.market.dao.MarketOrgDao;
import weaver.formmode.customjavacode.modeexpand.market.dao.ZTDao;

import java.util.List;

public class DeleteHrmService {

    MarketOrgDao marketOrgDao=new MarketOrgDao();

    ZTDao ztDao=new ZTDao();

    public boolean delete(String id){
        boolean isSuccess=true;
        System.out.println("获取到的建模id为: "+id);
        List<String> TERRITORY_EMPLOYEE_ID=marketOrgDao.getTERRITORY_EMPLOYEE_ID(id);
        for(String str:TERRITORY_EMPLOYEE_ID){
            if(str.contains(",")){
                String[] list=str.split(",");
                for(int i=0;i<list.length;i++){
                    boolean isSuccess1=ztDao.delete(list[i]);
                    if(!isSuccess1){
                        isSuccess=false;
                    }
                }
            }else{
                boolean isSuccess2=ztDao.delete(str);
                if(!isSuccess2){
                    isSuccess=false;
                }
            }
        }
        if(isSuccess){
            marketOrgDao.delete(id);
        }
        return isSuccess;
    }
}
