public class LDP7251{
    private static Scanner entrada = new Scanner(System.in);
    
    public static void main (String arg[]){
       int num = 0;
       int i = -2147483648;;
       
    while(true){
     num = entrada.nextInt(); 
     
         if(num == 0){
         break;   
     }
     if( num > i){
         i = num;
     }
     
     System.out.println(i);
        
    }