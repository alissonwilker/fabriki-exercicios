import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		int N=0;
		N = teclado.nextInt();
		double fatorial=1.0;
		teclado.close();
		
		if(N>=0 && N<=25) {
			
			for (int i=0; i<N; i++) {
				
				fatorial *= (i+1);
	
			}
			
			System.out.println(fatorial);
		}
		
	}
}
