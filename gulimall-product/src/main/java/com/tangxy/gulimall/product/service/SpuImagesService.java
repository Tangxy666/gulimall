package com.tangxy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tangxy.common.utils.PageUtils;
import com.tangxy.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author tangxy
 * @email tangxy@gmail.com
 * @date 2022-08-05 15:49:34
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

