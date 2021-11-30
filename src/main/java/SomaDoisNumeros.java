import java.util.Scanner;

public class SomaDoisNumeros {
		public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2, soma;
		
		//System.out.println();
		
		num1 = teclado.nextInt();
		
		//System.out.println();
		
		num2 = teclado.nextInt();
		
		soma = num1 + num2;
		
		System.out.println(soma);  
	}

