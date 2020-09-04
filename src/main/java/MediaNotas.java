import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double numAlunos, nota, soma=0, media;
		
		numAlunos = sc.nextDouble();
		double[] notas = new double[(int) numAlunos];
		
		for (int a=0;a<numAlunos;a++) {
			nota = sc.nextDouble();
			notas[a] = nota;
			soma = soma + nota;}
		
		media = soma/numAlunos;
		
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);
		
		System.out.println(formatador.format(media));
		
		for (int b=0;b<numAlunos;b++) {
			System.out.println(formatador.format(notas[b]));}	

	}
}
