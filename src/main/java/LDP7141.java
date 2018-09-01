import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static  Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	static int multa = 0;
	static int exedente = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int p = entrada.nextInt();
		//saida.print(pesoentrada);
		

		if (p > 50) {
		
			exedente = p - 50;
		    multa = exedente * 4;
		}
	
	    saida.println("excedente = " + exedente); 
	    saida.println("multa = " + multa); 
}
	
}
