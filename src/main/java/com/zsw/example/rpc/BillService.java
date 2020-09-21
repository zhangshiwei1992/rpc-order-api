package com.zsw.example.rpc;

/**
 * 账单服务类接口
 *
 * @author zhangshiwei
 * @since 2020年9月15日 下午11:18:10
 */
public interface BillService {

    String findBillById(Long id);

    String findListByOrderCode(String orderCode);
}
