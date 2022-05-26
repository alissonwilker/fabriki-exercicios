import java.util.Scanner;
public class LDP7251 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		int maior;
	 	maior = numero;
	 	
		while (numero != 0) {
		      if (numero>maior) {
		    	  maior = numero;
		      }
		  	 numero = entrada.nextInt();
		    }
		
	      System.out.println("maior = " + maior); 
	}
}
