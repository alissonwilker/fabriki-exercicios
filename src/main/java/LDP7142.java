import java.util.Scanner;
	public class LDP7142 {
		private static Scanner entrada = new Scanner(System.in);
		public static void main(String[]args){
			
			int cod=entrada.nextInt();
			int ht=entrada.nextInt();
			int exed=0;
			int st=0;
			
			if (ht>50){
				exed=(ht-50)*20;
				st= (50*10)+exed;		
			}
			else{
				exed=0;
				st=ht*10;
			}
			
			System.out.println("codigo = "+cod);
			System.out.println("salarioExcedente = "+exed);
			System.out.println("salarioTotal = "+st);
			