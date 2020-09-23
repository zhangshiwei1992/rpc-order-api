package com.zsw.example.openfeign.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.zsw.example.rpc.OrderService;

/**
 * FeignClient
 *
 * @author zhangshiwei
 * @since 2020年9月23日 下午7:03:25
 */
@FeignClient("message-service")
public interface MessageServiceFeignClient extends OrderService {
}
