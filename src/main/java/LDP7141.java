import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		int kg = 0;
		int mult = 0;
		int excedente= 0;
		
		 System.out.print ("Escreva quantos kilos: ");
		 kg = entrada.nextInt();
		 
			if (kg > 50){
				excedente = kg - 50;
				mult = excedente*4;
			}
		
			saida.println ("Excedente:  " + excedente);
            System.out.println ("Multa: " + mult);
      }
}