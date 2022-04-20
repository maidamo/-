package weaver.interfaces.zb.oa.base;

import weaver.conn.RecordSet;

/**
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/17
 * Time: 2:06
 * Description: No Description
 */
public class BaseDao {
    /**
     * 获取流程创建人姓名
     * @param requestid
     * @return
     */
    public String getCreater(String requestid){
        String sql = "select b.lastname from WORKFLOW_requestbase a left join HRMRESOURCE b on a.creater = b.id where a.requestid = "+requestid;
        RecordSet rs = new RecordSet();
        rs.execute(sql);
        String lastName = "";
        if (rs.next()){
            lastName = rs.getString("lastname");
        }
        return lastName;
    }

}
