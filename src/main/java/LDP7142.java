import java.util.Scanner;

public class LDP7142 {

    public static void main(String[] args) {
       Scanner tec = new Scanner(System.in);
       
       int codigo = tec.nextInt();
       int horastrabalhadas = tec.nextInt();
       int salario;
       int salarioextra;
       
       if(horastrabalhadas<=50){
           salario=horastrabalhadas*10;
           System.out.println("codigo = "+codigo);
           System.out.println("salarioExcedente = 0");
           System.out.println("salarioTotal = "+salario);
       }else{
           salarioextra=((horastrabalhadas-50)*20);
           salario=salarioextra+500;
           System.out.println("codigo = "+codigo);
           System.out.println("salarioExcedente = "+salarioextra);
           System.out.println("salarioTotal = "+salario);
       }
       
    }
