import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubtracaoConjuntos {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        List<Integer> lista=new ArrayList<>();
        List<Integer> lista2=new ArrayList<>(); 
        int a = tec.nextInt();
        
        
        while(a!=0){
            lista.add(a);
            a = tec.nextInt();
        }
        
        a = tec.nextInt();
        
        while(a!=0){
            lista2.add(a);
            a = tec.nextInt();
        }
        
        for(int i=0;i<lista2.size();i++){
            for(int j=0;j<lista.size();j++){
                if(lista.get(j)==lista2.get(i)){
                    lista.remove(j);
                }
                
            }
           
            
        }
        
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }
       
        
        
    }
    
}
