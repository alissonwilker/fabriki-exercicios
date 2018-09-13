import java.util.Scanner;

/**
 *
 * @author vasco
 * 
 * Desenvolva um programa que leia 4 números e calcule o quadrado de cada um. Se o valor resultante do quadrado do terceiro
 * for maior ou igual a 1000, imprima-o e finalize. Caso contrário, imprima os valores lidos e seus respectivos quadrados.
 */
public class LDP7143 {
    public static void main(String[] args) {
         
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        int d = entrada.nextInt();
               
        int a2 = a * a;
        int b2 = b * b;
        int c2 = c * c;
        int d2 = d * d;
        
        if(c2 >= 1000){
        
            System.out.println("c2 = " + c2);
        
        }
        
        else{
        
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("d = " + d);
            System.out.println("a2 = " + a2);
            System.out.println("b2 = " + b2);
            System.out.println("c2 = " + c2);
            System.out.println("d2 = " + d2);
        
        }
        
        
    }
    }
