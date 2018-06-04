
import java.util.Scanner;
import java.io.PrintStream;

public class LDP7141 {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {

		int pesoTotalPeixes;
		final int pesoLimite = 50;
		int multa = 0;

		System.out.println("Pescador\nInforme o peso total dos peixes pescados -> \nKg: ");
		pesoTotalPeixes = entrada.nextInt();
		if (pesoTotalPeixes > 0) {
			
			if (pesoTotalPeixes > 50) {
				multa = (pesoTotalPeixes - pesoLimite) * 4;
				saida.println("Resultado -> \nExcedente: Kg" + (pesoTotalPeixes - pesoLimite));
				saida.print("Multa: R$" + multa);
			} else {
				saida.println("Não há exedentes!");
			}
			
		} else {
			saida.println("valor negativo!");
		}

	}

}
