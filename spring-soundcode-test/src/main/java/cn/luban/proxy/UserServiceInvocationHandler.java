package cn.luban.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserServiceInvocationHandler implements InvocationHandler{


	private Object userService;

	public UserServiceInvocationHandler(Object object){
		this.userService=object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


		System.out.println("在调用之前，我要干点啥呢？");
//		System.out.println("proxy=="+proxy.toString());
		System.out.println("Method==="+method);
		System.out.println("args==="+(args==null?"空指针":args.toString()));
//		System.out.println();
		//当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
		Object returnValue = method.invoke(userService, args);
		System.out.println("returnValue====>"+returnValue);
		//在代理真实对象后我们也可以添加一些自己的操作
		System.out.println("在调用之后，我要干点啥呢？");
		return returnValue;

	}


	public Object getDuckProxy(){
		return Proxy.newProxyInstance(userService.getClass().getClassLoader(),
				userService.getClass().getInterfaces(),this);
	}

}
