package exceptionHandling;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.sql.SQLException;


public class TryWithResource {


    public static void main(String[] args)
    {



        System.out.println("program execution strarted..");

        String fileName = "d://src//abstractexample//AbstractEx.java";
        readFromFile(fileName);

        System.out.println("remaining program of main method executes..");
    }


    public static void readFromFile(String f)
    {


        try(FileReader fr = new FileReader(f); ) //only instance of classes tht implement AutoClosable interface could be passed here
        {


          System.out.println((char)fr.read());


        }
        catch(FileNotFoundException e)
        {

        //    e.printStackTrace();

            System.err.println("There is some issue while opening a file:AbstractEx.java");
            return;
        }
        catch(IOException e)
        {
            //e.printStackTrace();
            System.out.println("File opened successfully but there's some issue while reading from a file:AbstractEx.java");
            return;
        }



    System.out.println("remaining program of the readFromFile function  after close file continues..");
   } //end of function
 
}