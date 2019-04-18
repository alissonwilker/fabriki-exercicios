public class LDP7251 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero = 1;
        int maior = 0;
        

        while (numero != 0) {
            //System.out.println("Digite o número ");
            numero = s.nextInt();
            
            if(numero > maior){
               maior = numero;
            numero++;
            } else if ( numero < maior){
                System.out.println("maior = " + maior);
            }
            
        }   
           
