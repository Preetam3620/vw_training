package collections;
import java.util.HashMap;
import java.util.Map;

import classImplementation.Employee;

public class HashMapEx {
	public static void main(String[] args) {
		Map<Employee, Double> hMap = new HashMap<Employee, Double>();
		
		Employee e1 = new Employee(2, "Preetam", 25000, 20);
		Employee e2 = new Employee(4, "Alan", 40000, 80);
		Employee e3 = new Employee(6, "Tony", 55000, 30);
		
		hMap.put(e1, e1.getSalary());
		hMap.put(e2, e2.getSalary());
		hMap.put(e3, e3.getSalary());
		
		System.out.println(hMap);
		
		System.out.println("contains key empId=4: "+hMap.containsKey(new Employee(4, "Alan", 40000, 80)));
		System.out.println("contains value salary=40000: "+hMap.containsValue(e2.getSalary()));
		
	}
}
