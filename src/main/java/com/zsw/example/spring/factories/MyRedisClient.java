package com.zsw.example.spring.factories;

import lombok.Data;

/**
 * MyRedis服务端
 *
 * @author zhangshiwei
 * @since 2020年9月17日 下午5:53:04
 */
@Data
public class MyRedisClient {

    private String address;

    public MyRedisClient(MyRedisProperty myRedisProperty) {
        this.address = myRedisProperty.getHost() + ":" + myRedisProperty.getPort();
    }
}
