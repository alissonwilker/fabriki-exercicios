import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141
{
    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;
    
	public static void main(String[] args) {
	    int peso, multa, excesso;
	    
		System.out.println("Inforque o peso dos peixes em quilos");
	
	    peso = entrada.nextInt();
	    
	    excesso=peso-50;
	    multa=excesso*4;
	    
	    if (excesso<1)
	    System.out.printf ("\nVocê não será multado!");
	    else
	    System.out.printf ("\nVocê possui uma multa no valor de: R$  ", multa);
	}
}
