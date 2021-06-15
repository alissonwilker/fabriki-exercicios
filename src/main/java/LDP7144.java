package impar_par2;

import java.util.Scanner;

public class LDP7144 {
public static void main(String[] args) {	
	
	Scanner num = new Scanner( System. in );
	System.out.print("Informe um número inteiro: ");
	String aa= num.nextLine();
	
	try
	{ int a = Integer.parseInt(aa);
	if ((a % 2 == 0) && (a>=0)) {
		System.out.println("PAR E POSITIVO");
		} else if ((a % 2 == 0) && (a<0)) {
		System.out.println("PAR E NEGATIVO");
		} else if ((a % 2 != 0) && (a>0)) {
			System.out.println("ÍMPAR E POSITIVO");
		} else if ((a % 2 != 0) && (a<0)) {
			System.out.println("ÍMPAR E NEGATIVO");
		} 
	}
	   catch (NumberFormatException ex){
		   System.out.print("número inválido");;
        }
		

}}
