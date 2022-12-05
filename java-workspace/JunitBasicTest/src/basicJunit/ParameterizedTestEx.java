package basicJunit;

import static org.junit.Assert.*;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

public class ParameterizedTestEx {

	@ParameterizedTest
	@ValueSource(ints = {1,2,3}) 
	void test_int_array(int arg) {
		assertTrue(arg > 0);
	}
}
