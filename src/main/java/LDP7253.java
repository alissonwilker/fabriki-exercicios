import java.io.PrintStream;

public class LDP7253 {
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int[] numero = new int[100];
		for(int i = 0; i<numero.length;i++) {
			numero[i]= i+1;
			if(numero[i]%10 == 0) {
				saida.println("Multiplo de 10");				
			}
			
		}
		

	}

}
