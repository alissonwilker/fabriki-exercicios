import java.util.Scanner;

public class LDP7142 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int codigo= entrada.nextInt();;
		int TotalHoras= entrada.nextInt();;
		int salarioExcedente =0;
		int salarioTotal;
		entrada.close();
		
		if (TotalHoras<=50) { 
			salarioTotal = TotalHoras*10; 
		} else {
			salarioExcedente = ((TotalHoras - 50)*20);
			salarioTotal = 	(50*10) + salarioExcedente; 
	    }
		System.out.println("codigo = " +codigo);
		System.out.println("salarioExcedente = " +salarioExcedente);
		System.out.println("salarioTotal = " +salarioTotal);
	}	
}
