package br.com.engsenai.model;

public class trapezio {
	private double altura;
	private double baseMaior;
	private double baseMenor;
	
	public void setBaseMaior(double baseMaior) {
		if(baseMaior<0){
			this.baseMaior = 1;
		} else {
			this.baseMaior = baseMaior;
		}
	}
	public double getBaseMaior() {
		return this.baseMaior;
	}
	
	public void setBaseMenor(double baseMenor) {
		if(baseMenor<0){
			this.baseMenor = 1;
		} else {
			this.baseMenor = baseMenor;
		}
	}
	
	public double getBaseMenor() {
		return this.baseMenor;
	}
	
	public void setAltura(double altura) {
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
		double area = (baseMaior + baseMenor) * altura/2;
		return area;
	}
	public void mostrarDados(){
		System.out.println("DADOS DO TRAPEZIO");
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		System.out.println("ALTURA:    " + altura);
		System.out.println("BASE MAIOR:" + baseMaior);
		System.out.println("BASE MENOR:" + baseMenor);
		System.out.println("ÁREA:      " + calcularArea());
		System.out.println("------------------------------------------");
	}
}