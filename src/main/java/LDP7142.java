import java.util.Scanner;

public class LDP7142 {
     private static Scanner input = new Scanner(System.in);
	
public static final int hora_trabalhada = 10;
public static final int hora_extra_trabalho = 20;
	public static void main(String[]args) {
           	 int codigo = input.nextInt();		
		 int horas = input.nextInt();
		 int salarioTotal = 0;
		 int salarioExcedente = 0;	
		   
	if(horas <= 50) {
	salarioTotal = horas * hora_trabalhada;	
System.out.println("codigo = " + codigo);
			System.out.println("salarioExcedente = " + salarioExcedente);
			System.out.println("salarioTotal = " + salarioTotal);
		
		   }else {
	int horasExtra = horas - 50; 
	salarioTotal = (50 * hora_trabalhada) + (horasExtra * hora_extra_trabalho);	
System.out.println("codigo = " + codigo);
			System.out.println("salarioExcedente = " + horasExtra * hora_extra_trabalho);
			System.out.println("salarioTotal = " + salarioTotal);
		   }
	}
}
