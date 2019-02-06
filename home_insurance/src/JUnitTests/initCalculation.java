package JUnitTests;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import Calculator.Calculator;
import Entity.Product;

public class initCalculation {

	@Test
	public void test() {
		Product p1= new Product(1,"Kompakt",650);
		Product p2= new Product(2,"Optimal",700);
		
		Calculator test= new Calculator();
		int output = test.initCalculation("Kompakt", 100);
		assertEquals(65000, output);
		
		output = test.initCalculation("Optimal", 100);
		assertEquals(70000, output);
	}

}
