package com.trh.dictionary.config;

import com.trh.dictionary.util.MD5Util;

/**
 * @author jingxiaohu
 * @version 1.0
 * @date 2020-2-21 21:30
 */
public class MD5Service {
    public String getMD5(String input) {
        return MD5Util.getMD5(input.getBytes());
    }
}
