package com.zsw.example.rpc;

import java.io.Serializable;

import lombok.Data;

/**
 * rpc请求信息
 *
 * @author zhangshiwei
 * @since 2020年9月15日 10:42:34
 */
@Data
public class RpcRequestDto implements Serializable {

    /**
     * 调用类名
     */
    private String   className;
    /**
     * 方法名称
     */
    private String   methodName;

    /**
     * 请求参数
     */
    private Object[] args;
    /**
     * 参数类型
     */
    private Class[]  type;
}
