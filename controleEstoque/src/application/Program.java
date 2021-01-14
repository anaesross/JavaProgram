package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product(); // criando um objeto product da classe Product
		
		System.out.println("Enter Product data: ");
		
		System.out.print("Name: ");
		product.name = sc.nextLine();
		
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantity in Stock: ");
		product.quantity = sc.nextInt();
		
		
		//System.out.println(product.name + ", " + product.price + ", " + product.quantity);
		//System.out.println(product); - imprime o objeto
		//System.out.println(product.toString()); - transforma o objeto para string
		System.out.println("Product data: " + product);
		System.out.println("Enter the number of product to be added: ");
		int quantity = sc.nextInt(); // obter o valor inserido da quantidade
		product.addProducts(quantity); // faz o m�todo de adicionar o valor da classe product(atualiza��o da quantidade de product)
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of product to be removed: ");
		quantity = sc.nextInt(); // obter o valor inserido da quantidade
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		
		sc.close();

	}

}
