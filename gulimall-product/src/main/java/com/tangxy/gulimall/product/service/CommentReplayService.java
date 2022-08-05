package com.tangxy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tangxy.common.utils.PageUtils;
import com.tangxy.gulimall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author tangxy
 * @email tangxy@gmail.com
 * @date 2022-08-05 15:49:34
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

