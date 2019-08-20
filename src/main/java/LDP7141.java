import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;	
	public static void main(String[] args) {
		 int valor = entrada.nextInt();
		 int ex;
		 int multa;
		 
		 if(valor > 50) {
			ex = valor - 50; 
			 saida.println("excedente = "+ ex );
			 
			 multa = ex * 4;
			 saida.println("multa = "+ multa);
		 }else if(valor <= 50){
			 saida.println("excedente = 0\r\n" + 
			 		"multa = 0" );
		 }
		 

	}

}
