package collections;
import java.util.*;

public class HashSetAccountEx {
	public static void main(String[] args) {
		Set<Account> accHSet = new HashSet<Account>();
		
		Account ac1 = new Account("Prateek Kuhad", 1001, 2000);
		Account ac2 = new Account("Tony Stark", 1005, 8000);
		Account ac3 = new Account("Steve Rogers", 1002, 4000);
		Account ac4 = new Account("Bruce Banner", 1009, 1000);
		
		accHSet.add(ac1);
		accHSet.add(ac2);
		accHSet.add(ac3);
		accHSet.add(ac4);
		
		System.out.println(accHSet);
		System.out.println("Set size: "+accHSet.size());
		
		System.out.println("------ using iterator ------");
		
		Account ac = new Account("Preetam Maske", 1010, 100000);
        Iterator<Account> itr = accHSet.iterator();
        while(itr.hasNext()) {
        	ac = itr.next();
        	System.out.println(ac);
        }
        
        System.out.println("------ forEach loop ------");
        accHSet.forEach(emp -> System.out.println(emp));
	}
}
