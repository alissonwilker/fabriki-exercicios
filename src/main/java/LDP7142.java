import java.util.Scanner;

public class LDP7142 {

	public static void main(String[] args) {
		Scanner entrada=new scanner(Sistem.in);
		int C;
		int N,E =0, PrecoHora,PrecoExcedente;
		boolean continuar =true;
		char texto;
		do {
		 E = 0;
		 precohora=10;
		 precoexcedente=20;
		 System.out.println("Digite o codico do operario:");
		 C = entrada.nextInt();
		 System.out.println("Digite o numero de horas trabalhada:");
		 N = entrada.nextInt();
		 
			if(N > 50){
				
			E = N-50;
			}
				
			System.out.print("\ncodigo:"+ C +"\nsalario:"+((N - E)*10) +"\nsalario excedente:"
			+ (E * PrecoExcedente) + "\nsalario total:" +(E * PrecoExcedente + (N - E) * PrecoHora)
			+ "\n\n Deseja encerra o programa?(S/N)");
			texto = entrada.nex().charAt(0);
			if (texto =="S"|| texto =="S"){
				continuar = false;
				
			}
		}while (continuar);
	}
