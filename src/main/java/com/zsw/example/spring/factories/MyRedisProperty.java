package com.zsw.example.spring.factories;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * MyRedis 参数
 *
 * @author zhangshiwei
 * @since 2020年9月17日 下午6:08:10
 */
@Data
@ConfigurationProperties(prefix = "zsw")
public class MyRedisProperty {

    private String  host = "127.0.0.1";

    private Integer port = 6666;

    private Integer timeOut;

    private Boolean ssl;

}
