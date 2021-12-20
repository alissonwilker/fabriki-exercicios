import java.util.Scanner;

public class LDP7251 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num, maior;
		num = entrada.nextInt();
		maior = num;

			while(num != 0) {

				if(num > maior || num < maior) {
					maior = num;
					} 	num = entrada.nextInt();
				} 
			System.out.println("maior = " + maior);
			}
	} 

