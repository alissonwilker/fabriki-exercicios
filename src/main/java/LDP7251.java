import java.util.Scanner;

public class LDP7251 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num = 1, maior;
		num = entrada.nextInt();
				maior = num;

				while(num != 0) {
					num = entrada.nextInt();

					if(num > maior) {
						maior = num;
					}
				}
				System.out.print("maior = " + maior);
			}
	} 

