package weaver.interfaces.zb.oa.zt.service;


import org.apache.commons.lang.StringUtils;
import weaver.interfaces.zb.oa.zt.bill.StoreAcceptanceBill;
import weaver.interfaces.zb.oa.zt.dao.BaseDao;
import weaver.interfaces.zb.oa.zt.dao.StoreAcceptanceDao;
import weaver.interfaces.zb.zt.dto.ZTOrdersAcceptanceBill;
import weaver.interfaces.zb.zt.service.ZTService;

import java.util.List;

/**
 * 店面验收
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/17
 * Time: 2:53
 * Description: No Description
 */
public class StoreAcceptanceService {
    StoreAcceptanceDao storeAcceptanceDao = new StoreAcceptanceDao();
    BaseDao baseDao=new BaseDao();
    public void exec(String requestid,String tableName) throws Exception {
        StoreAcceptanceBill storeAcceptanceBill =  storeAcceptanceDao.getStoreAcceptanceBill(requestid,tableName);
        System.out.println("StoreAcceptanceBill:"+storeAcceptanceBill);
        ZTOrdersAcceptanceBill ztOrdersAcceptanceBill = getZtOrdersAcceptanceBill(storeAcceptanceBill);
        System.out.println("ZTOrdersAcceptanceBill:"+ztOrdersAcceptanceBill);
        ZTService ztService = new ZTService();
        List<String> lineId  = ztService.OrdersAcceptance(ztOrdersAcceptanceBill);
        System.out.println("店面验收发送后返回:"+ StringUtils.join(lineId, ","));
        for(String str:lineId){
            boolean isSuccess1=baseDao.updateFormFieldValue("shopId",str,requestid,tableName);
            System.out.println("店面id回写流程表单是否成功: "+isSuccess1);
        }
        StoreInformationService storeInformationService=new StoreInformationService();
        storeInformationService.exec(lineId);
    }

    private ZTOrdersAcceptanceBill getZtOrdersAcceptanceBill(StoreAcceptanceBill storeAcceptanceBill){
        BaseDao baseDao=new BaseDao();
        ZTOrdersAcceptanceBill ztOrdersAcceptanceBill = new ZTOrdersAcceptanceBill();
        ztOrdersAcceptanceBill.setAccountNumber(storeAcceptanceBill.getAccountNumber());
        ztOrdersAcceptanceBill.setSourceSystem(storeAcceptanceBill.getSourceSystem());
        ztOrdersAcceptanceBill.setSourceid(storeAcceptanceBill.getSourceid());
        ztOrdersAcceptanceBill.setShopFullName(storeAcceptanceBill.getShopFullName());
        ztOrdersAcceptanceBill.setShopShortName(storeAcceptanceBill.getShopShortName());
        ztOrdersAcceptanceBill.setUnitId(baseDao.getId(storeAcceptanceBill.getUnitCode()));
        ztOrdersAcceptanceBill.setBusinessChannel(storeAcceptanceBill.getBusinessChannel());
        ztOrdersAcceptanceBill.setOperateType(storeAcceptanceBill.getOperateType());
        ztOrdersAcceptanceBill.setOperationStatus(storeAcceptanceBill.getOperationStatus());
        ztOrdersAcceptanceBill.setShopType(storeAcceptanceBill.getShopType());
        ztOrdersAcceptanceBill.setShopAddress(storeAcceptanceBill.getShopAddress());
        ztOrdersAcceptanceBill.setShopOwner(storeAcceptanceBill.getShopOwner());
        ztOrdersAcceptanceBill.setShopOwnerPhone(storeAcceptanceBill.getShopOwnerPhone());
        ztOrdersAcceptanceBill.setShopPhone(storeAcceptanceBill.getShopPhone());
        ztOrdersAcceptanceBill.setShopUseArea(storeAcceptanceBill.getShopUseArea());
        ztOrdersAcceptanceBill.setOpenDate(storeAcceptanceBill.getOpenDate());
        ztOrdersAcceptanceBill.setTerminateDate(storeAcceptanceBill.getTerminateDate());
        ztOrdersAcceptanceBill.setRemarks(storeAcceptanceBill.getRemarks());
        ztOrdersAcceptanceBill.setEntityNo(storeAcceptanceBill.getEntityNo());
        ztOrdersAcceptanceBill.setShopId(storeAcceptanceBill.getShopId());
        ztOrdersAcceptanceBill.setStoreType(storeAcceptanceBill.getStoreType());
        ztOrdersAcceptanceBill.setNodeDescription(storeAcceptanceBill.getNodeDescription());
        ztOrdersAcceptanceBill.setStatisticsAdjust(storeAcceptanceBill.getStatisticsAdjust());
        ztOrdersAcceptanceBill.setAdjustStartDate(storeAcceptanceBill.getAdjustStartDate());
        ztOrdersAcceptanceBill.setAdjustEndDate(storeAcceptanceBill.getAdjustEndDate());
        return  ztOrdersAcceptanceBill;
    }

}
