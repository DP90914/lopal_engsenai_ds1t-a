package br.com.engsenai.model;

public class trapezio {
	private double area;
	private double altura;
	private double baseMaior;
	private double baseMenor;
	
	private double calcularAreaDoTrapezio() {
		area = (baseMaior + baseMenor) * altura/2;
		return area;
	}
}
