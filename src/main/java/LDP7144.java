import java.util.Scanner;

public class LDP7144 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		
			//System.out.println();
			num = in.nextInt();

			if(num % 2 == 0 && num >=0){
				System.out.print("PAR E POSIVITO");
				 
			}
			if(num<0 && num % 2 == 0 ){
				System.out.print("PAR E NEGATIVO");
				
			}
			if(num>0 && num % 2 != 0 ){
				System.out.print("ÍMPAR E POSITIVO"); 
				
			}else{
			System.out.print("ÍMPAR E NEGATIVO"); 
			}
	}
}

