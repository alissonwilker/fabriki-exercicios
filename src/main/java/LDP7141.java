import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141
{
    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;
    
	public static void main(String[] args) {
	    float peso, multa, excesso;
	    
		System.out.println("Informe o peso dos peixes em quilos");
	
	    peso=entrada.nextInt();
	    
	    excesso=peso-50;
	    multa=excesso*4;
	    
	    if (excesso<1){
	    System.out.printf ("\nexcedente = 0");
	    System.out.printf ("\nmulta = 0");}
	        else {
	    System.out.printf ("excedente = "+ excesso);
	    System.out.printf ("\nmulta = "+ multa);}
	        	    }
	}
