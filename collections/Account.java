package collections;
import customException1.*;

public class Account implements Comparable<Account> {
	private String accountHolderName;
	private int accNo;
	private double balance;

	public Account(String accountHolderName, int accNo, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accNo = accNo;
		this.balance = balance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getAccNo() {
		return accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	public double withdraw(double amount) throws InsufficientBalancException, ZeroBalanceException {
		if (amount <= balance) {
			this.balance -= amount;	
			if(balance == 0) {
				throw new ZeroBalanceException(this.balance, amount, this.accNo);
			}
			System.out.println("Current balance is: " + this.balance + " after withdrawing amount: " + amount);
		} else {			
			throw new InsufficientBalancException(this.balance, amount, this.accNo);
		}
		return amount;
	}

	@Override
	public String toString() {
		return "\nAccount [accountHolderName=" + accountHolderName + ", accNo=" + accNo + ", balance=" + balance + "]";
	}
	
	@Override
	public int hashCode() {
		return this.accNo;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Account)
			return this.accNo == ((Account) obj).accNo;
		else
			return false;
	}
	
	@Override
	public int compareTo(Account ac) {
		System.out.println("compared accNo=" + this.accNo + " to ac.accNo=" + ac.accNo);
		return this.accNo - ac.accNo;
	}
		
}
