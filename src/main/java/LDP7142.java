import java.util.Scanner;

public class LDP7142 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		final int workHour = 10;
		final int extraHour = 20;
		int wageTotal, wageOver = 0;
		
		int code = entrada.nextInt();
		int totalHour = entrada.nextInt();
		entrada.close();
		
		wageTotal = totalHour * workHour;
		if(totalHour > 50)
		{
			wageOver = (totalHour - 50) * extraHour;
			wageTotal = 500 + wageOver;
		}
		
		System.out.println("codigo = " + code);
		System.out.println("salarioExcedente = " + wageOver);
		System.out.println("salarioTotal = " + wageTotal);
	}
}
