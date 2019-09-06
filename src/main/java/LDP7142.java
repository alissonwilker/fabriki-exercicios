public class LDP7142 {
	private static Scanner entrada = new Scanner (System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		int codigo = entrada.nextInt();
		int horas = entrada.nextInt();
		int salarioExcedente;
		int salarioTotal;
		int salario;
		
		if (horas > 50) {
			salario = 50 * 10;
			salarioExcedente = (horas - 50) * 20;
			salarioTotal = salarioExcedente + salario;
			System.out.println("codigo = " + codigo + "\n" + "salarioExcedente = " + salarioExcedente + "\n" + "salarioTotal = "  + salarioTotal);
		}
		else {
			salarioExcedente = 0;
			System.out.println("codigo = " + codigo + "\n" + "salarioExcedente = " + salarioExcedente + "\n" + "salarioTotal = " + (horas *10));
		}
		
	}
}
