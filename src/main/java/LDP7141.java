import java.util.Scanner;

public class LDP7141 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int num = leitor.nextInt();
		
		
			if(num > 50){
				System.out.println("excedente = "+(num - 50));  
				System.out.println("multa = "+(num - 50)*4);  
			//}if(num == 50){ 
				//System.out.println(num - 50);
				//System.out.println(num - 50); 
		}else { 
			System.out.println("excedente = "+(num - num));
			System.out.println("multa = "+(num - num));
		}
	}
}	
