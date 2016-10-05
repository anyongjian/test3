package net.codejava.springmvc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("net/codejava/springmvc/test/root-context.xml");
		/*Performer performer = (Performer)ctx.getBean("poeticDuke");
		performer.perform()*/;
		/*Performer performer = (Performer)ctx.getBean("kenny");
		performer.perform();*/
		
		Performer performer = (Performer)ctx.getBean("instrumentalist");
		performer.perform();
	}

}
