import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static  Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p = entrada.nextInt();
		//saida.print(pesoentrada);
		int multa = 0;
		int exedente = 0;
		if (p > 50) {
		
			exedente = p - 50;
		    multa = exedente * 4;
		}
	
	    saida.println("exedente = " + exedente); 
	    saida.println("multa = " + multa); 
}
	
}