package com.ph.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ph.common.utils.PageUtils;
import com.ph.gulimall.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author alanpei
 * @email allen.hangpei@gmail.com
 * @date 2020-05-31 18:26:27
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

