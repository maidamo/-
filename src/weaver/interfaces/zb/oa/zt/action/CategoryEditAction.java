package weaver.interfaces.zb.oa.zt.action;

import weaver.interfaces.workflow.action.Action;
import weaver.interfaces.zb.oa.zt.service.CategoryEditService;
import weaver.soa.workflow.request.RequestInfo;
import weaver.workflow.request.RequestManager;

/**
 * 品类编辑
 */
public class CategoryEditAction implements Action {
    @Override
    public String execute(RequestInfo requestInfo) {
        RequestManager requestManager = requestInfo.getRequestManager();
        String requestid ="";
        try {
            requestid = requestInfo.getRequestid();
            String tableName = requestManager.getBillTableName();
            CategoryEditService categoryEditService=new CategoryEditService();
            categoryEditService.exec(requestid,tableName);
        } catch (Exception e) {
            e.printStackTrace();
            requestManager.setMessageid("品类编辑失败:"+requestid);
            requestManager.setMessagecontent("异常：" + e.getMessage());
            return FAILURE_AND_CONTINUE;
        }
        return Action.SUCCESS;
    }
}
