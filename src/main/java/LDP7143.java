import java.util.Scanner;

public class LDP7143 {

    public static void main(String[] args) {
        int a, b, c, d;
        int a2, b2, c2, d2;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        a2 = a * a;

        b = sc.nextInt();
        b2 = b * b;

        c = sc.nextInt();
        c2 = c * c;

        d = sc.nextInt();
        d2 = d * d;

        if (c2 < 1000) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("d = " + d);
            System.out.println("a2 = " + a2);
            System.out.println("b2 = " + b2);
            System.out.println("c2 = " + c2);
            System.out.println("d2 = " + d2);
        } else {
            System.out.println("c2 = " + c2);
        }

    }

}
