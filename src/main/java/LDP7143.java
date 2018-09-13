import java.io.PrintStream;
import java.util.Scanner;

public class LDP7143 {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int numero1 = entrada.nextInt();
		int numero2 = entrada.nextInt();
		int numero3 = entrada.nextInt();
		int numero4 = entrada.nextInt();
		int quadradoNumero1 = numero1 * numero1;
		int quadradoNumero2 = numero2 * numero2;
		int quadradoNumero3 = numero3 * numero3;
		int quadradoNumero4 = numero4 * numero4;		
		if (quadradoNumero3 >= 1000){
			saida.println("c2 = " + quadradoNumero3);
		} else {
			saida.println("a = " + numero1);
			saida.println("b = " + numero2);
			saida.println("c = " + numero3);
			saida.println("d = " + numero4);
			saida.println("a2 = " + quadradoNumero1);
			saida.println("b2 = " + quadradoNumero2);
			saida.println("c2 = " + quadradoNumero3);
			saida.println("d2 = " + quadradoNumero4);
		}		
	}
}