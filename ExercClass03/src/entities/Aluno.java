package entities;

public class Aluno {
	
	public String nome;
	public double n1;
	public double n2;
	public double n3;
	public double mediaFinal;
	
	public double media() {
		double mediaFinal = n1+n2+n3;
		if(mediaFinal > 60) {
			System.out.println("Nota final: " + mediaFinal + "\nPassou!");
		} else {
			double pontos = 60 - mediaFinal;
			System.out.println("Nota final: " + mediaFinal + "\nFalhou" + "\nFaltou:" + pontos + " pontos");
		}
		
		return 0.0;
	}
}
