package propertyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("accountbean")
public class Account {
	
	
	@Autowired
	private Datex createdate;
	
	@Value("1")
	private int acctid;
	
//	@Value("namrata")
	@Value("${acctname}")
	private String acctName;
	
//	@Value("5000")
	@Value("${acctbal}")
	private double acctBal;
	
	public Account()
	{
		System.out.println("Account object created..");
	}
	
	public Account(int acctid, String acctName, double acctBal,Datex createdt) {
		super();
		this.acctid = acctid;
		this.acctName = acctName;
		this.acctBal = acctBal;
		this.createdate = createdt;
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
	
	


	public Datex getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Datex createdate) {
		this.createdate = createdate;
	}

	@Override
	public String toString() {
		return "Account [createdate=" + createdate + ", acctid=" + acctid + ", acctName=" + acctName + ", acctBal="
				+ acctBal + "]";
	}
	
	
	
	
	

}
