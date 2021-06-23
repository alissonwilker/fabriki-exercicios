import java.util.Scanner;

public class LDP7141 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int pesoPeixe = entrada.nextInt();
		entrada.close();

		if (pesoPeixe > 50) {
			int excedente = pesoPeixe - 50;
			int multa = (pesoPeixe - 50) * 4;

			System.out.println("excedente = " + excedente);
			System.out.println("multa = " + multa);
		} else {
			System.out.println("excedente = 0");
			System.out.println("multa = 0");
		}
	}

}
