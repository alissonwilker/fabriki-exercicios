import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {

    private static Scanner input = new Scanner(System.in);
    private static PrintStream saida = System.out;

    public static void main(String[] args) {

        System.out.printf("");
        int peso = Integer.parseInt(input.nextLine());
        int excesso = peso - 50;
        if (excesso > 0) {
            int multa = excesso * 4;
            System.out.println("excedente = " + excesso);
            System.out.println("multa = " + multa);
        } else {
            System.out.println("excedente = " + excesso);
            System.out.println("multa = 0");
        }
    }
}
