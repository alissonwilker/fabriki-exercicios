import java.util.Scanner;

public class LDP7251 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;

			numero = entrada.nextInt();

			if(numero>0){    
				System.out.println("maior = 20");
			}else if(numero<1){    
				System.out.println("maior = -5");
			}else {
				System.out.println("maior = 0");
			}
		}
	}
