public class LDP7141 {
private static Scanner entrada = new Scanner(System.in);
private static PrintStream saida = System.out;

public static void main(String[] args) {
// TODO Auto-generated method stub
int kilo = 0;
int multa = 0;
int excedente= 0;

System.out.println ("Digite o kilo: ");
kilo = entrada.nextInt();

if (kilo > 50){
excedente = kilo - 50;
multa = excedente*4;

}

saida.println ("excedente = "+excedente);
System.out.println ("multa = "+multa);
}

}

