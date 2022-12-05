package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import customException1.Account;
import basicTest.MyUtils;

public class TestMyUtils {


	
	@DisplayName("test add method of MyUtils class")
	@Test
	void testMyUtils() {
		
		MyUtils ob = new MyUtils();
		int result = ob.add(10,20);
		//System.out.println(result);
		assertEquals(30,result,"add method of MyUtils failed");
	}

}
