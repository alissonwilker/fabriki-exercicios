import java.util.Scanner;
public class LDP7141 {

	public static void main(String[] args) {
		Scanner PesoP = new Scanner(System.in);
		int n1, exce, Mult;
		int PesoL = 50;
		
		n1 = PesoP.nextInt();
		exce = n1 - PesoL;
		Mult = exce * 4;
		if(n1 > PesoL){
		System.out.print("excedente = "+exce+"\n");
		System.out.print("multa = "+Mult+"\n");
		}else {
				System.out.print("excedente = "+ 0 +"\n");
				System.out.print("multa = "+ 0 +"\n");
		}
		

}
}
