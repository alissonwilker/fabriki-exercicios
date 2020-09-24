import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class SubtracaoConjuntos {
    
        public static void main (String [] args) {
        //usar o set pra criar o conjunto a e o conjunto b
        Set<Integer> conjuntoA = new HashSet<>();
        Set<Integer> conjuntoB = new HashSet<>();
            //escanear a entrada
        Scanner ent = new Scanner(System.in);
        int n = 1 ;
        int contagem = 0;
        //enquanto n (entrada) for diferente de 0
            
            do {
                
                //valores digitados na entrada são adicionados no conjunto A;
                n = ent.nextInt();
                conjuntoA.add(n);
                //não sei se precisa de contador, mas acabei de perceber q 
                //talvez sim, enfim
            }while (n!=0);
                do{
                n = ent.nextInt();
                conjuntoB.add(n);
                
                if(n==0){
                conjuntoA.removeAll(conjuntoB);
                System.out.println(conjuntoA.toString().replace("[","").replace("]",""));
                }
                }while (n!=0);
                
              
}
}
