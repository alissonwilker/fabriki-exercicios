public class LDP7252 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int graos = 1;
		int graosCasa = 1;

		for (int i = 1; i <= 64; i++) {
			graosCasa *= 2;
			graos += graosCasa;
		}

		System.out.println("totalGraos = " + graos);
	}

}
