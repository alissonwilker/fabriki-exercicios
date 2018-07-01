import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		
		int pesoPeixe = entrada.nextInt();
		
		int limitePeso, excedente;
		
		limitePeso = 50;
				
		excedente = pesoPeixe - limitePeso;
		
		int multa = (excedente * 4);
		
		if (pesoPeixe > 50){
			
			saida.println("excedente " + excedente + " Kilo(s)");
			saida.println("multa " + multa + " Reais");
			
		}else {
		
			excedente = 0;
			multa = 0;
			
			saida.println("excedente " + excedente + " Kilo(s)");
			saida.println("multa " + multa + " Reais");			
		}		

	}

}
