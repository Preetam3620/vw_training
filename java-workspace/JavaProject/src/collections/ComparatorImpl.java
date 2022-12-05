package collections;
import java.util.Comparator;
import classImplementation.Employee;

public class ComparatorImpl implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		System.out.println("comparing based on e1.salary: "+e1.getSalary()+" , e2.salary: "+e2.getSalary());
		return (int)(e1.getSalary() - e2.getSalary());
	}

}
