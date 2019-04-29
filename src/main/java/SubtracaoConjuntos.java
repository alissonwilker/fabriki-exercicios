import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

class SubtracaoConjuntos {
  public static void main(String[] args) {
    List <Integer> conjuntoA = new ArrayList();
    List <Integer> conjuntoB = new ArrayList();

    Scanner entrada = new Scanner (System.in);
    
    int numero = entrada.nextInt();

     while (numero != 0){
       conjuntoA.add(numero);
       numero = entrada.nextInt();
     }

     for (int i = 0; i < conjuntoA.size()-1; i++){
       
         numero = entrada.nextInt();

        if (numero != 0){
          conjuntoB.add(numero);
        
        } else {
          break;
        }

     }
  /*
      for (int i = 0; i < conjuntoA.size(); i++){
        System.out.print(conjuntoA.get (i) + " ");
      }
      
      System.out.println();

      for (int i = 0; i < conjuntoB.size(); i++){
        System.out.print(conjuntoB.get(i) + " ");
      }*/

      for (int i = 0; i < conjuntoB.size(); i++){
        for (int j = 0; j < conjuntoA.size(); j++){
          if (conjuntoB.get(i) == conjuntoA.get(j)){
            conjuntoA.remove(j);
        }
      }
  }
  for (int i = 0; i < conjuntoA.size(); i++){
        System.out.println(conjuntoA.get (i));
      }
}
}
