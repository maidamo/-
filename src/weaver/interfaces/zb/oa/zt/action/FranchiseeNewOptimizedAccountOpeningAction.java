package weaver.interfaces.zb.oa.zt.action;

import weaver.interfaces.workflow.action.Action;
import weaver.interfaces.zb.oa.zt.service.FranchiseeChangeApplicationService;
import weaver.interfaces.zb.oa.zt.service.FranchiseeNewOptimizedAccountOpeningService;
import weaver.soa.workflow.request.RequestInfo;
import weaver.workflow.request.RequestManager;

/**
 * 加盟商新建/优化开户申请
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/12
 * Time: 0:04
 * Description: No Description
 */
public class FranchiseeNewOptimizedAccountOpeningAction implements Action {
    @Override
    public String execute(RequestInfo requestInfo) {
        RequestManager requestManager = requestInfo.getRequestManager();
        String requestid ="";
        try {
            requestid = requestInfo.getRequestid();
            String tableName = requestManager.getBillTableName();
            FranchiseeNewOptimizedAccountOpeningService franchiseeNewOptimizedAccountOpeningService = new FranchiseeNewOptimizedAccountOpeningService();

            franchiseeNewOptimizedAccountOpeningService.exec(requestid,tableName,"");

        } catch (Exception e) {
            e.printStackTrace();
            requestManager.setMessageid("加盟商新建/优化开户申请失败:"+requestid);
            requestManager.setMessagecontent("异常：" + e.getMessage());
            return FAILURE_AND_CONTINUE;
        }

        return SUCCESS;
    }
}
