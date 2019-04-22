import java.io.PrintStream;
import java.math.BigInteger;

public class LDP7252 {

	private static PrintStream saida = new PrintStream(System.out);

	public static void main(String[] args) {
		BigInteger totalGraos = new BigInteger("0");
		BigInteger baseDaPotencia = new BigInteger("2");
		int quantidadeTotalDeQuadros = 64;
		int expoenteDaPotencia;
		for (int quantidadeDeQuadros = 0; quantidadeDeQuadros < quantidadeTotalDeQuadros; quantidadeDeQuadros++) {
			expoenteDaPotencia = quantidadeDeQuadros;
			totalGraos = totalGraos.add(baseDaPotencia.pow(expoenteDaPotencia));
		}
		saida.println("totalGraos = " + totalGraos);		
	}
}
