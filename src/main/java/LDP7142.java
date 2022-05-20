import java.util.Scanner;

public class LDP7142 {
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 
		int codigo = entrada.nextInt();
		int horas = entrada.nextInt();
		entrada.close();
		int horaextra = (horas-50)*20;
		int salario = horaextra+500;
		
		
		
		
		
		if (horas<=50){
			System.out.println ("codigo = " + codigo);
			System.out.println("salarioExcedente = 0");
			System.out.println("salarioTotal = "+ horas*10);
			}
		
		
		else {
			
			System.out.println("codigo = "+codigo);
			System.out.println("salarioExcedente = "+ horaextra);
			System.out.println("salarioTotal = "+salario);
		
		}
		 
	}
}
