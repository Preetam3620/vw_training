package collections;

import java.util.Comparator;

public class ComparatorAccountImpl implements Comparator<Account> {

	@Override
	public int compare(Account ac1, Account ac2) {
		System.out.println("comparing based on ac1.balance: "+ ac1.getBalance()+" , ac2.balance: "+ac2.getBalance());
		return (int)(ac1.getBalance() - ac2.getBalance());
	}	

}