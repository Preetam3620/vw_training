package org.nama.web.didemonama;

import constructorvaluerefinjection.*;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest
{
	public static void main(String[] args) 
	{
		try
		{
	       
            //Using ApplicationContext Spring container
            AbstractApplicationContext ac = new ClassPathXmlApplicationContext("employees.xml");
            Employee emp1 = (Employee) ac.getBean("employee");
            System.out.println(emp1.getFirstname());
            System.out.println("employee's birth year:"+emp1.getBirthdate().getYear());
            
            ac.close();
		}
		catch(Exception exp)
		{
			exp.printStackTrace();
		}
	}
}
