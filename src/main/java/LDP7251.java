

import java.util.Scanner;

public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);
		public static void main(String[] args) {
		int ver=0;
		int num1, maior;
		maior = entrada.nextInt();
		num1 = maior;
		if (maior == 0) {
			ver = 1;
		}
		laco1:while (ver== 0) {
			if (num1 == 0) {
				if (num1 >= maior) {
					maior = num1;
				}
				break laco1;
			}
			else {
				if (num1 >= maior) {
					maior = num1;
				}
			}
		num1 = entrada.nextInt();
		}
	System.out.println("maior = "+maior);
	}
}
