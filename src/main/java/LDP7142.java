import java.util.Scanner;
public class LDP7142{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int C;
		double N,E=0,PrecoHora,PrecoExcedente;
		boolean continuar = true;
		do{
			E=0;
			PrecoHora=10;
			PrecoExcedente=PrecoHora*2;
			C = entrada.nextInt();
			N = entrada.nextDouble();
			if(N>50){
				E = N-50;
			}
			System.out.println("\ncódigo = "+C+"\nsalarioExcedente = "+(E*PrecoExcedente)+"\nsalarioTotal = "+(E*PrecoExcedente+N*PrecoHora));
		}while(continuar);
	}
}
