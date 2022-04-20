package weaver.interfaces.zb.oa.zt.action;

import weaver.interfaces.workflow.action.Action;
import weaver.interfaces.zb.oa.zt.service.FranchiseeNewOptimizedAccountOpeningService;
import weaver.interfaces.zb.oa.zt.service.StoreEditorService;
import weaver.soa.workflow.request.RequestInfo;
import weaver.workflow.request.RequestManager;

/**
 * 店面编辑
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/18
 * Time: 1:20
 * Description: No Description
 */
public class StoreEditorAction  implements Action {
    @Override
    public String execute(RequestInfo requestInfo) {
        RequestManager requestManager = requestInfo.getRequestManager();
        String requestid ="";
        try {
            requestid = requestInfo.getRequestid();
            String tableName = requestManager.getBillTableName();
            StoreEditorService storeEditorService = new StoreEditorService();
            storeEditorService.exec(requestid,tableName);
        } catch (Exception e) {
            e.printStackTrace();
            requestManager.setMessageid("店面编辑申请失败:"+requestid);
            requestManager.setMessagecontent("异常：" + e.getMessage());
            return FAILURE_AND_CONTINUE;
        }

        return SUCCESS;
    }
}
