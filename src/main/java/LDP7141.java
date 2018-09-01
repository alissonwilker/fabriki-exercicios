	import java.io.PrintStream;
	import java.util.Scanner;
	
public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main (String[]args){
		
		int peso = entrada.nextInt();
		
		int exed=0;
		int multa=0;
		
		
		if(peso>50){
		exed=peso-50;			
		multa=exed*4;
				
		}
		else{
		exed=0;
		multa=0;

		}	
		saida.println("Excedente = "+exed);
		saida.println("Multa = "+multa);
}
}
