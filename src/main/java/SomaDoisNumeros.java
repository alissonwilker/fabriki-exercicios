package main;

import java.util.Scanner;

public class SomaDoisNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A+B);
		
		sc.close();
	}

}
