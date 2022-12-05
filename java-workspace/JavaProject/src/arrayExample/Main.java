package arrayExample;

public class Main {
 
    public static void main(String[] args) {



        int[]  arr;
          arr = new int[5];

        //int[] arrx = new int[5];   // array object of int primitives

         //initialize the array
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=i;
        }

        //iterate the array
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }


        System.out.println("iterate using for each loop:");
        //iterate array using for-each loop
        for(int v: arr)
        {
            System.out.println(v);    
        }






        String[] arr1 = new String[3]; // array object of String references 

        arr1[0] = "Namrata";   // arr1[0]= new String("namrata");
        System.out.println(arr1[0].toLowerCase());

        arr1[1]="CoreJava";

        for(String s:arr1)
        {
           System.out.println(s);

           if(s!=null)
           {
           System.out.println(s.toLowerCase());
           System.out.println(s.length());
           }
        }

 
    }
 
}