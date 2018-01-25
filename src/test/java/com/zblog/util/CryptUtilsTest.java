package com.zblog.util;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Feagle on 2018/1/26.
 */
public class CryptUtilsTest {
    @Test
    public void getSecretKey() throws Exception {
        byte[] secretKey = CryptUtils.getSecretKey();
        System.out.println(JSON.toJSONString(secretKey));
    }

    @Test
    public void encryptData() throws Exception {
    }

    @Test
    public void encryptData1() throws Exception {
    }

    @Test
    public void decryptData() throws Exception {
    }

    @Test
    public void decryptData1() throws Exception {
    }

    @Test
    public void byte2hex() throws Exception {
    }

    @Test
    public void hex2byte() throws Exception {
    }

    @Test
    public void bytesToBase64() throws Exception {
    }

    @Test
    public void base64ToBytes() throws Exception {
    }

    @Test
    public void encryptString() throws Exception {
        String root123 = CryptUtils.encryptString("root123");
        System.out.println(root123);
    }

    @Test
    public void encryptString1() throws Exception {
    }

    @Test
    public void encryptString2() throws Exception {
    }

    @Test
    public void decryptString() throws Exception {
    }

    @Test
    public void decryptString1() throws Exception {
    }

    @Test
    public void decryptString2() throws Exception {
    }

    @Test
    public void main() throws Exception {
    }

}