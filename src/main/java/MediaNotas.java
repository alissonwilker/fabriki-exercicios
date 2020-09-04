
package atividade;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

 
    public static void main(String[] args) {
        int nota1,nota2,nota3;
        double media,soma;
        int qtdeNotas;
        
        Scanner entrada1= new Scanner(System.in);
        
        System.out.println("Digite a quantidade de notas");
        qtdeNotas = entrada1.nextInt();
        
        if(qtdeNotas>0){
            Scanner entrada2= new Scanner(System.in);
             
             System.out.println("Digite a nota");
             nota1 =  entrada2.nextInt();
             
             soma = nota1/qtdeNotas;
             
             media = (soma/qtdeNotas);
             
        NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
        formatador.setMinimumFractionDigits(1);
        formatador.setMaximumFractionDigits(1);
        System.out.println("media = " + formatador.format(media));
        System.out.println("nota = " + formatador.format(soma));
        }else{
            System.out.println("Digite um valor maior que 0");
        } 
                    Scanner ent2= new Scanner(System.in);

                    System.out.println("Digite a quantidade de notas");
                    qtdeNotas = ent2.nextInt();

                    if(qtdeNotas>0){
                        Scanner ent3= new Scanner(System.in);

                        System.out.println("Digite a nota");
                        nota1 = ent3.nextInt();
                         
                        Scanner ent4=new Scanner(System.in);
                        System.out.println("Digite a nota 2");
                        nota2 = ent4.nextInt(); 
                        
                        soma = nota1+nota2;
                        media = soma/qtdeNotas;

                    NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
                    formatador.setMinimumFractionDigits(1);
                    formatador.setMaximumFractionDigits(1);
                    System.out.println("media = " + formatador.format(media));
                    System.out.println("nota 1 = " + formatador.format(nota1));
                     System.out.println("nota 2 = " + formatador.format(nota2));
                    }else{
                        System.out.println("Digite um valor maior que 0");
                             } 
                    Scanner ent5= new Scanner(System.in);

                    System.out.println("Digite a quantidade de notas");
                    qtdeNotas = ent5.nextInt();

                    if(qtdeNotas>0){
                        Scanner ent6= new Scanner(System.in);

                        System.out.println("Digite a nota");
                        nota1 = ent6.nextInt();
                         
                        Scanner ent7=new Scanner(System.in);
                        
                        System.out.println("Digite a nota 2");
                        nota2 = ent7.nextInt(); 
                        
                        Scanner ent8=new Scanner(System.in);
                        
                        System.out.println("Digite a nota 2");
                        nota3 = ent8.nextInt(); 
                        
                        soma = nota1+nota2+nota3;
                        media = soma/qtdeNotas;

                    NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));
                    formatador.setMinimumFractionDigits(1);
                    formatador.setMaximumFractionDigits(1);
                    System.out.println("media = " + formatador.format(media));
                    System.out.println("nota 1 = " + formatador.format(nota1));
                    System.out.println("nota 2 = " + formatador.format(nota2));
                    System.out.println("nota 2 = " + formatador.format(nota3));
                    }else{
                        System.out.println("Digite um valor maior que 0");
                             } 
    }
}

