import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	
	private static Scanner entrada =new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		
		int multa=0;
		int excedente=0;
	
		
		int num=entrada.nextInt();
		entrada.close();
		
		if(num>0 && num>50) {

		excedente = num-50;
		multa = excedente*4;
		
			saida.print("excedente = "+excedente+"\nmulta = "+multa);
			
		}else {
			saida.print("excedente = "+excedente+"\nmulta = "+multa);
			
		}
	
	}

}