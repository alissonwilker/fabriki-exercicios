package aula11;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
		int n=25, fat=1;
		System.out.println("número que deseja calcular o fatorial?" );
		n = input.nextInt();
		
		if(n<=25) {
			for (int i = 1; i <= n; i++) {
			fat = fat * n;	
		}
			System.out.println("Fatorial é: " +fat );
		}else {	
		
		System.out.println("número a partir de zero" );	

		}
	}
}
