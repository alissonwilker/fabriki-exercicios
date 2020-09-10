import java.util.Scanner;

public class LDP7251{

		
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num =  scanner.nextInt();
		int maior = num;
		
		while(num != 0){
			num =  scanner.nextInt();
			if (maior<num) {
				
				maior=num;}
			
		}      	
	 			
		System.out.print("maior = " +maior);
		
		
	
	}
}
