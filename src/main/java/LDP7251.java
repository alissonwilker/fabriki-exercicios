import java.util.Scanner;
public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args){
		int maior = 0;
		int num = entrada.nextInt();
		while (num != 0){
			num = entrada.nextInt();
			if (num > maior && num > 0){
				maior = num ;
			}
			else if(num < 0 && num != 0) {
				maior = num ;
			}
		}
		System.out.println("maior = " + maior);
	}
}

