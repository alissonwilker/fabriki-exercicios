import java.util.Scanner;
	public class LDP7142 {
		private static Scanner codigo = new Scanner(System.in);
		private static Scanner horas = new Scanner(System.in);
		
		public static void main(String[]args){
			
			int cod=codigo.nextInt();
			int ht=horas.nextInt();
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
			

}
	}
	