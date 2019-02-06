package Calculator;

import Entity.Product;

public class Start {

	public static void main(String[] args) {
		Calculator calculator= new Calculator();
		
		Product p1= new Product(1,"Kompakt",650);
		Product p2= new Product(2,"Optimal",700);
			
		calculator.initCalculation("Optimal",100);
	}

}
