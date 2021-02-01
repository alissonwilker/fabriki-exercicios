import java.util.Scanner;

public class LDP7251 {

public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);
int numero = entrada.nextInt();
int maior = 0;
int menor = 0;

while (numero != 0) {
if (numero > maior) {
maior = numero;
}
}
System.out.println("maior = " + maior);

entrada.close();
}
} 
