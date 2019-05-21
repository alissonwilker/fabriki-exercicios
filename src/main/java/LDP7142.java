import java.util.*;
public class LDP7142 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cod, exc=0,salario = 0, horas;
		cod=entrada.nextInt();
		horas=entrada.nextInt();
		if(horas>50) {
			exc = horas-50;
			salario = exc*20+ ((horas-exc)*10);
		}else {
			salario = horas*10;
		}
		entrada.close();
		
		System.out.println("codigo = "+cod);
		System.out.println("salarioExcedente = "+exc*20);
		System.out.println("salarioTotal = "+salario);
	}
}
