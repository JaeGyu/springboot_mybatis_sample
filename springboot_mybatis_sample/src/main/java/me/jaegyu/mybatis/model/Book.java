package me.jaegyu.mybatis.model;

import lombok.Data;

@Data
public class Book {

	private Integer id;
	private String name;
	private Integer price;

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]\n";
	}

}
