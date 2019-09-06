iimport java.io.PrintStream;
import java.util.Scanner;

public class LDP7142 {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida  = System.out;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codigo;
		int HorasTrabalhadas  = 0;
		int salarioExcedente =0;
		int salarioTotal  = 0;
		
		codigo = entrada.nextInt();
	    HorasTrabalhadas = entrada.nextInt();		
		
		if( HorasTrabalhadas >= 50) {
			salarioExcedente = HorasTrabalhadas - 50;
			salarioExcedente = salarioExcedente * 20;
			salarioTotal = salarioExcedente + 500;
				
		}
		else {
			salarioTotal = HorasTrabalhadas * 10;
		}
		
		saida.println("codigo = " + codigo );
		saida.println("salarioExcedente = " + salarioExcedente );
		saida.println("salarioTotal = " + salarioTotal);

	}

}
