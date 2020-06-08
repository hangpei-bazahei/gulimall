package com.ph.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ph.common.utils.PageUtils;
import com.ph.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author alanpei
 * @email allen.hangpei@gmail.com
 * @date 2020-05-31 20:14:51
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

