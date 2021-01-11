import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		// TODO INSIRA SEU CÓDIGO AQUI
	    
		int peso = 0;
	    int multa = 0;
	    int excedente = 0;
	    
		System.out.printf("");
	
	    peso = entrada.nextInt();
	    
	    excedente = peso - 50;
	    	    
	    if (excedente < 1) {
	    excedente = 0;
	    System.out.println ("excedente = " + excedente);
	    System.out.println ("multa = " + multa);	    
	    }
	    else {
	    multa = excedente * 4;
	    System.out.println ("excedente = "+ excedente);
	    System.out.println ("multa = "+ multa);
	    }
	}
}
