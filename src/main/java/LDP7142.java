import java.util.Scanner;

public class LDP7142{
	
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 
		
		int codigo = entrada.nextInt();
		int horas = entrada.nextInt();
		int valorextra = (horas-50)*(20);
		int valortotal = valorextra + 500; 
		
		if (horas>50) {
			
			System.out.println("codigo = "+ (codigo));
			System.out.println("salarioExcedente = "+ (valorextra));
			System.out.println("salarioTotal = "+ (valortotal));
		}
		
		else {
			
			System.out.println("codigo = "+(codigo));
			System.out.println("salarioExcedente = "+ 0);
			System.out.println("salarioTotal = "+(horas)*(10));
		}
		entrada.close();
		 
	}
	
}
