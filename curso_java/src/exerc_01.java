public class exerc_01 {

	public static void main(String[] args) {
		String produto1 = "Computador";
		String produto2 = "Cadeira Gamer";
		int idade = 32;
		int codigo = 5290;
		char genero = 'F';
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
				
		System.out.printf("Produtos:\n" + produto1 + ", o valor � " + preco1 + "\n" + produto2 + ", o valor � " + preco2 + "\n");
		System.out.println("Registro: " + idade + " anos, c�digo: " + codigo + " e g�nero " + genero);
		System.out.printf("%.2f\n", medida);  
	}

}


