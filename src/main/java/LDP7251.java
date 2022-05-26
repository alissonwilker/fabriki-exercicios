import java.util.Scanner;
public class LDP7251 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num, maior;
		num = entrada.nextInt();
		maior = num;

		while(num != 0) {
			num = entrada.nextInt();

			if(num > maior && num != 0) {
				maior = num;
			}
		}	
		entrada.close();
		System.out.println("maior = "+maior);

	}

}
