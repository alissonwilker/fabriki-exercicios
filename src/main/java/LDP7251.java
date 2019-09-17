import java.io.PrintStream;
import java.util.Scanner;

public class LDP7251 {
private static Scanner entrada = new Scanner(System.in);
private static PrintStream saida = System.out;

public static void main(String[] args) {

int num;
num = entrada.nextInt();
int Nmaior = num;

while (num != 0){

if (num > Nmaior) {
Nmaior = num;
}
num = entrada.nextInt();

}

saida.println("maior = " + Nmaior);

}
}
