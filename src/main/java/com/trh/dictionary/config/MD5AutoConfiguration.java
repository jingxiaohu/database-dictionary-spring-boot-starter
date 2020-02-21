package com.trh.dictionary.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jingxiaohu
 * @version 1.0
 * @date 2020-2-21 21:30
 */
@Configuration
public class MD5AutoConfiguration {
    @Bean
    MD5Service md5Service() {
        return new MD5Service();
    }
}