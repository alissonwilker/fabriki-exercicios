

//import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SubtracaoConjuntos {

    //private static InputStream entrada = System.in;
    private static Scanner entrada = new Scanner(System.in);
    private static PrintStream saida = System.out;
    
    //Scanner elemento = entrada.nextInt();
    
    public static void main(String[] args) {
                
        List<Integer> conjuntoA = new ArrayList<>();
        List<Integer> conjuntoB = new ArrayList<>();
        List<Integer> conjuntoC = new ArrayList<>();

        int elemento = entrada.nextInt();
        while (elemento != 0){
            conjuntoA.add(elemento);
            elemento = entrada.nextInt();
        }
        
        elemento = entrada.nextInt();
        while(elemento != 0){
            conjuntoB.add(elemento);
            elemento = entrada.nextInt();
        }
        
        conjuntoC.addAll(conjuntoA);
        conjuntoC.removeAll(conjuntoB);
        
        for (int i = 0; i < conjuntoC.size(); i++){
            saida.println(conjuntoC.get(i));
        }
    }
    
}
