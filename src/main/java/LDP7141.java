import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		int peso, excedente = 0, multa = 0;
		
		peso = entrada.nextInt();
		
		if (peso > 50){
			excedente = peso - 50;
			multa = excedente * 4;
		}
			System.out.println("excedente = "+ excedente);
			System.out.println("multa = "+ multa);
	}

}

