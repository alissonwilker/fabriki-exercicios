import java.util.Scanner;

public class Fatorial {
	
	
	private static Scanner entrada;

	public static void main(String[] args) {
	    
	    entrada = new Scanner (System.in);
	    
	    long fatorial;
	    long numero = entrada.nextLong();
	    
	        	    
	    for (fatorial = 1; numero > 1; numero = numero -1) {
	    fatorial = fatorial * numero;
	    
	    
		} System.out.println(fatorial);
	   
	    
	}
}
