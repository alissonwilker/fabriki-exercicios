import java.util.Scanner;

public class LDP7252 {
	public static void main(String[] args) {
		double graosCasa=1,casasTabuleiro=64;
		int graos=1;

		for(int x=1;x<casasTabuleiro;x++){
			graosCasa = graosCasa*2;
			graos +=graosCasa;
		}

		System.out.println("totalGraos = "+graos);

	}

}
