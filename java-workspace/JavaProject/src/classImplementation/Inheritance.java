package classImplementation;

public class Inheritance {

	public static void main(String[] args) {
		

		 //create a Manager object and check sequence of constructor call
		 /*
		 Manager m = new Manager();
		 
		 m.display();
		 */
		
		 Manager m1 = new Manager(101,"Ronit Roy",45000,10,5,"Sales",12000);
		 m1.display();
		 
		 /*
		 System.out.println(m1.getTeamSize());
		 System.out.println(m1.getMgrType());
		 System.out.println(m1.getCommission());
		 */
		 
		 //Employee e = new Employee();
		 
	  // superclass ref = subclass object();
		 Employee ob = new Manager(102,"Manish Shah",15000,20,5,"HR",10000);
		// ob.display();
		 meth(ob);
		 
		 
		 ob = new Employee(103,"Jeet phatak",23000,20);
		// ob.display();
		 meth(ob);
		 
		 
		 meth(new Manager(100,"Preeti Ganguly",85000,20,15,"Development",12000));
		 meth(new Employee(90,"Saurav Ganguly",75000,20));
		 
	}
	
	
	public static void meth(Employee ob)
	{
		ob.display();
		ob.calcAnnSal();
	}

}