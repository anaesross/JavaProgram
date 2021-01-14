package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n]; //arranjo bidimensional = matriz dois []
		//dois for um para percorrer as linhas e outro para percorrer as colunas
		for (int i = 0; i<n ; i++) {
			for (int j =0; j<n;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Valor da diagonal: ");//diagonal = valor da linha igual ao valor da coluna
		for (int i=0; i<n; i++) {
			System.out.println(mat[i][i] + " ");
		}
		sc.close();
		//acessar linhas por length:
//		for(int i = 0 ; i < mat.length; i++) {
		//acessar colunar com length:
//			for (int j = 0; j< mat[i].length;j++) {
				
//			}
//		}
	}

}
