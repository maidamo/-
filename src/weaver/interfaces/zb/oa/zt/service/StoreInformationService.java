package weaver.interfaces.zb.oa.zt.service;

import weaver.formmode.setup.ModeRightInfo;
import weaver.general.Util;
import weaver.interfaces.zb.oa.zt.bill.PermissionReconstructionEntity;
import weaver.interfaces.zb.oa.zt.bill.StoreInformationBill;
import weaver.interfaces.zb.oa.zt.dao.BaseDao;

import java.util.List;

public class StoreInformationService {

    BaseDao baseDao =new BaseDao();

    public void exec(List<String> list){
        for(String str:list){
            StoreInformationBill storeInformationBill=baseDao.getStoreInformation(str);
            boolean isSuccess=baseDao.getFacade(str);
            if(isSuccess){
                baseDao.updateStore(storeInformationBill);
            }else{
                boolean isSuccess1=baseDao.insertStore(storeInformationBill);
                if(isSuccess1){
                    ModeRightInfo ModeRightInfo=new ModeRightInfo();
                    ModeRightInfo.setNewRight(true);
                    List<PermissionReconstructionEntity> permissionList=baseDao.getPermissionDataMD("uf_jmdmxx",str);
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
}
