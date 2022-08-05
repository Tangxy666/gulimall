package com.tangxy.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tangxy.common.utils.PageUtils;
import com.tangxy.gulimall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author tangxy
 * @email tangxy@gmail.com
 * @date 2022-08-05 17:07:44
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

