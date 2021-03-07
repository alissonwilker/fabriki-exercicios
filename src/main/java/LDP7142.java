import java.util.Scanner;
public class LDP7142{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int C,H,E,PrecoHora,PrecoExcedente;
			E=0;
			PrecoHora=10;
			PrecoExcedente=20;
			C = entrada.nextInt();
			H = entrada.nextInt();
			if(H>50){
				E = H-50;
			}
			System.out.println("código = " +C);
			System.out.println("salarioExcedente = " +(E*PrecoExcedente));
			System.out.println("salarioTotal = " +(E*PrecoExcedente+(H - E)*PrecoHora));
	}
}
