import java.util.ArrayList;
import java.util.Scanner;



public class LDP7251 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
ArrayList<Double> lista = new ArrayList<>();

double valorLido = 1;
while (valorLido!=0) {
  valorLido = input.nextDouble();
  lista.add(valorLido);
}
Double maior, menor;
maior = menor = lista.get(0);
for (Double valor: lista) {
  if (valor > maior) {
    maior = valor;
  } 
}

System.out.println("maior = " + maior);
