package weaver.interfaces.zb.oa.zt.action;

import weaver.interfaces.workflow.action.Action;

import weaver.interfaces.zb.oa.zt.service.FranchiseeAreaEditServcie;
import weaver.soa.workflow.request.RequestInfo;
import weaver.workflow.request.RequestManager;

/**
 * 加盟商区域编辑
 */
public class FranchiseeAreaEditAction implements Action {
    @Override
    public String execute(RequestInfo requestInfo) {
        RequestManager requestManager = requestInfo.getRequestManager();
        String requestid ="";
        try {
            requestid = requestInfo.getRequestid();
            System.out.println("加盟商区域编辑请求id为: "+requestid);
            String tableName = requestManager.getBillTableName();
            System.out.println("加盟商区域编辑主表名为: "+tableName);
            FranchiseeAreaEditServcie franchiseeAreaEditServcie=new FranchiseeAreaEditServcie();
            franchiseeAreaEditServcie.exec(requestid,tableName);
        } catch (Exception e) {
            e.printStackTrace();
            requestManager.setMessageid("加盟商区域编辑失败:"+requestid);
            requestManager.setMessagecontent("异常：" + e.getMessage());
            return FAILURE_AND_CONTINUE;
        }
        return Action.SUCCESS;
    }
}
