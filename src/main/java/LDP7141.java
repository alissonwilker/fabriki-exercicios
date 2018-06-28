import java.util.Scanner;
public class LDP7141 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String kg = ("");
       int KG = sc.nextInt();
       
       int excedente = 0;
       for(int i = 50; i < KG ; i++){
           excedente += 1;
        }
        if(excedente > 0){
            System.out.println("excedente= " +excedente+"\nmulta = "+excedente*4);
        }else{
            System.out.println("excedente = 0 \nmulta = 0");
        }
    }
}


        

    
    
