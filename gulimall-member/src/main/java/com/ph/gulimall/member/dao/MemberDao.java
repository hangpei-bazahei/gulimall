package com.ph.gulimall.member.dao;

import com.ph.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author alanpei
 * @email allen.hangpei@gmail.com
 * @date 2020-05-31 18:34:07
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
