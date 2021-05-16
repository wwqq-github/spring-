package cn.luban.aop;


import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspects {

	@Pointcut("execution(public int cn.luban.aop.MathCalcculator.*(..))")
	public  void pointCut(){}

	@Before("pointCut()")
	public void logStart(){
		System.out.println("除法运行 参数列表{}");
	}

	@After("pointCut()")
	public void logEnd(){
		System.out.println("除法结束 参数列表{}");
	}

	@AfterReturning("pointCut()")
	public void logReturn(){
		System.out.println("除法返回 参数列表{}");
	}

	@AfterThrowing("pointCut()")
	public void logException(){
		System.out.println("除法异常 参数列表{}");
	}
}
