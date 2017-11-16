package com.hollespring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HolleSpring obj =(HolleSpring)context.getBean("hollespring");
		obj.getMessage();
	}

}
