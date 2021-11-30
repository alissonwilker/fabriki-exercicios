import java.util.Scanner;

public class LDP7144 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		boolean parar = false;
		char letra;

		do{
			System.out.println("Digite um número inteiro: ");
			numero = entrada.nextInt();
			
			if(numero%2==0){
				System.out.println("O número " +numero+ " é par." );
			}else{
				System.out.println("O número " +numero+ " é ímpar");
			}
			if(numero<0){
				System.out.println("O número é negativo");
			}else{
				System.out.println("O número é positivo");
			}

			System.out.println("Deseja sair? (s/N)? ");
			letra = entrada.next().charAt(0);
			if(letra == 's' || letra == 'S'){
				parar = true;
			}

		}while(parar==false);

	}
}
