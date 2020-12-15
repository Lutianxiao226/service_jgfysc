package com.neusoft.hz.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import sun.misc.BASE64Encoder;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.*;

public class BloodClient {
    private static final String MAC_NAME = "HmacSHA1";
    private static final String ENCODING = "UTF-8";
    private static final Integer MAX_TIMES = 3;
    private static final String RESULT_CODE_KEY = "code";
    private static final String SUCCESS_CODE = "200";
    public static String getData(Map<String, Object> map, String Url) {
        int i = 0;
        String code = "";
        String result = "";
        JSONObject object = null;
        Map headermap = new HashMap();
        try {
            Calendar cd = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("EEE d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
            String date  = sdf.format(cd.getTime());
            String version = "1.0";
            String  endpoint= "Donation/GetBloodDonation";
            boolean first = true;
            StringBuilder sb = new StringBuilder(endpoint);
            for (String key : map.keySet()) {
                char ch = '&';
                if (first == true) {
                    ch = '?';
                    first = false;
                }
                String value = map.get(key).toString();
                try {
                    String sval = URLEncoder.encode(value, "UTF-8");
                    sb.append(ch).append(key).append("=").append(sval);
                } catch (UnsupportedEncodingException e) {
                }
            }
            endpoint =sb.toString();
            String str = "GET" + "\n"
                    + date + "\n"
                    + "x-zjb-date:" + date + "\n"
                    + "x-zjb-version:" + version + "\n"
                    + endpoint;
            String signature = EncryptToSHA1(str, PropertiesUtil.prop.getProperty("AccessKeySecret"));
            String Authorization = "ZJB " + PropertiesUtil.prop.getProperty("AccseeKey") + ":" + signature;
            headermap.put("Authorization", Authorization);
            headermap.put("x-zjb-date",date);
            headermap.put("x-zjb-version",version);
            while (!SUCCESS_CODE.equals(code) && i++ < MAX_TIMES) {
                result = HttpUtil.getInstance().doGet(Url,headermap,map);
                object= JSON.parseObject(result);
                if(object == null){
                    continue;
                }
                code = object.getString(RESULT_CODE_KEY);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     * 使用 HMAC-SHA1 签名方法对对encryptText进行签名
     * @param encryptText 被签名的字符串
     * @param encryptKey 密钥
     * @return
     * @throws Exception
     */
    public static String EncryptToSHA1(String encryptText, String encryptKey) throws Exception
    {
        byte[] data=encryptKey.getBytes(ENCODING);
        // 根据给定的字节数组构造一个密钥,第二参数指定一个密钥算法的名称
        SecretKey secretKey = new SecretKeySpec(data, MAC_NAME);
        // 生成一个指定 Mac 算法 的 Mac 对象
        Mac mac = Mac.getInstance(MAC_NAME);
        // 用给定密钥初始化 Mac 对象
        mac.init(secretKey);
        byte[] text = encryptText.getBytes(ENCODING);
        byte[] payload = mac.doFinal(text);
        BASE64Encoder base64Encoder = new BASE64Encoder();
        return base64Encoder.encode(payload );
    }
}

