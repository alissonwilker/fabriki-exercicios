public class LDP7252 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mult =1;
		double totalGraos =0;
		for(int i =1; i<=64; i++) {
			mult *= 2;
			totalGraos += mult;
		}
		System.out.println("totalGraos = "+ totalGraos);
}
}
