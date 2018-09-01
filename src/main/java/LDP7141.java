import java.io.PrintStream;
import java.util.Scanner;
public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	public static void main(String[] args){
		int peso = entrada.nextInt();
		int multa = 0;
		int pesoexcedente=0;		
		if (peso > 50 ) {
			pesoexcedente = peso - 50;
			multa = pesoexcedente * 4;
			saida.println("Excedente = "+ pesoexcedente);
			saida.println("Multa = " + multa);
		} else {
			saida.println("Excedente = "+ pesoexcedente);
			saida.println("Multa = " + multa);
		}	
	}
}