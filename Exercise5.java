/*5 Escreva um programa em Java que exiba verdadeiro ou falso se os dois números inseridos pelo usuário são positivos ou negativos*/

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner texto = new Scanner (System.in);
		
		int num1, num2; 
		
		System.out.println("Digite o primeiro número");
		num1 = texto.nextInt();
		System.out.println("Digite o segundo número");
		num2 = texto.nextInt();
		
		
		if (num1 > 0 && num2 > 0) {
			System.out.println("Os dois números são maiores do que 0 (Positivo)");
		}
		if (num1 < 0 && num2 < 0) {
			System.out.println("Os dois números são menores do que 0 (Negativo)");
		}
		if (num1 > 0 && num2 < 0 || num1 < 0 && num2 > 0) {
			System.out.println("Os dois numéros são diferentes");
		}
		
	}
			
}