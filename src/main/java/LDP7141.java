import java.io.IOException;
import java.util.Scanner;

public class LDP7141 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int tara = 50;
		int excedente = 0;
		int multa = 0;
		int valorMulta = 4;
		int peso = leitor.nextInt();

		if (peso >= 51){
		    excedente = peso - tara;
		    multa = excedente * valorMulta;
			System.out.println("excedente = " + excedente);
			System.out.println("multa = " + multa);
		} else if (peso <= 50) {
		    System.out.println("excedente = " + excedente);
			System.out.println("multa = " + multa);
		}
		
	}
}
