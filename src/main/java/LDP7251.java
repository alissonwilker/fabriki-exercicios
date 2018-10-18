import java.util.Scanner;

class LDP7251 {
  private static Scanner entrada = new Scanner(System.in);

  public static void main(String[] args) { 

    int n = -1;
    int maior = -2000;

    while ( n != 0) {

      n = entrada.nextInt();


      if (maior < n && n != 0) {
          maior = n;
      } else {
        maior = 0;
      }
    } 

  System.out.println("maior = " + maior);
  }

}