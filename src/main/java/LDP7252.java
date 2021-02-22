public class LDP7252 {

	public static void main(String[] args) {

		long totalGraos = 1L;
		long totalCasa = 1L;
		int casas = 64; //Quantidade de casas no tabuleiro

		for (int i = 2; i <= casas; i++) {
			
			totalCasa = 2*totalCasa;
			totalGraos = totalGraos + totalCasa;
						
		}
		
		System.out.println( "totalGraos = " + totalGraos); 
	}
}
