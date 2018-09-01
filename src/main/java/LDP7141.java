import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int multa = 0;
		int excedente = 0;
		int pesoEntrada = entrada.nextInt();
		
		 excedente = pesoEntrada - 50;
		 
		 if(excedente >= 0){
			 multa = excedente * 4; 
		 }  else {
			 excedente = 0;
		 }
		 saida.println("excedente = "+ excedente);
		 saida.println("multa = "+ multa);	 
	}
}
