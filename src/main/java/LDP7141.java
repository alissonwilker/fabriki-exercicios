import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141{

    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;

    public static void main(String[] args) {

        int sobra;
        int multa;
        int peso = entrada.nextInt();

        if (peso > 50) {
            sobra = peso - 50;
            multa = sobra * 4;
        } else {
            multa = 0;
            sobra = 0;

        }

        saida.println("excedente = " + sobra);
        saida.println("multa = " + multa);
    }
}
