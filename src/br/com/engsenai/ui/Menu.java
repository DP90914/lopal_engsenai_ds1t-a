package br.com.engsenai.ui;

import br.com.engsenai.model.Quadrado;
import java.util.Scanner;

public class Menu {
	public void criarMenu() {

		Scanner leitor = new Scanner(System.in);

		
		System.out.println("CALCULADORA DE POLIGONAOS");
		System.out.println("-------------------------");
		System.out.println("1 - QUADRADO");
		System.out.println("2 - RETANGULO");
		System.out.println("3 - TRIANGULO");
		System.out.println("4 - TRAPEZIO");
		System.out.println("5 - CIRCUNFERENCIA");
		System.out.println("6 - SAIR");
		System.out.println("-------------------------");
		System.out.print("ESCOLHA UMA OPCAO(1 - 6):");
		int opcao = leitor.nextInt();
		leitor.close();


		if (opcao == 1) {
			System.out.print("ESCOLHER LADO: ");


		}
		if (opcao == 2) {
			System.out.print("ESCOLHER BASE: ");
			System.out.print("ESCOLHER ALTURA: ");

		}
		if (opcao == 3) {
			System.out.print("ESCOLHER BASE:");
			System.out.print("ESCOLHER ALTURA:");

		}
		if (opcao == 4) {
			System.out.print("ESCOLHER BASE MAIOR:");
			System.out.print("ESCOLHER BASE MENOR:");

		}
		if (opcao == 5) {
			System.out.print("ESCOLHER RAIO:");

		}
		if (opcao == 6) {

		}
	}

}