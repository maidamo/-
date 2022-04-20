package com.api.zb.hrm;

import com.alibaba.fastjson.JSON;
import weaver.conn.RecordSet;
import weaver.general.Util;

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
 * Date: 2021/5/18
 * Time: 14:04
 * Description: No Description
 */
@Path("/zb/hrm")
public class GetPersonID {
    @GET
    @Path("/GetUserId")
    @Produces(MediaType.TEXT_PLAIN)
    public String GetUserIdNewCmd(@Context HttpServletRequest request, @Context HttpServletResponse response) {

        Map<String, Object> apidatas = new HashMap<>();//初始化返回值
        RecordSet rs = new RecordSet();
        String name = Util.null2String(request.getParameter("name").trim());
        String value = Util.null2String(request.getParameter("value").trim());
        String sql = "select id from hrmresource where  "+name+" = '"+value+"'";
        rs.execute(sql);
        if (rs.next()){
            apidatas.put("hrmId",rs.getInt("id"));
        }else{
            apidatas.put("hrmId",0);
        }
        return JSON.toJSONString(apidatas);
    }
}
