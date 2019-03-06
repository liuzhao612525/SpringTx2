package cn.itcast.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class OrderDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//对数据库操作方法
	
	//少钱的方法
	public void lessMoney() {
		String sql = "update account set salary=salary-? where username=?";
		int res = jdbcTemplate.update(sql, 100 ,"张三");
		System.out.println("less" + res);
	}
	
	//多钱的方法
	public void moreMoney() {
		String sql = "update account set salary=salary+? where username=?";
		int res = jdbcTemplate.update(sql, 100 ,"李四");
		System.out.println("more" + res);
	}
}
