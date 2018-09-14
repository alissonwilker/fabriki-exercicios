import java.io.PrintStream;
import java.util.Scanner;

public class LDP7144 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[]args) {
		
		String parouimpar = "";
		String negouposi = "";
		
		int num = entrada.nextInt();
		
		if (num%2==0){
			 parouimpar = "PAR";}
			else{ 
		     parouimpar = "ÍMPAR";
		}
		
		if (num > 0) {
		    negouposi = "POSITIVO";}
			else{
		    negouposi = "NEGATIVO";
			}
		saida.println(parouimpar +" E "+ negouposi);
		}
}
