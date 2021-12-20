import java.util.Scanner;

public class LDP7251 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num, maior;
		num = entrada.nextInt();
		maior = num;
		
			while(num != 0) {
				num = entrada.nextInt();

				if (num ==0) {
					System.out.println("maior = 0");
				}
				else if (num > maior && maior!=0) {
					maior = num;
					System.out.println("maior = " + maior);
				} 
				else if (num < maior && maior!=0) {
						System.out.println("maior = " + maior);
				}
			}	
	} 
	}
