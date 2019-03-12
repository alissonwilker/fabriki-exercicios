import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
private static Scanner entrada = new Scanner(System.in);
private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int kg = 0;
		int m = 0;
		
		int peso = entrada.nextInt();
			
		if (peso>50) {
			kg = peso - 50;
			m= kg*4;
			System.out.println("excedente = "+kg);
			System.out.println("multa = "+m);
		} else if (peso<50) {
			System.out.println("excedente = "+kg);
			System.out.println("multa = "+m);
		}else {
			
			System.out.println("excedente = "+kg);
			System.out.println("multa = "+m);
		}
		
	}
}
