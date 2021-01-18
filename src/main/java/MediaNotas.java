import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {
	private static Scanner entrada = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int qtdeNotas = entrada.nextInt();
		
		
		if (qtdeNotas ==1) {
			int [] notas = new int [1];
			notas[0] = entrada.nextInt();
			double media = notas[0] /qtdeNotas;
			
			NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
			formatador.setMinimumFractionDigits(1);
			formatador.setMaximumFractionDigits(1);

			System.out.println("media = " + formatador.format(media));
			System.out.println("nota 1 = " + formatador.format (notas[0]));
	
		}
		
		else if (qtdeNotas ==2) {
			int [] notas = new int [2];
			notas[0] = entrada.nextInt();
			notas[1] = entrada.nextInt();
			double media = (notas[0] + notas [1]) / qtdeNotas;
			
			NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
			formatador.setMinimumFractionDigits(1);
			formatador.setMaximumFractionDigits(1);

			System.out.println("media = " + formatador.format(media));
			System.out.println("nota 1 = " + formatador.format (notas[0]));
			System.out.println("nota 2 = " + formatador.format (notas[1]));
		}
		
		else if (qtdeNotas ==3){
			int [] notas = new int [3];
			notas[0] = entrada.nextInt();
			notas[1] = entrada.nextInt();
			notas[2] = entrada.nextInt();
			double media = (notas[0] + notas [1] + notas [2]) / qtdeNotas;
			
			NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
			formatador.setMinimumFractionDigits(1);
			formatador.setMaximumFractionDigits(1);

			System.out.println("media = " + formatador.format(media));
			System.out.println("nota 1 = " + formatador.format (notas[0]));
			System.out.println("nota 2 = " + formatador.format (notas[1]));
			System.out.println("nota 3 = " + formatador.format (notas[2]));
		}
		
		else if (qtdeNotas ==4){
			int[] notas = new int [4];
			notas[0] = entrada.nextInt();
			notas[1] = entrada.nextInt();
			notas[2] = entrada.nextInt();
			notas[3] = entrada.nextInt();
			double media = (notas[0] + notas [1]  + notas [2] + notas [3]) / qtdeNotas;
			
			NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
			formatador.setMinimumFractionDigits(1);
			formatador.setMaximumFractionDigits(1);
			
			System.out.println("media = " + formatador.format(media));
			System.out.println("nota 1 = " + formatador.format (notas[0]));
			System.out.println("nota 2 = " + formatador.format (notas[1]));
			System.out.println("nota 3 = " + formatador.format (notas[2]));
			System.out.println("nota 4 = " + formatador.format (notas[3]));
			
		}
		else if (qtdeNotas ==5){
			int[] notas = new int [5];
			notas[0] = entrada.nextInt();
			notas[1] = entrada.nextInt();
			notas[2] = entrada.nextInt();
			notas[3] = entrada.nextInt();
			notas[4] = entrada.nextInt();
			double media = (notas[0] + notas [1]  + notas [2] + notas [3] + notas[4]) / qtdeNotas;
			
			NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
			formatador.setMinimumFractionDigits(1);
			formatador.setMaximumFractionDigits(1);
			
			System.out.println("media = " + formatador.format(media));
			System.out.println("nota 1 = " + formatador.format (notas[0]));
			System.out.println("nota 2 = " + formatador.format (notas[1]));
			System.out.println("nota 3 = " + formatador.format (notas[2]));
			System.out.println("nota 4 = " + formatador.format (notas[3]));
			System.out.println("nota 5 = " + formatador.format (notas[4]));
		}
			
		}
		
		
	}
