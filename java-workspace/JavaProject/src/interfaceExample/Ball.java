package interfaceExample;

public class Ball implements Bounceable,Rollable {
	
	private int bf;
	
	private int rf;
	
	private String color;
	
	
	
   public Ball(String ballcolor) {
		super();
		this.color=ballcolor;
	}



    public String getColor() {
	return color;
}



  public void setColor(String color) {
	   this.color = color;
   }



    @Override
	public void bounce()
    {
       System.out.println("It's a "+ this.color+ " color ball bouncing with bounce factor = "+this.bf);	
    }
	
    
    @Override
	public void setBounceMultiple(int multiple)
	{
		
		this.bf = Bounceable.BOUNCE_FACTOR * multiple;
		
	}
	
	
    @Override
	public void roll()
	{
    	 System.out.println("It's a "+ this.color+ " color ball rolling with roll factor = "+this.rf);	
	}
	
    @Override
	public void setRollMultiple(int multiple)
	{
    	this.rf = Rollable.ROLL_FACTOR * multiple;
	}
	
	

}


