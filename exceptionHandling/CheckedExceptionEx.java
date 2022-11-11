package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionEx {
	
	
	public static void main(String[] args)
	{
		System.out.println("program execution strarted..");
		
		String fileName = "d://src//abstractexample//AbstractEx.java";
		readFromFile(fileName);
		
		System.out.println("remaining program of main method executes..");
	}
	
	
	public static void readFromFile(String f)
	{
       FileReader fr=null;
		
		try
		{
		   fr = new FileReader(f);
		
		  System.out.println((char)fr.read());
		
		 
		}
		catch(FileNotFoundException e)
		{
			
		//	e.printStackTrace();
			
			System.err.println("There is some issue while opening a file:AbstractEx.java");
			return;
		}
		catch(IOException e)
		{
			//e.printStackTrace();
			System.out.println("File opened successfully but there's some issue while reading from a file:AbstractEx.java");
			return;
		}
		finally
		{
		
		System.out.println("remaining program of the readFromFile function continues..");
		
		
		
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