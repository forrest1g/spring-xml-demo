package com.itranswarp.learnjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		VTPConfig vtpConfig = context.getBean(VTPConfig.class);
		for (CountryConfig countryConfig: vtpConfig.getCountries()){
			System.out.println(countryConfig.toString());
		}
	}
}
