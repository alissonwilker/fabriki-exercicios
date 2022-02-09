public class Fatorial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		long valor, fatorial = 1;
		
		
		valor = entrada.nextLong();
		entrada.close();
		
		for (int i = 2; i <= valor; i++) {
			fatorial = fatorial * 1;
		
		}
		
	    5! = 2 * 3 * 4 * 5
		System.out.println(fatorial);
	}

}
