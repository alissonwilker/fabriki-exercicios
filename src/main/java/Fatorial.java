import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		long fator = scanner.nextLong();
		long soma = fator; 
		long var = soma;

		if(fator==0) {
			System.out.println(1);
		}else {
			while(var>1) {
				var--;
				soma= soma*var;
			}
			System.out.println(soma);
		}
	}
}
