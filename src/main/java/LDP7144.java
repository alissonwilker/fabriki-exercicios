import java.util.Scanner;

public class LDP7144 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		double resto;
		String positivoOuNegativo, parOuImpar;
		
		num = sc.nextInt();
	
		if (num>=0) {
			positivoOuNegativo = "POSITIVO";
		}
		else {
			positivoOuNegativo = "NEGATIVO";
		}
		
		resto = num % 2;
		
		if (resto == 0) {
			parOuImpar = "PAR";
		}
		else {
			parOuImpar = "IMPAR";
		}
		
		System.out.println(parOuImpar +" E " + positivoOuNegativo);
		
		sc.close();
	}

}
