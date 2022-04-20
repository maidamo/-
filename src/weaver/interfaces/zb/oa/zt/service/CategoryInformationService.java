package weaver.interfaces.zb.oa.zt.service;


import weaver.formmode.setup.ModeRightInfo;
import weaver.general.Util;
import weaver.interfaces.zb.oa.zt.bill.CategoryInformationBill;
import weaver.interfaces.zb.oa.zt.bill.PermissionReconstructionEntity;
import weaver.interfaces.zb.oa.zt.dao.BaseDao;

import java.util.List;

public class CategoryInformationService {

    BaseDao baseDao=new BaseDao();

    BaseService baseService=new BaseService();

    public void exec(String siteId){
        CategoryInformationBill categoryInformationBill=baseDao.getCategoryInformationMes(siteId);
        String marketAreaOa=baseService.transferMarketAreaToOa(categoryInformationBill.getYxqy());
        System.out.println("营销区域oa的value值为: "+marketAreaOa);
        boolean isSuccess=baseDao.getCategoryId(siteId);
        if(isSuccess){
            baseDao.updateCategory(categoryInformationBill,marketAreaOa);
        }else{
            boolean isSuccess1=baseDao.insertCategory(categoryInformationBill,marketAreaOa);
            if(isSuccess1){
                ModeRightInfo ModeRightInfo=new ModeRightInfo();
                ModeRightInfo.setNewRight(true);
                List<PermissionReconstructionEntity> permissionList=baseDao.getPermissionDataPL("uf_jmplxx",siteId);
                for(PermissionReconstructionEntity permissionReconstructionEntity:permissionList){
                    String createrId=permissionReconstructionEntity.getCreaterid();
                    String formmodeId=permissionReconstructionEntity.getFormmodeid();
                    String billId=permissionReconstructionEntity.getBillid();
                    ModeRightInfo.editModeDataShare(Util.getIntValue(createrId),Util.getIntValue(formmodeId),Util.getIntValue(billId));
                }
            }
        }

    }
}
