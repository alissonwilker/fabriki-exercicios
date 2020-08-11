public class MediaNotas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
       
        int qtNotas = scanner.nextInt();
        
        int [] notas = new int [qtNotas];
        
        for (int i = 0; i < notas.length; i++) {
            notas[i] = scanner.nextInt();
        }
        int somaNotas = 0;
                
        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i]; 
        }
        int media = somaNotas/2;
       
        System.out.println("media: "+media);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("nota"+i+" " + notas[i]);
                  
        }
       
    }
}
