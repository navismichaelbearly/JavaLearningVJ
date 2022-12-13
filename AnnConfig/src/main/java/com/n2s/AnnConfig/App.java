package com.n2s.AnnConfig;

import org.omg.PortableInterceptor.ACTIVE;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        Refreshment r1 = ac.getBean(Coffee.class);
        r1.drink();
        Refreshment r2 = ac.getBean(Tea.class);
        r2.drink();
    }
}
