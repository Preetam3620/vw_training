package interfaceExample;

public class Tyre implements Rollable {
	
	//private int bf;
	
	private int rf;
	
	private String material;
	
	
	
   public Tyre(String material) {
		super();
		this.material=material;
	}



  
    public String getMaterial() {
	    return material;
     }


    public void setMaterial(String material) {
    	this.material = material;
    }


/*
 * @Override public void bounce() { System.out.println("It's a "+ this.color+
 * " color ball bouncing with bounce factor = "+this.bf); }
 * 
 * 
 * @Override public void setBounceMultiple(int multiple) {
 * 
 * this.bf = Bounceable.BOUNCE_FACTOR * multiple;
 * 
 * }
 */	
	
    @Override
	public void roll()
	{
    	 System.out.println("It's a Tyre of material "+ this.material+ " rolling with roll factor = "+this.rf);	
	}
	
    @Override
	public void setRollMultiple(int multiple)
	{
    	this.rf = Rollable.ROLL_FACTOR * multiple;
	}
	
	

}


