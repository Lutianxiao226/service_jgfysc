package com.neusoft.hz.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {

	public static final String PATH = "restful.properties";

	public static Properties prop;

	static {
		if (null == prop) {
			InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream(com.neusoft.hz.util.PropertiesUtil.PATH);
			Properties vprop = new Properties();
			try {
				vprop.load(in);
				prop = vprop;
				in.close();
				in = null;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}