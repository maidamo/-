package weaver.interfaces.zb.oa.zt.action;

import weaver.interfaces.workflow.action.Action;
import weaver.interfaces.zb.oa.zt.service.FranchiseeChangeApplicationService;
import weaver.soa.workflow.request.RequestInfo;
import weaver.workflow.request.RequestManager;

/**
 * 加盟商变更
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/11
 * Time: 17:27
 * Description: No Description
 */
public class FranchiseeChangeApplicationAction implements Action {
    @Override
    public String execute(RequestInfo requestInfo) {
        RequestManager requestManager = requestInfo.getRequestManager();
        String requestid ="";
        try {
            requestid = requestInfo.getRequestid();
            String tableName = requestManager.getBillTableName();
            FranchiseeChangeApplicationService franchiseeChangeApplicationService = new FranchiseeChangeApplicationService();
            franchiseeChangeApplicationService.exec(requestid,tableName);
        } catch (Exception e) {
            e.printStackTrace();
            requestManager.setMessageid("加盟商变更失败:"+requestid);
            requestManager.setMessagecontent("异常：" + e.getMessage());
            return FAILURE_AND_CONTINUE;
        }

        return SUCCESS;
    }
}
