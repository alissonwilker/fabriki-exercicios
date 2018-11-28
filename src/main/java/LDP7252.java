public class LDP7252 {
	public static void main (String[]args) {
		int quadrado = 0;
		int graos = 1;
		
		while (quadrado <= 64){
			graos = graos + (graos*2);
			
			quadrado ++;
			
			if (quadrado == 65) {
				graos = graos -(graos/2);	
			}
		}
		
		System.out.println("totalGraos = " + graos);
	}
}
