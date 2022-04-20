package weaver.formmode.customjavacode.modeexpand.market.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDateUtil {

    public static String getDate(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date="";
        date=sdf.format(new Date());
        return date;
    }
}
