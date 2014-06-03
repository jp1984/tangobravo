package com.lan.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.lan.model.entity.Person;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext factory= new ClassPathXmlApplicationContext("config-beans.xml");
		Person p = (Person) factory.getBean("person");
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAddress());
		
	}

}
