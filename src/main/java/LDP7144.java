import java.util.Scanner;

public class LDP7144 {
    public static void main(String[] args) {
        
        //Declaração de variaveis
        Scanner entrada;
        int n;
        String tipo;
        
        entrada = new Scanner (System.in);
        
        //Entrada do dado
        System.out.println("Informe o numero a ser testado:");
        n = entrada.nextInt();
        
        //Processamento: inicio dos testes
        if(n % 2 == 0){
            
            //verifica se é positivo
            if(n >= 0){
                tipo = "par e positivo";
                System.out.printf("O numero eh %s", tipo);
            }
            else{
                //verifica se é negativo
                if(n < 0){
                    tipo = "par e negativo";
                    System.out.printf("O numero eh %s", tipo);
                }
            }//fim do else
        }//fim do if
        else{
            //verifica se é positivo
            if(n >= 0){
                tipo = "impar e positivo";
                System.out.printf("O numero eh %s", tipo);
            }
            else{
                //verifica se é negativo
                if(n < 0){
                    tipo = "impar e negativo";
                    System.out.printf("O numero eh %s", tipo);
                }
            }//fim do else
        }
    }
}