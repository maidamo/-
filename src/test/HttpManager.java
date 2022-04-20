package test;

/**
 * Created with IntelliJ IDEA.
 * User: 张远
 * Date: 2021/6/21
 * Time: 10:16
 * Description: No Description
 */

import com.cloudstore.dev.api.bean.DownLoadInfo;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.EntityUtils;

public class HttpManager {
    private static final Log logger = LogFactory.getLog(com.cloudstore.dev.api.util.HttpManager.class);
    public CookieStore cookieStore = new BasicCookieStore();

    public HttpManager() {
    }

    private CloseableHttpClient getHttpClientSSL() throws KeyManagementException, NoSuchAlgorithmException {
        SSLContext var1 = null;

        try {
            var1 = this.createIgnoreVerifySSL();
        } catch (Exception var6) {
        }

        Registry var2;
        if (var1 != null) {
            var2 = RegistryBuilder.create().register("http", PlainConnectionSocketFactory.INSTANCE).register("https", new SSLConnectionSocketFactory(var1)).build();
        } else {
            var2 = RegistryBuilder.create().register("http", PlainConnectionSocketFactory.INSTANCE).build();
        }

        PoolingHttpClientConnectionManager var3 = new PoolingHttpClientConnectionManager(var2);
        HttpClients.custom().setConnectionManager(var3);
        RequestConfig var4 = RequestConfig.custom().setSocketTimeout(30000).setConnectTimeout(30000).setConnectionRequestTimeout(30000).setStaleConnectionCheckEnabled(true).build();
        CloseableHttpClient var5 = HttpClients.custom().setConnectionManager(var3).setDefaultCookieStore(this.cookieStore).setDefaultRequestConfig(var4).build();
        return var5;
    }

    private CloseableHttpClient getHttpClient() throws KeyManagementException, NoSuchAlgorithmException {
        SSLContext var1 = this.createIgnoreVerifySSL();
        Registry var2 = RegistryBuilder.create().register("http", PlainConnectionSocketFactory.INSTANCE).build();
        PoolingHttpClientConnectionManager var3 = new PoolingHttpClientConnectionManager(var2);
        HttpClients.custom().setConnectionManager(var3);
        RequestConfig var4 = RequestConfig.custom().setSocketTimeout(5000).setConnectTimeout(5000).setConnectionRequestTimeout(5000).setStaleConnectionCheckEnabled(true).build();
        CloseableHttpClient var5 = HttpClients.custom().setConnectionManager(var3).setDefaultCookieStore(this.cookieStore).setDefaultRequestConfig(var4).build();
        return var5;
    }

    public String getData(String var1, Map<String, String> var2, Map<String, String> var3) {
        String var4 = null;
        CloseableHttpClient var5 = HttpClients.createDefault();
        CloseableHttpResponse var6 = null;

        try {
            URIBuilder var7 = new URIBuilder(var1);
            Iterator var8 = var2.entrySet().iterator();

            while(var8.hasNext()) {
                Entry var9 = (Entry)var8.next();
                var7.addParameter((String)var9.getKey(), (String)var9.getValue());
            }

            HttpGet var27 = new HttpGet(var7.build());
            if (var3 != null) {
                Iterator var28 = var3.entrySet().iterator();

                while(var28.hasNext()) {
                    Entry var10 = (Entry)var28.next();
                    var27.setHeader((String)var10.getKey(), (String)var10.getValue());
                }
            }

            var6 = var5.execute(var27);
            if (var6 != null && var6.getStatusLine().getStatusCode() == 200) {
                HttpEntity var29 = var6.getEntity();
                var4 = this.entityToString(var29);
            }

            String var30 = var4;
            return var30;
        } catch (URISyntaxException var23) {
            var23.printStackTrace();
        } catch (ClientProtocolException var24) {
            var24.printStackTrace();
        } catch (IOException var25) {
            var25.printStackTrace();
        } finally {
            try {
                var5.close();
                if (var6 != null) {
                    var6.close();
                }
            } catch (IOException var22) {
                var22.printStackTrace();
            }

        }

        return null;
    }

    public String getData(String var1, Map<String, String> var2) {
        return this.getData(var1, var2, (Map)null);
    }

    public String getDataSSL(String var1, Map<String, String> var2) throws KeyManagementException, NoSuchAlgorithmException {
        return this.getDataSSL(var1, var2, (Map)null);
    }

    public String getDataSSL(String var1, Map<String, String> var2, Map<String, String> var3) throws KeyManagementException, NoSuchAlgorithmException {
        String var4 = null;
        CloseableHttpClient var5 = this.getHttpClientSSL();
        CloseableHttpResponse var6 = null;

        try {
            URIBuilder var7 = new URIBuilder(var1);
            Iterator var8 = var2.entrySet().iterator();

            while(var8.hasNext()) {
                Entry var9 = (Entry)var8.next();
                var7.addParameter((String)var9.getKey(), (String)var9.getValue());
            }

            HttpGet var23 = new HttpGet(var7.build());
            if (var3 != null) {
                Iterator var24 = var3.entrySet().iterator();

                while(var24.hasNext()) {
                    Entry var10 = (Entry)var24.next();
                    var23.setHeader((String)var10.getKey(), (String)var10.getValue());
                }
            }

            var6 = var5.execute(var23);
            if (var6 != null && var6.getStatusLine().getStatusCode() == 200) {
                HttpEntity var25 = var6.getEntity();
                var4 = this.entityToString(var25);
            }

            String var26 = var4;
            return var26;
        } catch (ClientProtocolException | HttpHostConnectException | URISyntaxException var20) {
            logger.error("请求地址:" + var1 + ",请求参数：" + var2 + ",响应数据：" + var4);
            var20.printStackTrace();
            throw new KeyManagementException(var20);
        } catch (IOException var21) {
            logger.error("请求地址:" + var1 + ",请求参数：" + var2 + ",响应数据：" + var4);
            var21.printStackTrace();
        } finally {
            try {
                var5.close();
                if (var6 != null) {
                    var6.close();
                }
            } catch (IOException var19) {
                var19.printStackTrace();
            }

        }

        return null;
    }

    public String getDataSSLUrl(String var1, Map<String, String> var2, Map<String, String> var3) throws KeyManagementException, NoSuchAlgorithmException {
        String var4 = null;
        CloseableHttpClient var5 = this.getHttpClientSSL();
        CloseableHttpResponse var6 = null;

        try {
            StringBuilder var7 = new StringBuilder();
            if (var2 != null) {
                for(Iterator var8 = var2.entrySet().iterator(); var8.hasNext(); var7.append("&")) {
                    Entry var9 = (Entry)var8.next();
                    var7.append((String)var9.getKey());
                    if (var9.getValue() != null) {
                        var7.append("=").append((String)var9.getValue());
                    }
                }
            }

            if (var7.length() > 0) {
                var1 = addUrlParam(var1, var7.substring(0, var7.length() - 1));
            }

            logger.info("=======================调用enable接口url=========" + var1);
            URIBuilder var24 = new URIBuilder(var1);
            HttpGet var25 = new HttpGet(var24.build());
            if (var3 != null) {
                Iterator var10 = var3.entrySet().iterator();

                while(var10.hasNext()) {
                    Entry var11 = (Entry)var10.next();
                    var25.setHeader((String)var11.getKey(), (String)var11.getValue());
                }
            }

            var6 = var5.execute(var25);
            if (var6 == null) {
                logger.info("=======================调用enable接口response为空=========");
            } else {
                logger.info("=======================调用enable接口=========" + var6.getStatusLine().getStatusCode());
            }

            if (var6 != null && var6.getStatusLine().getStatusCode() == 200) {
                HttpEntity var26 = var6.getEntity();
                var4 = this.entityToString(var26);
                logger.info("=======================调用enable接口返回=========" + var4);
            }

            String var27 = var4;
            return var27;
        } catch (ClientProtocolException | HttpHostConnectException | URISyntaxException var21) {
            logger.error("请求地址:" + var1 + ",请求参数：" + var2 + ",响应数据：" + var4);
            var21.printStackTrace();
            throw new KeyManagementException(var21);
        } catch (IOException var22) {
            logger.error("请求地址:" + var1 + ",请求参数：" + var2 + ",响应数据：" + var4);
            var22.printStackTrace();
        } finally {
            try {
                var5.close();
                if (var6 != null) {
                    var6.close();
                }
            } catch (IOException var20) {
                var20.printStackTrace();
            }

        }

        return null;
    }

    public String patchDataSSL(String var1, Map<String, String> var2, Map<String, String> var3) throws KeyManagementException, NoSuchAlgorithmException {
        String var4 = null;
        CloseableHttpClient var5 = this.getHttpClientSSL();
        CloseableHttpResponse var6 = null;

        try {
            URIBuilder var7 = new URIBuilder(var1);
            Iterator var8 = var2.entrySet().iterator();

            while(var8.hasNext()) {
                Entry var9 = (Entry)var8.next();
                var7.addParameter((String)var9.getKey(), (String)var9.getValue());
            }

            HttpPatch var27 = new HttpPatch(var7.build());
            if (var3 != null) {
                Iterator var28 = var3.entrySet().iterator();

                while(var28.hasNext()) {
                    Entry var10 = (Entry)var28.next();
                    var27.setHeader((String)var10.getKey(), (String)var10.getValue());
                }
            }

            var6 = var5.execute(var27);
            if (var6 != null && var6.getStatusLine().getStatusCode() == 200) {
                HttpEntity var29 = var6.getEntity();
                var4 = this.entityToString(var29);
            }

            String var30 = var4;
            return var30;
        } catch (URISyntaxException var23) {
            var23.printStackTrace();
        } catch (ClientProtocolException var24) {
            var24.printStackTrace();
        } catch (IOException var25) {
            var25.printStackTrace();
        } finally {
            try {
                var5.close();
                if (var6 != null) {
                    var6.close();
                }
            } catch (IOException var22) {
                var22.printStackTrace();
            }

        }

        return null;
    }

    public String putDataSSL(String var1, Map<String, String> var2, Map<String, String> var3) throws KeyManagementException, NoSuchAlgorithmException {
        String var4 = null;
        CloseableHttpClient var5 = this.getHttpClientSSL();
        CloseableHttpResponse var6 = null;

        try {
            URIBuilder var7 = new URIBuilder(var1);
            Iterator var8 = var2.entrySet().iterator();

            while(var8.hasNext()) {
                Entry var9 = (Entry)var8.next();
                var7.addParameter((String)var9.getKey(), (String)var9.getValue());
            }

            HttpPut var27 = new HttpPut(var7.build());
            if (var3 != null) {
                Iterator var28 = var3.entrySet().iterator();

                while(var28.hasNext()) {
                    Entry var10 = (Entry)var28.next();
                    var27.setHeader((String)var10.getKey(), (String)var10.getValue());
                }
            }

            var6 = var5.execute(var27);
            if (var6 != null && var6.getStatusLine().getStatusCode() == 200) {
                HttpEntity var29 = var6.getEntity();
                var4 = this.entityToString(var29);
            }

            String var30 = var4;
            return var30;
        } catch (URISyntaxException var23) {
            var23.printStackTrace();
        } catch (ClientProtocolException var24) {
            var24.printStackTrace();
        } catch (IOException var25) {
            var25.printStackTrace();
        } finally {
            try {
                var5.close();
                if (var6 != null) {
                    var6.close();
                }
            } catch (IOException var22) {
                var22.printStackTrace();
            }

        }

        return null;
    }

    public String deleteDataSSL(String var1, Map<String, String> var2, Map<String, String> var3) throws KeyManagementException, NoSuchAlgorithmException {
        String var4 = null;
        CloseableHttpClient var5 = this.getHttpClientSSL();
        CloseableHttpResponse var6 = null;

        try {
            URIBuilder var7 = new URIBuilder(var1);
            Iterator var8 = var2.entrySet().iterator();

            while(var8.hasNext()) {
                Entry var9 = (Entry)var8.next();
                var7.addParameter((String)var9.getKey(), (String)var9.getValue());
            }

            HttpDelete var27 = new HttpDelete(var7.build());
            if (var3 != null) {
                Iterator var28 = var3.entrySet().iterator();

                while(var28.hasNext()) {
                    Entry var10 = (Entry)var28.next();
                    var27.setHeader((String)var10.getKey(), (String)var10.getValue());
                }
            }

            var6 = var5.execute(var27);
            if (var6 != null && var6.getStatusLine().getStatusCode() == 200) {
                HttpEntity var29 = var6.getEntity();
                var4 = this.entityToString(var29);
            }

            String var30 = var4;
            return var30;
        } catch (URISyntaxException var23) {
            var23.printStackTrace();
        } catch (ClientProtocolException var24) {
            var24.printStackTrace();
        } catch (IOException var25) {
            var25.printStackTrace();
        } finally {
            try {
                var5.close();
                if (var6 != null) {
                    var6.close();
                }
            } catch (IOException var22) {
                var22.printStackTrace();
            }

        }

        return null;
    }

    public String postData(String var1, Map<String, String> var2, Map<String, String> var3) {
        String var4 = null;
        CloseableHttpClient var5 = HttpClients.createDefault();
        HttpPost var6 = new HttpPost(var1);
        ArrayList var7 = new ArrayList();
        Iterator var8 = var2.entrySet().iterator();

        while(var8.hasNext()) {
            Entry var9 = (Entry)var8.next();
            var7.add(new BasicNameValuePair((String)var9.getKey(), (String)var9.getValue()));
        }

        CloseableHttpResponse var27 = null;

        try {
            var6.setEntity(new UrlEncodedFormEntity(var7, "UTF-8"));
            if (var3 != null) {
                Iterator var28 = var3.entrySet().iterator();

                while(var28.hasNext()) {
                    Entry var10 = (Entry)var28.next();
                    var6.setHeader((String)var10.getKey(), (String)var10.getValue());
                }
            }

            var27 = var5.execute(var6);
            if (var27 != null && var27.getStatusLine().getStatusCode() == 200) {
                HttpEntity var29 = var27.getEntity();
                var4 = this.entityToString(var29);
            }

            String var30 = var4;
            return var30;
        } catch (UnsupportedEncodingException var23) {
            var23.printStackTrace();
        } catch (ClientProtocolException var24) {
            var24.printStackTrace();
        } catch (IOException var25) {
            var25.printStackTrace();
        } finally {
            try {
                var5.close();
                if (var27 != null) {
                    var27.close();
                }
            } catch (IOException var22) {
                var22.printStackTrace();
            }

        }

        return null;
    }

    public String postData(String var1, Map<String, String> var2) {
        return this.postData(var1, var2, (Map)null);
    }

    public String postDataSSL(String var1, Map<String, String> var2) throws KeyManagementException, NoSuchAlgorithmException {
        return this.postDataSSL(var1, var2, (Map)null);
    }

    public String postDataSSL(String var1, Map<String, String> var2, Map<String, String> var3) throws KeyManagementException, NoSuchAlgorithmException {
        String var4 = null;
        CloseableHttpClient var5 = this.getHttpClientSSL();
        HttpPost var6 = new HttpPost(var1);
        ArrayList var7 = new ArrayList();
        Iterator var8 = var2.entrySet().iterator();

        while(var8.hasNext()) {
            Entry var9 = (Entry)var8.next();
            var7.add(new BasicNameValuePair((String)var9.getKey(), (String)var9.getValue()));
        }

        CloseableHttpResponse var27 = null;

        try {
            var6.setEntity(new UrlEncodedFormEntity(var7, "UTF-8"));
            if (var3 != null) {
                Iterator var28 = var3.entrySet().iterator();

                while(var28.hasNext()) {
                    Entry var10 = (Entry)var28.next();
                    var6.setHeader((String)var10.getKey(), (String)var10.getValue());
                }
            }

            var27 = var5.execute(var6);
            if (var27 != null && var27.getStatusLine().getStatusCode() == 200) {
                HttpEntity var29 = var27.getEntity();
                var4 = this.entityToString(var29);
            }

            String var30 = var4;
            return var30;
        } catch (UnsupportedEncodingException var23) {
            var23.printStackTrace();
        } catch (ClientProtocolException var24) {
            var24.printStackTrace();
        } catch (IOException var25) {
            var25.printStackTrace();
        } finally {
            try {
                var5.close();
                if (var27 != null) {
                    var27.close();
                }
            } catch (IOException var22) {
                var22.printStackTrace();
            }

        }

        return null;
    }

    public String postJsonData(String var1, String var2) {
        return this.postJsonData(var1, var2, (Map)null);
    }

    public String postJsonData(String var1, String var2, Map<String, String> var3) {
        String var4 = null;
        CloseableHttpClient var5 = HttpClients.createDefault();
        HttpPost var6 = new HttpPost(var1);
        CloseableHttpResponse var7 = null;

        try {
            var6.setEntity(new ByteArrayEntity(var2.getBytes("UTF-8")));
            if (var3 != null) {
                Iterator var8 = var3.entrySet().iterator();

                while(var8.hasNext()) {
                    Entry var9 = (Entry)var8.next();
                    var6.setHeader((String)var9.getKey(), (String)var9.getValue());
                }
            }

            var7 = var5.execute(var6);
            if (var7 != null && var7.getStatusLine().getStatusCode() == 200) {
                HttpEntity var26 = var7.getEntity();
                var4 = this.entityToString(var26);
            }

            String var27 = var4;
            return var27;
        } catch (UnsupportedEncodingException var22) {
            var22.printStackTrace();
        } catch (ClientProtocolException var23) {
            var23.printStackTrace();
        } catch (IOException var24) {
            var24.printStackTrace();
        } finally {
            try {
                var5.close();
                if (var7 != null) {
                    var7.close();
                }
            } catch (IOException var21) {
                var21.printStackTrace();
            }

        }

        return null;
    }

    public String postJsonDataSSL(String var1, String var2) throws KeyManagementException, NoSuchAlgorithmException {
        return this.postJsonDataSSL(var1, var2, (Map)null);
    }

    public String postJsonDataSSL(String var1, String var2, Map<String, String> var3) throws KeyManagementException, NoSuchAlgorithmException {
        String var4 = null;
        CloseableHttpClient var5 = this.getHttpClientSSL();
        HttpPost var6 = new HttpPost(var1);
        CloseableHttpResponse var7 = null;

        try {
            var6.setEntity(new ByteArrayEntity(var2.getBytes("UTF-8")));
            var6.setHeader("Content-type", "application/json");
            if (var3 != null) {
                Iterator var8 = var3.entrySet().iterator();

                while(var8.hasNext()) {
                    Entry var9 = (Entry)var8.next();
                    var6.setHeader((String)var9.getKey(), (String)var9.getValue());
                }
            }

            var7 = var5.execute(var6);
            if (var7 != null && var7.getStatusLine().getStatusCode() == 200) {
                HttpEntity var26 = var7.getEntity();
                var4 = this.entityToString(var26);
            }

            String var27 = var4;
            return var27;
        } catch (UnsupportedEncodingException var22) {
            var22.printStackTrace();
        } catch (ClientProtocolException var23) {
            var23.printStackTrace();
        } catch (IOException var24) {
            var24.printStackTrace();
        } finally {
            try {
                var5.close();
                if (var7 != null) {
                    var7.close();
                }
            } catch (IOException var21) {
                var21.printStackTrace();
            }

        }

        return null;
    }

    private String entityToString(HttpEntity var1) throws IOException {
        String var2 = null;
        if (var1 != null) {
            long var3 = var1.getContentLength();
            if (var3 != -1L && var3 < 2048L) {
                var2 = EntityUtils.toString(var1, "UTF-8");
            } else {
                InputStreamReader var5 = new InputStreamReader(var1.getContent(), "UTF-8");
                CharArrayBuffer var6 = new CharArrayBuffer(2048);
                char[] var7 = new char[1024];

                int var8;
                while((var8 = var5.read(var7)) != -1) {
                    var6.append(var7, 0, var8);
                }

                var2 = var6.toString();
            }
        }

        return var2;
    }

    public SSLContext createIgnoreVerifySSL() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext var1 = SSLContext.getInstance("SSLv3");
        X509TrustManager var2 = new X509TrustManager() {
            public void checkClientTrusted(X509Certificate[] var1, String var2) throws CertificateException {
            }

            public void checkServerTrusted(X509Certificate[] var1, String var2) throws CertificateException {
            }

            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }
        };
        var1.init((KeyManager[])null, new TrustManager[]{var2}, (SecureRandom)null);
        return var1;
    }

    public String uploadFile(String var1, String var2, String var3, String var4, Map<String, String> var5, Map<String, String> var6) throws KeyManagementException, NoSuchAlgorithmException {
        String var7 = "";

        try {
            try {
                File var8 = new File(var2);
                FileInputStream var9 = new FileInputStream(var8);
                var7 = this.uploadFile(var1, var9, var8.getName(), var3, var4, var5, var6);
            } catch (IOException var14) {
                var14.printStackTrace();
            } catch (Exception var15) {
                var15.printStackTrace();
            }

            return var7;
        } finally {
            ;
        }
    }

    public String uploadFile(String var1, InputStream var2, String var3, String var4, String var5, Map<String, String> var6, Map<String, String> var7) throws KeyManagementException, NoSuchAlgorithmException {
        CloseableHttpClient var8 = this.getHttpClientSSL();
        String var9 = "";

        try {
            HttpPost var10 = new HttpPost(var1);
            MultipartEntityBuilder var11 = MultipartEntityBuilder.create().setMode(HttpMultipartMode.RFC6532);
            var11.addBinaryBody(var5, var2, ContentType.create(var4), var3);
            Iterator var12 = var6.entrySet().iterator();

            Entry var13;
            while(var12.hasNext()) {
                var13 = (Entry)var12.next();
                var11.addTextBody((String)var13.getKey(), (String)var13.getValue());
            }

            if (var7 != null) {
                var12 = var7.entrySet().iterator();

                while(var12.hasNext()) {
                    var13 = (Entry)var12.next();
                    var10.setHeader((String)var13.getKey(), (String)var13.getValue());
                }
            }

            HttpEntity var28 = var11.build();
            var10.setEntity(var28);
            CloseableHttpResponse var29 = var8.execute(var10);
            HttpEntity var14 = var29.getEntity();
            if (var14 != null) {
                var9 = EntityUtils.toString(var14, "UTF-8");
            }
        } catch (IOException var25) {
            var25.printStackTrace();
        } catch (Exception var26) {
            var26.printStackTrace();
        } finally {
            try {
                var8.close();
            } catch (IOException var24) {
                var24.printStackTrace();
            }

        }

        return var9;
    }

    private static String getFileName(HttpResponse var0) {
        Header var1 = var0.getFirstHeader("Content-Disposition");
        String var2 = null;
        if (var1 != null) {
            HeaderElement[] var3 = var1.getElements();
            if (var3.length == 1) {
                NameValuePair var4 = var3[0].getParameterByName("filename");
                if (var4 != null) {
                    try {
                        var2 = new String(var4.getValue().toString().getBytes("ISO-8859-1"), "GBK");
                    } catch (Exception var6) {
                        var6.printStackTrace();
                    }
                }
            }
        }

        return var2;
    }

    public DownLoadInfo downloadFile(String var1, Map<String, String> var2, Map<String, String> var3) {
        DownLoadInfo var4 = new DownLoadInfo();

        try {
            CloseableHttpClient var5 = this.getHttpClientSSL();
            ArrayList var6 = new ArrayList(var2.size());
            Iterator var7 = var2.entrySet().iterator();

            while(var7.hasNext()) {
                Entry var8 = (Entry)var7.next();
                var6.add(new BasicNameValuePair((String)var8.getKey(), (String)var8.getValue()));
            }

            var1 = var1 + "?" + EntityUtils.toString(new UrlEncodedFormEntity(var6, "UTF-8"));
            HttpGet var14 = new HttpGet(var1);
            if (var3 != null) {
                Iterator var15 = var3.entrySet().iterator();

                while(var15.hasNext()) {
                    Entry var9 = (Entry)var15.next();
                    var14.setHeader((String)var9.getKey(), (String)var9.getValue());
                }
            }

            CloseableHttpResponse var16 = var5.execute(var14);
            var4.setFileName(getFileName(var16));
            Header var17 = var16.getFirstHeader("Content-Type");
            var4.setMimeType(var17.getValue());
            HttpEntity var10;
            if (!StringUtils.isNotBlank(getFileName(var16))) {
                var10 = var16.getEntity();
                String var11 = "";
                if (var10 != null) {
                    var11 = this.entityToString(var10);
                    var4.setResult(var11);
                }
            } else {
                var10 = var16.getEntity();
                InputStream var18 = var10.getContent();
                byte[] var12 = getbytes(var18);
                var4.setData(var12);
                var18.close();
            }

            return var4;
        } catch (Exception var13) {
            var13.printStackTrace();
            logger.error(var1 + ":" + var13.getMessage());
            return null;
        }
    }

    private static byte[] getbytes(InputStream var0) {
        ByteArrayOutputStream var1 = new ByteArrayOutputStream();

        try {
            byte[] var2 = new byte[2048];
            boolean var3 = false;

            int var20;
            while((var20 = var0.read(var2)) != -1) {
                var1.write(var2, 0, var20);
            }

            byte[] var4 = var1.toByteArray();
            return var4;
        } catch (Exception var18) {
        } finally {
            try {
                if (var0 != null) {
                    var0.close();
                }
            } catch (Exception var17) {
            }

            try {
                if (var1 != null) {
                    var1.close();
                }
            } catch (Exception var16) {
            }

        }

        return null;
    }

    public boolean downloadFile(String var1, OutputStream var2, Map<String, String> var3, Map<String, String> var4) {
        try {
            CloseableHttpClient var5 = this.getHttpClientSSL();
            HttpGet var6 = new HttpGet(var1);
            CloseableHttpResponse var7 = var5.execute(var6);
            HttpEntity var8 = var7.getEntity();
            InputStream var9 = var8.getContent();
            byte[] var10 = new byte[10240];
            boolean var11 = false;

            int var13;
            while((var13 = var9.read(var10)) != -1) {
                var2.write(var10, 0, var13);
            }

            var9.close();
            var2.flush();
            var2.close();
            return true;
        } catch (Exception var12) {
            var12.printStackTrace();
            return false;
        }
    }

    public boolean downloadFile(String var1, String var2, Map<String, String> var3, Map<String, String> var4) {
        try {
            CloseableHttpClient var5 = this.getHttpClientSSL();
            HttpGet var6 = new HttpGet(var1);
            CloseableHttpResponse var7 = var5.execute(var6);
            HttpEntity var8 = var7.getEntity();
            InputStream var9 = var8.getContent();
            File var10 = new File(var2);
            var10.getParentFile().mkdirs();
            FileOutputStream var11 = new FileOutputStream(var10);
            byte[] var12 = new byte[10240];
            boolean var13 = false;

            int var15;
            while((var15 = var9.read(var12)) != -1) {
                var11.write(var12, 0, var15);
            }

            var9.close();
            var11.flush();
            var11.close();
            return true;
        } catch (Exception var14) {
            var14.printStackTrace();
            return false;
        }
    }

    public static String addUrlParam(String var0, String... var1) {
        if (var1 != null) {
            String[] var2 = var1;
            int var3 = var1.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                String var5 = var2[var4];
                if (StringUtils.isNotBlank(var5)) {
                    if (var0.indexOf("?") >= 0) {
                        var0 = var0 + "&" + var5;
                    } else {
                        var0 = var0 + "?" + var5;
                    }
                }
            }
        }

        return var0;
    }
}
