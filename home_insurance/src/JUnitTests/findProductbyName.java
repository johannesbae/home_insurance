package JUnitTests;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import Entity.Product;
import Entity.Productmanager;

public class findProductbyName {

	@Test
	public void test() {
		
		Product p1= new Product(1,"Kompakt",650);
		Product p2= new Product(2,"Optimal",700);
		
		Productmanager test= new Productmanager();
		Product output = test.findProductbyName("Kompakt");
		assertEquals("Kompakt", output.getType());
		
		output = test.findProductbyName("Optimal");
		assertEquals("Optimal", output.getType());
		
	}

}
