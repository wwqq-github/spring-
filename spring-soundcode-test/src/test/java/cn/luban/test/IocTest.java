package cn.luban.test;

import cn.luban.config.MyConfig;
import cn.luban.config.MyConfigLifeCycle;
import cn.luban.myextend.MyBeanDefinitionRegistryPostProcessors;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocTest {



	@Test
	public void test1(){
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(MyConfig.class);
		System.out.println(ac.getBean(MyBeanDefinitionRegistryPostProcessors.class));
//		String[] beanDefinitionNames = ac.getBeanDefinitionNames();
//		for (String beanName:beanDefinitionNames) {
//			System.out.println(beanName);
//		}
	}

	@Test
	public void test2(){
		System.out.println("test");
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(MyConfigLifeCycle.class);
	}


}
