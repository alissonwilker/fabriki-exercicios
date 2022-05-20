import java.util.Scanner;

public class LDP7142 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int codigo,horastrabalhadas,horaextra,PrecoHora,PrecoExcedente;		
		boolean fim = true;
		
		{
			horaextra=0;
			PrecoHora=10;
			PrecoExcedente=20;
			codigo = entrada.nextInt();
			horastrabalhadas = entrada.nextInt();
			int salarioNormal;
	

			if(horastrabalhadas>50){
				horaextra = horastrabalhadas-50;
				salarioNormal = 500;
			}
			else {
				salarioNormal = horastrabalhadas*10;
			}
			System.out.println("codigo = "+codigo );
			System.out.println("salarioExcedente = " +(horaextra*PrecoExcedente));
			System.out.println("salarioTotal = "+(horaextra*PrecoExcedente+salarioNormal));
					
			{				
			}

		}
	}
}

