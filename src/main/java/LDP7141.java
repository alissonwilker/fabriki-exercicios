import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[]args){
		
		int ent = entrada.nextInt();
		
		int sub = 0;
		int exc = 0;

		
			if(ent>50){
				 sub = ent - 50;
				 exc = sub * 4;
				
			}
			
			else{
				sub = 0;
				exc = 0;
				
			}
					
				
			saida.println("excedente = " +sub );
			saida.println("multa = "  +exc );
			
					
	}

}