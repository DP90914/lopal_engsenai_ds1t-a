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
	public void setLado(double altura) {
		if(altura<0){
			this.altura = 1;
		} else {
			this.altura = altura;
		}
	}
	
	private double calcularAreaDoTriangulo() {
		double area = altura * base / 2;
		return area;
	}
	
}
