import java.io.PrintStream;
import java.util.Scanner;
public class LDP7141 {
			private static Scanner entrada = new Scanner(System.in);
			private static PrintStream saida = System.out;
		public static void main(String[] args) {
		
		int pesoentrada = entrada.nextInt();
		int excedente = pesoentrada - 50;
		
		if ( pesoentrada > 50) {
			int multa = excedente * 4;
			saida.println("excedente = " + excedente);
			saida.println("multa = " + multa);
		} else {
			System.out.println("excedente = 0");
			System.out.println("multa = 0");
		}
	}

}
