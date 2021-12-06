import java.util.Scanner;

public class LDP7144 {
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			int numero;
			
				System.out.println("Digite um número inteiro: ");
				numero = entrada.nextInt();

	                        if(numero % 2 == 0){
	                                 System.out.println("PAR ");
	                                 }
				else{
					System.out.println("ÍMPAR");
				}
				if(numero<0){
					System.out.println(" E NEGATIVO");
					
				}else{ 
					System.out.println(" E POSITIVO"); 
	}
	}
	}
