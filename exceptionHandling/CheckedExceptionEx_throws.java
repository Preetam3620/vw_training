package exceptionHandling;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class CheckedExceptionEx_throws {
	
	
	public static void main(String[] args)
	{
		
		
		
		System.out.println("program execution strarted..");
		
		String fileName = "d://src//abstractexample//AbstractEx.java";
		
		try
		{
		readFromFile(fileName);
		}
		catch(FileNotFoundException e)
		{
		 //e.printStackTrace();	
			System.err.println("There is some issue while opening a file:AbstractEx.java");
		}
		catch(IOException e)
		{
			//e.printStackTrace();
			System.err.println("File opened successfully but there's some issue while reading from a file:AbstractEx.java");
		}
		System.out.println("remaining program of main method executes..");
	}
	
	//handle or declare
	public static void readFromFile(String f) throws FileNotFoundException,IOException
	{
       FileReader fr=null;
		
		try
		{
		   fr = new FileReader(f);
		
		  System.out.println("file opened successfully..starting to read from the file");
		  System.out.println((char)fr.read());
		
		 
		}
		finally
		{
		
		System.out.println("inside finally..");
		
		
		
		try
		{
			
		System.out.println("checking and attempting to close the file resource..");
		if(fr!=null)	
		  fr.close();
		  
		}
		catch(IOException e)
		{
			//e.printStackTrace();
			
			System.out.println("problem while closing a file");
			
		}
	  }  //end of finally	
	System.out.println("remaining program of the readFromFile function  after close file continues..");
	}
}