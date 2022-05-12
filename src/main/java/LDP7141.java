import java.util.Scanner;

public class LDP7141 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int peso, multa, excedente;
		
		peso = entrada.nextInt();
		
		excedente = peso - 50;
		multa = excedente*4;
		
		if (peso > 50) {
			System.out.println("excedente = "+ excedente);
			System.out.println("multa = "+ multa);
		}
		else {
			System.out.println("excedente = 0");
			System.out.println("multa = 0");
			
		}
		
	}

}
