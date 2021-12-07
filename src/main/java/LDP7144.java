import java.util.Scanner;

public class LDP7144{
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num = teclado.nextInt();
		teclado.close();
		if(num % 2 == 0) {
			System.out.print("PAR E ");
		} else {
			System.out.print("ÍMPAR E ");
		}
		
		if(num >= 0) {
			System.out.println("POSITIVO");
		} else {
			System.out.println("NEGATIVO");
		}
	}
}
