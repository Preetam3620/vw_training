package org.nama.web.didemonama;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import propertyinjection.Account;
//import propertyinjection.Employee;


/*
 *
Spring containers are called IOC Containers:
  --IOC container = Inversion Of Control (design pattern)
  -- bean instance creation control
  -- dependancy injection control
two containers:
BeanFactory Container  (very basic spring container)
   
ApplicationContext Container  (advanced spring container)
    
*/
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	//Application Context container
        ApplicationContext context = 
        		new ClassPathXmlApplicationContext("springbeans.xml");
        
        
        Account ob = (Account) context.getBean("accountbean");
        System.out.println(ob);
        
        
        /*
        Employee e = (Employee) context.getBean("empbean");
        System.out.println(e);
        */
        
        
      //Using BeanFactory Container (primitive basic container) 
      		
      		Resource resource = new FileSystemResource("springbeans.xml");
      		BeanFactory factory = new XmlBeanFactory(resource);
      	   Account ob1 = (Account) factory.getBean("accountbean");
           System.out.println(ob1);
      		
        
    }
}
