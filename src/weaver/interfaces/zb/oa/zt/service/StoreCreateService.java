package weaver.interfaces.zb.oa.zt.service;

import org.apache.commons.lang.StringUtils;
import weaver.interfaces.zb.oa.zt.bill.StoreEditorBill;
import weaver.interfaces.zb.oa.zt.dao.StoreEditorDao;
import weaver.interfaces.zb.zt.dto.ZTStoreModifyBill;
import weaver.interfaces.zb.zt.service.ZTService;

import java.util.List;

public class StoreCreateService {
    StoreEditorDao storeEditorDao = new StoreEditorDao();
    public void exec(String requestid, String tableName) throws Exception {
        StoreEditorBill storeEditorBill = storeEditorDao.getStoreEditorBill(requestid,tableName);
        ZTStoreModifyBill ztStoreModifyBill = getztStoreModifyBill(storeEditorBill);
        ZTService ztService = new ZTService();
        List<String> lineId = ztService.StoreModify(ztStoreModifyBill);
        System.out.println("店面编辑发送后返回:"+ StringUtils.join(lineId, ","));
        StoreInformationService storeInformationService=new StoreInformationService();
        storeInformationService.exec(lineId);
    }

    private ZTStoreModifyBill getztStoreModifyBill(  StoreEditorBill storeEditorBill){
        ZTStoreModifyBill ztStoreModifyBill = new ZTStoreModifyBill();
        ztStoreModifyBill.setCustAccountId(storeEditorBill.getAccountnumber());
//        ztStoreModifyBill.setShopId(storeEditorBill.getShopid());
        ztStoreModifyBill.setSourceSystem(storeEditorBill.getSourcesystem());
        ztStoreModifyBill.setSourceid(storeEditorBill.getSourceid());
        ztStoreModifyBill.setUnitId(storeEditorBill.getUnitid());
        ztStoreModifyBill.setShopFullName(storeEditorBill.getShopfullname());
        ztStoreModifyBill.setShopShortName(storeEditorBill.getShopshortname());
        ztStoreModifyBill.setBusinessChannel(storeEditorBill.getBusinesschannel());
        ztStoreModifyBill.setOperateType(storeEditorBill.getYylx());
        ztStoreModifyBill.setOperationStatus(storeEditorBill.getYyzt());
        ztStoreModifyBill.setShopType(storeEditorBill.getDmlx());
        ztStoreModifyBill.setShopAddress(storeEditorBill.getShopaddress());
        ztStoreModifyBill.setShopOwner(storeEditorBill.getShopowner());
        ztStoreModifyBill.setShopOwnerPhone(storeEditorBill.getShopownerphone());
        ztStoreModifyBill.setShopPhone(storeEditorBill.getShopphone());
        ztStoreModifyBill.setShopUseArea(storeEditorBill.getShopusearea());
        ztStoreModifyBill.setOpenDate(storeEditorBill.getOpendate());
        ztStoreModifyBill.setTerminateDate(storeEditorBill.getTerminatedate());
        ztStoreModifyBill.setRemarks(storeEditorBill.getRemarks());
        ztStoreModifyBill.setEntityNo(storeEditorBill.getEntityno());
        ztStoreModifyBill.setStatisticsAdjust(storeEditorBill.getStatisticsadjust());
        ztStoreModifyBill.setAdjustStartDate(storeEditorBill.getAdjuststartdate());
        ztStoreModifyBill.setAdjustEndDate(storeEditorBill.getAdjustenddate());
        ztStoreModifyBill.setStoreName(storeEditorBill.getStorename());


        return ztStoreModifyBill;
    }
}
