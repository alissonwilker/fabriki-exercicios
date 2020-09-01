public class MediaNotas {
    public static void main(String args[]) {
        Scanner nota = new Scanner(System.in);

        System.out.println("Quer tirar a média de quantas notas?");
        double qntNotas = nota.nextDouble();

        System.out.println("Insira " + qntNotas + " notas: ");
        double soma = 0;

        for (int i = 1; i <= qntNotas; i++) {
            double notaInserida = nota.nextDouble();
            soma = soma + notaInserida;
            System.out.println();
        }

        double media = soma / qntNotas;
        NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
        formatador.setMinimumFractionDigits(1);
        formatador.setMaximumFractionDigits(1);
        System.out.println("media = " + formatador.format(media));

        nota.close();
    }
}
