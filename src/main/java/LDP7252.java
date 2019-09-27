import java.io.PrintStream;

public class LDP7252 {
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		
		double graosCasa=1,casasTabuleiro=64;
		double graos=1;

		for(int i=1; i <casasTabuleiro; i++){
			graosCasa = graosCasa*2;
			graos += graosCasa;
		}

		saida.println("totalGraos = "+graos);

	}

}
