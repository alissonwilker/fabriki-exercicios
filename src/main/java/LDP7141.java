
import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {

    private static Scanner input = new Scanner(System.in);
    private static PrintStream saida = System.out;

    public static void main(String[] args) {

        saida.print(" ");
        int KG = input.nextInt();

        int excedente = 0;
        for (int i = 50; i < KG; i++) {
            excedente += 1;
        }
        if (excedente > 0) {
            saida.println("excedente = " + excedente + "\nmulta = " + excedente * 4);
        } else {
            saida.println("excedente = " + excedente + " \nmulta = 0");
        }
    }
}
