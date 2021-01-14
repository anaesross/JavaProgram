package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//double xA, xB, xC, yA, yB, yC;
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Entre com as 3 medidadas do tri�ngulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com as 3 medidas do tri�ngulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area(); //chamando m�todo da classe tri�ngulo para o objeto x
		
		double areaY = y.area();
		
		
		System.out.printf("�rea do tri�ngulo X: %.4f\n" , areaX);
		System.out.printf("�rea do tri�ngulo Y: %.4f\n" , areaY);
		
		if( areaX > areaY) {
			System.out.println("Maior �rea � o X");
		} else {
			System.out.println("Maior �rea � o Y");
		}
		
		sc.close();
	}

}
