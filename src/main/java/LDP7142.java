import java.util.Scanner;

public class LDP7142 {

	private static Scanner input = new Scanner(System.in);
	
	public static final int Valor_hora = 10;
	public static final int Valor_hora_extra = 20;
	public static void main(String[]args) {
		  int codigo = input.nextInt();		
		   int horas = input.nextInt();
		   int salarioTotal = 0;
		   int salarioExcedente = 0;	
		   
		   if(horas <=50) {
			salarioTotal = horas * Valor_hora;	
			System.out.println("codigo = " + codigo);
			System.out.println("HoraExcedente = " + salarioExcedente);
			System.out.println("salarioTotal = " + salarioTotal);
			
			
		   }else {
			int horasExtra = horas - 50; 
			salarioTotal = (50 * Valor_hora) + (horasExtra * Valor_hora_extra);	
			System.out.println("codigo = " + codigo);
			System.out.println("HoraExcedente = " + horasExtra * Valor_hora_extra);
			System.out.println("salarioTotal = " + salarioTotal);
		   }				
	}
}
