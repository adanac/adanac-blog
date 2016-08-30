package com.zblog.util;

import org.jsoup.Jsoup;

/**
 * HTML parse utils.
 * @author adanac
 *
 */
public class HTMLUtils {
	
	public static String html2Text(String html) {
		return Jsoup.parse(html).text();
	}

}
