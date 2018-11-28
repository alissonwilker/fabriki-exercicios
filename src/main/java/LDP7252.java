public class LDP7252 {
	public static void main (String[]args) {
		int quadrados = 0;
		int graos = 1;
		
		while (quadrados <= 64){
			graos = graos + (graos*2);
		}
		System.out.println("totalGraos = " + graos);
	}

}
