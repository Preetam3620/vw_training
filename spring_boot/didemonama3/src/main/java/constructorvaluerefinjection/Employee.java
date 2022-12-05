package constructorvaluerefinjection;



import com.util.BirthDate;

public class Employee 
{
	private String firstname="dude";
	private String lastname="dude";
	private BirthDate birthdate=null;

	public Employee()
	{
		System.out.println("inside default constructor of Employee()");
	}

    public Employee(String firstname)
	{
		System.out.println("inside constructor Employee(String)");
		this.firstname = firstname;
	}
	
	public Employee(String firstname,String lastname)
	{
		System.out.println("inside constructor Employee(String,String)");
		this.firstname = firstname;
		this.lastname = lastname;
	}

    public Employee(String firstname,String lastname,BirthDate birthdate)
	{
		System.out.println("inside constructor Employee(String,String,Date)");
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthdate = birthdate;
	}

    
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public BirthDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(BirthDate birthdate) {
		this.birthdate = birthdate;
	}

	public String toString()
	{
		return "FullName :: "+ this.firstname + this.lastname + "\n" + "BirthDate :: " + this.birthdate.toString();
	}

	
}