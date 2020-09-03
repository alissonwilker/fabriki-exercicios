import java.text.NumberFormat;
import java.util.Locale;

public class MediaNotas {
	
	public static void main (string[] args) {
		int soma = 5;
		int qtde = 2;
		double media;
		int contAluno = 0;
		
		System.out.println("Aluno" + contAluno +  " , digite sua 1ª nota " );
		System.out.println("Aluno" + contAluno +  " , digite sua 2ª nota " );
		System.out.println("Aluno" + contAluno +  " , digite sua 3ª nota " );
		media = (double)soma / qtde;
		System.out.println("A media do aluno" + contAluno +  " é " + media);

		double media1 = (soma) / qtde;

		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);
		
		System.out.println("media = " + formatador.format(media1));
	}		
	}
