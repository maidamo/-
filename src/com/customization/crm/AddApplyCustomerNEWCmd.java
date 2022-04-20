package com.customization.crm;

import com.engine.core.cfg.annotation.CommandDynamicProxy;
import com.engine.core.exception.ECException;
import com.engine.core.interceptor.AbstractCommandProxy;
import com.engine.core.interceptor.Command;
import com.engine.crm.cmd.seas.AddApplyCustomerCmd;
import com.engine.crm.job.CrmCustomerToHighSeasJob;
import weaver.common.DateUtil;
import weaver.conn.ConnStatement;
import weaver.conn.RecordSet;
import weaver.crm.CrmShareBase;
import weaver.general.Util;
import weaver.systeminfo.SystemEnv;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/2
 * Time: 22:22
 * Description: No Description
 */
@CommandDynamicProxy(target = AddApplyCustomerCmd.class, desc="公海客户申领不用审批")
public class AddApplyCustomerNEWCmd extends AbstractCommandProxy<Map<String,Object>> {
    @Override
    public Map<String, Object> execute(Command<Map<String, Object>> command) {
        AddApplyCustomerCmd doSaveCmd = (AddApplyCustomerCmd)command;
        Map<String, Object> params = doSaveCmd.getParams();
        HashMap var2 = new HashMap();
        String var3 = Util.null2String(params.get("seasCustomerIds"));
        int var4 = doSaveCmd.getUser().getUID();
        String var5 = DateUtil.getDate(new Date());
        RecordSet var6 = new RecordSet();
        ConnStatement var7 = new ConnStatement();
        CrmShareBase crmShareBase = new CrmShareBase();
        int var9 = 0;

        try {

            String var10 = "select c1.id,c1.seasid,c1.customerid,t1.seasflag,t1.name,s1.name seasname,oldmanager from CRM_SeasCustomer c1 left join CRM_CustomerInfo t1 on c1.customerid = t1.id left join crm_seasinfo s1 on c1.seasid=s1.id where c1.id in(" + var3 + ")";
            var6.execute(var10);

            while(var6.next()) {
                if (!"2".equals(var6.getString("seasflag")) && !"3".equals(var6.getString("seasFlag"))) {

                    String var12 = var6.getString("customerid");
                    String var13 = var6.getString("oldmanager");
                    String var14 = var6.getString("seasname");
                    String var15 = var6.getString("seasid");
                    crmShareBase.doSomeThings(doSaveCmd.getUser().getUID()+"", var13, var12,doSaveCmd.getUser());
                    (new CrmCustomerToHighSeasJob()).recordLog(var12, var15, 2, var5, doSaveCmd.getUser().getUID(), SystemEnv.getHtmlLabelName(501725, doSaveCmd.getUser().getLanguage()));
                    ++var9;
                    (new CrmCustomerToHighSeasJob()).recordLog(var6.getString("seasid"), var6.getString("customerid"), 1, var5, var4, "");
                }
            }
        } catch (Exception var14) {
            throw new ECException(this.getClass().getName() + "-" + SystemEnv.getHtmlLabelName(384324, doSaveCmd.getUser().getLanguage()), var14);
        } finally {
            var7.close();
        }

        var2.put("datas", var9);
        return var2;
    }
}
