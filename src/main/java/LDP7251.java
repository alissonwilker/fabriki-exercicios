import java.util.Scanner;
public class LDP7251 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int valor = s.nextInt();
		int maior;
		maior = valor;
		while (valor != 0) {
			valor = s.nextInt();
			if (valor !=0 ) {
				maior = Math.max(valor, valor);
			}
		}
		System.out.println("maior = " + maior);
	}

}
