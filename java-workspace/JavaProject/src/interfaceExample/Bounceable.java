package interfaceExample;

public interface Bounceable {
	
	int BOUNCE_FACTOR = 5;
	
	void bounce();
	
	void setBounceMultiple(int multiple);
	
	default void showDefaultBounceFactor()
	{
		System.out.println("The default bounce factor for Bouncebale type is "+ BOUNCE_FACTOR);
	}

}