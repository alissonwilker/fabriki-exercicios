public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {

		int n1 = 0, maior = 0;

		n1 = entrada.nextInt();

		while (n1 != 0) {
		
		if (n1 > maior) {
			maior = n1;

		} else if (n1 < 0 && n1 < maior) {
			maior = n1;
		}
		n1 = entrada.nextInt();
		}
		saida.println("maior = " + maior);
	}
}
