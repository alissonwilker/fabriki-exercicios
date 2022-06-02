public class LDP7253 {

	public static void main(String[] args) {
		int mult[] = new int[100];
		for (int i=0; i<mult.length; i++) {
			mult[i] = i+1;
			if (mult[i] % 10 == 0) {
				System.out.println("Multiplo de 10");
			}
		}

	}

}
