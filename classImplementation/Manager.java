package classImplementation;

public class Manager extends Employee {

    private int teamSize;
    private String mgrType;
    private double commission;


    public Manager()
    {  //super();
        System.out.println("no args/0 args Manager constructor called...");
    }


    public Manager(int id,String empname,double salary,int deptno,int teamSize,String mgrType,double commission)
    {
        super(id,empname,salary,deptno);

        System.out.println("Parameterized Manager constructor called...");

        this.mgrType = mgrType;
        this.teamSize = teamSize;
        this.commission = commission;
    }
 

    public int getTeamSize() {
        return teamSize;
    }
 

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
 

    public String getMgrType() {
        return mgrType;
    }
 

    public void setMgrType(String mgrType) {
        this.mgrType = mgrType;
    }
 

    public double getCommission() {
        return commission;
    }
 

    public void setCommission(double commission) {
        this.commission = commission;
    }

    //overriding 


    @Override
    public void display()
    {
        super.display();
        System.out.println(","+this.teamSize+","+this.mgrType+","+this.commission);
    }
 
    
 
}