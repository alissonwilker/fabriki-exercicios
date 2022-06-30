import java.util.Scanner;

public class LDP7252 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double GraosCasa = 1, CasasTabuleiro = 64;
		int TotalGraos = 1;

		for (int i = 1; i < CasasTabuleiro; i++) {
			GraosCasa = GraosCasa * 2;
			TotalGraos += GraosCasa;
		}

		System.out.println("totalGraos = " + TotalGraos);

	}
}
