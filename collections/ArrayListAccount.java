package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListAccount {
	public static void main(String[] args) {
		Account ac1 = new Account("Prateek Kuhad", 1001, 2000);
		Account ac2 = new Account("Tony Stark", 1005, 8000);
		Account ac3 = new Account("Steve Rogers", 1002, 4000);
		Account ac4 = new Account("Bruce Banner", 1009, 1000);

		List<Account> accList = new ArrayList<Account>();
		accList.add(ac1);
		accList.add(ac2);
		accList.add(ac3);
		accList.add(ac4);
		
		System.out.println(accList);
		
		Account ac5 = new Account("Clark Kent", 1003, 3000);
		Account ac = ac5;
		
		System.out.println(ac == ac5); // true because same memory location
		System.out.println("equals: "+ac.equals(new Account("Clark Kent", 1003, 3000))); // false if equals method not overriden
		
		// contains() uses equals method overriden in Account class
		boolean isPresent = accList.contains(new Account("Steve Rogers", 1002, 4000));
		System.out.println("is ac3 employee present?: "+isPresent);
		
		
		Iterator<Account> itr = accList.iterator();

        while(itr.hasNext()) {
            ac = itr.next();
            System.out.println(ac.getBalance());
            System.out.println(ac);
        }
       
        accList.forEach(acc -> System.out.println(acc));
        
        System.out.println("is empty: " + accList.isEmpty());
        accList.clear();
        System.out.println("is empty: " + accList.isEmpty());
	}
}
