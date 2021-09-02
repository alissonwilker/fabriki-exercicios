import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SubtracaoConjuntos {
    private static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        Set<Integer> conjuntoA = new HashSet<>();
        Set<Integer> conjuntoB = new HashSet<>();

        preencherConjunto(conjuntoA);

        preencherConjunto(conjuntoB);

        entrada.close();

        conjuntoA.removeAll(conjuntoB);

        imprimirConjunto(conjuntoA);
    }

    private static void imprimirConjunto(Set<Integer> conjunto) {
        Iterator<Integer> iterador = conjunto.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }

    private static void preencherConjunto(Set<Integer> conjunto) {
        int elemento;
        while ((elemento = entrada.nextInt()) != 0) {
            conjunto.add(elemento);
            elemento = entrada.nextInt();
        }
    }
}
