package com.ph.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ph.common.utils.PageUtils;
import com.ph.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author alanpei
 * @email allen.hangpei@gmail.com
 * @date 2020-06-08 17:56:21
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

