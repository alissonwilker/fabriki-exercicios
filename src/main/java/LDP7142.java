import java.util.*;
public class LDP7142 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int codigo, excedente=0,salariototal = 0, horas;
		codigo=input.nextInt();
		horas=input.nextInt();
		if(horas>50) {
			excedente = horas-50;
			salariototal= excedente*20+ ((horas-excedente)*10);
		}else {
			salariototal= horas*10;
		}
		
		System.out.println("codigo = "+codigo);
		System.out.println("salarioExcedente = "+excedente*20);
		System.out.println("salarioTotal = "+salariototal);
	}
}
