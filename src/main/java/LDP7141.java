import java.io.PrintStream;
import java.util.Scanner;
public class LDP7141
{
    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;    
	public static void main(String[] args) {
	    int peso, multa, excesso;	
	    peso=entrada.nextInt();	    
	    excesso=peso-50;
	    multa=excesso*4;	    
	    if (excesso<1){
	    System.out.printIn ("excedente = 0");
	    System.out.printIn ("multa = 0");}
	        else {
	    System.out.printIn ("excedente = "+ excesso);
	    System.out.printIn ("multa = "+ multa);}
	        	    }
	}
