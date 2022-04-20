package com.engine.crm.job;

import com.engine.crm.util.CRMLog;
import weaver.conn.RecordSet;
import weaver.general.TimeUtil;
import weaver.interfaces.schedule.BaseCronJob;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/6
 * Time: 21:22
 * Description: No Description
 */
public class CrmTimeApproachJob extends BaseCronJob {
    @Override
    public void execute() {

        new CRMLog().writeLog("CrmTimeApproachJob start -----------------!");
        RecordSet rs = new RecordSet();
        RecordSet rs2 = new RecordSet();
        String time = getMinusDay(10);
        String sql = "select khfz,id from crm_customerinfo where (seasflag is null or seasflag = 3) and approvedate is null and deleted != 1 and  lastcontacteddate is null and to_date( createdate||' '||createtime, 'yyyy-mm-dd hh24:mi:ss' ) <= to_date( '"+time+"', 'yyyy-mm-dd hh24:mi:ss' )  ";
        rs.execute(sql);
        new CRMLog().writeLog(sql);
        //没进过公海的数据
        while (rs.next()){
            String khfz = rs.getString("khfz");
            String id = rs.getString("id");
            String currentDate = TimeUtil.getCurrentDateString();
            //2、客户进入公海
            sql = "insert into crm_seasCustomer(seasid,customerid,enterdate) values(" + khfz + "," + id + ",'"+currentDate+"')";
            new CRMLog().writeLog(sql);
            rs2.executeUpdate(sql);
            //3、更新客户公海状态
            sql = "update crm_customerinfo set seasflag = 1,oldmanager = manager where id = " + id;
            new CRMLog().writeLog(sql);
            rs2.executeUpdate(sql);
        }
        sql = "select khfz,id from crm_customerinfo where (seasflag is null or seasflag = 3)  and  lastcontacteddate is null and deleted != 1  and to_date( approvedate||' '||approvetime, 'yyyy-mm-dd hh24:mi:ss' ) <= to_date( '"+time+"', 'yyyy-mm-dd hh24:mi:ss' )  ";

        rs.execute(sql);
        //没进过公海的数据
        while (rs.next()){
            String khfz = rs.getString("khfz");
            String id = rs.getString("id");
            String currentDate = TimeUtil.getCurrentDateString();
            //2、客户进入公海
            sql = "insert into crm_seasCustomer(seasid,customerid,enterdate) values(" + khfz + "," + id + ",'"+currentDate+"')";
            rs2.executeUpdate(sql);
            //3、更新客户公海状态
            sql = "update crm_customerinfo set seasflag = 1,oldmanager = manager where id = " + id;
            rs2.executeUpdate(sql);
        }

    }


    public String getMinusDay( int minute) {
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentDate);
        return getMinusDay(dateString,minute);
    }

    public String getMinusDay(String startDay, int day) {

        int remindNo = day;
        String dateTime = startDay;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        String endDate = null;
        try {
            date = sdf.parse(dateTime);
        } catch (ParseException e) {
            new CRMLog().writeLog(e);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(calendar.MINUTE, calendar.get(calendar.MINUTE) - remindNo);
        // 返回减去后的最终时间
        endDate = sdf.format(calendar.getTime());
        return endDate;
    }

}
