import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	public static void main(String[] args) {
		// Insira seu código aqui
		Scanner entrada = new Scanner(System.in); //atalho para incluir é control shift O
		int a = entrada.nextInt();
		int excedente;
		int multa;
		if (a>=50) {
			excedente = a-50;
			multa = excedente*4;
		}
		else {
			excedente = 0;
			multa = 0;
		}

		System.out.println("excedente = " + excedente);// digite sout depois control espaço e tudo isso já vai ser digitado automaticamente.
		System.out.println("multa = " + multa);
	}
}
