package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import basicTest.MyUtils;
 
public class SampleTest {
 
    @Tag("testing")
    @Test
    void test() {
        assertEquals(4,2+2,"test in SampleTest");
    }

    @Test
    void test1() {
        assertEquals(6,3*2,"test1 in SampleTest");
    }
    
    @DisplayName("test for add() from MyUtils")     
    @Test
    void addTest() {
    	MyUtils obj = new MyUtils();
    	int result = obj.add(4, 6);
    	assertEquals(10,result, "add test");
    }
    
}