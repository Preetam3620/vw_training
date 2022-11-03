package collections;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapAccount {
	public static void main(String[] args) {
		Account ac1 = new Account("Prateek Kuhad", 1001, 2000);
		Account ac2 = new Account("Tony Stark", 1005, 8000);
		Account ac3 = new Account("Steve Rogers", 1002, 4000);
		Account ac4 = new Account("Bruce Banner", 1009, 1000);

		SortedMap<Account, Integer> sortMapAcc = new TreeMap<Account, Integer>();
		
		sortMapAcc.put(ac1, ac1.getAccNo());
		sortMapAcc.put(ac2, ac2.getAccNo());
		sortMapAcc.put(ac3, ac3.getAccNo());
		sortMapAcc.put(ac4, ac4.getAccNo());
		
		System.out.println(sortMapAcc);
		
		// custom comparator with account balance
		Comparator<Account> c = new ComparatorAccountImpl();
		SortedMap<Account, Double> sortMapAcc1 = new TreeMap<Account, Double>(c);

		sortMapAcc1.put(ac1, ac1.getBalance());
		sortMapAcc1.put(ac2, ac2.getBalance());
		sortMapAcc1.put(ac3, ac3.getBalance());
		sortMapAcc1.put(ac4, ac4.getBalance());
		sortMapAcc1.put(ac2, ac2.getBalance()); // dupliacte
		
		System.out.println(sortMapAcc1);
	}
}
