import java.util.Scanner;

public class LDP7144 {
	  public static void main(String[] args) {
		  Scanner entrada = new Scanner(System.in);
			int num1 = entrada.nextInt();
			int resto;
			resto = num1 % 2;
		
			if((resto == 0) &&( num1 >= 0)) {				 
		  System.out.println( "PAR E POSITIVO" );				
			 }
			else if((resto == 0) && (num1<0)) {
			System.out.println( "PAR E NEGATIVO" );
			}
			else if((resto !=0) && ( num1 < 0)) {
				System.out.println( "ÍMPAR E NEGATIVO" );
				}
			else if((resto !=0) && (num1 > 0)) {
				System.out.println( "ÍMPAR E POSITIVO" );
				}

	  }
		   
	 }
