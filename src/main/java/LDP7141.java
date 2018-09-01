import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;
    
    public static void main(String[] args) throws Exception {
        // TODO INSIRA TODO SEU CÓDIGO AQUI
        try {
            saida.println("Digite o peso de sua pescaria: ");
            int peso = Integer.parseInt( entrada.nextLine());
            int excedente = (peso - 50) > 0 ? (peso - 50) : 0;
            int multa = excedente > 0 ?  excedente * 4 : 0;
        
            saida.println("excedente = "+excedente);
            saida.println("multa = "+multa);
        }catch (NumberFormatException n) {
            saida.println("Número inválido.");
        }
    }
}
