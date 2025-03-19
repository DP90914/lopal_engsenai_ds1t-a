package br.com.engsenai.model;

public class Circunferencia {
	private double raio;
	
	public void setRaio(double raio) {
		if(raio<0){
			this.raio = 1;
		} else {
			this.raio = raio;
		}
	}
	
	public double getRaio() {
		return raio;
	}

	private double calcularArea() {
		double area = Math.PI * Math.pow(raio, 2);
		return area;
	}
	private double calcularCircunferencia() {
		double circunferencia = 2 * Math.PI * raio;
		return circunferencia;
	}
	public void mostrarDados(){
		System.out.println("------------------------------------------");
		System.out.println("DADOS DO CIRCULO");
		System.out.println("------------------------------------------");
		System.out.println("RAIO:           " + raio);
		System.out.println("AREA:           " + calcularArea());
		System.out.println("CIRCUNFERENCIA: " + calcularCircunferencia());
		System.out.println("------------------------------------------");
	}
}