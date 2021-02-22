import java.text.DecimalFormat;

public class LDP7252 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat saida = new DecimalFormat("0");
		double mult =1;
		double totalGraos =1;
		for(int i =1; i< 64; i++) {
			mult = mult * 2;
			totalGraos += mult;
		}
		//String str = String.valueOf(totalGraos);
		System.out.println("totalGraos = "+ saida.format(totalGraos));
}
}
