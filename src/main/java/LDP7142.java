import java.util.Scanner;

public class LDP7142 {
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
			int codigo = entrada.nextInt();
			int horastrab = entrada.nextInt();
			int horasextra = (horastrab - 50);
			
			
			
			
		
			
			
			int[] valorhora = new int[4];
			valorhora[0] = 10;
			valorhora[1] = 20;	
			valorhora[3] = horasextra * valorhora[1];
			
			
	 if(horastrab > 50) {
		 System.out.println("codigo = " + codigo );
		 System.out.println("salarioExcedente = " + valorhora[3]);
		 System.out.println("salarioTotal = " + (500 + valorhora[3])) ;
		
		 
	 }
	 
	 else {
		 valorhora[2] = horastrab * valorhora[0];
		 
		 System.out.println("codigo = " + codigo );
		 System.out.println("salarioExcedente =  " + 0 );
		 System.out.println("salarioTotal = " + valorhora[2]);
	 }
	 
			
			
			
			
			
			
			


			
			
			
			
	

}
}
