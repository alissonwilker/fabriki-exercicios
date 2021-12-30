import java.util.Scanner;

public class MediaNotas {
	private static Scanner entrada = new Scanner(System.in);
		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			int qtd, soma=0;
			laco1:while (true){
				System.out.println("Digite a quantidade de notas que deseja ler: ");
				qtd = sc.nextInt();
				if(qtd>0) {
					break laco1;
				}
			}
			String[] valores = new String[qtd];
			for (int i=0; i < qtd;	i++) {
				float nota;
				nota = sc.nextInt();
				while (nota < 0) {
					nota = sc.nextInt();
				}
				String str = String.valueOf(nota);
				valores[i] = str;
				soma += nota;
			}
			
			double media = soma / qtd;
			NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

			formatador.setMinimumFractionDigits(1);

			formatador.setMaximumFractionDigits(1);
			System.out.println("media = " + media);
			int j = 0;
			while (j<qtd) {
				System.out.println("nota "+(j+1)+" = " + valores[j++]);
			}
		}
}
