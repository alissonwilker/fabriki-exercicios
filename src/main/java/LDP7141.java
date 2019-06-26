import java.util.Scanner;

class LDP7141 {
  public static void main(String[] args) {
    int peso;
    int excedente = 0;
    int multa = 0;
    Scanner teclado = new Scanner(System.in);
    peso = teclado.nextInt();
    if (peso > 50) {
        excedente = peso - 50;
        multa = excedente * 4;
    }

    System.out.println("excedente = " + excedente);
    System.out.println("multa = " + multa);
  }
}
