import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {
	public static void main(String[] args) {
		double total=0;
		Scanner leia=new Scanner(System.in);
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);
		

		int n=leia.nextInt();
		int alunos[]=new int[n];
		
		for (int i = 0; i < alunos.length; i++) {
			alunos[i]=leia.nextInt();
			total+=alunos[i];
		}
		
		System.out.println("media = "+formatador.format((total/alunos.length)));
		
		for (int j = 0; j < alunos.length; j++) {
			System.out.println("nota "+(j+1)+" = "+formatador.format(alunos[j]));
		}
		
	}
}
