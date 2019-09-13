import java.io.PrintStream;

public class LDP7253 {
	private static PrintStream saida  = System.out;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10,i;

		for (i = 1; i <= 100; i++) {
			if(i % num ==0  ) {
				saida.println("Multiplo de 10");
			}
			
		}
	}

}
