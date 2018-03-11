public class MultiplicacaoMatrizes {
    public static void main(String[] args) {

        int matrizA1[][] = new int[][] { { 2, 5, 9 }, { 3, 6, 8 } };
        int matrizB2[][] = { { 2, 7 }, { 4, 3 }, { 5, 2 } };

        int[][] matrizC3 = new int[matrizA1.length][matrizB2[0].length];

        for (int a = 0; a < matrizA1.length; a++) {
            for (int b = 0; b < matrizB2[0].length; b++) {
                for (int c = 0; c < matrizB2.length; c++) {

                    matrizC3[a][b] += matrizA1[a][c] * matrizB2[c][b];
                }
            }
        }
        System.out.print(" matrizC3 = { ");
        for (int a = 0; a < matrizC3.length; a++) {
            System.out.print("{");
            for (int b = 0; b < matrizC3[0].length; b++) {
                System.out.print(" " + matrizC3[a][b] + ",");
            }
            System.out.print("}, ");
        }
        System.out.println("}");
    }
}
