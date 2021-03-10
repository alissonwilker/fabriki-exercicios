
import java.util.Scanner;

public class  LDP7143 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int a2 = calcularQuadrado(a);
        int b2 = calcularQuadrado(b);
        int c2 = calcularQuadrado(c);
        int d2 = calcularQuadrado(d);

        if(c2 < 1000) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("d = " + d);
            System.out.println("a2 = " + a2);
            System.out.println("b2 = " + b2);
            System.out.println("c2 = " + c2);
            System.out.println("d2 = " + d2);
        }else
            System.out.println("c2 = " + c2);

    }

    public static int calcularQuadrado(int number) {
        int quadrado = number * number;
        return quadrado;
    }
}
