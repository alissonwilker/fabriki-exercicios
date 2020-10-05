import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class LDP7143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		
		int a = scanner.nextInt();
		System.out.println("a=" + a);
		
		int b = scanner.nextInt();
		System.out.println("b="+ b);
		
		int c = scanner.nextInt();
		System.out.println("c="+ c);
		
		int d = scanner.nextInt();
		System.out.println("d="+ d);
		
		int quadrado1 = a * a;
                int quadrado2 = b * b;
                int quadrado3 = c * c;
                int quadrado4 = d * d;
        
			
		//for(quadrado3 = 0; quadrado3 >= 1000; quadrado3++){
			//System.out.println(quadrado3 );	
		//		}
		
        if (quadrado3 >= 1000) { 
	        
	        System.out.println(quadrado3);
	        }
                
	        System.out.println("a2=" + quadrado1 );
	        System.out.println("b2=" + quadrado2 );
	        System.out.println("c2=" + quadrado3 );
	        System.out.println("d2=" + quadrado4 );
				
		

	}

}
