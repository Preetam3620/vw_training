package customException;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Account ob = new Account("Prateek Kuhad", 1001, 2000);
		
		Scanner sc = new Scanner(System.in);
		String r;
		do {
			
			System.out.print("Enter amount to withdraw: ");
			double amount = sc.nextDouble();
			
			try {
				amount = ob.withdraw(amount);				
			} catch(InsufficientBalancException e) {
				System.out.println(e);
				break;
			}
		
			System.out.print("Do you wish to continue: y/n");
			r = sc.next();
		}
		while(r.charAt(0) == 'y' ||  r.charAt(0) == 'Y');
		sc.close();
	}

}
