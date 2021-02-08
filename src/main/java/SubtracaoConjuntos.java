import java.util.Scanner;

public class SubtracaoConjuntos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int A, B , subtracao;
		
		A = entrada.nextInt();
		B = entrada.nextInt();
		
		while (A != 0) {
			A = entrada.nextInt();
		}
		while (B != 0) {
			B = entrada.nextInt();
		}
		
		subtracao = A - B;
		System.out.println(A + B);
	}

}
