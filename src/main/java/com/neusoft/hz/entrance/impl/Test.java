package com.neusoft.hz.entrance.impl;

import com.alibaba.druid.pool.vendor.SybaseExceptionSorter;
import com.neusoft.hz.util.BloodClient;

import java.text.SimpleDateFormat;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        try {
            Map headermap = new HashMap();
           // String date = "GMT Date";
            Calendar cd = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("EEE d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            sdf.setTimeZone(TimeZone.getTimeZone("GMT")); // 设置时区为GMT
            String date  = sdf.format(cd.getTime());
            String version = "1.0";
            String endpoint = "Donation/GetBloodDonation?StartDate=2020-07-27";
            String str = "GET" + "\n"
                    + date + "\n"
                    + "x-zjb-date:" + date + "\n"
                    + "x-zjb-version:" + version + "\n"
                    + endpoint;
            String signature = BloodClient.EncryptToSHA1(str, "WC/L6KlhP4NNibBvZi3LYSc1BOgnvDCs");
            String authorization = "ZJB " + "OC8YvGuXnww=" + ":" + signature;
//            headermap.put("Authorization", authorization);
            System.out.println(authorization);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
