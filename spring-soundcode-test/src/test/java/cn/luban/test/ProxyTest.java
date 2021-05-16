package cn.luban.test;

import cn.luban.proxy.UserService;
import cn.luban.proxy.UserServiceImpl;
import cn.luban.proxy.UserServiceInvocationHandler;
import cn.luban.proxy.UserServiceProxy;
import org.junit.Test;

public class ProxyTest {

	@Test
	public void test(){
		UserServiceProxy userServiceProxy=new UserServiceProxy(new UserServiceImpl());
		userServiceProxy.add();
	}

	@Test
	public void test2(){
		UserService userService=new UserServiceImpl();
		UserService proxy=(UserService)new UserServiceInvocationHandler(userService).getDuckProxy();
		proxy.add();
		proxy.delect(1);

	}
}
