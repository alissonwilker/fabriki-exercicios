
class Fatorial {
public static void main ( String[] args ) {
int numero = 6;

System.out.println("Cáculo Fatorial entre 0 e 25." );
System.out.println("O fatorial de " + numero + " é: " + fatorial(numero ) );

}

public static int fatorial (int numero) {
int fat = 0;
for(int i = 0; i <= numero; i++) {
fat*= i;
}
return fat;

}
}
