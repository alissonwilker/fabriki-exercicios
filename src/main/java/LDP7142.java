	import java.util.Scanner;
	
	public class LDP7142 {
	
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			int cod = entrada.nextInt();
			int horas = entrada.nextInt();
			entrada.close();
			
			int[] valorhora	= new int[4];
			valorhora[0] = 10;
			valorhora[1] = 20;
			valorhora[2] = horas * valorhora[0];
			valorhora[3] = (horas - 50)*valorhora[1];
			
		
			
			if(horas <= 50) {
				System.out.println("codigo = " + cod);
				System.out.println("salarioExcedente = 0");
				System.out.println("salarioTotal = " + valorhora[2]);
			}
			else {
				System.out.println("codigo = " + cod);
				System.out.println("salarioExcedente = " + valorhora[3]);
				System.out.println("salarioTotal = " + (valorhora[2] + valorhora[3]));
				
			}
			
	
		}
	
	}
