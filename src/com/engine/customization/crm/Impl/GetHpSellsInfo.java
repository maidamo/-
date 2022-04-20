package com.engine.customization.crm.Impl;

import com.weaverboot.frame.ioc.anno.classAnno.WeaIocReplaceComponent;
import com.weaverboot.frame.ioc.anno.methodAnno.WeaReplaceAfter;
import com.weaverboot.frame.ioc.handler.replace.weaReplaceParam.impl.WeaAfterReplaceParam;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import weaver.conn.RecordSet;
import weaver.general.Util;
import weaver.hrm.HrmUserVarify;
import weaver.hrm.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/5/12
 * Time: 15:27
 * Description: No Description
 */
@WeaIocReplaceComponent("getHpSellsInfo")
public class GetHpSellsInfo {
    @WeaReplaceAfter(value = "/api/crm/mobile/getHpSellsInfo",order = 1)
    public String after(WeaAfterReplaceParam weaAfterReplaceParam){
        JSONObject bymbJson = new JSONObject();
        RecordSet rs = new RecordSet();
        HttpServletRequest request = weaAfterReplaceParam.getRequest();
        HttpServletResponse response=  weaAfterReplaceParam.getResponse();
        User user = HrmUserVarify.getUser(request, response);
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
        String currdate = dateFormat.format(date);
        String curruser = user.getUID()+"";

        String sql = "select sum(mbz) as mbz  from uf_zsmb where nd = SUBSTR('"+currdate+"', 0, 4) and yf = SUBSTR('"+currdate+"', 6,2) -1 and fzr = "+curruser+" and pl = 0";
        rs.execute(sql);
        rs.next();
        int bymbc = Util.getIntValue(rs.getString("mbz"),0);
        sql = "select sum(mbz) as mbz from uf_zsmb where nd = SUBSTR('"+currdate+"', 0, 4) and yf = SUBSTR('"+currdate+"', 6,2) -1 and fzr = "+curruser+" and pl = 1";
        rs.execute(sql);
        rs.next();
        int bymby = Util.getIntValue(rs.getString("mbz"),0);

        bymbJson.put("counts","厨:"+bymbc+" 衣:"+bymby+"");
        bymbJson.put("icon","icon-crm-icon-03144");
        bymbJson.put("link","#");
        bymbJson.put("text","本月目标");
        bymbJson.put("type","bymb");
        sql = "select count(1) as mbz from crm_customerinfo where  status = 2 and substr(createdate,0,7) = substr('"+currdate+"',0,7)  and manager = "+curruser+"";
        rs.execute(sql);
        rs.next();
        int xzkhsa = Util.getIntValue(rs.getString("mbz"),0);
        sql = "select count(1) as mbz from crm_customerinfo where  status = 3 and substr(createdate,0,7) = substr('"+currdate+"',0,7)  and manager = "+curruser+"";
        rs.execute(sql);
        rs.next();
        int xzkhsb = Util.getIntValue(rs.getString("mbz"),0);
        sql = "select count(1) as mbz from crm_customerinfo where  status = 4 and substr(createdate,0,7) = substr('"+currdate+"',0,7)  and manager = "+curruser+"";
        rs.execute(sql);
        rs.next();
        int xzkhsc = Util.getIntValue(rs.getString("mbz"),0);

        JSONObject xzkhsJson = new JSONObject();
        xzkhsJson.put("counts","A: "+xzkhsa+" B: "+xzkhsb+" C: "+xzkhsc+" ");
        xzkhsJson.put("icon","icon-crm-icon-03147");
        xzkhsJson.put("link","#");
        xzkhsJson.put("text","新增意向客户");
        xzkhsJson.put("type","xzkhs");
        sql = "SELECT count(*) AS mbz FROM (SELECT id,name,manager,xzyh,createdate,khrq,yxjjnsj,REGEXP_SUBSTR(a.jmpl,'[^,]+',1,l) AS pl FROM (SELECT*FROM crm_customerinfo) a,(SELECT LEVEL l FROM DUAL CONNECT BY LEVEL<=100) b WHERE l<=LENGTH(a.jmpl)-LENGTH(REPLACE (jmpl,','))+1) WHERE pl=104 AND substr(yxjjnsj,0,7)=substr('"+currdate+"',0,7) AND manager= "+curruser+"";
        rs.execute(sql);
        rs.next();
        int qysc = Util.getIntValue(rs.getString("mbz"),0);
        sql = "SELECT count(*) AS mbz FROM (SELECT id,name,manager,xzyh,createdate,khrq,yxjjnsj,REGEXP_SUBSTR(a.jmpl,'[^,]+',1,l) AS pl FROM (SELECT*FROM crm_customerinfo) a,(SELECT LEVEL l FROM DUAL CONNECT BY LEVEL<=100) b WHERE l<=LENGTH(a.jmpl)-LENGTH(REPLACE (jmpl,','))+1) WHERE pl=112 AND substr(yxjjnsj,0,7)=substr('"+currdate+"',0,7) AND manager= "+curruser+"";
        rs.execute(sql);
        rs.next();
        int qysy = Util.getIntValue(rs.getString("mbz"),0);
        JSONObject qysJson = new JSONObject();
        qysJson.put("counts","厨:"+qysc+" 衣:"+qysy+"");
        qysJson.put("icon","icon-crm-icon-03148");
        qysJson.put("link","#");
        qysJson.put("text","已交意向金");
        qysJson.put("type","qys");


        sql = "SELECT count(*) AS mbz FROM (SELECT id,name,manager,xzyh,createdate,khrq,yxjjnsj,REGEXP_SUBSTR(a.jmpl,'[^,]+',1,l) AS pl FROM (SELECT*FROM crm_customerinfo) a,(SELECT LEVEL l FROM DUAL CONNECT BY LEVEL<=100) b WHERE l<=LENGTH(a.jmpl)-LENGTH(REPLACE (jmpl,','))+1) WHERE pl=112 AND substr(khrq,0,7)=substr('"+currdate+"',0,7) AND manager= "+curruser+"";

        rs.execute(sql);
        rs.next();
        int kshy = Util.getIntValue(rs.getString("mbz"),0);
        sql = "SELECT count(*) AS mbz FROM (SELECT id,name,manager,xzyh,createdate,khrq,yxjjnsj,REGEXP_SUBSTR(a.jmpl,'[^,]+',1,l) AS pl FROM (SELECT*FROM crm_customerinfo) a,(SELECT LEVEL l FROM DUAL CONNECT BY LEVEL<=100) b WHERE l<=LENGTH(a.jmpl)-LENGTH(REPLACE (jmpl,','))+1) WHERE pl=104 AND substr(khrq,0,7)=substr('"+currdate+"',0,7) AND manager= "+curruser+"";

        rs.execute(sql);
        rs.next();
        int kshc = Util.getIntValue(rs.getString("mbz"),0);
        JSONObject khsJson = new JSONObject();
        khsJson.put("counts","厨:"+kshc+" 衣:"+kshy+"");
        khsJson.put("icon","icon-crm-icon-03142");
        khsJson.put("link","#");
        khsJson.put("text","已开户数");
        khsJson.put("type","ksh");
        sql = "select count(1) as mbz from crm_customerinfo where  status = 1 and substr(createdate,0,7) = substr('"+currdate+"',0,7)  and manager = "+curruser+"";
        rs.execute(sql);
        rs.next();
        int byxdk = Util.getIntValue(rs.getString("mbz"),0);
       JSONObject byxdkJson = new JSONObject();
        byxdkJson.put("counts",""+byxdk+"");
        byxdkJson.put("icon","icon-crm-icon-03144");
        byxdkJson.put("link","#");
        byxdkJson.put("text","失效客户数");
        byxdkJson.put("type","byxdk");

        JSONArray data = new JSONArray();
        data.add(bymbJson);
        data.add(xzkhsJson);
        data.add(qysJson);
        data.add(khsJson);
        data.add(byxdkJson);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data",data);
        return jsonObject.toString();
    }
}
