package Entity;

public class Product {

	Integer id;
	String type;
	Integer price;
	
//	Productmanager pm= new Productmanager();
	
	public Product (Integer id, String type, Integer price) {
		
		this.id= id;
		this.type= type;
		this.price= price;
		Productmanager.productList.add(this);
	}	
	
	public Product() {}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	

}
