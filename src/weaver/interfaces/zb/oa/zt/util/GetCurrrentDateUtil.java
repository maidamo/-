package weaver.interfaces.zb.oa.zt.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetCurrrentDateUtil {
    public static String getDate(){
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }
    public static String getTime(){
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
        return sdf.format(date);
    }
}
