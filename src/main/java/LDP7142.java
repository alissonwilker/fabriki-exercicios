import java.util.Scanner;

public class LDP7142 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int codigo = 0, horas = 0, horaextra = 0, salario = 0, salarioexcedente = 0, salariototal = 0;
		
		codigo = s.nextInt();
		horas = s.nextInt();
		
		if(horas > 50) {
			horaextra = horas - 50;
			salario = horaextra*10;
			salarioexcedente = horaextra*20;
			salariototal = 50*10 + salarioexcedente;
		
		}
		
		else {
			salariototal = horas*10;
			
			
		}
		System.out.println("codigo = "+codigo);
		System.out.println("salarioExcedente = "+salarioexcedente);
		System.out.println("salarioTotal = "+salariototal);


	}

}
