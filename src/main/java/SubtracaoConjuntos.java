import java.util.ArrayList;
import java.util.Scanner;
public class SubtracaoConjuntos {
    public static void main(String[] args) {
    Scanner leia=new Scanner(System.in);
    ArrayList<Integer> conjunto1 = new ArrayList<Integer>();
    ArrayList<Integer> conjunto2 = new ArrayList<Integer>();
    
    int aux=leia.nextInt();
        while(aux!=0){
            conjunto1.add(aux);
            aux=leia.nextInt();
        }
        
    
        do{            
            aux=leia.nextInt();
            if(aux!=0) 
            conjunto2.add(aux);
        }while(aux!=0 & (conjunto1.size()-1)>conjunto2.size());
        
        for (int i = 0; i < conjunto2.size(); i++) {
            for (int j = 0; j < conjunto1.size(); j++) {
                if(conjunto2.get(i)==conjunto1.get(j))
                    conjunto1.remove(j);
            }
        }
         for (int i = 0; i < conjunto1.size(); i++) {
             System.out.println(""+conjunto1.get(i));
        }
        
        
    }
}
