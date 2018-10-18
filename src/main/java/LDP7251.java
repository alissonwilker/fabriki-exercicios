import java.util.Scanner;

public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int num;
		int maior = 0;
		num = entrada.nextInt();
		while (num != 0){
			
		

			if (num > maior) {
				maior = num;
				
			}

			else if (num < 0 && num < maior) {
				maior = num;

			}
			
			num = entrada.nextInt();

		}
		
		System.out.println("maior = " + maior);
	}

}