package delegateImplementation;

public class WageEmployee extends Employee {

	private double dailyWage;
	private int daysWorked;
	
	public WageEmployee(int empid, String empname, double salary, int deptid, double dailyWage, int daysWorked) {
		super(empid, empname, salary, deptid);
		this.dailyWage = dailyWage;
		this.daysWorked = daysWorked;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", daily wage = " + this.dailyWage + ", days worked = " + this.daysWorked;
	}
	
	@Override
	public double calcAnnSal() {
		 return super.calcAnnSal() + (this.dailyWage * this.daysWorked);
	}

	public double getDailyWage() {
		return dailyWage;
	}

	public void setDailyWage(double dailyWage) {
		this.dailyWage = dailyWage;
	}

	public int getDaysWorked() {
		return daysWorked;
	}

	public void setDaysWorked(int daysWorked) {
		this.daysWorked = daysWorked;
	}
	
	
}
