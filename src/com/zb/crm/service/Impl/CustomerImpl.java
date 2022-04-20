package com.zb.crm.service.Impl;

import com.engine.core.impl.Service;
import com.zb.crm.cmd.GetCustomerData;
import com.zb.crm.cmd.StorePublishCmd;
import com.zb.crm.service.CustomerService;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/5/17
 * Time: 17:30
 * Description: No Description
 */
public class CustomerImpl  extends Service implements CustomerService {
    @Override
    public Map<String, Object> GetCustomerData(Map<String, Object> params) {
        return commandExecutor.execute(new GetCustomerData(user,params));
    }

    @Override
    public Map<String, Object> StorePublishCmd(Map<String, Object> params) {
        return commandExecutor.execute(new StorePublishCmd(user,params));
    }

}
