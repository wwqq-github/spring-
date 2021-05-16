package cn.luban.config;

import cn.luban.aop.LogAspects;
import cn.luban.aop.MathCalcculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class MainConfigOfAop {

	@Bean
	public MathCalcculator calcculator(){
		return new MathCalcculator();
	}

	@Bean
	public LogAspects logAspects(){
		return new LogAspects();
	}
}
