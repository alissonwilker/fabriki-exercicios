import java.io.IOException;
import java.util.Scanner;

public class LDP7144 {
 
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int num = leitor.nextInt();
		
		if (num % 2 == 0 && num >= 0){
			System.out.println("PAR E POSITIVO");
		} else if (num % 2 == 0  && num < 0) {
		    System.out.println("PAR E NEGATIVO");
		} else if (num % 2 != 0 && num >= 0) {
		    System.out.println("ÍMPAR E POSITIVO");
		} else if (num % 2 != 0 && num < 0) {
		    System.out.println("ÍMPAR E NEGATIVO");
		}
	}
}
