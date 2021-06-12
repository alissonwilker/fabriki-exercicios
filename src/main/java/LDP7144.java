import java.util.Scanner;

public class LDP7144 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner LerNumero  = new Scanner(System.in);
		
		System.out.print("Digite o valor: ");
		int n1 = LerNumero.nextInt();
		
		if(n1 % 2 == 0 && n1 >= 0) {
			System.out.println("PAR E POSITIVO");
			
		} else if(n1 % 2 != 0 && n1 >= 0) {
			System.out.println("IMPAR E POSITIVO");
			
		} else if(n1 % 2 == 0 && n1 < 0) {
			System.out.println("PAR E NEGATIVO");
			
		} else if(n1 % 2 != 0 && n1 < 0) {
		System.out.println("IMPAR E NEGATIVO"); 
		
		}
		
	}
