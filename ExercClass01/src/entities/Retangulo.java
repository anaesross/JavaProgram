package entities;

public class Retangulo {
	
	public double largura;
	public double altura;
	public double area;
	public double perimetro;
	public double diagonal;
	
	public double area() {
		area = altura * largura;
		return area;
	}
	
	public double perimetro() {
		perimetro = 2 * (altura + largura);
		return perimetro;
	}
	
	public double diagonal() {
		diagonal= Math.sqrt(altura * altura + largura * largura); 
		return diagonal;
	}
	
	
	
}
