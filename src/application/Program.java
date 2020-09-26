package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Calculador de índice de massa corporal - IMC");
		
		System.out.print("Digite sua altura em metros: ");
		double altura = sc.nextDouble();
		System.out.print("Digite seu peso em kg: ");
		double peso = sc.nextDouble();

		imprimirResultado(calcularIMC(altura, peso));

		sc.close();
	}

	static double calcularIMC(double altura, double peso) {
		return peso / Math.pow(altura, 2);
	}

	static void imprimirResultado(double imc) {
		System.out.println();
		if (imc < 18.5)
			System.out.println("Magreza");
		else if (imc < 24.5)
			System.out.println("Normal");
		else if (imc < 29.9)
			System.out.println("Sobrepeso");
		else if (imc < 39.9)
			System.out.println("Obesidade");
		else
			System.out.println("Obesidade grave");

		System.out.printf("Seu IMC: %.2f%n", imc);
	}

}
