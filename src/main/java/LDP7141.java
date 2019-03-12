import java.util.Scanner;

public class LDP7141{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int excedente = 0;
        int multa = 0;
        int peso = Integer.parseInt(input.nextLine());

        if (peso > 50) {
            excedente = peso - 50;
            multa = excedente * 4;

        }
            System.out.println("excedente = " +excedente);
            System.out.println("multa = "+multa);
    }
}
