package com.deloitte.task1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		JavaCollection jc = (JavaCollection) context.getBean("javaCollection");

	    jc.getAddressList();
	    jc.getAddressSet();
	    jc.getAddressMap();
	    jc.getAddressProp();

	}

}
