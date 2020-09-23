package com.zsw.example.rpc;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zsw.example.openfeign.dto.MessageDto;

/**
 * OrderService
 *
 * @author zhangshiwei
 * @since 2020年9月15日 10:39:25
 */
public interface OrderService {

    @RequestMapping("/findOrderList")
    String findOrderList();

    @RequestMapping("/findOrderById")
    String findOrderById();

    @RequestMapping("/insertOrder")
    int insertOrder(@RequestBody MessageDto orderDto);
}
