import java.io.IOException;
import java.util.Scanner;

public class LDP7144 {
		public static void main(String[] args) throws IOException {
			Scanner leitor = new Scanner(System.in);
			int num = leitor.nextInt();

	            if(num % 2 == 0){
	            System.out.print("PAR");
	            }
				else{
				System.out.print("ÍMPAR");
				}
				if(num <0){
				System.out.print(" E NEGATIVO");
				}
				else{ 
				System.out.print(" E POSITIVO"); 
		}
	}
}
