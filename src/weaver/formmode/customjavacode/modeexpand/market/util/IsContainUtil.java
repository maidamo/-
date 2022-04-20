package weaver.formmode.customjavacode.modeexpand.market.util;

import java.util.Map;

public class IsContainUtil {
    public static String isContain(Map<String,String> map,String functionP){
        String id="";
        for(Map.Entry<String,String> entry:map.entrySet()){
            String key=entry.getKey();
            String value=entry.getValue();
            if(value.equals(functionP)){
                id=key;
                break;
            }
        }
        return id;
    }
}
