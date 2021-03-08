import java.util.Scanner;

public class LDP7142 {
	private static Scanner entrada = new Scanner(System.in);	
	public static void main(String[] args) {
	    
		int codigo = 0;
		int horas = 0;
	    int salarioExcedente = 0;
	    int salarioTotal = 0;
	    	
	    codigo = entrada.nextInt();
	    horas = entrada.nextInt();
	    
	    salarioExcedente = horas - 50;
	    	    
	    if (salarioExcedente < 1) {
	    salarioExcedente = 0;
	    salarioTotal = horas*10;
	    System.out.println ("codigo = " + codigo);
	    System.out.println ("salarioExcedente = " + salarioExcedente);
	    System.out.println ("salarioTotal = " + salarioTotal);	    
	    }
	    else {
		salarioExcedente = (horas - 50) * 20;
		salarioTotal = salarioExcedente + 500;
		System.out.println ("codigo = " + codigo);
		System.out.println ("salarioExcedente = " + salarioExcedente);
		System.out.println ("salarioTotal = " + salarioTotal);	    
	    }
	}
}
