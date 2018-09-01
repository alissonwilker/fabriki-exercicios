/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FERNANDO
 */
import java.io.PrintStream;
import java.util.Scanner;

public class LDP7141 {
  private static Scanner entrada = new Scanner(System.in);
  private static PrintStream saida = System.out;
  
  public static void main(String[] args){
   
   int multa;
   int excedente;   
   int peso = entrada.nextInt();
   

   excedente = peso - 50;
   
   if(peso >= 0){
      saida.println("exedente ="+excedente);
      multa = excedente * 4;
      saida.println("multa = "+multa);
   
   }
   else{
      saida.println("Não tem excedente");
    }
}
}
