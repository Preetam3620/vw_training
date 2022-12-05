package langFundamental;

public class implementingEmployee {
	public static void main(String[] args) {
		Employee.showObjectCount();
		System.out.println("hello");
		
		Employee r = new Employee(5);
		
		System.out.println(r.empid);
		r.display();
		
		Employee.showObjectCount();
		
		Employee s = new Employee(1);
		
		System.out.println(s.empid);
		System.out.println(s.empid);
		s.display();
		Employee.showObjectCount();
	}

}
