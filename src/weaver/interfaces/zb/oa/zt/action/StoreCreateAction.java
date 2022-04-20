package weaver.interfaces.zb.oa.zt.action;

import weaver.interfaces.workflow.action.Action;
import weaver.interfaces.zb.oa.zt.service.StoreCreateService;
import weaver.soa.workflow.request.RequestInfo;
import weaver.workflow.request.RequestManager;

public class StoreCreateAction implements Action {
    @Override
    public String execute(RequestInfo requestInfo) {
        RequestManager requestManager = requestInfo.getRequestManager();
        String requestid ="";
        try {
            requestid = requestInfo.getRequestid();
            String tableName = requestManager.getBillTableName();
            StoreCreateService storeCreateService=new StoreCreateService();
            storeCreateService.exec(requestid,tableName);
        } catch (Exception e) {
            e.printStackTrace();
            requestManager.setMessageid("店面新建申请失败:"+requestid);
            requestManager.setMessagecontent("异常：" + e.getMessage());
            return FAILURE_AND_CONTINUE;
        }
        return SUCCESS;
    }
}
