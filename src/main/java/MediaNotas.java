// Este é o código normal, sem uso do new Locale


import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {
	private static Scanner entrada = new Scanner(System.in);
		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			float soma = 0;
			int qtd;
			laco1:while (true){
				//System.out.println("Digite a quantidade de notas que deseja ler: ");
				qtd = sc.nextInt();
				if(qtd>0) {
					break laco1;
				}
			}
			String[] valores = new String[qtd];
			for (int i=0; i < qtd;	i++) {
				int nota;
				nota = sc.nextInt();
				while (nota < 0) {
					nota = sc.nextInt();
				}
				double nota2 = nota;
				String str = String.valueOf(nota2);
				str = str.replace('.', ',');
				valores[i] = str;
				soma += nota;
			}
			
			double media = soma / qtd;

			NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

			formatador.setMinimumFractionDigits(1);

			formatador.setMaximumFractionDigits(1);

			System.out.println("media = " + formatador.format(media));
			int j = 0;
			while (j<qtd) {
				System.out.println("nota "+(j+1)+" = " + valores[j++]);
			}
		}
}
