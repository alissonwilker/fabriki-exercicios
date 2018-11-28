public class LDP7252 {
	public static void main (String[]args) {
		int quadrado = 0;
		int graos = 1;
		
		do {
			graos = graos + (graos*2);
			
			quadrado ++;
		}while (quadrado <= 63);
					
		
		
		System.out.println("totalGraos = " + graos);
	}
}
