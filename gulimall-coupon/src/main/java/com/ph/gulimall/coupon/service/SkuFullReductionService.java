package com.ph.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ph.common.utils.PageUtils;
import com.ph.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author alanpei
 * @email allen.hangpei@gmail.com
 * @date 2020-05-31 18:26:27
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

