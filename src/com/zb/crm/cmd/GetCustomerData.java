package com.zb.crm.cmd;

import com.api.crm.service.BaseService;
import com.engine.common.biz.AbstractCommonCommand;
import com.engine.common.entity.BizLogContext;
import com.engine.core.interceptor.CommandContext;
import net.sf.json.JSONObject;
import weaver.conn.RecordSet;
import weaver.general.Util;
import weaver.hrm.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 获取客户信息 支持分页 全字段like
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/5/17
 * Time: 16:16
 * Description: No Description
 */
public class GetCustomerData extends AbstractCommonCommand<Map<String, Object>> {
    public GetCustomerData(User user, Map<String, Object> params) {
        this.user = user;
        this.params = params;
    }

    @Override
    public BizLogContext getLogContext() {
        return null;
    }

    private BaseService baseService = new BaseService();

    @Override
    public Map<String, Object> execute(CommandContext commandContext) {
        Map<String, Object> apidatas = new HashMap<String, Object>();
        String json = Util.null2String(params.get("where"));//json

        JSONObject jsonObject = null;
        if (json != null && !"".equals(json)) {
            jsonObject = JSONObject.fromObject(json);
        }

        int amount = Util.getIntValue(Util.null2String(params.get("amount")), 10);
        int pagesNumber = Util.getIntValue(Util.null2String(this.params.get("pagesNumber")), 1);

        RecordSet recordSet = new RecordSet();
        String select2 = " count(1) as sl ";
        String select = " ROWNUM rn , t1.*";
        String joinFrom = this.baseService.crmShareBase.getTempTable("" + user.getUID());
        String from = " CRM_CustomerInfo t1 left join " + joinFrom + " t2 on t1.id = t2.relateditemid  left join (select customerid from CRM_Attention where resourceid=" + user.getUID() + ") t3 on t1.id=t3.customerid left join HrmResource on t1.manager=HrmResource.id ";
        String tj = getWhere(jsonObject);

        String where = " 1 = 1 " + tj + " and t1.deleted = 0 and t1.id = t2.relateditemid  and (seasFlag is null or seasFlag = 3)";
        String slsql = "SELECT " + select2 + " FROM " + from + " WHERE " + where;
        recordSet.execute(slsql);
        recordSet.next();
        int sl = recordSet.getInt("sl");
        apidatas.put("amount", sl);

        String sql = "SELECT * FROM (SELECT " + select + " FROM " + from + " WHERE " + where + " and ROWNUM<=" + pagesNumber + "*" + amount + ") aa WHERE aa.rn> (" + pagesNumber + "-1)*" + amount + "";

        recordSet.execute(sql);
        List<Map<String, Object>> mapList = new ArrayList<>();
        while (recordSet.next()) {
            Map<String, Object> map = new HashMap<>();
            map.put("id", recordSet.getString("id"));
            map.put("name", recordSet.getString("name"));
            map.put("phone", recordSet.getString("phone"));
            map.put("crmcode", recordSet.getString("crmcode"));
            map.put("country", recordSet.getString("country"));
            map.put("province", recordSet.getString("province"));
            map.put("city", recordSet.getString("city"));
            map.put("district", recordSet.getString("district"));
            map.put("address1", recordSet.getString("address1"));
            map.put("qy", recordSet.getString("qy"));
            map.put("status", recordSet.getString("status"));
            map.put("manager", getHrmResourceLastName(recordSet.getString("manager")));
            map.put("xzyh", getSelectNameByID(recordSet.getString("xzyh"), "585"));
            map.put("jb", getSelectNameByID(recordSet.getString("jb"), "586"));
            map.put("xxly", getSelectNameByID(recordSet.getString("xxly"), "582"));
            map.put("wllxfs", recordSet.getString("wllxfs"));
            map.put("TYPE", recordSet.getString("TYPE"));
            map.put("jmpl1", getJmpls(recordSet.getString("jmpl1")));
            map.put("dmzt", getSelectNameByID(recordSet.getString("dmzt"), "588"));
            map.put("dmmj", recordSet.getString("dmmj"));
            map.put("dmlx1", getSelectNameByID(recordSet.getString("dmlx1"), "1585"));
            map.put("scdw1", getSelectNameByID(recordSet.getString("scdw1"), "1586"));
            map.put("czlb", recordSet.getString("czlb"));
            map.put("tzys", recordSet.getString("tzys"));
            map.put("gzd", recordSet.getString("gzd"));
            map.put("gtnr", recordSet.getString("gtnr"));
            map.put("rq", recordSet.getString("rq"));
            map.put("ccgtr", getHrmResourceLastName(recordSet.getString("ccgtr")));
            map.put("ccpj", getSelectNameByID(recordSet.getString("ccpj"), "1584"));
            map.put("lastcontactedtime", recordSet.getString("lastcontactedtime"));
            map.put("lastcontacteddate", recordSet.getString("lastcontacteddate"));
            map.put("lastcontactedby", getHrmResourceLastName(recordSet.getString("lastcontactedby")));
            map.put("lastupdatedtime", recordSet.getString("lastupdatedtime"));
            map.put("lastupdateddate", recordSet.getString("lastupdateddate"));
            map.put("lastupdatedby", getHrmResourceLastName(recordSet.getString("lastupdatedby")));
            map.put("createtime", recordSet.getString("createtime"));
            map.put("createdate", recordSet.getString("createdate"));
            map.put("createrid ", getHrmResourceLastName(recordSet.getString("createrid ")));
            mapList.add(map);
        }
        apidatas.put("datas", mapList);
        recordSet.execute(sql);
        return apidatas;
    }


    private String getWhere(JSONObject jsonObject) {
        if (jsonObject == null) {
            return "";
        }
        String where = "";
        for (Object str : jsonObject.keySet()) {
            if (!"".equals(jsonObject.keySet())) {

                if ("manager".equals(str.toString()) || "createrid".equals(str.toString())) {//经理
                    where += " and t1." + str.toString() + "in (select id from HrmResource where lastname like '%" + jsonObject.getString(str.toString()) + "%' )";
                } else if ("xzyh".equals(str.toString())) {
                    where += " and t1." + str.toString() + " in (select selectvalue from CRM_Selectitem where fieldid= 585 and selectname like '%" + jsonObject.getString(str.toString()) + "%' )";
                } else if ("dmzt".equals(str.toString())) {
                    where += " and t1." + str.toString() + " in (select selectvalue from CRM_Selectitem where fieldid= 588 and selectname like '%" + jsonObject.getString(str.toString()) + "%' )";
                } else if ("dmlx1".equals(str.toString())) {
                    where += " and t1." + str.toString() + " in (select selectvalue from CRM_Selectitem where fieldid= 1585 and selectname like '%" + jsonObject.getString(str.toString()) + "%' )";
                } else if ("id".equals(str.toString())) {
                    where += " and t1.id = '"+ jsonObject.getString(str.toString())+"' ";
                } else if ("jmpl1".equals(str.toString())) {
                    String sql = "select id from uf_jmpl where plmc like '%" + jsonObject.getString(str.toString()) + "%'";
                    RecordSet rs = new RecordSet();
                    rs.execute(sql);
                    if (rs.next()) {
                        where += " and t1." + str.toString() + " like '%" + rs.getString("id") + "%'";
                    }


                } else {
                    where += "and t1." + str.toString() + " like '%" + jsonObject.getString(str.toString()) + "%' ";
                }


            }
        }
        return where;
    }


    private String getJmpls(String id) {
        if ("".equals(id)) {
            return "";
        }
        List<String> jmplNameList = new ArrayList<>();
        RecordSet rs = new RecordSet();
        String sql = "select plmc uf_jmpl where id in (" + id + ")";
        rs.execute(sql);

        while (rs.next()) {
            jmplNameList.add(rs.getString("plmc"));
        }
        return String.join(",", jmplNameList);
    }

    /**
     * 获取crm选择框值
     *
     * @param id      字段值
     * @param fieldid 字段id
     * @return
     */
    private String getSelectNameByID(String id, String fieldid) {
        if ("".equals(id)) {
            return "";
        }
        List<String> selectnameList = new ArrayList<>();
        StringBuffer tablesql = new StringBuffer(
                "select selectname from CRM_Selectitem where fieldid='")
                .append(fieldid).append("' and selectvalue in (").append(id)
                .append(")");
        RecordSet rs = new RecordSet();

        rs.execute(tablesql.toString());

        while (rs.next()) {
            selectnameList.add(rs.getString("selectname"));
        }

        return String.join(",", selectnameList);

    }

    /**
     * 获取人员姓名
     *
     * @param id 人员id 多个逗号相隔
     * @return
     */
    private String getHrmResourceLastName(String id) {
        RecordSet rs = new RecordSet();
        String lastname = "";
        if ("".equals(id)) {
            return lastname;
        }
        List<String> lastnameList = new ArrayList<>();

        String sql = "select lastname from hrmresource where id in (" + id + ")";
        rs.execute(sql);
        while (rs.next()) {
            lastnameList.add(rs.getString("lastname"));
        }
        return String.join(",", lastnameList);
    }
}
