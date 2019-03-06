package cn.itcast.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {
	
	@Test
	public void testDemo() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		OrderService orderService = (OrderService)context.getBean("orderService");
		orderService.accountMoney();
	}
}
