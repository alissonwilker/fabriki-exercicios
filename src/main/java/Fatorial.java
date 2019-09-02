public class Fatorial {

	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int numero = entrada.nextInt();
		String fatorial = fatorial(numero);
			saida.println(fatorial);
		}
		public static String fatorial(int numero) {
		       BigInteger fatorial = new BigInteger("1");
		       for(int i = 1;i <= numero;i++) {
					fatorial = fatorial.multiply(new BigInteger(i + ""));
		   
		       }
		       return fatorial.toString();
		   }
	}
