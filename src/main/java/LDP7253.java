public class LDP7253 {
	
	public static void main(String[] args) {
		
		int multiplo = 10;
		
		for (int i = 1; i <= 100; i++) {
			if (i == multiplo) {
				System.out.println("Multiplo de 10");
				multiplo += 10;
			}
		}
	}

}
