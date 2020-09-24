package com.zsw.example.openfeign.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.zsw.example.openfeign.service.MessageService;

/**
 * FeignClient
 *
 * @author zhangshiwei
 * @since 2020年9月23日 下午7:03:25
 */
@FeignClient("spring-cloud-order-service")
public interface MessageServiceFeignClient extends MessageService {
}
