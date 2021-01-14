package entities;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto = 1000.00; 
	
	public double salarioBruto() {
		salarioBruto = salarioBruto - imposto;
		return salarioBruto;
	}
	public double salarioFinal() {
		double salarioTaxa = salarioBruto * (imposto/100);
		salarioTaxa = salarioBruto + salarioTaxa;
		return salarioTaxa;
	}
}
