
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;


public class MediaNotas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
		formatador.setMinimumFractionDigits(1);
		formatador.setMaximumFractionDigits(1);
		
		int quantidadeNotas =  entrada.nextInt();
		ArrayList<Double> notas = new ArrayList();
		
		for(int i = 0; i < quantidadeNotas; i++) {
			double nota = entrada.nextDouble();
			notas.add(nota);
		}
		
		
		Double somatorioNotas = notas.stream().reduce(0.0, (somatorio, nota) -> somatorio += nota);
		Double media = somatorioNotas / quantidadeNotas;
		
		System.out.println("media = "+ formatador.format(media));

		int i = 1;
		for(Double nota : notas){
            System.out.println("nota "+ i +" = " + formatador.format(nota));
            i++;
        }
		
		entrada.close();
	}
}
