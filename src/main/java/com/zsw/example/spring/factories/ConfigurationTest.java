package com.zsw.example.spring.factories;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试configuration
 *
 * @author zhangshiwei
 * @since 2020年9月17日 下午6:55:34
 */
public class ConfigurationTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                MyRedisAutoConfiguration.class);
        System.out.println("从spring容器中获取对象 MyRedisClient: " + applicationContext.getBean(MyRedisClient.class));
    }
}
