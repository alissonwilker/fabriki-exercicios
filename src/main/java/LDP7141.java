import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
private static Scanner entrada = new Scanner(System.in);
private static PrintStream saida = System.out;
	public static void main(String[] args) {
		int excesso = 0;
		int multa = 0;
		
		System.out.println();
		int peso  = entrada.nextInt();
		
		
		if(peso <= 50) {
			
			
		}
		else{
			excesso = peso - 50;
			multa = excesso * 4;
		}
		saida.println("excedente = "+excesso);
		saida.println("multa = "+multa);
		entrada.close();
	}

}
