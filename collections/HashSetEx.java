package collections;
import java.util.*;
import classImplementation.Employee;

public class HashSetEx {
	public static void main(String[] args) {


		Employee e1 = new Employee(5, "Preetam", 25000, 20);
		Employee e2 = new Employee(8, "Alan", 15000, 80);
		Employee e3 = new Employee(2, "Tony", 55000, 30);

		Set<Employee> st = new HashSet<Employee>();
				
		st.add(e1);
		
        
        st.add(e2);
        st.add(e3);
        st.add(e2);
        
        
        System.out.println(st);
        System.out.println("Set size: "+st.size());
        
        System.out.println("------ using iterator ------");
        Iterator<Employee> itr = st.iterator();
        while(itr.hasNext()) {
        	e1 = itr.next();
        	System.out.println(e1);
        }
        
        System.out.println("------ forEach loop ------");
        st.forEach(emp -> System.out.println(emp));
        
        
	}

}