package atividade;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas  {

   
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

        int nota;
        List notas = new ArrayList();
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
                notas.add(nota);
                soma += nota;

                media = (soma / qtdeNotas);

                formatador.setMinimumFractionDigits(1);
                formatador.setMaximumFractionDigits(1);

                contagem++;
                
            } while (contagem < qtdeNotas);
            
            for (int i = 0; i < notas.size(); i++) {
                System.out.println("nota "+(i+1)+" = "+notas.get(i));
            }

            System.out.println("media = " + formatador.format(media));

        } else {
            System.out.println("Digite um valor maior que 0");
        }
        
    }
}
