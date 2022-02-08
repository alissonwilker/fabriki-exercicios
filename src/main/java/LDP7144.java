public class LDP7144 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor = entrada.NextInt();
		
		if (valor % 2 == 0) {
			System.out.println("PAR E");	
		} else {
			System.out.println("ÍMPAR E");		
		}
		if (valor >= 0) {
			System.out.println("POSITIVO");

		} else {
			System.out.println("NEGATIVO");
		}
		
	}

}
