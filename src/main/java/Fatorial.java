public class Fatorial {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	public static void main(String[] args) {
		int fatorial = 1;
		int numero;
		int i;
		numero = entrada.nextInt();
		for(i = 1;i <= numero;i++) {
			fatorial = fatorial*i;
			saida.println(fatorial);
		}
	}
}
