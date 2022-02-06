package aula11;

import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	
		byte n; 
		BigInteger fatorial = BigInteger.ONE;
		System.out.println("número que deseja calcular o fatorial?" );
		n = entrada.nextByte();
		
		
			for (byte i = 2; i <= n; i++) {
			fatorial = fatorial.multiply(BigInteger.valueOf(i));	
		}
			System.out.println("Fatorial é: " +fatorial );
		
		
		System.out.println("número até 25" );	
		
		
		
		}
	}
