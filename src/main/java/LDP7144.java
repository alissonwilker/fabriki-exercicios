import java.io.PrintStream;
import java.util.Scanner;

public class LDP7144 {
	public static Scanner entrada = new Scanner(System.in);
	public static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = entrada.nextInt();
		
		if(num>=0) {
			if(num%2==0) {
				saida.println("PAR E POSITIVO");
			}else {
				saida.println("ÍMPAR E POSITIVO");
			}
			
			
			
			
			
		}else {
			if(num%2==0) {
				saida.println("PAR E NEGATIVO");
			}else {
				saida.println("ÍMPAR E NEGATIVO");
			}
			
		}

	}

}
