import java.util.Scanner;

public class LDP7251 {

	public LDP7251() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int maior = -9999999;
		int numero = -999999;
		while (numero!=0) {
			numero = scanner.nextInt();
			if (numero>maior&&numero!=0) {
				maior = numero;
			}
		}
		if (maior ==-9999999) {
			System.out.println("maior = 0");
		} else {
			System.out.println("maior = "+maior);
		}
		

	}

}
