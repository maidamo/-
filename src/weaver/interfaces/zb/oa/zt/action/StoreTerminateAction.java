package weaver.interfaces.zb.oa.zt.action;

import weaver.interfaces.workflow.action.Action;
import weaver.interfaces.zb.oa.zt.service.FranchiseeNewOptimizedAccountOpeningService;
import weaver.interfaces.zb.oa.zt.service.StoreTerminateService;
import weaver.soa.workflow.request.RequestInfo;
import weaver.workflow.request.RequestManager;

/**
 * 商终止
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/18
 * Time: 1:20
 * Description: No Description
 */
public class StoreTerminateAction implements Action {
    @Override
    public String execute(RequestInfo requestInfo) {
        RequestManager requestManager = requestInfo.getRequestManager();
        String requestid ="";
        try {
            requestid = requestInfo.getRequestid();
            String tableName = requestManager.getBillTableName();
            StoreTerminateService storeTerminateService = new StoreTerminateService();
            storeTerminateService.exec(requestid,tableName);
        } catch (Exception e) {
            e.printStackTrace();
            requestManager.setMessageid("商终止申请失败:"+requestid);
            requestManager.setMessagecontent("异常：" + e.getMessage());
            return FAILURE_AND_CONTINUE;
        }

        return SUCCESS;
    }
}
