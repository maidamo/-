package weaver.interfaces.zb.zt.dto;

/**
 * 商终止
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/9
 * Time: 0:15
 * Description: No Description
 */
public class ZTStoreStopBill {
    /**商id*/private String custAccountId;
    /**品牌id*/private String accountSiteId;
    /**状态*/private String operationStatus;
    /**备注*/private String remarks;

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getCustAccountId() {
        return custAccountId;
    }

    public void setCustAccountId(String custAccountId) {
        this.custAccountId = custAccountId;
    }

    public String getAccountSiteId() {
        return accountSiteId;
    }

    public void setAccountSiteId(String accountSiteId) {
        this.accountSiteId = accountSiteId;
    }

    public String getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
    }

    @Override
    public String toString() {
        return "ZTStoreStopBill{" +
                "custAccountId='" + custAccountId + '\'' +
                ", accountSiteId='" + accountSiteId + '\'' +
                ", operationStatus='" + operationStatus + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
