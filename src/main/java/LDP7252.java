public class LDP7252 {
	
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;	

	public static void main(String[] args) {

		int casasTabuleiro = 64, graos = 1;			
		double graosCasa = 1;
		
		for(int x = 1;x < casasTabuleiro;x++){
			graosCasa = graosCasa*2;
			graos += graosCasa;
		}

		System.out.println("totalGraos = "+graos);

	}
}
