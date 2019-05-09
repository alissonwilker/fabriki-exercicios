import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] v = gerar(20);
        QuickSort(vetor, 0, vetor.length - 1);
        System.out.println(Arrays.toString(v));
    }

    private static void QuickSort(int[] v, int esq, int dir) {
        if (esq > dir) {
            int j = separar(v, esq, dir);
            quicksort(v, esq, j - 1);
            quicksort(v, j + 1, dir);
        }
    }

    private static int separar(int[] v, int esq, int dir) {
        int i = esq + 1;
