import java.util.Scanner;



public class LDP7251 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
Double menor, maior;
menor = maior = null;

while (true) {
  double valorLido = input.nextDouble();
  if (valorLido == 0) {
    break;
  }
  if (maior == null) {
    maior = menor = valorLido;
  } else if (valorLido > maior) {
    maior = valorLido;
  } else if (valorLido < menor) {
    menor = valorLido;
  }
}
System.out.println("maior " + maior);
