 

import java.util.Scanner;

public class SomaDoisNumeros {
		public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2, soma;
		
		System.out.println("Digite um número inteiro: ");
		num1 = teclado.nextInt();
		
		System.out.println("Digite um outro número inteiro: ");
		
		num2 = teclado.nextInt();
		
		soma = num1 + num2;
		
		System.out.println(soma);

		
		
		
	}
