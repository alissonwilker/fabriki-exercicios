import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
private static Scanner entrada = new Scanner(System.in);
private static PrintStream saida = System.out;



public static void main(String[] args) {
	int valor = entrada.nextInt();
	
	int multa = 0;
	
	int i;
	
	if(valor == 70) {
		multa = valor*4;
		
		System.out.println("excedente de: " + multa);
	}else if(valor == 50) {
		multa=0;
		System.out.println("excedente de: " + multa);
	}else if(valor == 30) {
		System.out.println("excedente de: " + multa);
		multa=0;
	}
	
}

}
