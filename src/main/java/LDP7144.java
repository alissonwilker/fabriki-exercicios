import java.io.PrintStream;
import java.util.Scanner;

public class LDP7144 {
	
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		
		int n1 = entrada.nextInt();
		boolean positivo;
		boolean par;			
		String resultado1;
		String resultado2;
		
		if(n1 < 0) {	
			
			positivo = false;
			resultado1 = "NEGATIVO";
			
			
		}
		else
		{
			positivo = true;
			resultado1 = "POSITIVO";
			
			
		}
		
		if (n1 % 2 == 0) {
			
			par = true;
			resultado2 = "PAR";
			
		}
		else
		{
			par = false;
			resultado2 = "ÍMPAR";
		}
		
		System.out.println(resultado2 + " E " + resultado1);	
				

	}

}
