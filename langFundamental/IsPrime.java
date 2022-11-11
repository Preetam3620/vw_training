package langFundamental;
import java.util.*;

public class IsPrime {
	public static void main(String[] args) {
		System.out.print("Enter no. to check prime: ");
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		boolean s = isPrime(n);
		System.out.println("prime status of " + n + " : " + s);
		
		in.close();
	}
	
	static boolean isPrime(int num) {
		if(num % 2 == 0) {
			return false;
		}
		for(int i = 3; i < num/2 ;i+=2) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
