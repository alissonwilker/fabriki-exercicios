import java.util.Scanner;
public class LDP7144 {
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			int numero;
			numero = entrada.nextInt();
			if ((numero%2==0) && (numero>=0)) { 
				System.out.println("PAR E POSITIVO");
		    } else if ((numero%2==0) && (numero<0)) { 
		    	System.out.println("PAR E NEGATIVO");
		    } else if ((numero%2!=0) && (numero>0)) { 
		    	System.out.println("ÍMPAR E POSITIVO");	
		    } else {
		    	System.out.println("ÍMPAR E NEGATIVO");
		  }
		}			
}
