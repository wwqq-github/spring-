package cn.luban.test;

import cn.luban.aop.MathCalcculator;
import cn.luban.config.MainConfigOfAop;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {


	/**
	 * @EnableAspectJAutoProxy 是什么
	 * 	@Import(AspectJAutoProxyRegistrar.class)
	 * 	利用AspectJAutoProxyRegistrar注册组件
	 * 	//创建org.springframework.aop.config.internalAutoProxyCreator的bean定义信息
	 * 	//类型是AnnotationAwareAspectJAutoProxyCreator
	 *	AspectJAwareAdvisorAutoProxyCreator
	 *    ->AbstractAdvisorAutoProxyCreator
	 *    	->AbstractAutoProxyCreator
	 *    	  -->SmartInstantiationAwareBeanPostProcessor
	 *    	  -->BeanFactoryAware
	 */
	@Test
	public void test(){
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(MainConfigOfAop.class);
		MathCalcculator mathCalcculator = ac.getBean(MathCalcculator.class);
		System.out.println(mathCalcculator);
		mathCalcculator.div(1,1);
	}

//	public static void main(String[] args) {
//		Father father=new Son();
//	}
	static class Father{
		public int i=1;
		public Father(){
			i=2;
			show();
		}
		public void show(){
			System.out.println("i="+i);
		}
	}


	static class Son extends Father{

		public int i=2;

		public Son(){
			i=4;
			show();
		}
		public void show(){
			System.out.println("i="+i);
		}
	}
}
