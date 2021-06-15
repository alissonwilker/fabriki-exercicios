package impar_par2;

import java.util.Scanner;

public class LDP7144 {
public static void main(String[] args) {	
	int a = 0;
	Scanner num = new Scanner( System. in );
	System.out.print("Informe um número inteiro: ");
	a= num.nextInt();
	if ((a % 2 == 0) && (a>=0)) {
	System.out.println("PAR E POSITIVO");
	} else if ((a % 2 == 0) && (a<0)) {
	System.out.println("PAR E NEGATIVO");
	} else if ((a % 2 != 0) && (a>=0)) {
		System.out.println("IMPAR E POSITIVO");
	} else if ((a % 2 != 0) && (a<0)) {
		System.out.println("IMPAR E NEGATIVO");
	} 
	
}
}
