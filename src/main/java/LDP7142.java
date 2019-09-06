import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142 {
	
	private static Scanner entrada = new Scanner (System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {

		int codigo = entrada.nextInt();
		int horas = entrada.nextInt();
		int extras = 0;
		int salE = 0;
		int salT = 0;
		
		if(horas <= 50) {
			salT = horas * 10;
			
		}else {
			extras = horas - 50;
			salE = extras * 20;
			salT = salE + 500;
			
		}
		
		saida.println("codigo = "+codigo);
		saida.println("salarioExcedente = "+salE);
		saida.println("salarioTotal = "+salT);
				
			
	}

}
