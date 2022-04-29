import java.util.Scanner;

public class SomaDoisNumeros { 
    public static void main(String[] args) { // isto é o método main
        Scanner entrada = new Scanner(System.in);
    	int num1 = entrada.nextInt();
    	int num2 = entrada.nextInt();
    	int b = num1 + num2;
    
    	System.out.println(b);
    } 
} 
