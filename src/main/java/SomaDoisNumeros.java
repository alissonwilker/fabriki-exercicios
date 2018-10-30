import java.io.PrintStream;
import java.util.Scanner;

public class SomaDoisNumeros {
    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;

    public static void main(String[] args) {
        int x = entrada.nextInt();
        int y = entrada.nextInt();
        saida.println(x + y);
    }
}
