import java.util.Scanner;

public class LDP7144 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner v1 = new Scanner(System.in);
		
		int n1;
		
		System.out.printf("");
		n1 = v1.nextInt();
		
		
		if(n1 >= 0) {
			System.out.printf("POSITIVO E ");	
		}
		else {
			System.out.printf("NEGATIVO E ");	
		}
		
		if(n1 % 2 == 0 ) {
			System.out.printf("PAR");	
		}
		else {
			System.out.printf("IMPAR");	
		}
		

	}

}
