package Entity;

import java.util.ArrayList;

public class Productmanager {

	
	public static ArrayList <Product> productList= new ArrayList <Product>();
	
	public Product findProductbyName(String type) {
		
		Product result = null;
		for (Product i: productList) {
			if (type==i.getType()) {
				result= i;
			}
		}
		return result;
	}
}
