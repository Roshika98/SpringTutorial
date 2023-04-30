package com.tutorials.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext contxt = new ClassPathXmlApplicationContext("com/tutorials/springtutorial/spring.xml");
		Vehicle vh = (Vehicle) contxt.getBean("car");
		Vehicle vh1 = (Vehicle) contxt.getBean("Bike");
		vh.drive();
		vh1.drive();
    }
}
