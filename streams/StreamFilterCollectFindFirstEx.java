package streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamFilterCollectFindFirstEx {

	public static void main(String[] args) {

		List<Emp> lst = new ArrayList<Emp>();
		lst.add(new Emp(1,"Ram",12000));
		
		lst.add(new Emp(5,"Shyam",5000));
		lst.add(new Emp(2,"Lara",20000));
		
		Emp e = new Emp(4,"Meena",3000);
		lst.add(e);
		e = new Emp(4,"Meena",3000);
		lst.add(e);
		
		/*
		Emp em = findFirstEmpLara(lst);
		System.out.println(em);
		*/
		
		Emp em = findFirstEmpLara_Java8(lst);
		System.out.println(em);
		
		
		List<Emp> lst_emp = ListEmpSal_Java8(lst);
		System.out.println(lst_emp);
		
		
		List<Emp> lst_emp1 = lst.stream().filter(x->x.sal>5000).collect(Collectors.toList());
		System.out.println(lst_emp1);
		
		
		//filter, findAny, findFirst, orElse
		Emp e1 = lst.stream()
				   .filter(x->x.ename.equals("Lara"))
				   .findFirst().orElse(null);
		System.out.println(e1);
		
		
		 e1 = lst.stream()
				   .filter(x->x.ename.equals("Lara"))
				   .findAny().orElse(null);
		System.out.println(e1);
		
		//filter & collect	
		List<Emp> lst1 = lst.stream().filter(x->x.sal>5000)
				         .collect(Collectors.toList());
		
		          lst1.forEach(System.out::println);

	}
	
	static Emp findFirstEmpLara_Java8(List<Emp> lst)
	{
	
		 return lst.stream().filter(x->x.ename.equals("Lara")).findFirst().orElse(null);	 
	  
	}
	
	//from an existing list of employees,
	//create a separate list of those employees who have salary greater than 5000
	static List<Emp> ListEmpSal_Java8(List<Emp> lst)
	{
	
		 return lst.stream().filter(x->x.sal>5000).collect(Collectors.toList());	 
	  
	}
	

}
