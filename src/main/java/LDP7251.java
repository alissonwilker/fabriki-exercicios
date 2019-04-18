import java.util.Scanner;
public class LDP7251 {
    public static void main(String[] args) {
    Scanner leia=new Scanner(System.in);
    int aux=leia.nextInt();
    laco:while(aux!=0){
    int i=leia.nextInt();
        if (i!=0) {
            if(i>aux)
            aux=i;
        }else
         break laco;   
    }
    System.out.println("maior = "+aux); 
    }
}
