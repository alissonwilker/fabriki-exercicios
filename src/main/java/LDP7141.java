import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int peso;
		
		peso = entrada.nextInt();
		
		if(peso<=50) {
			System.out.println("excedente = 0");
			System.out.println("multa = 0");
		}else {
			System.out.println("excedente = " + (peso-50));
			System.out.println("multa = " + ((peso-50) *4));
		}

	}

}
