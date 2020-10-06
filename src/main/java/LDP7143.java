import java.util.Scanner;
public class LDP7143 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int a2 = a * a;
        int b = scanner.nextInt();
        int b2 = b * b;
        int c = scanner.nextInt();
        int c2 = c * c;
        int d = scanner.nextInt();
        int d2 = d * d;

        if (c2 >= 1000) {
            System.out.println("c2 = " + c2);
        } else {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("d = " + d);
            System.out.println("a2 = " + a2);
            System.out.println("b2 = " + b2);
            System.out.println("c2 = " + c2);
            System.out.println("d2 = " + d2);
        }
    }
}
