import java.util.Scanner;

public class SomaDoisNumeros {
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int a;
        int b;

        a = s.nextInt();
        b = s.nextInt();

        System.out.println(a+b);
    }
}
