import java.util.Scanner;

public class LDP7251 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0, maior = 0;

		Scanner x = new Scanner(System.in);
		
		n = x.nextInt();
		
		while(n != 0) {
			
			if(maior < n) {
				
			maior = n;
			
			}
			
			if(maior < n){
				maior = n;
			}
		
			n = x.nextInt();
			
		}
		
		System.out.println("maior = "+ maior);
		
		
		x.close();
	}

}

		while(n != 0) {
			
			if(maior < n) {
				
			maior = n;
			
			}
			
			if(maior < n){
				maior = n;
			}
		
			n = x.nextInt();
			
		}
		
		System.out.println("maior = "+ maior);
		
		
		x.close();
	}

}
