
public class LDP7142 {
	private static Scanner entrada = new Scanner (System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		int codigo = entrada.nextInt();
		int horas = entrada.nextInt();
		int salarioExcedente;
		int salarioTotal;
		
		if (horas > 50) {
			salarioExcedente = (horas - 50) * 20;
			salarioTotal = salarioExcedente + (50*10);
			System.out.println("codigo = " + codigo + "\n" + "salarioExcedente = " + salarioExcedente + "\n" + "salarioTotal = "  + salarioTotal);
		}
		else {
			System.out.println("codigo = " + codigo + "\n" + "salarioExcedente = 0" + "\n" + "salarioTotal = " + (horas *10));
		}
		
	}
}
