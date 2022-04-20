package weaver.interfaces.zb.oa.zt.action;

import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.RequestInfo;
import weaver.workflow.request.RequestManager;

public class TestAction implements Action {
    @Override
    public String execute(RequestInfo requestInfo) {
        RequestManager requestManager = requestInfo.getRequestManager();
        String requestid = requestInfo.getRequestid();
        System.out.println("请求id为: "+requestid);
        String tableName=requestManager.getBillTableName();
        System.out.println("表名为: "+tableName);
        //当前操作类型
        String src = requestInfo.getRequestManager().getSrc();
        System.out.println("当前操作类型: "+src);
        //签字意见
        String remark = requestInfo.getRequestManager().getRemark();
        System.out.println("签字意见: "+remark);
        return Action.SUCCESS;
    }
}
