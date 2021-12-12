public class LDP7141 {
	private static  Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;
	
	public static void main(String[] args) {
		int peso = entrada.NextInt();
		
		if (peso > 50) {
			System.out.print("Excesso de peso");
		} else  {
			System.out.println("Peso Correto");		
		}
		
		
		if (peso <= 50) {
			System.out.print("Peso Correto");	
		} else  {
			System.out.println("Peso Correto");		
		}
		
		
	}

}
