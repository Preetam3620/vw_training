package langFundamental;
import java.util.*;

public class AdditionOfEven {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int seed = in.nextInt();
		int sum = sumEvenFive(seed);
		System.out.println("sum = " + sum);
		
		in.close();
	}

	static int sumEvenFive(int seed) {
		int sum = 0;
		int count = 0;
		
		while(count < 5) {
			System.out.println("seed="+seed);
			sum += seed;
			System.out.println("sum="+sum);
			seed++;
			count++;
		}
		
		return sum;
	}
}
