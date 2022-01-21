import java.util.Scanner;

public class SubtracaoConjuntos {
	public static void main(String[] args) {

		System.out.print("");
		int[] listaA = new int[3];
		int[] listaB = new int[1];

		Scanner leitor = new Scanner(System.in);

		for (int i = 0; i < listaA.length; i++) {
			System.out.print("");
			listaA[i] = leitor.nextInt();
		}

		for (int i = 0; i < listaB.length; i++) {
			System.out.print("");
			listaB[i] = leitor.nextInt();
		}

		System.out.print("");

		for (int i = 0; i < listaB.length; i++) {

			for (int j = 0; j < listaA.length; j++) {

				if (listaA[j] != listaB[i]) {

					System.out.println(listaA[j]);
				}
			}
		}

	}

}
