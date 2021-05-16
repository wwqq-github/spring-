package cn.luban;

import cn.luban.config.MyConfig;
import cn.luban.service.UserService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(MyConfig.class);
		System.out.println(ac);

		//		Object userService = ac.getBean("userService");
//		System.out.println(userService);
//		System.out.println(ac);
//		String[] beanDefinitionNames = ac.getBeanDefinitionNames();
//		for (String name:beanDefinitionNames) {
//			BeanDefinition beanDefinition = ac.getBeanDefinition(name);
//			System.err.println(beanDefinition+"===>");
//		}
	}
}
