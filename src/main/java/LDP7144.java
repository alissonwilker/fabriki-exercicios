import java.util.Scanner;

public class LDP7144 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int num = leitor.nextInt();
		
		
			if(num % 2 == 0 && num >=0){
				System.out.print("PAR E POSIVITO"); 
				
			}else if (num % 2 == 0 && num < 0){
				System.out.print("PAR E NEGATIVO");
				
			}else if(num % 2 != 0 && num >= 0 ){
				System.out.print("ÍMPAR E POSITIVO"); 
			 
			}else if (num % 2 != 0 && num < 0) {
				System.out.print("ÍMPAR E NEGATIVO"); 
			}
	}
}

