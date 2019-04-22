
public class LDP7252{

	public static void main(String[] args) {
		double graos[][] = new double[8][8];
		double total = 0;
		double multiplicar = 1;

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {

				graos[i][j] = multiplicar;
				multiplicar = graos[i][j] * 2;
				total += multiplicar;

			}
		}

		System.out.println( total);
	}

}
