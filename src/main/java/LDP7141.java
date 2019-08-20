import java.util.Scanner;

public class LDP7141 {

	private static Scanner enter = new Scanner(System.in);

	public static void main(String[] args) {
		// a cada kilo sobrando = +4reais
		int peso = enter.nextInt();

		int excedente = 0;
		int multa = 0;

		if (peso > 50) {

			excedente = peso - 50;

			multa = excedente * 4;

			System.out.println("excedente = " + excedente + "\n" + "multa = " + multa);
		} else {
			System.out.println("excedente = " + excedente + "\n" + "multa = " + multa);
		}
	}

}
