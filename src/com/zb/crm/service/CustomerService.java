package com.zb.crm.service;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/5/17
 * Time: 17:29
 * Description: No Description
 */
public interface CustomerService {
    Map<String, Object> GetCustomerData(Map<String, Object> params);
    Map<String, Object> StorePublishCmd(Map<String, Object> params);
}
