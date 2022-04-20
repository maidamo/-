
<%@ page import="com.alibaba.fastjson.JSONObject" %>
<%@ page import="java.util.*" %>
<%@ page import="weaver.formmode.customjavacode.modeexpand.market.service.DeleteHrmService" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<%
    String ids = request.getParameter("ids").trim();
    System.out.println("建模ids: "+ids);
    Map<String,Object> map=new HashMap<>();
    DeleteHrmService deleteHrmService=new DeleteHrmService();
    boolean isSuccess=deleteHrmService.delete(ids);
    map.put("success",isSuccess);
    if(isSuccess){
        map.put("msg","删除成功!");
    }else{
        map.put("msg","删除失败!");
    }

%>

<%=JSONObject.toJSONString(map)%>
