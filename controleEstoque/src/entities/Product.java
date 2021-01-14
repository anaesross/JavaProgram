package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity; //atributo da classe
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts( int quantity) { //parâmetro recebido - quantity
		this.quantity += quantity; //auto referencia para o objeto quantity (linha 7)
	}
	
	public void removeProducts( int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		//return name + ", $" + price + ", " + quantity + "units, Total: $" + totalValueInStock();
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f",totalValueInStock());
	}
}
