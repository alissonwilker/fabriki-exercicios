import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int peso = entrada.nextInt(), excesso = peso - 50, multa = excesso * 4;
		
		if (peso > 50){
			System.out.println("excedente = " + excesso);
			System.out.println("multa = " + multa);
		} else if (peso == 50) {
			System.out.println("excedente = " + excesso);
			System.out.println("multa = " + multa);
		} else {
			System.out.println("excedente = " + excesso);
			System.out.println("multa = " + multa);
		}
				
	}	
}
