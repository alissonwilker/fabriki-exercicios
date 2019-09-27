import java.io.PrintStream;

public class LDP7252 {

	private static PrintStream saida = System.out;

	public static void main(String[] args) {

		int graos = 0;
		double graosCasa = 1;
		double casasTabuleiro = 64;

		for (int x = 1; x < casasTabuleiro; x++) {
			graosCasa = graosCasa * 2;
			graos += graosCasa;
		}
		saida.println("totalGraos = " + graos);
	}
}
