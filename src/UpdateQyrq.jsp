<%@ page import="weaver.conn.RecordSet" %>

<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="weaver.hrm.User" %>
<%@ page import="java.text.SimpleDateFormat" %>

<%@ page import="weaver.hrm.HrmUserVarify" %>
<%@ page import="com.alibaba.fastjson.JSONObject" %>
<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<%
    String rq = request.getParameter("rq").trim();
    String id = request.getParameter("id").trim();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
    Map<String,Object> map = new HashMap<>();
    RecordSet rs = new RecordSet();
    User user = HrmUserVarify.getUser(request, response);
    String sql = "update CRM_CustomerInfo set  qysj = '"+rq+"' , lastcontactedby = "+user.getUID()+" , lastupdateddate = '"+dateFormat.format(new Date())+"' , lastupdatedtime = '"+timeFormat.format(new Date())+"' where id = "+id;
    boolean success = rs.executeUpdate(sql);
    map.put("success",success);
%>

<%=JSONObject.toJSONString(map)%>
