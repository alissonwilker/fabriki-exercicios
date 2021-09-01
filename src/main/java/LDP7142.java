import java.util.Scanner;

public class LDP7142
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    int cod = entrada.nextInt();
	    int horas = entrada.nextInt();
	    int exc = 0;
	    int total = 0;
	    if(horas <= 50){
	        total = horas * 10;
	    } else {
	        total = 500 + ((horas - 50) * 20);
	        exc = total - 500;
	    }

		System.out.println("codigo = " + cod);
		System.out.println("salarioExcedente = " + exc);
		System.out.println("salarioTotal = " + total);
	}
}
