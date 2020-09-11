import java.util.Scanner;

public class LDP7251 {

	public static void main(String[] args) {
		
		int numero, maior;
		Scanner sc = new Scanner(System.in);
		
		numero = sc.nextInt();
		maior = numero;
		
		while(numero!=0) {
			numero = sc.nextInt();
			if(numero==0) {
				break;
			}
			if(numero>maior) {
				maior=numero;}}

		System.out.println("maior = "+maior);
		
		
	}

}
