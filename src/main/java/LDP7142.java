import java.io.PrintStream;
import java.util.Scanner;

public class LDP7142 {
	private static Scanner entrada = new Scanner(System.in);
	private static Scanner entrada2 = new Scanner(System.in);
	private static PrintStream saida = System.out;

	public static void main(String[] args) {
		int codigo = entrada.nextInt();
		int hora = entrada2.nextInt();
		int excedente, total;
		
		if(hora <= 50) {
			total = hora * 10;
			excedente = 0;
			saida.println("codigo = "+ codigo);
			saida.println("salarioExcedente = " + excedente);
			saida.println("salarioTotal = " + total);
		}else {
			excedente = (hora - 50) * 20;
			total = (50 * 10) + excedente; 
			
			saida.println("codigo = "+ codigo);
			saida.println("salarioExcedente = " + excedente);
			saida.println("salarioTotal = " + total);
		}
		
