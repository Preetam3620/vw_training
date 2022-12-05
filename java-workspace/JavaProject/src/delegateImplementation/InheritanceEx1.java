package delegateImplementation;

public class InheritanceEx1 {
	public static void main(String[] args) {
		Employee e;
		e = new Employee(1, "Peter", 23000, 10);
		method(e);
		
		e = new WageEmployee(2, "Tony", 5000, 20, 8000, 15);
		method(e);
		
		e = new Manager(101, "Bruce", 45000, 10, 4, "Sales", 12000);
	}

	public static void method(Employee e) {
		System.out.println(e);
		System.out.println(e.calcAnnSal());
		// Error
		if (e instanceof WageEmployee)
			System.out.println("daily wages: " + ((WageEmployee)e).getDailyWage());
	}
}
