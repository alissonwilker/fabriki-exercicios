import java.util.Scanner;

public class LDP7252{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double graoPorCasa=1,casasTabuleiro=64;
		int graos=1;

		for(int x=1; x<casasTabuleiro; x++){
			
			graoPorCasa = graoPorCasa*2;
			
			graos += graoPorCasa;
		}

		System.out.println("totalGraos = " + graos);

	}
}
