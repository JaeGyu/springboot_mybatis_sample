package me.jaegyu.mybatis;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import me.jaegyu.mybatis.mapper.MemberMapper;

public class MemberMapperTest extends AppTest{
	
	@Autowired
	private MemberMapper mapper;

	@Test
	public void testName() throws Exception {
		System.out.println(mapper.findAll());
	}
}
