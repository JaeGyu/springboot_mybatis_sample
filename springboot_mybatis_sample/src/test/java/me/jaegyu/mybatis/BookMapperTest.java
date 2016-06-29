package me.jaegyu.mybatis;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import me.jaegyu.mybatis.mapper.BookMapper;

public class BookMapperTest extends AppTest {

	@Autowired
	private BookMapper mapper;

	@Test
	public void testFindAll() throws Exception {
		System.out.println(mapper.findAll());
	}
}
