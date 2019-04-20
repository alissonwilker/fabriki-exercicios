import java.util.Scanner;
public class LDP7251 {
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		int valor = entry.nextInt();
		int maior = valor;
		while (valor != 0) {
			valor = entry.nextInt();
			if (valor !=0 ) {
				if(valor > maior) {
					maior = valor;
				}
			}
		}
		System.out.println("maior = " + maior);
	}
}
