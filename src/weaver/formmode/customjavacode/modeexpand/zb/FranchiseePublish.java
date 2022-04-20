package weaver.formmode.customjavacode.modeexpand.zb;

import net.sf.json.JSONObject;
import weaver.conn.RecordSet;
import weaver.formmode.customjavacode.AbstractModeExpandJavaCodeNew;
import weaver.general.Util;
import weaver.hrm.User;
import weaver.interfaces.zb.oa.zt.service.FranchiseeInformationService;
import weaver.interfaces.zb.zt.dto.STStorePublishBill;
import weaver.interfaces.zb.zt.service.ZTService;
import weaver.soa.workflow.request.RequestInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FranchiseePublish extends AbstractModeExpandJavaCodeNew {
    @Override
    public Map<String, String> doModeExpand(Map<String, Object> param) {
        Map<String, String> result = new HashMap<String, String>();
        String message = "";
        try {
            User user = (User)param.get("user");
            int billid = -1;//数据id
            int modeid = -1;//模块id
            RequestInfo requestInfo = (RequestInfo)param.get("RequestInfo");
            if(requestInfo!=null){
                billid = Util.getIntValue(requestInfo.getRequestid());
                modeid = Util.getIntValue(requestInfo.getWorkflowid());
                if(billid>0&&modeid>0){
                    //------请在下面编写业务逻辑代码------
                    System.out.println("billid"+billid+": "+billid);
                    System.out.println("modeid"+modeid+": "+modeid);
                    List<STStorePublishBill> stStorePublishBills = new ArrayList<>();
                    STStorePublishBill stStorePublishBill=new STStorePublishBill();
                    String sid="";
                    RecordSet rs=new RecordSet();
                    String sql="select sid from uf_jmsxx where id='"+billid+"'";
                    rs.execute(sql);
                    if(rs.next()){
                        sid=Util.null2String(rs.getString("sid"));
                        stStorePublishBill.setCustAccountId(Integer.valueOf(sid));
                        System.out.println("STStorePublishBill:"+stStorePublishBill);
                        stStorePublishBills.add(stStorePublishBill);
                    }
                    ZTService ztService=new ZTService();
                    if(stStorePublishBills.size() >0 ){
                        JSONObject jsonObject =ztService.storePublish(stStorePublishBills);
                        if (jsonObject != null){
                            message = jsonObject.getString("message");
                            if(jsonObject.getBoolean("success")){
                                FranchiseeInformationService franchiseeInformationService=new FranchiseeInformationService();
                                franchiseeInformationService.exec(message);
                                rs.executeUpdate("update uf_jmsxx set sffab = 0 where id in ("+billid+")");
                            }else{
                                throw new Exception("商发布失败!");
                            }
                        }else{
                            throw new Exception("商发布失败!");
                        }
                    }
                }
            }
        } catch (Exception e) {
            result.put("errmsg",message);
            result.put("flag", "false");
        }
        return result;
    }
}
