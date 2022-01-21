import java.util.Scanner;

public class SubtracaoConjuntos {
	public static void main(String[] args) {

		int[] listaA = new int[3];
		int[] listaB = new int[1];

		Scanner leitor = new Scanner(System.in);

		for (int i = 0; i < listaA.length; i++) {

			listaA[i] = leitor.nextInt();
		}

		for (int i = 0; i < listaB.length; i++) {

			listaB[i] = leitor.nextInt();
		}

		for (int i = 0; i < listaB.length; i++) {

			for (int j = 0; j < listaA.length; j++) {

				if (listaA[j] != listaB[i]) {

					System.out.println(listaA[j]);
				}
			}
		}

	}

}
