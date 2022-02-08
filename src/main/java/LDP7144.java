import java.util.Scanner;

	public class LDP7144 {
		public static void main(String[] args) {
			Scanner entrada = new Scanner (System.in);
			
			int valor = entrada.nextInt();
			boolean par = valor % 2 == 0;
			boolean positivo = valor >= 0;
			
			if (par) {
				System.out.print("PAR E ");
			}	
			else {
			System.out.print("ÍMPAR E ");
			}
			if (positivo) {
				System.out.println("POSITIVO");
			}
			else {
				System.out.println("NEGATIVO");
			}
		}
	}
