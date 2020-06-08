package com.ph.gulimall.order.dao;

import com.ph.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author alanpei
 * @email allen.hangpei@gmail.com
 * @date 2020-05-31 20:14:51
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
