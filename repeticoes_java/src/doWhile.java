import java.util.Locale;
import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/* 1 - programa com while
		 * char resp = 's';
		while(resp != 'n') {
			System.out.println("Qual temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F =  9 * C / 5 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f\n", F);
			System.out.println("Deseja repetir? (s/n)");;
			resp = sc.next().charAt(0);
		} */
		//programa com do while
		char resp;
		do  {
			System.out.println("Qual temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F =  9 * C / 5 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f\n", F);
			System.out.println("Deseja repetir? (s/n)");;
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		sc.close();
	}

}
