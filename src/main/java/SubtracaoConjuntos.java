import java.util.ArrayList;
import java.util.Scanner;

public class SubtracaoConjuntos {

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> B = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        while (n != 0) {
            A.add(n);
            n = sc.nextInt();
        }

        n = sc.nextInt();

        while (n != 0) {
            B.add(n);
            n = sc.nextInt();
        }

        if (B.size() > A.size()) {
            return;
        }

        for (Integer numero : B) {
            while (A.contains(numero)) {
                A.remove(numero);
            }
        }

        for (Integer numero : A) {
            System.out.println(numero);
        }

    }
}
