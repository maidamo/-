package weaver.interfaces.zb.zt.dto;

/**
 * 商发布
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/9
 * Time: 0:16
 * Description: No Description
 */
public class STStorePublishBill {
    /**商id*/
    private int custAccountId;
    /**商编码*/
    private String accountNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * 获取 商id
     *
     * @return custAccountId 商id
     */
    public int getCustAccountId() {
        return this.custAccountId;
    }

    /**
     * 设置 商id
     *
     * @param custAccountId 商id
     */
    public void setCustAccountId(int custAccountId) {
        this.custAccountId = custAccountId;
    }

    @Override
    public String toString() {
        return "STStorePublishBill{" +
                "custAccountId=" + custAccountId +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
