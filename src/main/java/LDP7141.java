import.java.io.PrintSream;
import.java.util.Scanner;


public class LDP7141
{
public static Scanner entrada = new Scanner(System.in);
private static PrintStream  saida = System.out;
  public static void main(String[] args) {
    int e = 4;
		int m;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o peso do peixe:");
		int p = teclado.nextInt();
		System.out.println("O peso é :" + p + "kilos");
		if (p > 50) {
			p = p - 50;
			p = p * e;
			e = p;
			m = e;

		} else {
			p = p;
			e = 0;
			m = 0;
		}

		System.out.println("exesso é:" + e + "kilos" + "\n" + "A multa é: R$ "
				+ m);
	}

}
