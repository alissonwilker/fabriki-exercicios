import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int codigo;
		int N,E=0,salarioTotal,salarioExcedente;
		
		
			E=0;
			salarioTotal=10;
			salarioExcedente= salarioTotal*2;

			
			codigo = entrada.nextInt();

			
			N = entrada.nextInt();

			if(N>50){
				E = N-50;
				salarioExcedente = E*salarioExcedente;
				salarioTotal = N*salarioTotal;
			}

			
		


	}

}
