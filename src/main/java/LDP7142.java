public class LDP7142 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {

		int codigo = entrada.nextInt();
		int horas = entrada.nextInt();
		int salario, salarioexcedente = 0;
		int horasextras;

		if (horas > 50) {
			horasextras = horas - 50;
			salarioexcedente = horasextras * 20;
			salario = salarioexcedente + 500;
		} else {
			salario = horas * 10;
		}
		saida.println("codigo = " + codigo);
		saida.println("salarioExcedente = " + salarioexcedente);
		saida.println("salarioTotal = " + salario);
	}

}
