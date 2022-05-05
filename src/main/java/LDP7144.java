import java.util.Scanner;

public class LDP7144{
	public static void main(String[] args) {
		
		
		
		Scanner dados  = new Scanner(System.in);
		System.out.println("Digite um numero para ser verificado");
		int numero = dados.nextInt();
		
		if (numero>=0) {
			System.out.println("Esse numero é positivo!!");
		}
		
		else if (numero<=0) {
			System.out.println("Esse numero é Negativo!!");
		
	}

		if (numero % 2 == 0) {
			System.out.println("Esse numero é par!!");
		}
		
		else if(numero % 2 == 1) {
			System.out.println("Esse numero é impar!!");
		
	}
		
	}
		
}
