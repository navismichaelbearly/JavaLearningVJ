package com.n2s.SpringCore1;

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
        //Refreshment r = new Coffee();
        //r.drink();
        //Coffee c = new Coffee();
        //c.drink();
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Refreshment r1 = (Refreshment) context.getBean("C");
    	r1.drink();
    	Refreshment r2 = (Refreshment) context.getBean("T");
    	r2.drink();
    	
    	Brand b = (Brand) context.getBean("brand");
    	System.out.println(b);
    	
    }
}
