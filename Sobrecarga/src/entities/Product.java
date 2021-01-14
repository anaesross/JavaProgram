package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	//construtor padr�o
	public Product() {
	}
	//criando dois m�todos semelhantes , sobrecarga = disponibilizar mais de uma vers�o da mesma opera��o
	//a diferen�a entre elas v�o ser os par�metros
	public Product(String name, double price, int quantity) {
		this.name = name; //this.name referencia o pr�prio objeto - linha 5 - name referencia o parametro passado na fun��o
		this.price = price;
		this.quantity = quantity;
	}
	
	//criando outro m�todo - sobrecarga
	public Product(String name, double price) {
		this.name = name; //this.name referencia o pr�prio objeto - linha 5 - name referencia o parametro passado na fun��o
		this.price = price;
		//this.quantity = 0; //opcional, ele ja cria o atributo com valor 0 (int)
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