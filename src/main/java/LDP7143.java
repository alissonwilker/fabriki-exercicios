import java.util.Scanner;

public class LDP7143 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] vetorNum = new int[4];
		int[] vetorQuad = new int[4];
		String[] vetorA = { "a", "b", "c", "d" };
		String[] vetorA2 = { "a2", "b2", "c2", "d2" };

		for (int i = 0; i < vetorNum.length; i++) {
			vetorNum[i] = entrada.nextInt();
			vetorQuad[i] = (vetorNum[i] * vetorNum[i]);
			if (vetorQuad[2] >= 1000) {
				System.out.println(vetorA2[2] + " = " + vetorQuad[2]);
				break;
			}
		}
		if (vetorQuad[2] < 1000) {
			for (int i = 0; i < vetorQuad.length; i++) {
				System.out.println(vetorA[i] + " = " + vetorNum[i]);
			}
			for (int i = 0; i < vetorQuad.length; i++) {
				System.out.println(vetorA2[i] + " = " + vetorQuad[i]);}
		}

	}

}
