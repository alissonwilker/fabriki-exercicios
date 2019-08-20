import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int valor;int ex;int multa; 
		
		valor= entrada.nextInt();
		
		if(valor>50) {
			ex = valor-50;
			saida.println("execedente = "+ ex);
			
			multa = 4*ex;
			saida.println("multa = "+ multa);
			
		}else if(valor<=50) {
		saida.println("excedente = 0"  );
		saida.println("multa = 0");
		};

	}

}
