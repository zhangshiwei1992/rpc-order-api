package com.zsw.example.spring.factories;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MyRedis 配置类
 *
 * @author zhangshiwei
 * @since 2020年9月17日 下午5:50:31
 */
@EnableConfigurationProperties(MyRedisProperty.class)
@Configuration
@ConditionalOnProperty(prefix = "zsw", value = "enable") // 满足条件才加载此配置类
public class MyRedisAutoConfiguration {

    @Bean
    public MyRedisClient myRedisClient(MyRedisProperty myRedisProperty) {
        System.out.println("myRedisProperty: " + myRedisProperty.getHost() + "  " + myRedisProperty.getPort());
        return new MyRedisClient(myRedisProperty);
    }
}
