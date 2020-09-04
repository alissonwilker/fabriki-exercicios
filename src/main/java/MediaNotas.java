public class MediaNotas  {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

        int nota;
        double soma = 0;
        double media;
        int qtdeNotas;

        System.out.println("Digite a quantidade de notas");
        qtdeNotas = entrada.nextInt();
        int contagem = 0;

        if (qtdeNotas > 0) {

            do {

                System.out.println("Digite a nota");
                nota = entrada.nextInt();

                soma += nota;

                media = (soma / qtdeNotas);

                formatador.setMinimumFractionDigits(1);
                formatador.setMaximumFractionDigits(1);

                contagem++;
                
            } while (contagem < qtdeNotas);

            System.out.println("media = " + formatador.format(media));
            System.out.println("nota = " + formatador.format(soma));

        } else {
            System.out.println("Digite um valor maior que 0");
        }
        
    }
}
