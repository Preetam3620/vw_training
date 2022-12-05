package propertyinjection;

public class Employee {

	int empid;
	String empname;
	Account empact;

	public Employee()
	{
		System.out.println("Employee constructor called..");
	}
	
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Account getEmpact() {
		return empact;
	}

	public void setEmpact(Account empact) {
		
		System.out.println("setting account of employee:"+this.empid);
		this.empact = empact;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empact=" + empact + "]";
	}
	
	
}
