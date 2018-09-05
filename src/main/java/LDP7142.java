import java.util.Scanner;

public class LDP7142 {
	private static Scanner codigo = new  Scanner(System.in);
	private static Scanner horas = new  Scanner(System.in);
	
		public static void main(String[]args){
			
			String hrs = horas.nextLine();
			String cod = codigo.nextLine();
			
			int hor = Integer.parseInt(hrs);
			int codi = Integer.parseInt(cod);
			
			if(hor<50){
				hor = hor*10;
					System.out.println("código = " +codi);
					System.out.println("salarioEscedente = 0");
					System.out.println("salarioTotal = " +hor);
				}
			else if(hor>50){
				int esced =((hor-50)*20)+50*10;
				int salar = esced + 50*10;
					System.out.println("código = " +codi);
					System.out.println("salarioEscedente = " +esced);
					System.out.println("salarioTotal = " +salar);
				}
			
		}
}
