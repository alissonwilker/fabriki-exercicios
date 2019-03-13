import.java.io.PrintSream;
import.java.util.Scanner;


public class LDP7141
{
public static Scanner entrada = new Scanner(System.in);
private static PrintStream  saida = System.out;
  public static void main(String[] args) {
    // INSIRA O CÓDIGO ABAIXO

float peso , excesso , multa , falta ;

Scanner input = new Scanner(System.in); 

System.out.println("Digite o seu Peso:");

peso = input.nextFloat();

if(peso >=51)

{

excesso = peso -50 ;

multa = excesso * 4 ;

System.out.printf("O valor que passou foi:%.2f KG\nO valor da multa é:%.2f Reais" , excesso , multa);

}//fim if

else if (peso <=50)

{

excesso = 0 ;

multa = 0 ;

System.out.printf("\nExcesso:%.2f Multa:%.2f",excesso , multa);

}

}

}
