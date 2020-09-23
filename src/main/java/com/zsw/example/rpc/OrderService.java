package com.zsw.example.rpc;

import com.zsw.example.openfeign.dto.OrderDto;

/**
 * OrderService
 *
 * @author zhangshiwei
 * @since 2020年9月15日 10:39:25
 */
public interface OrderService {

    String findOrderList();

    String findOrderById();

    int insertOrder(OrderDto orderDto);
}
