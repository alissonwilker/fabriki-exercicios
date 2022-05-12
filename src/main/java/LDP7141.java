import java.util.Scanner;


public class LDP7141 {
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
			int pesopeixe = entrada.nextInt();
			int pesoexc = (pesopeixe-50);
			int multa = (pesoexc * 4);
			
			if(pesopeixe > 50) {
				System.out.println("excedente = " + pesoexc);
				System.out.println("multa = " + multa);
				
				
			}
			
			else if(pesopeixe <= 50) {
				System.out.println("excendente = " + 0 );
				System.out.println("multa = " + 0);
				
			}
	
	
	

}
}
