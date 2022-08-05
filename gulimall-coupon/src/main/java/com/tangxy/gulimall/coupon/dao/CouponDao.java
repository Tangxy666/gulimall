package com.tangxy.gulimall.coupon.dao;

import com.tangxy.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author tangxy
 * @email tangxy@gmail.com
 * @date 2022-08-05 16:56:02
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
