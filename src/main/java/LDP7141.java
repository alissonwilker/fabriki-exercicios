import java.util.Scanner;

public class LDP7141 {
	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int peso = entrada.nextInt();
		int excedente = 0;
		int multa = 0;
		if (peso > 50) {
			excedente = peso - 50;
			multa = 4*excedente;
			System.out.println(excedente = +excedente);
			System.out.println(multa);			
		}
		else {
			System.out.println(excedente = +excedente);
			System.out.println(multa);
		}

	}

}
