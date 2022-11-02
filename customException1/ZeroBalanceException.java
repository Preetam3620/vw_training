package customException1;

public class ZeroBalanceException extends Exception {
	private double currBal;
	private double withdrawAmt;
	private int accountNo;
	public ZeroBalanceException(double currBal, double withdrawAmt, int accountNo) {
		super();
		this.currBal = currBal;
		this.withdrawAmt = withdrawAmt;
		this.accountNo = accountNo;
	}
	@Override
	public String toString() {
		return "ZeroBalanceException [currBal=" + currBal + ", withdrawAmt=" + withdrawAmt + ", accountNo=" + accountNo
				+ "]";
	}
	
}
