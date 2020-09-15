import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numero = sc.nextInt();
		double fatorial = numero;
		
		if(numero == 0) {
			fatorial = 1;
		} else {
			while(numero > 1) {
				fatorial = fatorial * (numero - 1);
				numero--;
			}
		}
		System.out.println(fatorial);
		
	}
}
