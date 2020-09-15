import java.util.Scanner;

public class Fatorial {

public static void main(String[] args) {
double fat = 1;
int valor = 2;

Scanner in = new Scanner(System.in);

if (valor>=0||valor<=25){
valor = in.nextInt();
for(int i = 1; i <= valor; i++)
    {
        fat *= i;
    }
    System.out.println(fat);
}
}
}
