import java.util.Scanner;
public class LDP7251 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero, maior;
		numero = entrada.nextInt();
		maior = numero;
		
		if(numero == 0) {
			System.out.println("maior = 0");
		}
		
		else {
		
			do{
			numero = entrada.nextInt();

			if(numero > maior && numero != 0) {
				maior = numero;
			}
			
			}while(numero != 0);
		
			entrada.close();
			System.out.println("maior = "+maior);
			}
		}
}
