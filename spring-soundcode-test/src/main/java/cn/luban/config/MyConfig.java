package cn.luban.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
/**
 * 注入组件的方式
 * 1、在配置类上标注@Configuration注解
 *      在配置类中添加方法 方法名为bean的名字 返回值类型为bean的类型
 * 2、@ComponentScan 配置类上添加@ComponentScan 注解 在要加入容器 的类中上标注@Component、@Service、@Controller注解
 * 3、使用@Import导入一个组件 bean的名字为全类名
 *      @Import也可以导入一个ImportSelector的实现了的组件
 *      会调用实现类的selectImports方法 将字符串数组的bean添加到容器中
 *    @Import也可以导入一个ImportBeanDefinitionRegistrar的实现了的组件
 *      会调用实现类的registerBeanDefinition方法 往容器中注册一个bean
 * 4、实现FactoryBean接口 重写getObject()【bean的值】 、getObjectType() 【bean的类型】、isSingleton()【是否单例】 方法
 */
@ComponentScan("cn.luban.myextend")
@Component
public class MyConfig {
}
