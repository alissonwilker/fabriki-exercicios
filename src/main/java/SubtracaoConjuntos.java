subtracaoconjuntos

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubtracaoConjuntos {

    public static void main(String[] args) {
        List a = new ArrayList();
        List b = new ArrayList();
        List c = new ArrayList();

        Scanner scanner = new Scanner(System.in);

        int contA = 0;
        do {
            a.add(scanner.nextInt());
            int parada = (int) a.get(contA);
            if (parada == 0) {
                break;
            }
            c.add(a.get(contA));
            contA++;
        } while (true);

        int contB = 0;
        do {
            b.add(scanner.nextInt());
            int parada = (int) b.get(contB);
            if (parada == 0) {
                break;
            }
            c.add(b.get(contB));

            contB++;
        } while (true);

        for (int i = 0; i < c.size(); i++) {
            for (int j = i + 1; j < c.size(); j++) {
                if (c.get(i) == c.get(j)) {
                    c.remove(j);
                    c.remove(i);
                }

            }
        }
        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i));
        }
    }

}
