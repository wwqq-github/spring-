package cn.luban.myextend;

import cn.luban.service.UserService;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

//@Component
public class MyFactoryBean implements FactoryBean <Object>{
	@Override
	public Object getObject() throws Exception {
		System.out.println("getObject() ");
		return new Object();
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println(" getObjectType() ");
		return Object.class;
	}

}
