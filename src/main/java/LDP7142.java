import java.util.Scanner;
import java.io.PrintStream;

public class LDP7142 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo = sc.nextInt();

		Scanner sc2 = new Scanner(System.in);
		int horas = sc2.nextInt();

		if (codigo == 1) {
			int salarioTotal = horas * 10;
			if (horas > 50) {
				salarioTotal = 500 + ((horas - 50) * 20);
			}
			int salarioExcedente = salarioTotal - 500;
			System.out.println("codigo = " + codigo + "\n" + "salarioExcedente = " + salarioExcedente + "\n"
					+ "salarioTotal = " + salarioTotal);
		} else if (codigo == 2) {
			int salarioTotal = horas * 10;
			if (horas > 50) {
				salarioTotal = 500 + ((horas - 50) * 20);
			}
			int salarioExcedente = salarioTotal - 500;
			System.out.println("codigo = " + codigo + "\n" + "salarioExcedente = " + salarioExcedente + "\n"
					+ "salarioTotal = " + salarioTotal);
		} else if (codigo == 3) {
			int salarioTotal = horas * 10;
			if (horas > 50) {
				salarioTotal = 500 + ((horas - 50) * 20);
			}
			int salarioExcedente = salarioTotal - 500;
			System.out.println("codigo = " + codigo + "\n" + "salarioExcedente = " + salarioExcedente + "\n"
					+ "salarioTotal = " + salarioTotal);
		}
	}

}
