import java.io.PrintStream;
public class LDP7252 {
	private static PrintStream saida = System.out;
	public static void main(String[] args) {
		int[] casas = new int[64];
		int i = 1;
		for(i = 1; i < casas.length; i++) {
			casas[i] = i * 2;
		}
		int totalGraos = 1;
		for(i = 1; i< casas.length; i++) {
			totalGraos += casas[i];
		}
		saida.println("totalGraos = "+totalGraos);
	}
}
