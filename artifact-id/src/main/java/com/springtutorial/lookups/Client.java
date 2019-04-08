package com.springtutorial.lookups;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		 /* Logger logger = Logger.getLogger(Client.class);
		 * BasicConfigurator.configure(); BasicConfigurator.resetConfiguration();*/
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springtutorial/lookups/springConfig.xml");
		Car c = (Car)context.getBean("c");
		//logger.info("HI LOGGER IS ENABLED");
		System.out.println(c.getCarEngine().getName() + " Of Year "+c.getCarEngine().getYear());
		System.out.println(c.getClass().getCanonicalName() +"  class Name");

	}

}
