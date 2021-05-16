package cn.luban.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
public class MathCalcculator {

	public  int div(int i,int j){
		return i/j;
	}
}
