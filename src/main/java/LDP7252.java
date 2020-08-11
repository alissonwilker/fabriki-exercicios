public class LDP7252 {

    public  static void main(String[]args) {
        final int CASAS_DO_TABULEIRO = 64;
        float[] casas = new float[64];

        casas[0] = 1;

        for (int i = 1; i < CASAS_DO_TABULEIRO; ++i) {
            casas[i] = casas[i - 1] * 2;
        }


        System.out.println("totalGraos= " + casas[CASAS_DO_TABULEIRO - 1]);
    }
}
