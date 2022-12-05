package org.nama.web.didemonama;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import propertyinjection.Account;
import propertyinjection.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = 
        		new ClassPathXmlApplicationContext("springbeans.xml");
        
        /*
        Account ob = (Account) context.getBean("accountbean");
        System.out.println(ob);
        */
        
        Employee e = (Employee) context.getBean("empbean");
        System.out.println(e);
        
        
        
    }
}
