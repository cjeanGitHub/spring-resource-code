package com.example;

import com.example.Appconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//测试bean获取
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
		applicationContext.getBean(TestService.class).test();
	}
}