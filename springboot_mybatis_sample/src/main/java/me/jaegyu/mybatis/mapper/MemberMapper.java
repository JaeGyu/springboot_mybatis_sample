package me.jaegyu.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import me.jaegyu.mybatis.model.Member;

public interface MemberMapper {
	
	@Select("select id,name,age from members;")
	public List<Member> findAll() throws Exception;
}
