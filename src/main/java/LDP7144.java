import java.util.Scanner;

public class LDP7144 {
	private static Scanner entrada = new Scanner (System.in);
	
	public static void main(String[] args) {
		        
        int num ;
		boolean parar = false;
		char letra;

		do{
			System.out.println("Digite um número inteiro: ");
			num = entrada.nextInt();


			if(num%2==0){
				System.out.println("O número é par.\n");
			}else{
				System.out.println("O número  é impar\n");
			}
			if(num<0){
				System.out.println("O número é negativo\n");
			}else{
				System.out.println("O número é positivo\n");
			}

			System.out.println("Deseja sair? (s/N)? ");
			letra = entrada.next().charAt(0);
			if(letra == 's' || letra == 'S'){
				parar = true;
			}

		}while(parar==false);

	}
}
			
			