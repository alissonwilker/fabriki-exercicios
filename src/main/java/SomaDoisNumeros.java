import java.util.Scanner;

public class SomaDoisNumeros {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int soma;

        System.out.print("");
        num1 = scanner.nextInt();

        System.out.print("");
        num2 = scanner.nextInt();

        soma = num1 + num2;

        System.out.println(soma);

    }

}
