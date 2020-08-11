import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n;
		int maior = -1;
		int num;
		
		do {
			System.out.print("Digite um número positivo maior que zero:: "); 
			num =  input.nextInt();
			if (num>maior) {
				
				maior=num;}
		}
	    while((num >0 || num <0));
	    
	     	
	    	
	    
			
		System.out.print("Maior =" +maior);
		
	}
	
}
