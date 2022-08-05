package com.tangxy.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tangxy.common.utils.PageUtils;
import com.tangxy.gulimall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author tangxy
 * @email tangxy@gmail.com
 * @date 2022-08-05 17:20:52
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

