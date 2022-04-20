package weaver.interfaces.zb.oa.zt.action;

import weaver.interfaces.workflow.action.Action;
import weaver.interfaces.zb.oa.zt.service.StoreCopyChangeService;
import weaver.soa.workflow.request.RequestInfo;
import weaver.workflow.request.RequestManager;

public class StoreCopyChangeAction implements Action {
    @Override
    public String execute(RequestInfo requestInfo) {
        RequestManager requestManager = requestInfo.getRequestManager();
        String requestid ="";
        try {
            requestid = requestInfo.getRequestid();
            String tableName = requestManager.getBillTableName();
            StoreCopyChangeService storeCopyChangeService=new StoreCopyChangeService();
            storeCopyChangeService.exec(requestid,tableName);
        } catch (Exception e) {
            e.printStackTrace();
            requestManager.setMessageid("店面复制变更申请失败:"+requestid);
            requestManager.setMessagecontent("异常：" + e.getMessage());
            return FAILURE_AND_CONTINUE;
        }
        return Action.SUCCESS;
    }
}
