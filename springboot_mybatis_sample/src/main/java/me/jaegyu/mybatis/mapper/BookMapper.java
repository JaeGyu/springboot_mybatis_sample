package me.jaegyu.mybatis.mapper;

import java.util.List;

import me.jaegyu.mybatis.model.Book;

public interface BookMapper {

	public List<Book> findAll() throws Exception;
}
