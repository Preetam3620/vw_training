package customException1;

public class InsufficientBalancException extends Exception {
	private double currBal;
	private double withdrawAmt;
	private int accountNo;
	public InsufficientBalancException(double currBal, double withdrawAmt, int accountNo) {
		super();
		this.currBal = currBal;
		this.withdrawAmt = withdrawAmt;
		this.accountNo = accountNo;
	}
	@Override
	public String toString() {
		return "InsufficientBalancException [currBal=" + currBal + ", withdrawAmt=" + withdrawAmt + ", accountNo="
				+ accountNo + "]";
	}

	
}
