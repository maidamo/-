package com.engine.crm.job;

import com.cloudstore.dev.api.bean.MessageBean;
import com.cloudstore.dev.api.bean.MessageType;
import com.cloudstore.dev.api.util.Util_Message;
import com.engine.crm.util.CRMLog;
import weaver.conn.RecordSet;
import weaver.interfaces.schedule.BaseCronJob;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/7
 * Time: 16:15
 * Description: No Description
 */
public class CrmHighSeasRemindJob  extends BaseCronJob {
    @Override
    public void execute() {
        new CRMLog().writeLog("CrmHighSeasRemindJob start -----------------!");
        RecordSet rs = new RecordSet();
        String sql = "SELECT count(1) AS sl,seasid FROM (SELECT customerid,seasid FROM CRM_SEASCUSTOMER MINUS SELECT customerid,seasid FROM CRM_SEASCUSTOMER_TX) GROUP BY seasid";
        rs.execute(sql);
        Map<Integer,Integer> map = new HashMap<>();
        while (rs.next()){
            int sl = rs.getInt("sl");
            int seasid = rs.getInt("seasid");
            map.put(seasid,sl);
        }
        sql = "delete from CRM_SEASCUSTOMER_TX";
        rs.executeUpdate(sql);
        sql = "INSERT into CRM_SEASCUSTOMER_TX select * from CRM_SEASCUSTOMER";
        rs.executeUpdate(sql);

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            System.out.println("seasid:" + m.getKey() + " sl:" + m.getValue());
            String cxsql = "select name from crm_seasinfo where id = "+m.getKey();
            String name = "";
            rs.execute(cxsql);
            if (rs.next()){
                name = rs.getString("name");
            }


            String sql1 = "select contentid from crm_seasright  where seasid = "+m.getKey()+" and  sharetype = 1";
            rs.execute(sql1);
            Set<String> userIdList = new HashSet<>();
            while (rs.next()){
                String contentid = rs.getString("contentid");
                userIdList.add(contentid);

            }
            sendMessage(name+"公海数据新增"+m.getValue()+"条数据,请前往招商查看.",userIdList);
        }

    }


    private void sendMessage(String context,Set<String> userIdList){
        MessageType messageType = MessageType.newInstance(209); // 消息来源（见文档第四点补充 必填）
         // 接收人id 必填
        String title = "公海新增提醒"; // 标题

        String linkUrl = "/wui/index.html#/main/crm/highseas/seasList"; // PC端链接
        String linkMobileUrl = "/spa/crm/static4mobile/index.html#/enter"; // 移动端链接
        try {
            MessageBean messageBean = Util_Message.createMessage(messageType, userIdList, title, context, linkUrl, linkMobileUrl);
            messageBean.setCreater(1);// 创建人id
            Util_Message.store(messageBean);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
