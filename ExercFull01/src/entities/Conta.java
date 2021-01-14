package entities;

public class Conta {
	private  int numConta;
	private  String nomeTitular;
	private  double depositoInicial;
	
	
	public Conta(int numConta, String nomeTitular, double depositoInicial) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		deposito(depositoInicial);
	}
	
	public Conta(int numConta, String nomeTitular) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
	}

	public int getNumConta() {
		return numConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}


	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}


	public double getSaldoConta() {
		return depositoInicial;
	}
	
	public void deposito(double montante) {
		depositoInicial += montante;
	}
	
	public void saque(double montante) {
		depositoInicial -= montante + 5.0;
	}
	
	public String toString() {
		return "Conta " + numConta + ", Titular " + nomeTitular + ", Saldo: R$ " + String.format("%.2f", depositoInicial);
	}
	
}
