package collections;
import classImplementation.Employee;
import java.util.*;

public class ArrayListEmployee {
	public static void main(String[] args) {
		List<Employee> lst = new ArrayList<Employee>();
		
		Employee e1 = new Employee(2, "Preetam", 25000, 20);
		Employee e2 = new Employee(4, "Alan", 15000, 80);
		Employee e3 = new Employee(6, "Tony", 55000, 30);
		lst.add(e1);
		lst.add(e2);
		lst.add(e3);
		
		System.out.println(lst);
		
		Employee e4 = new Employee(3, "Rohan", 35000, 10);
		Employee e = e4;
	    //   Employee e = new Employee(1,"Anubhav Sinha",15000,10);
		System.out.println(e==e4); //true , == checks whether object is actually same (same memory)
		System.out.println("equals: "+e.equals(new Employee(2,"Raj Malhotra",25000,10))); 
		//true if equals is overriden in employee class
		
		/*
         * contains method checks if element is present by comparing it with every element in collection
         * it uses equals method for comparison. 
         * so you have to override equals method in the elements class if two elements are supposed to
         * be equal i.e. meaningfully same application-wise
         * 
         * reason:- why you should override the equals method.
         * if you dont override equals in Employee then Object class equal will be called
         * and it checks if two objects are memory-wise equal - so u wont get the expected result.
         */
          boolean isPresent = lst.contains(new Employee(3,"Sangeeta Shah",35000,10));
          System.out.println("Employee with empid 3 and name Sangeeta Shah is Present or not? = "+isPresent);
          
          Iterator<Employee> itr = lst.iterator();

          while(itr.hasNext())
          {
              Employee ex = itr.next();
              System.out.println(ex.calcAnnSal());
              System.out.println(ex);
          }
         
          lst.forEach(ex -> System.out.println(ex));
          
          System.out.println("is empty: " + lst.isEmpty());
          lst.clear();
          System.out.println("is empty: " + lst.isEmpty());

	}
}
