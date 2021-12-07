import java.util.Scanner;

public class LDP7144 {
		@SuppressWarnings("resource")
		public static void main(String[] args) {
			int num = 0;
			do {
				System.out.print("Digite um numero:  ");
				Scanner in = new Scanner(System.in);
				num = in.nextInt();
				in.nextLine();
				if(num%2==0 && num>=0){
					System.out.println("PAR E POSITIVO"); 
					
				}else if (num%2==0 && num<0){
					System.out.println("PAR E NEGATIVO");
					
				}else if(num%2!=0 && num>=0 ){
					System.out.println("ÍMPAR E POSITIVO"); 
				 
				}else if (num%2!=0 && num<0) {
					System.out.println("ÍMPAR E NEGATIVO"); 
				}
			} while (num != 0);
			
		}
	}
