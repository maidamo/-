package com.zb.crm.web;

import com.alibaba.fastjson.JSONObject;
import com.engine.common.util.ParamUtil;
import com.engine.common.util.ServiceUtil;
import com.zb.crm.service.CustomerService;
import com.zb.crm.service.Impl.CustomerImpl;
import weaver.hrm.HrmUserVarify;
import weaver.hrm.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/5/17
 * Time: 17:30
 * Description: No Description
 */
public class CustomerAction {
    private CustomerService getService(User user) {
        return ServiceUtil.getService(CustomerImpl.class, user);
    }
    @GET
    @Path("/getCustomerData")
    @Produces({MediaType.TEXT_PLAIN})
    public String GetCustomerData(@Context HttpServletRequest request, @Context HttpServletResponse response){
        Map<String, Object> apidatas = new HashMap<String, Object>();
        try {
            //获取当前用户
            User user = HrmUserVarify.getUser(request, response);
            apidatas.putAll(getService(user).GetCustomerData(ParamUtil.request2Map(request)));
            apidatas.put("api_status", true);
        } catch (Exception e) {
            e.printStackTrace();
            apidatas.put("api_status", false);
            apidatas.put("api_errormsg", "catch exception : " + e.getMessage());
        }
        return JSONObject.toJSONString(apidatas);
    }


    @GET
    @Path("/StorePublishCmd")
    @Produces({MediaType.TEXT_PLAIN})
    public String StorePublishCmd(@Context HttpServletRequest request, @Context HttpServletResponse response){
        Map<String, Object> apidatas = new HashMap<String, Object>();
        try {
            //获取当前用户
            User user = HrmUserVarify.getUser(request, response);
            apidatas.putAll(getService(user).StorePublishCmd(ParamUtil.request2Map(request)));
            apidatas.put("api_status", true);
        } catch (Exception e) {
            e.printStackTrace();
            apidatas.put("api_status", false);
            apidatas.put("api_errormsg", "catch exception : " + e.getMessage());
        }
        return JSONObject.toJSONString(apidatas);
    }
}
