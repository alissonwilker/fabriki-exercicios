public class LDP7142 {
	private static Scanner entrada = new Scanner (System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		int codigo = entrada.nextInt();
		int horas = entrada.nextInt();
		int salarioExcedente;
		int salarioTotal;
		int salario;
		int extra = 0;
		
		if (horas > 50) {
			salario = 50 * 10;
			extra = horas - 50;
			salarioExcedente = extra * 20;
			salarioTotal = salarioExcedente + salario;
		}
		else {
			salario = horas * 10;
			salarioExcedente = extra * 20;
			
		}
		
		System.out.println("codigo = " + codigo + "\n" + "salarioExcedente = " + salarioExcedente + "\n" + "salarioTotal = " + salario);
	}
}
