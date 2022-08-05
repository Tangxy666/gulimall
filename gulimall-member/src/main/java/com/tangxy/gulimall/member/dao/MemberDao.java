package com.tangxy.gulimall.member.dao;

import com.tangxy.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author tangxy
 * @email tangxy@gmail.com
 * @date 2022-08-05 17:07:44
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
