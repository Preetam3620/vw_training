package propertyinjection;

public class Account {
	
	
	private int acctid;
	private String acctName;
	private double acctBal;
	
	public Account()
	{
		System.out.println("Account object created..");
	}
	
	public Account(int acctid, String acctName, double acctBal) {
		super();
		this.acctid = acctid;
		this.acctName = acctName;
		this.acctBal = acctBal;
	}


	public int getAcctid() {
		return acctid;
	}


	public void setAcctid(int acctid) {
		this.acctid = acctid;
	}


	public String getAcctName() {
		return acctName;
	}


	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}


	public double getAcctBal() {
		return acctBal;
	}


	public void setAcctBal(double acctBal) {
		this.acctBal = acctBal;
	}


	@Override
	public String toString() {
		return "Account [acctid=" + acctid + ", acctName=" + acctName + ", acctBal=" + acctBal + "]";
	}
	
	
	
	
	

}
