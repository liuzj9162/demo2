package com.vcic.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vcic.bean.VcicUser;
import com.vcic.service.VcicUserService;

public class ModelTest {

	public static void main(String[] args) {
		
		ApplicationContext  app = new ClassPathXmlApplicationContext("daoComponent.xml","mvcComponent.xml");
		VcicUserService  vws = app.getBean("userService",VcicUserService.class);
		System.out.println(vws.listAll());
		
		//vws.createAccount(new VcicUser(101,601798,"Broek",40,"M","ITP"));
		//vws.createAccount(new VcicUser(103,601800,"Ejiaku",41,"M","Finance"));
		//vws.createAccountView(new VcicUser(104,601801,"EcuiYa",41,"M","Finance"));
		//VcicUser vcicUser = vws.createAccountView(new VcicUser(104,601802,"Wangyan",36,"F","Finance"));
		//System.out.println(vcicUser);
	}

}
