package langFundamental;

import java.util.Scanner;

public class LargestFromThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 3 numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a > b && a > c) {
			System.out.println("a = " + a + " is greatest");
		} else if (b > c){
			System.out.println("b = " + b + " is greatest");
		} else {
			System.out.println("c = " + c + " is greatest");
		}
		
		sc.close();
	}
}
