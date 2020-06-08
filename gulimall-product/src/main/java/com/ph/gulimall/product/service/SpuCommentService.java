package com.ph.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ph.common.utils.PageUtils;
import com.ph.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author alanpei
 * @email allen.hangpei@gmail.com
 * @date 2020-06-08 17:56:21
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

