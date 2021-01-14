import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
	
		Scanner sc =  new Scanner(System.in);
		
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Você digitou: " + x);
		System.out.println(y);
		System.out.printf("%.2f\n" , z);
		sc.close();

	}

}