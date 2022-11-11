package arrayExample;
import java.util.Scanner;
 
public class StringSplit {
 
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter comma seperated marks of 5 subjects of a student:");

        String strMarks =  sc.nextLine();

        String[] marks = strMarks.split(",");

        int total = 0;

        for(String s: marks)
        {
           int m = Integer.parseInt(s.trim());

           total+=m;

        }

        System.out.println("Total of all marks: "+strMarks+" is total marks= "+total);
        sc.close();
    }
 
}