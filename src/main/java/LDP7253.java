import java.io.PrintStream;

public class LDP7253 {
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if(i%10==0) {
			
		  saida.println("Multiplo de 10");
			}
		}
	
	}
}
