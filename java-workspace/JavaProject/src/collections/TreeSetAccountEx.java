package collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetAccountEx {

	public static void main(String[] args) {
		Account ac1 = new Account("Prateek Kuhad", 1001, 2000);
		Account ac2 = new Account("Tony Stark", 1005, 8000);
		Account ac3 = new Account("Steve Rogers", 1002, 4000);
		Account ac4 = new Account("Bruce Banner", 1009, 1000);

		SortedSet<Account> sstAcc = new TreeSet<Account>();
		
		sstAcc.add(ac1);
		sstAcc.add(ac2);
		sstAcc.add(ac3);
		sstAcc.add(ac4);
		sstAcc.add(ac2); // duplicate
		
		System.out.println(sstAcc);
		System.out.println(sstAcc.size());
		System.out.println(sstAcc.contains(new Account("Tony Stark", 1005, 8000)));
		
		// custom comparator with account balance
		Comparator<Account> c = new ComparatorAccountImpl();
		sstAcc = new TreeSet<Account>(c);
		
		sstAcc.add(ac1);
		sstAcc.add(ac2);
		sstAcc.add(ac3);
		sstAcc.add(ac4);
		sstAcc.add(ac2); // duplicate
		
		System.out.println(sstAcc);
		System.out.println(sstAcc.size());
		System.out.println(sstAcc.contains(new Account("Bruce Banner", 1009, 1000)));
		
		
	}

}
