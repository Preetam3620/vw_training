package collections;
import java.util.HashMap;
import java.util.Map;


public class HashMapAccount {

	public static void main(String[] args) {
		Map<Account, Double> hMap = new HashMap<Account, Double>();
		
		Account ac1 = new Account("Prateek Kuhad", 1001, 2000);
		Account ac2 = new Account("Tony Stark", 1005, 8000);
		Account ac3 = new Account("Steve Rogers", 1002, 4000);
		Account ac4 = new Account("Bruce Banner", 1009, 1000);
		
		hMap.put(ac1, ac1.getBalance());
		hMap.put(ac2, ac2.getBalance());
		hMap.put(ac3, ac3.getBalance());
		hMap.put(ac4, ac4.getBalance());
		
		System.out.println(hMap);
		
		// returns true because overriden hashCode returns accNo 
		System.out.println("contains key accNo=1002: "+hMap.containsKey(new Account("Steve Rogers", 1002, 4000)));
		
		System.out.println("contains value balance of ac3=4000: "+hMap.containsValue(ac3.getBalance()));
	}

}
