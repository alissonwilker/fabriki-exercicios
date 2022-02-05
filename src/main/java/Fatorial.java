import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor, fatorial =1;
		
		valor = entrada.nextInt();
		entrada.close();
		
		for(int i = 2; i <= valor; i++) {
			fatorial = fatorial * i;
		}
		System.out.println(fatorial);
	}
}
