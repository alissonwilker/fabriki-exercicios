import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
	    
	    Scanner entrada = new Scanner (System.in);
	    
	    long fatorial;
	    long numero = entrada.nextLong();
	    
	        	    
	    for (fatorial = 1; numero > 1; numero = numero -1) {
	    fatorial = fatorial * numero;
	    
	    
		} System.out.println(fatorial);
	   
	    
	}
}
