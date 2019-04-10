public class MediaNotas {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos: ");
        int alunos = s.nextInt();

        double[] notas = new double[alunos];

        for (int i = 0; i < alunos; i++) {
            notas[i] = s.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
        }

        double media = soma / alunos;

        NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

        formatador.setMinimumFractionDigits(1);

        formatador.setMaximumFractionDigits(1);

        System.out.println("media = " + formatador.format(media));
        
        for (int i = 0; i < notas.length; i++) {
             
            System.out.println("Nota"+(i+1)+"="+formatador.format(notas[i]));
        }
      
        }
        
    }

