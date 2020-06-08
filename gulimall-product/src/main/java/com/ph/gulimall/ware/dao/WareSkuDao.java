package com.ph.gulimall.ware.dao;

import com.ph.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author alanpei
 * @email allen.hangpei@gmail.com
 * @date 2020-05-31 20:22:12
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
