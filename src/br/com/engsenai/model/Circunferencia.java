package br.com.engsenai.model;

public class Circunferencia {
	private double raio;
	private double area;
	private double circunferencia;
	
	private double calcularAreaDaCircunferencia() {
		area = Math.PI * Math.pow(raio, 2);
		return area;
	}
	private double calcularCircunferenciaDaCircunferencia() {
		circunferencia = 2 * Math.PI * raio;
		return circunferencia;
	}
}
