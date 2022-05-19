import java.util.Scanner;
public class LDP7142 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int codigo = entrada.nextInt();
		int horas = entrada.nextInt();
		int extra = (horas - 50) * 20;
		int salarioTotal = 0;
		
		if (extra >= 1) {
			salarioTotal = 500 + extra;
			System.out.println("codigo = " + codigo);
			System.out.println("salarioExcedente = " + extra);
			System.out.println("salarioTotal = " + salarioTotal);
		}
		else {
			salarioTotal = horas * 10;
			System.out.println("codigo = " + codigo);
			System.out.println("salarioExcedente = 0");
			System.out.println("salarioTotal = " + salarioTotal);
		}
	}
}
