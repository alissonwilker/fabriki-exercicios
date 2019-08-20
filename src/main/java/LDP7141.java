import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida  = System.out;
	public static void main(String[] args) {
		int valor = entrada.nextInt();
		int excedente = 0;
		int multa = 0;
		if (valor<=50) {
			saida.println("Excedente: "+excedente+" Multa: "+multa);
		}
		else {
			excedente = valor - 50;
			multa = excedente*4;
			saida.println("Excedente: "+excedente+" Multa: "+multa);
		}
	}
}
