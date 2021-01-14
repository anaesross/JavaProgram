package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		
		System.out.println("Insira a medida da altura do retângulo: ");
		retangulo.altura = sc.nextDouble();
		System.out.println("Insira a medida da largura do retângulo: ");
		retangulo.largura = sc.nextDouble();
		
		System.out.printf("Area = " + retangulo.area() + "\nPerimetro = " + retangulo.perimetro() + "\nDiagonal = " + retangulo.diagonal());
		
		sc.close();

	}

}
