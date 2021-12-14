import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner (System.in);
private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int peixes = entrada.nextInt();
		int dife = peixes - 50; 
		int mul = dife * 4;
	if(peixes >= 50) {System.out.println("excedente = 0\r\n"
			+ "multa = 0");}
	if (peixes <= 50) {System.out.println("excedente =" + dife   
			+ "r/n/multa =" + mul);}

	}

}
