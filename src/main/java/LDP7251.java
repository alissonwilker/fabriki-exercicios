import java.util.Scanner;

class LDP7251{
  private static Scanner entrada = new Scanner(System.in);

  public static void main(String[] args) { 

    int n = entrada.nextInt();
    
    if ( n == 0) {

      int maior = 0;
      System.out.println("maior = " + maior);
    } else {

      int maior = n;

      while (n != 0 ) {

      n = entrada.nextInt();
      
      if (n != 0) {
        if (maior < n && n != 0) {
            maior = n;
        } 
      } 
    } 

    System.out.println("maior = " + maior);

    }




  
  }

}