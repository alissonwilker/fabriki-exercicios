import java.io.IOException;
import java.util.Scanner;

public class LDP7144_1 {
		public static void main(String[] args) {
			Scanner leitor = new Scanner(System.in);
			int numero;
			
				System.out.println("");
				numero = leitor.nextInt();

	            if(numero % 2 == 0){
	                                 System.out.print("PAR ");
	                                 }
				else{
					System.out.print("ÍMPAR");
				}
				if(numero<0){
					System.out.print(" E NEGATIVO");
					
				}else{ 
					System.out.print(" E POSITIVO"); 
				}
	}
}
