package com.neusoft.hz.util;

import java.util.UUID;

/**
 * @param
 * @author meng-fch
 * @Description
 * @return
 * @date 2020/9/14 16:57
 */
public class UUIDUtils {
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static void main(String[] args) {
        System.out.println("格式前的UUID ： " + UUID.randomUUID().toString());
        System.out.println("格式化后的UUID ：" + getUUID());
    }
}
