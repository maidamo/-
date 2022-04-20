package weaver.interfaces.zb.oa.zt.action;

import weaver.interfaces.workflow.action.Action;
import weaver.interfaces.zb.oa.zt.service.FranchiseeEditorService;
import weaver.soa.workflow.request.RequestInfo;
import weaver.workflow.request.RequestManager;

/**
 * 加盟商编辑
 */
public class FranchiseeEditAction implements Action {
    @Override
    public String execute(RequestInfo requestInfo) {
        RequestManager requestManager = requestInfo.getRequestManager();
        String requestid ="";
        try {
            requestid = requestInfo.getRequestid();
            System.out.println("商编辑请求id为: "+requestid);
            String tableName = requestManager.getBillTableName();
            System.out.println("商编辑主表名为: "+tableName);
            FranchiseeEditorService franchiseeEditorService=new FranchiseeEditorService();
            franchiseeEditorService.exec(requestid,tableName);
        } catch (Exception e) {
            e.printStackTrace();
            requestManager.setMessageid("加盟商编辑失败:"+requestid);
            requestManager.setMessagecontent("异常：" + e.getMessage());
            return FAILURE_AND_CONTINUE;
        }
        return Action.SUCCESS;
    }
}
