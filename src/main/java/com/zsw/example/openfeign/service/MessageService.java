package com.zsw.example.openfeign.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zsw.example.openfeign.dto.MessageDto;

/**
 * MessageService
 *
 * @author zhangshiwei
 * @since 2020年9月15日 10:39:25
 */
public interface MessageService {

    @RequestMapping("/findAllList")
    String findAllList();

    @RequestMapping("/findById")
    String findById();

    @RequestMapping("/insertMessage")
    int insertMessage(@RequestBody MessageDto orderDto);
}
