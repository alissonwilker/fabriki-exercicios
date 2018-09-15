import java.io.PrintStream;
import java.util.Scanner;

public class LDP7144 {
	private static Scanner entrada = new Scanner (System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		
        System.out.println("Digite um numero: ");
         
        int numero;
		boolean parar = false;
		char letra;

		do{
			System.out.println("Digite um número inteiro: ");
			numero = entrada.nextInt();


			if(numero%2==0){
				System.out.println("O número é par.\n");
			}else{
				System.out.println("O número  é impar\n");
			}
			if(numero<0){
				System.out.println("O número é negativo\n");
			}else{
				System.out.print("O número é positivo\n");
			}

			System.out.println("Deseja sair? (s/N)? ");
			letra = entrada.next().charAt(0);
			if(letra == 's' || letra == 'S'){
				parar = true;
			}

		}while(parar==false);

	}
}
			
			