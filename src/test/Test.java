package test;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public void test() throws Exception {
        if(true){
            throw new Exception("1111");
        }
//        str.replaceAll("\\<.*?>","")
        System.out.println("11111111111");
}
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("1","2");
        map.put("4","5");
        System.out.println(map.size());
    }
}
