/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int qtdeNotas = s.nextInt();

        double[] notas = new double[qtdeNotas];

        for (int i = 0; i < qtdeNotas; i++) {
            notas[i] = s.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
        }

        double media = soma / qtdeNotas;
        NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

        formatador.setMinimumFractionDigits(1);

        formatador.setMaximumFractionDigits(1);

        System.out.println("media = " + formatador.format(media));

        for (int i = 0; i < notas.length; i++) {

            System.out.println("nota " + (i + 1) + " = " + formatador.format(notas[i]));
        }

    }

}
