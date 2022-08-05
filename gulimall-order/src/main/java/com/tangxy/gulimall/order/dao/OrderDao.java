package com.tangxy.gulimall.order.dao;

import com.tangxy.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author tangxy
 * @email tangxy@gmail.com
 * @date 2022-08-05 17:20:52
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
