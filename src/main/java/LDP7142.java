import java.util.Scanner;

public class LDP7142 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int codigo = entrada.nextInt();
		int numHoras = entrada.nextInt();
		final int valorHora = 10;
		int salarioExcedente = 0;
		int horaExcedente = 0;
		int salarioTotal = 0;

		if (numHoras > 50) {
			salarioExcedente = (numHoras - 50) * 20;
			horaExcedente = numHoras - 50;
			salarioTotal = ((numHoras - horaExcedente) * valorHora) + salarioExcedente;

		} else {
			horaExcedente = 0;
			salarioTotal = numHoras * valorHora;
		}

		System.out.println("código = " + codigo);
		System.out.println("salarioExcedente = " + salarioExcedente);
		System.out.println("salarioTotal = " + salarioTotal);

	}

}
