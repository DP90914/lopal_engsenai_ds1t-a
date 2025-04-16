package br.com.engsenai.ui;
import br.com.engsenai.model.Quadrado;
import br.com.engsenai.model.Retangulo;
import br.com.engsenai.model.Trapezio;
import br.com.engsenai.model.Triangulo;
import br.com.engsenai.model.Circunferencia;
import java.util.Scanner;

public class Menu {
	public void criarMenu() {

		Scanner leitor1 = new Scanner(System.in);

		System.out.println("CALCULADORA DE POLIGONAOS");
		System.out.println("-------------------------");
		System.out.println("1 - QUADRADO");
		System.out.println("2 - RETANGULO");
		System.out.println("3 - TRIANGULO");
		System.out.println("4 - TRAPEZIO");
		System.out.println("5 - CIRCUNFERENCIA");
		System.out.println("6 - SAIR");
		System.out.println("-------------------------");
		System.out.println("ESCOLHA UMA OPCAO(1 - 6):");

		int opcao = leitor1.nextInt();

		if (opcao == 1) {
			Quadrado q1 = new Quadrado();

			System.out.println("ESCOLHER LADO: ");
			double escolherLado = leitor1.nextDouble();
			q1.setLado(escolherLado);
			q1.mostrarDados();

		}
		if (opcao == 2) {
			Retangulo r1 = new Retangulo();
			
			System.out.print("ESCOLHER BASE: ");
			double escolherBase = leitor1.nextDouble();
			r1.setBase(escolherBase);
			
			System.out.print("ESCOLHER ALTURA: ");
			double escolherAltura = leitor1.nextDouble();
			r1.setAltura(escolherAltura);
			
			r1.mostrarDados();
		}
		if (opcao == 3) {
			Triangulo t1 = new Triangulo();
			System.out.print("ESCOLHER BASE:");
			double escolherBase = leitor1.nextDouble();
			t1.setBase(escolherBase);
			
			System.out.print("ESCOLHER ALTURA:");
			double escolherAltura = leitor1.nextDouble();
			t1.setAltura(escolherAltura);
			t1.mostrarDados();

		}
		if (opcao == 4) {
			Trapezio t2 = new Trapezio();		
			System.out.print("ESCOLHER BASE MAIOR:");
			double escolherBaseMaior = leitor1.nextDouble();
			t2.setBaseMaior(escolherBaseMaior);
			
			System.out.print("ESCOLHER BASE MENOR:");
			double escolherBaseMenor = leitor1.nextDouble();
			t2.setBaseMenor(escolherBaseMenor);
			t2.mostrarDados();
		}
		if (opcao == 5) {
			Circunferencia c1 = new Circunferencia();
			System.out.print("ESCOLHER RAIO:");
			double escolherRaio = leitor1.nextDouble();
			c1.setRaio(escolherRaio);
			c1.mostrarDados();

		}
		if (opcao == 6) {
			System.exit(0);
		}

	}
}
