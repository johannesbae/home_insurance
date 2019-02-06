package Calculator;

import Entity.Productmanager;

public class Calculator {
	
	Productmanager pm = new Productmanager();

	public int initCalculation(String type, int size) { //(ausgewähltes Produkt, Wohnfläche in m²)
		int insurance = 0;
		switch (type) {
			case "Kompakt": insurance= this.calculateInsurance(size, pm.findProductbyName(type).getPrice()); 
			break;
			
			case "Optimal":	insurance= this.calculateInsurance(size, pm.findProductbyName(type).getPrice()); 
			break;
			
			case "Test":	insurance= this.calculateInsurance(size, 100); 
			break;
			
		}
		
		return insurance; //berechnete Versicherungssumme
	}
	
	public int calculateInsurance(int size, int price) {	//Berechnung der Versicherungssumme
		System.out.println("Die Versicherungssumme betr\u00E4gt: "+ size*price+"\u20AC");
		return size*price;
	}

}
