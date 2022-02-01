public class Fatorial {

            public static void main(String[] args) {

            int numero;
            System.out.println("");
            Scanner scanner = new Scanner (System.in);
             numero = scanner.nextInt();
             long fatorial = 1;
             int i = 1;
  
             while (i <= numero) {
                        fatorial = fatorial + i;    
                        i++;
}

              System.out.println("O fatorial de " + numero + " é " + fatorial);

}
}
             
    
