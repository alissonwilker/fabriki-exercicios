import java.util.Scanner;
 
public class LDP7251 { 
	public static void main(String[] args) {
		
		int menor=0;
		int maior=0; 
		
		Scanner leitor = new Scanner(System.in); 
		int num = leitor.nextInt();  
		    
		while (num == 0) { 
		
		if (num > maior){
			System.out.println(" maior =  " + num );
		
			
		}else if(num < menor) { 
			System.out.println(" menor =  " + num );
		
			}
		}	
	}
}
