import java.util.Scanner;

public class LDP7251 {

	public static void main(String[] args) {
		
		double numero, maior;
		Scanner sc = new Scanner(System.in);
		
		numero = sc.nextDouble();
		maior = numero;
		
		while(numero!=0) {
			numero = sc.nextDouble();
			if(numero==0) {
				break;
			}
			if(numero>maior) {
				maior=numero;}}

		System.out.println("maior = "+maior);
		
		
	}

}
