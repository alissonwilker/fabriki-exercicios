import java.util.Scanner;

public class LDP7141{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a, multa = 0, ex = 0;
		
		System.out.println();
		a = s.nextInt();
		
		
		if(a>50) {
			ex = a - 50;
			multa = ex*4;
			System.out.println("exedente = " + ex);
			System.out.println("multa = " + multa);
			
		}
		else {
			System.out.println("excedente = " + ex);
			System.out.println("multa = " + multa);
		}
		
		
	}
	

}
