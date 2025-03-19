package br.com.engsenai.model;

public class Triangulo {
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
	
	public void setAltura(double altura) {
		if(altura<0){
			this.altura = 1;
		} else {
			this.altura = altura;
		}
	}
	public double getAltura() {
		return this.base;
	}
	
	private double calcularArea() {
		double area = altura * base / 2;
		return area;
	}
	
	public void mostrarDados(){
		System.out.println("------------------------------------------");
		System.out.println("DADOS DO TRIANGULO");
		System.out.println("------------------------------------------");
		System.out.println("ALTURA:    " + altura);
		System.out.println("BASE:      " + base);
		System.out.println("ÁREA:      " + calcularArea());
		System.out.println("------------------------------------------");
	}
	
}
