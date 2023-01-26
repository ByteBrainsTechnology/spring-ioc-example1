package com.bytebrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 
 * @author ByteBtrains Technology
 *
 */
public class App {
	private static ApplicationContext context;

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e = (Employee) context.getBean("manager");
		e.work();
	}
}
