//Kaio Franklin de Alencar 

import java.util.Scanner;

public class LDP7141 {

public static void main(String [] args ) {

float pesopeixe;
float sobra;
float falta;
float multa;

Scanner input = new Scanner(System.in); 

System.out.println("Favor, inserir o peso:");

pesopeixe = input.nextFloat();

if(pesopeixe >=51)

{

sobra = pesopeixe -50 ;

multa = sobra * 4 ;

System.out.printf("Valor ultrapado foi de:%.2f KG\nO valor da multa é:%.2f Reais" ,sobra , multa);

}//fim if

else if (pesopeixe <=50)

{

sobra = 0 ;

multa = 0 ;

System.out.printf("\nExcesso:%.2f Multa:%.2f",sobra , multa);

	}

    }

}