package classImplementation;

public class Employee implements Comparable<Employee> {

	private int empId;
	private String empname;
	private double salary;
	private int deptno;

	public Employee() {
		System.out.println("no-args/0-args Employee constructor called");
		/*
		 * this.empid=11; this.deptno=10; this.empname="xyz"; this.salary=100;
		 */
	}

	public Employee(Employee x) {
		this.deptno = x.deptno;
		this.empId = x.empId;
		this.empname = x.empname;
		this.salary = x.salary;
	}

	public Employee(int empid, String empname, double salary, int deptno) {
		// super();
//        System.out.println("Parameterized Employee constructor called..");
		this.empId = empid;
		this.empname = empname;
		this.salary = salary;
		this.deptno = deptno;

	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {

		if (salary > 0) {
			this.salary = salary;
		} else {
			System.out.println("Slary can't be 0 or less than 0");
		}
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public int getEmpid() {
		return empId;
	}

	public void display() {
		// this
		System.out.println("details:" + this.empId + "," + this.empname + "," + this.salary + "," + this.deptno);
		// System.out.println(empId+","+this.empname+","+this.salary+","+this.deptno);

	}

	public double calcAnnSal() {
		return this.salary * 12;
	}

	public double calcAnnSal(double bonus) {
		return (this.salary * 12) + bonus;
	}

	@Override
	public String toString() {
		return "\nEmployee [empId=" + empId + ", empname=" + empname + ", salary=" + salary + ", deptno=" + deptno
				+ "]";
	}

	// e1.equals(e2)

	@Override
	public boolean equals(Object obj) // obj = e2
	{
		if (obj instanceof Employee)
			return this.empId == ((Employee) obj).empId;
		else
			return false;
	}

	@Override
	public int hashCode() {
		return this.deptno;
	}

	@Override
	public int compareTo(Employee e) {
		System.out.println("compared empId=" + this.empId + " to e.empId=" + e.empId);
		return this.empId - e.empId;
	}

}
