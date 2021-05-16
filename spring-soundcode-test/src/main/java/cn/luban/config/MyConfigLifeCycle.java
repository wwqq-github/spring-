package cn.luban.config;

import cn.luban.entity.Car;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *bean的生命周期配置
 * 4种方式
 * 1 通过@bean注解指定初始化和销毁方法
 * 案例 @Bean(initMethod = "init",destroyMethod ="destroy" )
 * 2.通过实现InitializingBean（初始化）, DisposableBean（销毁）接口
 * 3. 可以使用jsr250
 * @PostConstruct 对象创建执行之后调用
 * @PreDestroy 对象销毁之前执行
 * 4.实现BeanPostProcessor接口 重写初始化和销毁方法
 *
 * //调用BeanPostProcessor的postProcessBeforeInitialization方法
 * wrappedBean = applyBeanPostProcessorsBeforeInitialization(wrappedBean, beanName);
 * //调用实现了InitializingBean类的初始化方法
 * 			invokeInitMethods(beanName, wrappedBean, mbd);
 * //wrappedBean = applyBeanPostProcessorsAfterInitialization(wrappedBean, beanName);
 */
@Configuration
@ComponentScan("cn.luban.entity")
public class MyConfigLifeCycle {


	@Bean(initMethod = "init",destroyMethod ="destroy" )
	public Car car(){return new Car();}
}
