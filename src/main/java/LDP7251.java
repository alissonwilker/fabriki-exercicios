import java.util.Scanner;

public class LDP7251 {
             public static void main(String[] args) {
                      
                          Scanner lerNumeros = new Scanner(System.in);
                          int num = lerNumeros.nextInt();
                          int maior = 0;

                         while (num ! = 0) {
                                          if (maior == 0)  {
                                                            maior = num;

                                          }
                                          if (num > maior) {
                                                         maior = num;
  
                                          }
                                           num = lerNumeros.nextInt();
                       
                                  }
                                    System.out.println ("maior = " + maior);
