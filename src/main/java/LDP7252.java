public class LDP7252 {

	public static void main(String[] args) {

		double totalGraos = 1;
		double totalCasa = 1;
		int casas = 64; //Quantidade de casas no tabuleiro

		for (int i = 2; i <= casas; i++) {
			
			totalCasa = 2*totalCasa;
			totalGraos = totalGraos + totalCasa;
			
		}
		
		System.out.println( "totalGraos = " + totalGraos); 
	}
}
