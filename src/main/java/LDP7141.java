import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	// DECLARAÇÃO DAS VARIÁVEIS INTEIRAS peso, excedente e multa
	private static int peso, excedente, multa;

	public static void main(String[] args) {

		//LEIA UM INTEIRO E ARMAZENE NA VARIÁVEL peso
		pes = entrada.nextInt();
	
		//PROCESSAMENTO
		if (peso > 50) { //SE peso FOR MAIOR DO QUE 50...
			excedente = peso - 50; //CALCULE excedente
			multa = excedente * 4; //CALCULE multa
		}

		//ESCREVA 'excedente = <valor de excedente>'
		saida.println("excedente = " + excedente);
		saida.println("multa = " + multa);
	}
}
