package weaver.interfaces.zb.oa.zt.service;

import weaver.formmode.setup.ModeRightInfo;
import weaver.general.Util;
import weaver.interfaces.zb.oa.zt.bill.FranchiseeInformationBill;
import weaver.interfaces.zb.oa.zt.bill.PermissionReconstructionEntity;
import weaver.interfaces.zb.oa.zt.dao.BaseDao;

import java.util.List;

/**
 * 写入加盟商信息
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/22
 * Time: 2:30
 * Description: No Description
 */
public class FranchiseeInformationService {

    BaseDao baseDao=new BaseDao();

    /**
     * 执行
     * @param fNumber F码
     */
    public void exec(String fNumber){
        FranchiseeInformationBill franchiseeInformationBill=baseDao.getFranchiseeInformation(fNumber);
        System.out.println("中台插入oa的建模加盟商数据为: "+franchiseeInformationBill);
        boolean isSuccess=baseDao.getFNumber(fNumber);
        if(isSuccess){
            baseDao.updateFranchisee(franchiseeInformationBill);
        }else {
            boolean isSuccess1=baseDao.insertFranchisee(franchiseeInformationBill);
            if(isSuccess1){
                ModeRightInfo ModeRightInfo=new ModeRightInfo();
                ModeRightInfo.setNewRight(true);
                List<PermissionReconstructionEntity> permissionList=baseDao.getPermissionDataJMS("uf_jmsxx",fNumber);
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
