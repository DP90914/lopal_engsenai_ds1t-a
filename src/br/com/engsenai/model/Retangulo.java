package br.com.engsenai.model;

public class Retangulo {
	private double base;
	private double altura;
	
	public void setBase(double base) {
		if(base<0){
			this.base = 1;
		} else {
			this.base = base;
		}
	}
	
	public double getBase() {
		return this.base;
	}
	
	public void setLado(double altura) {
		if(altura<0){
			this.altura = 1;
		} else {
			this.altura = altura;
		}
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	private double calcularArea() {
		double area = altura * base;
		return area;
	}
	
	private double calcularPerimetro() {
		double perimetro = 2 * altura + 2 * base;
		return perimetro;
	}
	public void mostrarDados(){
		System.out.println("------------------------------------------");
		System.out.println("DADOS DO RETANGULO");
		System.out.println("------------------------------------------");
		System.out.println("altura:    " + altura);
		System.out.println("BASE:      " + base);
		System.out.println("ÁREA:      " + calcularArea());
		System.out.println("PERÍMETRO: " + calcularPerimetro());
		System.out.println("------------------------------------------");
	}

}
