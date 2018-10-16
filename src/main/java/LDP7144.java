import java.io.PrintStream;
import java.util.Scanner;

public class LDP7144 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	//DECLARAÇÃO DE VARIÁVEIS INTEIRA E LITERAL
	private static int numero;
	private static String resultado;
	
	public static void main(String[] args) {
		//LEIA UM NÚMERO INTEIRO E ARMAZENE EM numero
		numero = entrada.nextInt();
		
		//SE O RESTO DA DIVISÃO DE numero POR 2 É IGUAL A 0
		if (numero % 2 == 0) { 
			if (numero >= 0) { //SE numero É MAIOR OU IGUAL A 0
				resultado = "PAR E POSITIVO";
			} else { //SENÃO (numero É MENOR DO QUE 0)
				resultado = "PAR E NEGATIVO";
			}
		//SENÃO (O RESTO DA DIVISÃO DE numero POR 2 NÃO É IGUAL A 0)
		} else { 
			if (numero >= 0) {
				resultado = "ÍMPAR E POSITIVO";
			} else {
				resultado = "ÍMPAR E NEGATIVO";
			}
		}
		
		//ESCREVA O VALOR DE resultado
		saida.println(resultado);
		
	}
	
}
