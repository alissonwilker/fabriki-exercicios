import java.util.Scanner;
public class LDP7144 {
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			int numero;
			numero = entrada.nextInt();
			if ((numero%2==0) && (numero>=0)) { 
				System.out.print("PAR E POSITIVO");
		    } else if ((numero%2==0) && (numero<0)) { 
		    	System.out.print("PAR E NEGATIVO");
		    } else if ((numero%2!=0) && (numero>0)) { 
		    	System.out.print("ÍMPAR E POSITIVO");	
		    } else { // senão
		    	System.out.print("ÍMPAR E NEGATIVO");
		  }
		}			
}
