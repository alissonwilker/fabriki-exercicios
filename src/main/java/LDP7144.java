import java.util.Scanner;

public class LDP7144 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner v1 = new Scanner(System.in);
		
		int n1;
		
		System.out.printf("digite o número: ");
		n1 = v1.nextInt();
		
		if(n1<0) {
			System.out.printf("o seu número é negativo ");	
		}
		else {
			System.out.printf("o seu número é positívo ");	
		}
		
		if(n1 > 0 && n1 % 2 == 0 ) {
			System.out.printf("e par");	
		}
		else {
			System.out.printf("e impar");	
		}
		

	}

}
