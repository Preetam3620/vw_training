package collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		SortedSet<String> sortedSet = new TreeSet<String>();
		
		sortedSet.add("Tony");
		sortedSet.add("Steve");
		sortedSet.add("Bruce");
		sortedSet.add("Clark");
		
		System.out.println(sortedSet);
		
		sortedSet.add("Peter");
		System.out.println(sortedSet);
		System.out.println(sortedSet.size());
		
		System.out.println(sortedSet.contains("Tony"));
	}
}
