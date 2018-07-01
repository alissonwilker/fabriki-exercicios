import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
private static Scanner entrada = new Scanner(System.in);
private static PrintStream saida = System.out;
	public static void main(String[] args) {
		int peso = 0;
		int excesso = 0;
		int multa = 0;
		
		System.out.println("Peso dos peixes: ");
		peso  = entrada.nextInt();
		entrada.close();
		
		if(peso>50) {
			excesso = peso - 50;
			multa = excesso * 4;
			
		}
		else{
			excesso = 0;
			multa = 0;
		}
		saida.println("excedente = "+excesso);
		saida.println("multa = "+multa);

	}

}
