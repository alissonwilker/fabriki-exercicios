import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int peso;
		int excesso = 0;
		int multa = 0;
		peso = entrada.nextInt();
		if(peso>50) {
			excesso = peso - 50;
			multa = 4 * excesso;			
		}
		saida.println("excedente = "+ excesso + "\nmulta = " + multa);
	}

}