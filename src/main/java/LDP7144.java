import java.util.Scanner;

public class LDP7144 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		int ImpaPar = (num % 2);

		if (ImpaPar == 0 && num >= 0) {
			System.out.println("PAR E POSITIVO");
		
	}else if (ImpaPar == 0 && num < 0) {
			System.out.println("PAR E NEGATIVO");
			
	}else if (ImpaPar != 0 && num >= 0) {
			System.out.println("ÍMPAR E POSITIVO");
		
	}else if (ImpaPar != 0 && num < 0){
			System.out.println("ÍMPAR E NEGATIVO");
	}
}
}
