import java.util.Scanner;

public class Fatorial {

public static void main(String[] args) {
int fat = 1;
int valor = 0; //ou qualquer outro valor que queira calcular;

if (valor>=0||valor<=25){
Scanner in = new Scanner(System.in);
valor = in.nextInt();
System.out.println();
for( int i = 1; i <= valor; i++ )
{
fat *= i;
}

System.out.println(fat);
}

}
}
