package com.zsw.example.rpc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.zsw.example.openfeign.dto.OrderDto;

/**
 * OrderService
 *
 * @author zhangshiwei
 * @since 2020年9月15日 10:39:25
 */
public interface OrderService {

    @GetMapping("/findOrderList")
    String findOrderList();

    @GetMapping("/findOrderById")
    String findOrderById();

    @PostMapping("/insertOrder")
    int insertOrder(@RequestBody OrderDto orderDto);
}
