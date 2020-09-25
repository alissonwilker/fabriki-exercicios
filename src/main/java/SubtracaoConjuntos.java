import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

public class SubtracaoConjuntos {
       public static void main(String[] args) {

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        do {
            int numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            a.add(numero);
        } while (true);

        do {
            int numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }

            b.add(numero);
        } while (true);

        a.removeAll(b);

        Iterator<Integer> iterador = a.iterator();
        while (iterador.hasNext()) {
            Integer elemento = iterador.next();
            System.out.println(element);
        }
    }
}
