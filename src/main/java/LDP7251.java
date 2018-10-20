import java.util.Scanner;

public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int n = entrada.nextInt();
		
		int maior = n;
		
		while ( n != 0) {
		
			if ( n > maior) {
			 maior = n;
			}
			n = entrada.nextInt();
		}
		  
		System.out.println("maior = "+ maior);
	}

}
