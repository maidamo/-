package weaver.interfaces.zb.zt.util;

import net.sf.json.JSONObject;

/**
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/8
 * Time: 15:43
 * Description: No Description
 */
public class ZTUtil {

    public static void main(String[] args) {
        String currdate = "2020-06-16";
        String curruser = "1";
        String sql = "select sum(mbz) as mbz  from uf_zsmb where nd = SUBSTR('{currdate}', 0, 4) and yf = SUBSTR('{currdate}', 6,2) -1 and fzr = {curruser} and pl = 0";

        System.out.println(sql);
    }
}
