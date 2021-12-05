import java.util.Scanner;

public class LDP7144 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;

			numero = entrada.nextInt();


			if(numero%2==0){
				System.out.print("PAR");
			}else{
				System.out.print("ÍMPAR");
			}
			if(numero<0){
				System.out.print("E NEGATIVO.");
			}else{
				System.out.print("E POSITIVO.");
			}

			}

	}
