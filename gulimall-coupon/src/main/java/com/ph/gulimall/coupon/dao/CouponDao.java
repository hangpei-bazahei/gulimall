package com.ph.gulimall.coupon.dao;

import com.ph.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author alanpei
 * @email allen.hangpei@gmail.com
 * @date 2020-05-31 18:26:27
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
