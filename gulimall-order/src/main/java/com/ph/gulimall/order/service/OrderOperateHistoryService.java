package com.ph.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ph.common.utils.PageUtils;
import com.ph.gulimall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author alanpei
 * @email allen.hangpei@gmail.com
 * @date 2020-05-31 20:14:51
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

