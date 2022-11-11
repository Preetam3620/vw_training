package langFundamental;

public class Employee {
	 int empid;
	 private static int ct;
	 
	 static {
		 System.out.println("static block called");
		 ct = 0;
	 }
	
	public Employee(int id) {
		System.out.println("constructor called");
		empid = id;
		ct += 1;
		System.out.println("ct="+ct);
	}
	
	static void showObjectCount() {
		System.out.println("static method called");
		System.out.println("no of emp objects: " + ct);
	}
	
	void display() {
		System.out.println("id = " + empid + ", ct = " + ct);
	}
}
