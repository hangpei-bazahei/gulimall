package com.ph.gulimall.product.dao;

import com.ph.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author alanpei
 * @email allen.hangpei@gmail.com
 * @date 2020-05-31 10:38:02
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
