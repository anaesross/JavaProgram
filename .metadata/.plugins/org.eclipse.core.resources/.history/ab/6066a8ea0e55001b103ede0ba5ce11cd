package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	//criando um método construtor
	public Product(String name, double price, int quantity) {
		this.name = name; //this.name referencia o próprio objeto - linha 5 - name referencia o parametro passado na função
		this.price = price;
		this.quantity = quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}