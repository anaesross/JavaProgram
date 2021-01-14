package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cronograma;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Cronograma cron = new Cronograma();
		
		System.out.println("Entre com o dia de inicio da vacinação: ");
		cron.dia = sc.next();
		System.out.println("Entre com o horário da vacinação: ");
		cron.hora = sc.next();
		
		System.out.println(cron.vacinacao());
		
		sc.close();

	}

}
