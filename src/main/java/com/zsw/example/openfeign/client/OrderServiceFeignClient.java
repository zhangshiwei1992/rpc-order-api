package com.zsw.example.openfeign.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.zsw.example.rpc.OrderService;

/**
 * orderService FeignClient
 *
 * @author zhangshiwei
 * @since 2020年9月23日 下午7:03:25
 */
@FeignClient
public interface OrderServiceFeignClient extends OrderService {
}
