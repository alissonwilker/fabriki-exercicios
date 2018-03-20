import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	// DECLARAÇÃO DAS VARIÁVEIS INTEIRAS
	private static int codigo, numeroHoras, excedente;
	private static int salarioExcedente, salarioTotal;
	
	public static void main(String[] args) {
		//LEIA UM INTEIRO E ARMAZENE NA VARIÁVEL codigo
		codigo = entrada.nextInt();
		numeroHoras = entrada.nextInt();
		 
		//PROCESSAMENTO
		if (numeroHoras > 50) { //SE numeroHoras FOR MAIOR DO QUE 50... 
			excedente = numeroHoras - 50;
		}
		salarioExcedente = excedente * 20;
		salarioTotal = salarioExcedente + (numeroHoras-excedente)*10;
		
		//ESCREVA 'codigo = <valor de codigo>'
		saida.println("codigo = " + codigo);
		saida.println("salarioExcedente = " + salarioExcedente);
		saida.println("salarioTotal = " + salarioTotal);
	}
	
}
