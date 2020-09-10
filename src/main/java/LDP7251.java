import java.util.Scanner;


public class LDP7251{

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
int valorLido = input.nextInt();
int menor, maior;
menor = maior = valorLido;
while (valorLido != 0) {
  valorLido = input.nextInt();
  if (valorLido != 0) {
    if (valorLido > maior) {
      maior = valorLido;
    } else if (valorLido < menor) {
       menor = valorLido;
    }
  }
}

System.out.println("maior = " + maior);
}
}
