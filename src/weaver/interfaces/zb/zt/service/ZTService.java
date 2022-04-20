package weaver.interfaces.zb.zt.service;

import com.cloudstore.dev.api.util.HttpManager;
import com.qiyuesuo.sdk.v2.utils.StringUtils;
import ecode.security.rsa.IOUtils;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import weaver.interfaces.zb.zt.dto.*;
import weaver.interfaces.zb.zt.franchiseereturnwebservice.*;


import javax.xml.rpc.ServiceException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.rmi.RemoteException;
import java.security.KeyManagementException;
import java.security.MessageDigest;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 中台数据推送类
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/8
 * Time: 15:13
 * Description: No Description
 */
public class ZTService {
//    private String url = "http://10.10.22.106:8010/core/api/public/";
//    private String url = "http://10.10.22.34:8080/core/api/public/";
    //private String url = "http://10.10.0.114:8008/core/api/public/";
    private String url = "http://10.10.19.30:8008/core/api/public/";//2022-04-19修改 中台测试地址
//    private String url = "http://balance.zhibang.com:8000/core/api/public/";
    private String timeStamp = "";
    private String apiKey = "4D71448A44EC0C28E05361000A0A3F3";
    private String sign = "";
    private String urlto = "";
    public ZTService() throws Exception {
        this.timeStamp = System.currentTimeMillis()+"";
        this.sign = md5(timeStamp+apiKey);
        this.urlto ="?timeStamp="+timeStamp+"&sign="+sign;
    }

    private String md5(String str) throws Exception {
        String result = "";
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update((str).getBytes("UTF-8"));
        byte b[] = md5.digest();

        int i;
        StringBuffer buf = new StringBuffer("");

        for(int offset=0; offset<b.length; offset++){
            i = b[offset];
            if(i<0){
                i+=256;
            }
            if(i<16){
                buf.append("0");
            }
            buf.append(Integer.toHexString(i));
        }

        result = buf.toString();

        return result;
    }
    /**
     * 推送开户数据
     * @param ztOpenAccounBill
     * @return F码
     * @throws Exception 执行异常
     */
    public JSONObject openAccount(ZTOpenAccounBill ztOpenAccounBill) throws Exception {
        JSONObject jsonObject = new JSONObject();
        JSONObject postData = JSONObject.fromObject(ztOpenAccounBill);
        HttpManager http=new HttpManager();
        //请求头信息封装集合
        Map<String, String> heads=new HashMap<String, String>();

            System.out.println(url+"addOACust"+urlto);
//        System.out.println("http://10.10.22.34:8080/api/public/"+"addOACust"+urlto);

            System.out.println(postData.toString());

            jsonObject = JSONObject.fromObject(http.postJsonDataSSL(url+"addOACust"+urlto,postData.toString(),heads));
//        jsonObject = JSONObject.fromObject(http.postJsonDataSSL("http://10.10.22.34:8080/api/public/"+"addOACust"+urlto,postData.toString(),heads));
        return jsonObject;
//        String message = "";
//        System.out.println(jsonObject.toString());
//        if (jsonObject != null){
//            if(jsonObject.getBoolean("success")){
//                //获取到F码
//                message=jsonObject.getString("message");
//                return message;
//            }else{
//                message=jsonObject.getString("message");
//                throw new Exception(message);
//            }
//        }else{
//            throw new Exception("推送开户信息失败!");
//        }
    }

    /**
     * 商变更/优化
     * @param ztModifyOptimizeBill
     * @return
     * @throws Exception
     */
    public String modifyOptimize(ZTModifyOptimizeBill ztModifyOptimizeBill) throws Exception {
        JSONObject jsonObject = new JSONObject();
        JSONObject postData = JSONObject.fromObject(ztModifyOptimizeBill);
        HttpManager http=new HttpManager();
        //请求头信息封装集合
        Map<String, String> heads=new HashMap<String, String>();

//            System.out.println("http://10.10.22.34:8080/api/public/"+"submitOAOperation"+urlto);
        System.out.println(url+"submitOAOperation"+urlto);
            System.out.println(postData.toString());
            jsonObject = JSONObject.fromObject(http.postJsonDataSSL(url+"submitOAOperation"+urlto,postData.toString(),heads));
//        jsonObject = JSONObject.fromObject(http.postJsonDataSSL("http://10.10.22.34:8080/api/public/"+"submitOAOperation"+urlto,postData.toString(),heads));
        System.out.println(jsonObject.toString());
        String message = "";
        if (jsonObject != null){
            message = jsonObject.getString("message");
            if(jsonObject.getBoolean("success")){
                //获取到F码

                return message;
            }else{
                throw new Exception(message);
            }
        }else{
            throw new Exception("商变更/优化失败!");
        }
    }

    /**
     * 商终止
     * @param ztStoreModifyBill
     * @return
     * @throws Exception
     */
    public boolean storeStopBill(ZTStoreStopBill ztStoreModifyBill) throws Exception {
        boolean isSuccess=false;
        JSONObject jsonObject = new JSONObject();
        JSONObject postData = JSONObject.fromObject(ztStoreModifyBill);
        HttpManager http=new HttpManager();
        //请求头信息封装集合
        Map<String, String> heads=new HashMap<String, String>();

//            System.out.println("http://10.10.22.34:8080/api/public/stopOACust"+urlto);
        System.out.println(url+"stopOACust"+urlto);
            System.out.println(postData.toString());
            jsonObject = JSONObject.fromObject(http.postJsonDataSSL(url+"stopOACust"+urlto,postData.toString(),heads));
//            jsonObject = JSONObject.fromObject(http.postJsonDataSSL("http://10.10.22.34:8080/api/public/stopOACust"+urlto,postData.toString(),heads));

        String message = "";
        System.out.println(jsonObject.toString());
        if (jsonObject != null){
            if(jsonObject.getBoolean("success")){
                isSuccess=jsonObject.getBoolean("success");
//                //获取到F码
//                message = jsonObject.getString("message");
                return isSuccess;
            }else{
                message = jsonObject.getString("message");
                throw new Exception(message);
            }
        }else{
            throw new Exception("商终止失败!");
        }
    }

    /**
     * 商发布
     * @param stStorePublishBills
     * @return
     * @throws Exception
     */
    public JSONObject storePublish (List<STStorePublishBill> stStorePublishBills) throws Exception {
        JSONObject jsonObject = new JSONObject();
        JSONArray postData = JSONArray.fromObject(stStorePublishBills);
        System.out.println(postData);
        HttpManager http=new HttpManager();
        //请求头信息封装集合
        Map<String, String> heads=new HashMap<String, String>();

//            System.out.println("http://10.10.22.34:8080/api/public/"+"releaseOAAll"+urlto);
        System.out.println(url+"releaseOAAll"+urlto);
            System.out.println(postData.toString());
            jsonObject = JSONObject.fromObject(http.postJsonDataSSL(url+"releaseOAAll"+urlto,postData.toString(),heads));
//        jsonObject = JSONObject.fromObject(http.postJsonDataSSL("http://10.10.22.34:8080/api/public/"+"releaseOAAll"+urlto,postData.toString(),heads));

       return jsonObject;
    }

    /**
     * 商编辑
     * @param ztFranchiseeEditorBill
     * @return
     */
    public boolean franchiseeAditor(ZTFranchiseeEditorBill ztFranchiseeEditorBill) throws Exception{
        boolean isSuccess=false;
        JSONObject postData = JSONObject.fromObject(ztFranchiseeEditorBill);
        System.out.println(postData);
        HttpManager http=new HttpManager();
        //请求头信息封装集合
        Map<String, String> heads=new HashMap<String, String>();
//        System.out.println("http://10.10.22.34:8080/api/public/editOACust"+urlto);
        System.out.println(url+"editOACust"+urlto);
        System.out.println("商编辑json为: "+postData.toString());
//        JSONObject jsonObject = JSONObject.fromObject(http.postJsonDataSSL("http://10.10.22.34:8080/api/public/editOACust"+urlto,postData.toString(),heads));
        JSONObject jsonObject = JSONObject.fromObject(http.postJsonDataSSL(url+"editOACust"+urlto,postData.toString(),heads));
        System.out.println("商编辑接口返回结果为: "+jsonObject.toString());
        isSuccess=jsonObject.getBoolean("success");
        System.out.println("商编辑是否成功: "+isSuccess);
        if(!isSuccess){
            String message=jsonObject.getString("message");
            throw new Exception(message);
        }
        return isSuccess;
    }

    /**
     * 店面下单/验收推送
     * @param ztOrdersAcceptanceBill
     * @return
     * @throws Exception
     */
    public  List <String> OrdersAcceptance(ZTOrdersAcceptanceBill ztOrdersAcceptanceBill) throws Exception {
        JSONObject jsonObject = new JSONObject();
        JSONObject postData = JSONObject.fromObject(ztOrdersAcceptanceBill);
        HttpManager http=new HttpManager();
        //请求头信息封装集合
        Map<String, String> heads=new HashMap<String, String>();

//            System.out.println("http://10.10.22.34:8080/api/public/"+"addOAShops"+urlto);
        System.out.println(url+"addOAShops"+urlto);
            System.out.println(postData.toString());
            jsonObject = JSONObject.fromObject(http.postJsonDataSSL(url+"addOAShops"+urlto,postData.toString(),heads));
//        jsonObject = JSONObject.fromObject(http.postJsonDataSSL("http://10.10.22.34:8080/api/public/"+"addOAShops"+urlto,postData.toString(),heads));

       List <String> lineId = new ArrayList<>();
        System.out.println(jsonObject.toString());
        if (jsonObject != null){
            String message = jsonObject.getString("message");
            if(jsonObject.getBoolean("success")){
                //获取到F码
                JSONArray rows =  jsonObject.getJSONArray("rows");
                for (int i = 0 ; i<rows.size() ; i++ ){
                    lineId.add(rows.getJSONObject(i).getString("lineId"));
                }

            }else{
                throw new Exception(message);
            }
        }else{
            throw new Exception("店面下单/验收失败!");
        }
        return lineId;
    }

    /**
     * 店面信息修改推送
     * @param ztStoreModifyBill
     * @return
     */
    public List<String> StoreModify(ZTStoreModifyBill ztStoreModifyBill) throws Exception {
        JSONObject jsonObject = new JSONObject();
        JSONObject postData = JSONObject.fromObject(ztStoreModifyBill);
        HttpManager http=new HttpManager();
        //请求头信息封装集合
        Map<String, String> heads=new HashMap<String, String>();

//            System.out.println("http://10.10.22.34:8080/api/public/"+"editShop"+urlto);
        System.out.println(url+"editShop"+urlto);
            System.out.println(postData.toString());
            jsonObject = JSONObject.fromObject(http.postJsonDataSSL(url+"editShop"+urlto,postData.toString(),heads));
//        jsonObject = JSONObject.fromObject(http.postJsonDataSSL("http://10.10.22.34:8080/api/public/"+"editShop"+urlto,postData.toString(),heads));
        List <String> lineId = new ArrayList<>();
        System.out.println(jsonObject.toString());
        if (jsonObject != null){
            String message = jsonObject.getString("message");
            if(jsonObject.getBoolean("success")){
                //获取到F码
                JSONArray rows =  jsonObject.getJSONArray("rows");
                for (int i = 0 ; i<rows.size() ; i++ ){
                    lineId.add(rows.getJSONObject(i).getString("lineId"));
                }
            }else{
                throw new Exception(message);
            }
        }else{
            throw new Exception("店面编辑失败!");
        }
        return lineId;
    }

    /**
     *品类编辑
     * @return
     */
    public boolean categoryEdit(ZTCategoryEditBill ztCategoryEditBill) throws Exception{
        boolean isSuccess=false;
        JSONObject postData = JSONObject.fromObject(ztCategoryEditBill);
        System.out.println(postData);
        HttpManager http=new HttpManager();
        //请求头信息封装集合
        Map<String, String> heads=new HashMap<String, String>();
//        System.out.println("http://10.10.22.34:8080/api/public/editOACustSites"+urlto);
        System.out.println(url+"editOACustSites"+urlto);
        System.out.println("品类编辑json为: "+postData.toString());
//        JSONObject jsonObject = JSONObject.fromObject(http.postJsonDataSSL("http://10.10.22.34:8080/api/public/editOACustSites"+urlto,postData.toString(),heads));
        JSONObject jsonObject = JSONObject.fromObject(http.postJsonDataSSL(url+"editOACustSites"+urlto,postData.toString(),heads));
        System.out.println("品类编辑接口返回结果为: "+jsonObject.toString());
        isSuccess=jsonObject.getBoolean("success");
        System.out.println("品类编辑是否成功: "+isSuccess);
        if(!isSuccess){
            String message=jsonObject.getString("message");
            throw new Exception(message);
        }
        return isSuccess;
    }

    /**
     * 回传建店平台结果(开户)
     * @param accountNumber  F码
     * @param relevanceCode  一体商码
     * @param remark 备注
     * @param sourceId   建店唯一标识码
     * @param status 状态
     * @return
     */
    public boolean returnJD(String accountNumber,String relevanceCode,String remark,String sourceId,String status) throws Exception {
        boolean isSuccess=false;
        Order order=new OrderLocator();
            IOrderService iOrderService=order.getOrderServiceImplPort();
            AccountResponse accountResponse=new AccountResponse(accountNumber,relevanceCode,remark,sourceId,status);
            AccountResponse[] accountResponsesS=new AccountResponse[1];
            accountResponsesS[0]=accountResponse;
            InterfaceResult interfaceResult=iOrderService.accountZdSynchroMd(new AccountZdSynchroMdEntrance(accountResponsesS));
            System.out.println("调用结果为: "+interfaceResult.getMessage());
            MessageBo[] messageBosS=interfaceResult.getRows();
            System.out.println("返回的信息为: "+messageBosS[0].getHandleMessage());
            if("Success".equals(interfaceResult.getMessage())){
                isSuccess=true;
            }else{
                throw new Exception("回传建店失败!");
            }

        return isSuccess;
    }

    /**
     * 回传建店平台结果(门店)
     * @param sourceId
     * @param shopFullName
     * @param shopId
     * @param status
     * @param remark
     * @return
     */
    public boolean returnJDStore(String sourceId,String shopFullName,String shopId,String status,String remark) throws Exception {
        boolean isSuccess=false;
        weaver.interfaces.zb.zt.storereturnwebservice.Order order=new weaver.interfaces.zb.zt.storereturnwebservice.OrderLocator();
        weaver.interfaces.zb.zt.storereturnwebservice.IOrderService iOrderService=order.getOrderServiceImplPort();
        weaver.interfaces.zb.zt.storereturnwebservice.StoreStopAcceptanceResponse storeStopAcceptanceResponse= new weaver.interfaces.zb.zt.storereturnwebservice.StoreStopAcceptanceResponse(remark,shopFullName,shopId,sourceId,status);
        weaver.interfaces.zb.zt.storereturnwebservice.StoreStopAcceptanceResponse[] storeStopAcceptanceResponses= new weaver.interfaces.zb.zt.storereturnwebservice.StoreStopAcceptanceResponse[1];
        storeStopAcceptanceResponses[0]=storeStopAcceptanceResponse;
        weaver.interfaces.zb.zt.storereturnwebservice.InterfaceResult interfaceResult=iOrderService.storeStopAcceptanceZdSynchroMd(new weaver.interfaces.zb.zt.storereturnwebservice.StoreStopAcceptanceZdSynchroMdEntrance(storeStopAcceptanceResponses));
        System.out.println("调用结果为: "+interfaceResult.getMessage());
        weaver.interfaces.zb.zt.storereturnwebservice.MessageBo[] messageBosS=interfaceResult.getRows();
        System.out.println("返回的信息为: "+messageBosS[0].getHandleMessage());
        if("Success".equals(interfaceResult.getMessage())){
            isSuccess=true;
        }else{
            throw new Exception("回传建店失败!");
        }
        return isSuccess;
    }

    /**
     * 店面复制
     * @return
     */
    public boolean storeCopy(ZTStoreCopyBill ztStoreCopyBill) throws Exception {
        boolean isSuccess=false;
        JSONObject postData = JSONObject.fromObject(ztStoreCopyBill);
        System.out.println(postData);
        HttpManager http=new HttpManager();
        //请求头信息封装集合
        Map<String, String> heads=new HashMap<String, String>();
        System.out.println(url+"copyShop"+urlto);
        System.out.println("店面复制json为: "+postData.toString());
//        JSONObject jsonObject = JSONObject.fromObject(http.postJsonDataSSL("http://10.10.22.34:8080/api/public/editOACustSites"+urlto,postData.toString(),heads));
        JSONObject jsonObject = JSONObject.fromObject(http.postJsonDataSSL(url+"copyShop"+urlto,postData.toString(),heads));
        System.out.println("店面复制接口返回结果为: "+jsonObject.toString());
        isSuccess=jsonObject.getBoolean("success");
        System.out.println("店面复制是否成功: "+isSuccess);
        if(!isSuccess){
            JSONArray message=jsonObject.getJSONArray("rows");
            throw new Exception(message.toString());
        }
        return isSuccess;
    }



//    /**
//     * 建店状态传输
//     * @param accountNumber 加盟商F编号
//     * @param sourceid  申请时传递的sourceid
//     * @param relevanceCode 一体商编码
//     * @param state 开户状态1表示开户成功 2:表示退回
//     * @param remarks 签字意见
//     */
//    public void customerZdSynchroMd(String accountNumber, String sourceid, String relevanceCode, String state,String remarks) throws Exception {
//        String xml = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://webservice.itf.core.crm/\">\n" +
//                "   <soapenv:Header/>\n" +
//                "   <soapenv:Body>\n" +
//                "      <web:customerZdSynchroMd>\n" +
//                "         <arg>\n" +
//                "            <elements>\n" +
//                "               <element>\n" +
//                "                  <accountNumber>"+accountNumber+"</accountNumber>\n" +
//                "                  <sourceid>"+sourceid+"</sourceid>\n" +
//                "                  <state>"+state+"</state>\n" +
//                "                 <remarks>"+remarks+"</remarks>\n" +
//                "                 <relevanceCode>"+relevanceCode+"</relevanceCode>\n" +
//                "               </element>\n" +
//                "            </elements>\n" +
//                "         </arg>\n" +
//                "      </web:customerZdSynchroMd>\n" +
//                "   </soapenv:Body>\n" +
//                "</soapenv:Envelope>\n";
//        System.out.println("退回请求的xml为: "+xml);
//        String fhxml = doPost("http://10.10.0.132:8060/core/ws/crm/orderService/customerZdSynchroMd",xml);
//        System.out.println("返回:"+fhxml);
//        String flag = regex(fhxml,"flag");
//        String handleMessage = regex(fhxml,"handleMessage");
//        if (!flag.equals("S")){
//            throw new Exception(handleMessage);
//        }
//
//    }
//    public static String doPost(String urlStr, String strInfo) throws IOException {
//        String result = new String();
//        URL u = new URL(urlStr);
//        HttpURLConnection conn = (HttpURLConnection) u.openConnection();
//        conn.setDoInput(true);
//        //允许对外输出数据
//        conn.setDoOutput(true);
//        conn.setUseCaches(false);
//        conn.setDefaultUseCaches(false);
//        conn.setRequestProperty("Content-Type","text/xml");
//        conn.setRequestProperty("Content-Length",String.valueOf(strInfo.length()));
//        conn.setRequestMethod("POST");
//        //定义输出流
//        OutputStream output = conn.getOutputStream();
//        if(StringUtils.isNotBlank(strInfo)){
//            byte[] b = strInfo.getBytes("UTF-8");
//            //发送soap请求报文
//            output.write(b,0,b.length);
//            output.flush();
//            output.close();
//            //定义输入流，获取soap报文
//            InputStream input = conn.getInputStream();
//            //设置编码格式
//            result = IOUtils.toString(input,"UTF-8");
//            input.close();
//        }
//        System.out.println("请求返回报文：" + result);
//
//        return result;
//    }
//
//    public  static String regex(String xml,String label) {
//        String context = "";
//        //正则表达式
//        String rgex = "<"+label+">(.*?)</"+label+">";
//        Pattern pattern = Pattern.compile(rgex);// 匹配的模式
//        Matcher m = pattern.matcher(xml);
//        //匹配的有多个
//        List<String> list = new ArrayList<String>();
//        while (m.find()) {
//            int i = 1;
//            list.add(m.group(i));
//            i++;
//        }
//        //只要匹配的第一个
//        if(list.size()>0){
//            context = list.get(0);
//        }
//        return context;
//    }

//    public static void main(String[] args) {
//        try {
//            ZTService ztService=new ZTService();
//            ztService.returnJD("","","ceshi","21111","2");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }

}
