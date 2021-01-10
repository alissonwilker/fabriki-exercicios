import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	
	public static void main(String[] args) {
		int pesoLimite = 50; 
		int  excesso;
		double multa;
		int peso;
		
		System.out.println("Entre com o peso: ");
                 peso = sc.nextInt();
				if (peso > pesoLimite) {
					excesso = peso - pesoLimite;
				    multa =  excesso * 4.00;
				    System.out.println ("Multa foi de " + multa + " reais");
				}
				    
	}


	

}
