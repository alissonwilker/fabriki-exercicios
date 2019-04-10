public class MediaNotas {
    public static void main(String[] args) {
        new JavaConsole();
        Scanner Leitura = new Scanner(System.in);
        Float Mat[][] = new Float[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Informe a nota " + (i + 1) + "º do aluno");
                Mat[i][j] = Leitura.nextFloat();
            }
        }
        // Mostrar elementos digitados

        System.out.println("-------- Notas Lançadas -------");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(Mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
