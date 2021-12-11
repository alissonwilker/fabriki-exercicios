import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	

	public static void main(String[] args) {
		int peso = entrada.nextInt();
		int max=50;
		
		if(peso>max) {
			int exced = peso-max;
			int multa = exced*4;
			System.out.println("excedente = "+exced);
			System.out.println("multa = "+multa);
		}else {System.out.println("sem multas!");}
		
		
	}

}
