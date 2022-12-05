package collections;
import java.util.*;

public class ArrayListEx {
	public static void main(String[] args) {
//		List lst = new ArrayList();
		List<Integer> lst = new ArrayList<Integer>();
		
		lst.add(100);
		lst.add(50);
//		lst.add("java");
		lst.add(80);
		lst.add(90);
		System.out.println(lst);
		
		System.out.println(lst.size());

        int no = (int) lst.get(0); //  new Integer(100).intvalue() -- auto-unboxing - unbox Integer object to its primitive value
        System.out.println("value at index position 0:"+no);

        System.out.println(lst); 
        System.out.println(lst.size());

        // remove at index
         lst.remove(0);
         System.out.println(lst);   
         System.out.println(lst.size());

         // replace value at index
         lst.set(1,150);
         System.out.println(lst); 
         System.out.println(lst.size());
		
		no = (int)lst.get(0);
		
		lst.add(70);
		System.out.println(lst); 
        System.out.println(lst.size());
        
        boolean isPresent = lst.contains(150);
        System.out.println("150 Present or not? = "+isPresent);
		
	}
}
