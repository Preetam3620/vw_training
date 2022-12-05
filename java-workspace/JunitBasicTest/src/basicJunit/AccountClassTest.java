package basicJunit;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import basicTest.*;

public class AccountClassTest {

    static Account ac;
    @BeforeAll
    static void setup() {
    	ac = new Account("Preetam Maske", 1002, 4000);
    }
    
    @DisplayName("withdraw_test1")
    @Order(1)
    @Test
    void withdrawTest1() {
    	try {
    		ac.withdraw(2000);    		
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    		
    	double balance = ac.getBalance();
    	assertEquals(2000, balance, "withdraw not working");
    }
    
    @DisplayName("withdraw_test2")
    @Order(2)
    @Test
    void withdrawTest2() {
    	assertThrows(InsufficientBalancException.class,()->ac.withdraw(5000));
    }
    
    @ParameterizedTest(name = "#{index}-Run test with args={0}")
    @Order(3)
    @ValueSource(doubles = {0, 3999, 2})
    void withdrawTest2(double args) {
    	Account ac1 = null;
    	ac1 = new Account("Preetam Maske", 1002, 4000);
    	try {
    		
    		ac1.withdraw(args);
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    	double bal = ac1.getBalance();
    	System.out.println("after withdrawing = "+ args + ", curr balance = " + bal);
    	assertTrue(bal >= 0);
//    	assertTrue(bal >= 0, "balance is less than zero");
    }
}
