package com.neusoft.hz.util;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * @param
 * @author meng-fch
 * @Description
 * @return
 * @date 2020/9/21 15:17
 */
public class Base64Util {
    // 加密
    public static String encrypt(String str) {
        String s = null;
        try {
            byte[] b = str.getBytes("UTF-8");
            s = new BASE64Encoder().encode(b);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return s;
    }

    // 解密
    public static String decryption(String s) {
        String result = null;
        if (s != null) {
            BASE64Decoder decoder = new BASE64Decoder();
            try {
                byte[] b = decoder.decodeBuffer(s);
                result = new String(b, "UTF-8");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
