package weaver.interfaces.zb.oa.dto;

/**
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/5/21
 * Time: 16:54
 * Description: No Description
 */
public class MessageBill {
    // 执行状态S: 成功 E：失败
    private String flag = "";
    // 返回消息：1返回requestid 0 返回错误信息记录
    private String message = "";

    /**
     * 获取 执行状态S: 成功 E：失败
     *
     * @return flag 执行状态S: 成功 E：失败
     */
    public String getFlag() {
        return this.flag;
    }

    /**
     * 设置 执行状态S: 成功 E：失败
     *
     * @param flag 执行状态S: 成功 E：失败
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }

    /**
     * 获取 返回消息：1返回requestid 0 返回错误信息记录
     *
     * @return message 返回消息：1返回requestid 0 返回错误信息记录
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * 设置 返回消息：1返回requestid 0 返回错误信息记录
     *
     * @param message 返回消息：1返回requestid 0 返回错误信息记录
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
