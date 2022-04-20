package com.engine.customization.crm.Impl;


import com.weaverboot.frame.ioc.anno.classAnno.WeaIocReplaceComponent;
import com.weaverboot.frame.ioc.anno.methodAnno.WeaReplaceAfter;
import com.weaverboot.frame.ioc.handler.replace.weaReplaceParam.impl.WeaAfterReplaceParam;
import net.sf.json.JSONObject;

/**
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/5/8
 * Time: 11:39
 * Description: No Description
 */
@WeaIocReplaceComponent("crmImportDatas")
public class GetCrmImportDataService {

    @WeaReplaceAfter(value = "/api/crm/customer/crmImportDatas",order = 1)
    public String after(WeaAfterReplaceParam weaAfterReplaceParam){
        String data = weaAfterReplaceParam.getData();
        JSONObject jsonObject = JSONObject.fromObject(data);
        JSONObject managerJson = jsonObject.getJSONObject("datas").getJSONObject("manager");
        managerJson.put("value","1");
        managerJson.put("showName","系统管理员");
        JSONObject browserConditionParam =  managerJson.getJSONObject("browserConditionParam");
        browserConditionParam.put("replaceDatas","[{name: \"系统管理员\", id: \"1\"}]");
        System.out.println(jsonObject.toString());
        return jsonObject.toString();
    }
}
