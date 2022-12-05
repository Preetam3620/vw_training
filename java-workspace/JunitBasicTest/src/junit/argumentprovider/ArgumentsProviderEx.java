package junit.argumentprovider;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.ArgumentsSource;

class ArgumentsProviderEx {

	
	@ParameterizedTest
	@ArgumentsSource(BlankStringsArgumentsProvider.class)
	void isEmpty_ShouldReturnTrueForEmptyStringsArgProvider(String input) {
	    assertTrue(input.isEmpty());
//		 assertTrue(input.isBlank());
	}
	
	
	}

