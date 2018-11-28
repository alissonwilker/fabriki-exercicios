import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {

	private static Scanner entrada = new Scanner (System.in);
	private static PrintStream saida = System.out;
	
	
	public static void main(String[] args) {
	
		int p=0;
	
	p = entrada.nextInt();
	
	if(p<=50) {
		saida.println("excedente = 0");
		saida.println("multa = 0");
	}else if(p>50) {
		saida.println("excedente = "+(p-50));
		saida.println("multa = "+((p-50)*4));
	}
	
}
}
