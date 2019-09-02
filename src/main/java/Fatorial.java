class Fatorial {
public static void main ( String[] args ) {
int numero = 25;

System.out.println( Exemplo de cálculo fatorial de um número em java" );
System.out.println("O fatorial de " + numero + " é: " + fatorial(numero ) );

}

public static int fatorial (int numero) {
int fat = 1;
for(int i = 1; i <= numero; i++) {
fat*= i;
}
return fat;

}
