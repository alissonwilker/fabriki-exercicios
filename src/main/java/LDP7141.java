import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	public static void main(String[] args) {
		
		int valor = entrada.nextInt();
		int reg = 50;
		if(valor>=reg) {
			int execed = valor -reg;
			System.out.println("excedente = " + execed);
			int multa = execed*4;
			saida.println("multa = " + multa);
			
		}else if (valor<reg) {
			int execed = 0;
			System.out.println("excedente = " + execed);
			int multa=0;
			saida.println("multa = " + multa);
		}
	}

}
