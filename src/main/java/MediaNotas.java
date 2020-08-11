import java.text.NumberFormat;
 import java.util.Locale;
 import java.util.Scanner;

 public class MediaNotas {

 	public static void main(String[] args) {

 		Scanner scanner = new Scanner(System.in);
 		int quantidadeNotas = scanner.nextInt();
 		int nota;
 		int total=0;
 		String notas = "\n";
 		for (int i = 1; i <= quantidadeNotas; i++) {
 			nota = scanner.nextInt();
 			total +=nota;
 			notas += "nota "+i+" = "+nota+",0\n";
 		}

 		float media = (float) total/quantidadeNotas;
 		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
 		formatador.setMinimumFractionDigits(1);
 		formatador.setMaximumFractionDigits(1);

 		System.out.print("media = "+formatador.format(media)+notas);	

 	}

 }
