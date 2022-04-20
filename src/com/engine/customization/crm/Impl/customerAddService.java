package com.engine.customization.crm.Impl;

import com.weaverboot.frame.ioc.anno.classAnno.WeaIocReplaceComponent;
import com.weaverboot.frame.ioc.anno.methodAnno.WeaReplaceAfter;
import com.weaverboot.frame.ioc.handler.replace.weaReplaceParam.impl.WeaAfterReplaceParam;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import weaver.conn.RecordSet;
import weaver.hrm.HrmUserVarify;
import weaver.hrm.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/5/9
 * Time: 16:51
 * Description: No Description
 */
@WeaIocReplaceComponent("customerAdd")
public class customerAddService {
    @WeaReplaceAfter(value = "/api/crm/customer/customerAdd",order = 1)
    public String after(WeaAfterReplaceParam weaAfterReplaceParam){
        String data = weaAfterReplaceParam.getData();

        HttpServletRequest request = weaAfterReplaceParam.getRequest();
        HttpServletResponse response=  weaAfterReplaceParam.getResponse();
        User user = HrmUserVarify.getUser(request, response);
        JSONObject jsonObject = JSONObject.fromObject(data);
        JSONArray customerInfoJsonArr = jsonObject.getJSONObject("datas").getJSONArray("customerInfo");
        for (int i = 0 ; i <customerInfoJsonArr.size() ; i++){
            JSONArray itemsJsonArr = customerInfoJsonArr.getJSONObject(i).getJSONArray("items");//
            for (int j = 0 ; j < itemsJsonArr.size();j++){
                JSONObject item = itemsJsonArr.getJSONObject(j);
                String domkey = item.getString("domkey");
                System.out.println(domkey);
                if ("[\"manager\"]".equals(domkey)){
                    int userid = user.getUID();
                    System.out.println("Userid"+userid);
                    String sql = "select departmentid from hrmresource where id = "+userid;
                    RecordSet rs = new RecordSet();
                    rs.execute(sql);
                    rs.next();
                    int department = rs.getInt("departmentid");
                    System.out.println("department"+department);
                    if (department == 31523){
                        item.put("value","1");
                        item.put("showName","系统管理员");
                        JSONObject browserConditionParam = item.getJSONObject("browserConditionParam");
                        browserConditionParam.put("replaceDatas", "[{name: \"系统管理员\", id: \"1\"}]");
                    }


                }
            }
        }
//        System.out.println(jsonObject.toString());
        return jsonObject.toString();
    }
}
