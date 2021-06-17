import java.util.Scanner;

public class LDP7143 {
	public static void main(String[] args) {
		
		Scanner lerNumeros = new Scanner(System.in);
		
		int n1 = lerNumeros.nextInt();
		int n2 = lerNumeros.nextInt();
		int n3 = lerNumeros.nextInt();
		int n4 = lerNumeros.nextInt();

		if(n3*n3 >= 1000) {
	        System.out.println("c2 = "+ n3*n3);
		} else {
			System.out.println("a = "+ n1);
			System.out.println("b = "+ n2);
			System.out.println("c = "+ n3);
			System.out.println("d = "+ n4);
			System.out.println("a2 = "+ (n1*n1));
			System.out.println("b2 = "+ (n2*n2));
			System.out.println("c2 = "+ (n3*n3));
			System.out.println("d2 = "+ (n4*n4));
		}
	}	
}
