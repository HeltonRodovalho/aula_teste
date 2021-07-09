package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity)  {
		this.quantity += quantity; 
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
		+ ", $ "
		+ String.format("%.2f", price)
		+ ", "
		+ " units, Total: $ "
		+ String.format("%.2f", totalValueInStock());
		
		
		
	}

	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
}
