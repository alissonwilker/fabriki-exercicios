import java.util.Scanner;

public class LDP7142{

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int cod_operario, sal_excedente = 0,sal_total = 0, tot_horas_extras;
		
		cod_operario = entrada.nextInt();
		tot_horas_extras = entrada.nextInt();
		
		if(tot_horas_extras > 50) {
			sal_excedente = tot_horas_extras - 50;
			sal_total = sal_excedente * 20 + ((tot_horas_extras - sal_excedente) * 10);
		}else {
			sal_total = tot_horas_extras * 10;
		}
		
		System.out.println("codigo = " + cod_operario);
		System.out.println("salarioExcedente = "  + sal_excedente * 20);
		System.out.println("salarioTotal = " + sal_total);
	
	}
}
