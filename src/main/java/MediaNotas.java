package lp2;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class MediaNotas {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner scanner = new Scanner(System.in);
        int qtdNotas = scanner.nextInt();  
        int notas [] = new int[qtdNotas];
        for (int i = 0; i < qtdNotas; i++) {
            notas[i] = scanner.nextInt();
        } 
        scanner.close();
        double somaNotas = 0;        
        for (int i = 0; i < qtdNotas; i++) {
            somaNotas += notas[i];
        }
        double media = somaNotas / qtdNotas;
        NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
        formatador.setMinimumFractionDigits(1);
        formatador.setMaximumFractionDigits(1);
        System.out.println("media = "+formatador.format(media));
        int a = 1;
        for (int i = 0; i < qtdNotas; i++) {
            System.out.println("nota "+a+" = "+formatador.format(notas[i]));
            a += 1;    
        }             
    }
}
