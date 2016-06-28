package me.jaegyu.mybatis;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
public class AppTest {

	@Autowired
	private DataSource ds;

	@Autowired
	private SqlSessionFactory sessionFactory;

	@Test
	public void testSqlSession() throws Exception {
		System.out.println(sessionFactory);
	}

	@Test
	public void testConnection() throws Exception {
		System.out.println(ds);
		Connection conn = ds.getConnection();
		System.out.println(conn);
		conn.close();
	}
}
