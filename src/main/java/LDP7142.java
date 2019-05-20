import java.util.Scanner;

public class LDP7142 {

	public static void main(String[] args) {
		
		int ht=0;
		int salariototal=0;
		int salarioextra = 0;
		int codigo = 0;
		int horaextra = 0;
		
		Scanner entrada = new Scanner(System.in);
		//codigo = entrada.nextInt();
		
		//System.out.println("Digite o codigo do seu operário");
		codigo = entrada.nextInt();
		//System.out.println("Digite o numero de horas trabalhadas");
		ht = entrada.nextInt();
		
				
		if(ht > 50) {
			horaextra = ht - 50;
			salarioextra = horaextra * 20;
			salariototal = salarioextra + 500;
		
		} else {
			salariototal = ht *10;
		 }
		System.out.println("codigo = " + codigo);
		System.out.println("salarioExcedente = " + salarioextra);
		System.out.println("salarioTotal = " + salariototal);

	}

}
