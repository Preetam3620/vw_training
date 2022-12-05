package collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import classImplementation.Employee;

public class TreeSetEmployeeEX {

	public static void main(String[] args) {
		Employee e1 = new Employee(5, "Preetam", 25000, 20);
		Employee e2 = new Employee(8, "Alan", 15000, 80);
		Employee e3 = new Employee(2, "Tony", 55000, 30);

		SortedSet<Employee> sstEmp = new TreeSet<Employee>();
		
		sstEmp.add(e1);
		sstEmp.add(e2);
		sstEmp.add(e3);
		sstEmp.add(e1); // duplicate

		System.out.println(sstEmp);
		System.out.println(sstEmp.size());
		System.out.println(sstEmp.contains(new Employee(8, "Alan", 15000, 80)));
		
		// Comparator
		Comparator<Employee> c = new ComparatorImpl();
		sstEmp = new TreeSet<Employee>(c);
		sstEmp.add(e1);
		sstEmp.add(e2);
		sstEmp.add(e3);
		sstEmp.add(e1); // duplicate
		
		System.out.println(sstEmp);
		System.out.println(sstEmp.size());
		System.out.println(sstEmp.contains(new Employee(2, "Tony", 55000, 30)));
	}

}