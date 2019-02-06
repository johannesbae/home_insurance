package JUnitTests;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import Calculator.Calculator;

public class calculateInsurance {

	@Test
	public void test() {
		Calculator test= new Calculator();
		int output = test.calculateInsurance(100, 650); 
		assertEquals(65000, output);
	}

}
