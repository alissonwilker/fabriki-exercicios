import java.util.Scanner;

public class LDP7251 {

    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
      
        int n1;
        int n2=0;
        int n3=0;
    
        n1=leitor.nextInt();
        while(n1!=0){
             while(n1>0){
          
                if(n1>n2 ){
                    n2=n1;
                }

                n1=leitor.nextInt(); 
            
            
            
        }
        
             while(n1<0){
                if(n1<n2 ){ 
                    n2=n1;
                    n3=n1;
                } 

                if(n1>n2 && n3<n1){ 
                    n3=n1; 
                } 

                n1=leitor.nextInt();
                if(n1==0 && n3<0 && n3>n2){
                    System.out.println("maior = " +n3);
                    System.exit(0);
                }
            }
        }
      
        
        System.out.println("maior = " +n2);
       
      

    }
    
}
