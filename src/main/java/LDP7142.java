import java.util.Scanner;

public class LDP7142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codigo, hora, horaExtra =0;
		int salarioTotal, salarioExcedente = 0, valorHora = 10, valorExtra = 20 ;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		codigo = entrada.nextInt();
		hora = entrada.nextInt();
		if (hora > 50) {
			horaExtra = hora - 50;
			salarioExcedente = horaExtra * valorExtra;
			
		}salarioTotal = ((hora - horaExtra) * valorHora) + salarioExcedente;
		
		System.out.println("codigo = " + codigo);
		System.out.println("salarioExcedente = "+salarioExcedente);
		System.out.println("salarioTotal = "+salarioTotal);

	}

}
