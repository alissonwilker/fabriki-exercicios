import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int multa;
		int excedente;
		int pesoEntrada = entrada.nextInt();
		
		 excedente = pesoEntrada - 50;
		 
		 if(excedente >= 0){
			 saida.println("excedente = "+ excedente);
			 multa = excedente * 4; 
			 saida.println("multa = "+ multa);	 
		 }  
		 else{
			 saida.println("Não tem excedente"); 
		 }
	}
}
