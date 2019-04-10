import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite a quantidade de alunos:");
		int n = s.nextInt();
		
		int[] notas = new int[n];
		
		for (int i = 0; i < n; i++) {
			notas[i] = s.nextInt();
		}
		
		double soma = 0;
		for (int i = 0; i < notas.length; i++) {
			soma = soma +notas[i];
		}
		
		double media = soma/n;
		System.out.println("media = "+ media);
		// System.out.println("notas "+[i]+" ="+ notas[i]);
		
				
	}

}
