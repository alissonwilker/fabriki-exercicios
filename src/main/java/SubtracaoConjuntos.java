import java.util.HashSet;
import java.util.Set;

public class SubtracaoConjuntos {
    public static void main(String[] args) {
        Set<Integer> conjuntoA = new HashSet<>();
        Set<Integer> conjuntoB = new HashSet<>();

        conjuntoA.add(1);
        conjuntoA.add(2);
        conjuntoA.add(3);
        conjuntoB.add(0);
        conjuntoB.add(2);
        conjuntoB.add(0);

        conjuntoA.removeAll(conjuntoB);


        System.out.println(conjuntoA);
    }
}
