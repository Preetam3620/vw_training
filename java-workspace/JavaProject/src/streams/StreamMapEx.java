package streams;
 
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 
public class StreamMapEx {
 
    public static void main(String[] args) {


        List<Integer> lst = new ArrayList<Integer>();
        lst.add(20);
        lst.add(30);
        lst.add(5);
        lst.add(41);
        lst.add(6);
        lst.add(5);
        lst.add(30);

        System.out.println(lst);

        lst.stream().map(x->x*10).forEach(x->System.out.print(x + " "));


        System.out.println("\nmultiply each element of list ten times and convert it into another set");
        Set<Integer> st = lst.stream().map(x->x*10).collect(Collectors.toSet());

        st.forEach(x->System.out.print(x + " ")); //no duplicates

        //only even elements should be doubled and converted to list

        System.out.println("\nfilter even elements in the list and double them and convert to new/another list");
        List<Integer> lstint =lst.stream().filter(x->x%2==0).map(x->x*2).collect(Collectors.toList());

        lstint.forEach(x->System.out.print(x + " "));
        System.out.println();

        int[] arr = {20,30,5,41,6,5,30};
        List<Integer> lt = Arrays.asList(20,30,5,41,6,5,30);
        lst.stream().map(x->x*10).forEach(x->System.out.print(x + " "));
        //once converted to list you can call stream related functions on it using stream function

        //no need of collection and directly create stream as below
        Stream<Integer> strm = Stream.of(20,11,5,6,5);
        long odd_ele = strm.filter(x->x%2==1).count();
        System.out.println("\nno of odd elements:"+odd_ele);

    }
 
}