	import java.util.Scanner;
	
	public class LDP7141 {
	
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			int peso = entrada.nextInt();
			int limite = 50;
			int excedente = (peso - limite); 
			int multa = (excedente * 4 );
			
			entrada.close();
			if(peso <= limite) {
				System.out.println("excedente = 0");
				System.out.println("multa = 0");
			} else {
				System.out.println("excedente = " + excedente);
				System.out.println("multa = " + multa);
			}
	
		}
	
	}
