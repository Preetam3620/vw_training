package interfaceExample;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Bounceable bref;
		Rollable r;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter color of ball:-");
						
	    String c = sc.next();
		
	//	bref = new Ball(c);  //2
		
		
		System.out.println("Enter bounce factor multiple for ball:-");
		
		int bouncemultiple = sc.nextInt();
		
		System.out.println("Enter roll factor multiple for ball:-");
		
		int rollmultiple = sc.nextInt();
		
		//meth(bref,bouncemultiple);
		
		meth(new Ball(c),bouncemultiple);
		
		
		meth1(new Ball(c),rollmultiple);
		
		
		meth(new Ball("red"),10);
		
		
		meth1(new Ball("red"),5);
		
		meth1(new Tyre("rubber"),5);
		
		

	}
	
	
	public static void meth(Bounceable b,int multiple)
	{
		
		b.showDefaultBounceFactor();
		b.setBounceMultiple(multiple);
		b.bounce();
	
		((Rollable)b).roll();
	}
	
	public static void meth1(Rollable r,int multiple)
	{
		r.setRollMultiple(multiple);
		r.roll();
		
		if( r instanceof Bounceable)
	    	((Bounceable)r).bounce();
	}
	

}