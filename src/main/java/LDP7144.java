import java.util.Scanner;

public class LDP7144 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1;

		n1 = teclado.nextInt();
		
		if (n1 % 2 == 0 && n1 < 0) {
			System.out.println("PAR E NEGATIVO");
		} else if(n1 % 2 == 0 && n1 > 0){
			System.out.println("PAR E POSITIVO");
		} else if(n1 % 2 != 0 && n1 < 0){
			System.out.println("IMPAR E NEGATIVO");
		}else if(n1 % 2 != 0 && n1 > 0){
			System.out.println("IMPAR E POSITIVO");
		}
	}
}
