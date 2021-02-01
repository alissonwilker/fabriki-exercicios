import java.util.Scanner;

public class LDP7251 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numeroMaior = 0;
		int numeroMenor = 0;
		int i = 0;
		
		do {
			int n = entrada.nextInt();
			if (n == 0) {
				break;
			}
			if (i == 0) {
				numeroMaior = n;
				numeroMenor = n;
				i++; 
			} 
			  else if (n > numeroMaior) {
				numeroMaior = n;
			} else if (n < numeroMenor) {
				numeroMenor = n;
			}
		}while(true);
			System.out.println("maior = " + numeroMaior);
	}	
}
