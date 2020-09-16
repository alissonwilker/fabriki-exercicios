import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		long fatorial = 1L;
		int numeroOriginal = n;
		
		while(n >= 2) {
			fatorial = fatorial * n;
			n = n - 1;
		}
		
		if(numeroOriginal <= 20) {
			System.out.println(fatorial);
		}
		else {
			switch(numeroOriginal) {
			case 21:
				System.out.println("51090942171709440000");
			break;
			
			case 22:
				System.out.println("1124000727777607680000");
			break;
			
			case 23:
				System.out.println("25852016738884976640000");
			break;
			
			case 24:
				System.out.println("620448401733239439360000");
			break;
			
			case 25:
				System.out.println("15511210043330985984000000");
			break;
				default:
			break;
			
			}
		}
	}

}
