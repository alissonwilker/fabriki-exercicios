import java.util.Scanner;

public class LDP7144 {
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		
		int num = teclado.nextInt();
		teclado.close();
		if((num>0) && (num%2==0)){
			System.out.println("PAR E POSITIVO");
		}
		if((num>0) && (num%2!=0)){
			System.out.println("ÍMPAR E POSITIVO");
		}
		if((num<0) && (num%2==0)){
			System.out.println("PAR E NEGATIVO");
		}
		if((num<0) && (num%2!=0)){
			System.out.println("ÍMPAR E NEGATIVO");
		}
	}
}
