public class LDP7252 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mult =1;
		int totalGraos =1;
		for(int i =1; i< 64; i++) {
			mult = mult * 2;
			totalGraos += mult;
		}
		System.out.println("totalGraos = "+ totalGraos);
}
}
