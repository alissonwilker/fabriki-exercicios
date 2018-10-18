import java.util.Scanner;

public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int maior = 0;
		int num = entrada.nextInt();
		while (num != 0){
			
			if (num > maior){
				maior = num ;
			}
		num = entrada.nextInt();
		}
		System.out.println("maior = " + maior);
	}
}