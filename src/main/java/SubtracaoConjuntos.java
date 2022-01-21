import java.util.Scanner;
import java.util.Arrays;

public class SubtracaoConjuntos {
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String args[]) {
        int elementoConjunto;
        int[] conjuntoA = new int[10];
        int[] conjuntoB = new int[10];
        int A = 0;
        int B = 0;

        do {
            elementoConjunto = entrada.nextInt();
            conjuntoA[A] = elementoConjunto;
            A++;
        } while (elementoConjunto != 0);

        do {
            elementoConjunto = entrada.nextInt();
            conjuntoB[B] = elementoConjunto;
            B++;
        } while (elementoConjunto != 0);

        for (int i = 0; i < A; i++) {
            boolean val = contains(conjuntoB, conjuntoA[i]);
            if(val == false) {
                System.out.println(conjuntoA[i]);
            }
        }
    }

     public static boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }
}
