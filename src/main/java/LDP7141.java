import java.util.Scanner;

public class LDP7141 {
	public static void main(String[]args){
		int peso, exc, multa;
		
		Scanner sc1=new Scanner(System.in);
		peso = sc1.nextInt();
		
		exc = peso - 50;
		multa = excesso * 4;
		
		if (exc > 1) {
			System.out.println("excedente = "+exc);
			System.out.println("multa = "+multa);
		}
		else {	
			System.out.println("excedente = 0");
			System.out.println("multa = 0");
		}
	}
}
