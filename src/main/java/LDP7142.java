import java.util.Scanner;

public class LDP7142 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int horas = sc.nextInt();
		int excedente = 0;
		int total;
		
		if(horas > 50) {
			excedente = (horas - 50) * 20;
			total = excedente + 500;
		} else {
			total = horas * 10;
		}
		
		System.out.println("codigo = " + codigo);
		System.out.println("salarioExcedente = " + excedente);
		System.out.println("salarioTotal = " + total);
	}
}
