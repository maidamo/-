package com.zb.crm.cmd;

import com.engine.common.biz.AbstractCommonCommand;
import com.engine.common.entity.BizLogContext;
import com.engine.core.interceptor.CommandContext;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import weaver.conn.RecordSet;
import weaver.general.Util;
import weaver.hrm.User;
import weaver.interfaces.zb.zt.dto.STStorePublishBill;
import weaver.interfaces.zb.zt.service.ZTService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/18
 * Time: 0:35
 * Description: No Description
 */
public class StorePublishCmd extends AbstractCommonCommand<Map<String, Object>> {
    public StorePublishCmd(User user, Map<String, Object> params) {
        this.user = user;
        this.params = params;
    }
    @Override
    public BizLogContext getLogContext() {
        return null;
    }

    @Override
    public Map<String, Object> execute(CommandContext commandContext) {
        RecordSet rs = new RecordSet();
        Map<String, Object> apidatas = new HashMap<String, Object>();
        String ids = Util.null2String(params.get("ids"));//json
        if ("".equals(ids)){
            apidatas.put("msg","请选择发布数据");
            return apidatas;
        }
        List<STStorePublishBill> stStorePublishBills = new ArrayList<>();
        String sql = "select sid from uf_jmsxx where id in ("+ids+") ";
        rs.execute(sql);
        while(rs.next()){
            STStorePublishBill storePublishBill = new STStorePublishBill();
            storePublishBill.setCustAccountId(rs.getInt("sid"));
            stStorePublishBills.add(storePublishBill);
        }
        JSONObject jsonObject;
        try {
            ZTService ztService = new ZTService();
            jsonObject = ztService.storePublish(stStorePublishBills);
        } catch (Exception e) {
            apidatas.put("msg","请求中台系统失败");
            return apidatas;
        }
        boolean success = jsonObject.getBoolean("success");
        if (success){
            apidatas.put("msg","发布成功!");
            //发布成功后反写
            rs.executeUpdate("update uf_jmsxx set sffab = 0 where id in ("+ids+")");
        }else{
            apidatas.put("msg",jsonObject.getString("message"));
        }



        return apidatas;
    }
}
