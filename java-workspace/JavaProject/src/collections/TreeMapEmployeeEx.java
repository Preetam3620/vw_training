package collections;
import classImplementation.*;
import java.util.*;

public class TreeMapEmployeeEx {
	public static void main(String[] args) {
		SortedMap<Employee, Double> sortMap = new TreeMap<Employee, Double>();
		
		Employee e1 = new Employee(2, "Preetam", 25000, 20);
		Employee e2 = new Employee(4, "Alan", 40000, 80);
		Employee e3 = new Employee(1, "Tony", 55000, 30);
		
		sortMap.put(e1, e1.getSalary());
		sortMap.put(e2, e2.getSalary());
		sortMap.put(e3, e3.getSalary());
		sortMap.put(e1, e1.getSalary());
		
		System.out.println(sortMap);
		
		
		// custom comparison based on salary
		Comparator<Employee> c= new ComparatorImpl();
		sortMap = new TreeMap<Employee, Double>(c);
		
		sortMap.put(e1, e1.getSalary());
		sortMap.put(e2, e2.getSalary());
		sortMap.put(e3, e3.getSalary());
		sortMap.put(e1, e1.getSalary());
		
		System.out.println(sortMap);
	}
}
