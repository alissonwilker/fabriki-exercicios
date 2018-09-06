import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int codigo;
		int N,E=0,salarioTotal,salarioExcedente;
		
		
			E=0;
			salarioTotal= 0;
			salarioExcedente= 0;

			
			codigo = entrada.nextInt();

			
			N = entrada.nextInt();
			
					
			
			
			if(N>50){
				
				E = N - 50;
				salarioExcedente = E * 20;
				salarioTotal = ((N - E) * 10) + salarioExcedente;
				
			}
			else{
				salarioTotal = (N * 10);
			}
			saida.println("codigo = " + codigo);
			saida.println("salarioExcedente = " + salarioExcedente);
			saida.println("salarioTotal = " + salarioTotal);

		


	}

}
