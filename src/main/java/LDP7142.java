import java.util.Scanner;
public class LDP7142 {
	private static Scanner entrada = new Scanner(System.in);
	
	public static void main (String [] args) {
			
		int codigo;
		int horasTrabalhadas;
		int horaExcedente;
		int precoHora;
		int precoExcedente;
		int salarioExcedente = 0;
		int salarioTotal;
		
		
		 precoHora = 10;
		 precoExcedente = 20;
		 codigo = entrada.nextInt(); 
		 horasTrabalhadas = entrada.nextInt();
		 
		     if(horasTrabalhadas > 50){
		    	 horaExcedente = horasTrabalhadas - 50;	
		    	 salarioExcedente = horaExcedente * precoExcedente;
		    	 salarioTotal =  (precoHora * 50) + salarioExcedente;
		    	 
		     }else{
		    	 salarioTotal = horasTrabalhadas * precoHora;
		     
		     }   
		     
		     System.out.println("codigo = " + codigo); 	 
		     System.out.println("salarioExcedente = " + salarioExcedente);
		     System.out.println("salarioTotal = " + salarioTotal);
		
		    
	}

}