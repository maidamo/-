package weaver.interfaces.zb.oa.zt.action;

import weaver.interfaces.workflow.action.Action;
import weaver.interfaces.zb.oa.zt.service.FranchiseeReturnService;
import weaver.soa.workflow.request.RequestInfo;
import weaver.workflow.request.RequestManager;

public class FranchiseeReturnAction implements Action {
    @Override
    public String execute(RequestInfo requestInfo) {
        RequestManager requestManager = requestInfo.getRequestManager();
        String requestid = requestInfo.getRequestid();
        String tableName = requestManager.getBillTableName();

        //签字意见
        String remark = requestInfo.getRequestManager().getRemark();

        System.out.println("签字意见: "+remark);

        FranchiseeReturnService franchiseeReturnService=new FranchiseeReturnService();
        try {
            if(!"".equals(remark)){
                franchiseeReturnService.exc(requestid,tableName,remark.replaceAll("\\<.*?>",""));
            }else {
                franchiseeReturnService.exc(requestid,tableName,"");
            }
        } catch (Exception e) {
            e.printStackTrace();
            requestManager.setMessageid("退回失败:"+requestid);
            requestManager.setMessagecontent("异常：" + e.getMessage());
            return FAILURE_AND_CONTINUE;
        }
        return Action.SUCCESS;
    }
}
