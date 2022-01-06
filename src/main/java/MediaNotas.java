import java.util.Scanner;

public class MediaNotas {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int nota1, nota2, nota3;
        int media, i, contAluno = 0;
        
        for(i = 0; i < 3; i++){
            
            contAluno++;

            System.out.println("Aluno " + contAluno + ", digite sua 1ª nota");
            nota1 = ent.nextInt();
            
            System.out.println("Aluno " + contAluno + ", digite sua 2ª nota");
            nota2 = ent.nextInt();
            
            System.out.println("Aluno " + contAluno + ", digite sua 3ª nota");
            nota3 = ent.nextInt();
            
            media = (nota1 + nota2 + nota3) / 3;
            System.out.println("A média do aluno " + contAluno + " é " + media);
            
            if( (media >= 0) && (media <2) ){
                System.out.println("nota 1 = 2,0");
            } else if(media < 3){
                System.out.println("nota 2 = 3,0");
            } else if(media < 6){
                System.out.println("nota 1 = 6,0");
            } else if(media < 6){
                System.out.println("nota 2 = 6,0");
            } else if(media <= 7){
                System.out.println("nota 3 = 7,0");
            }
        }       
    }
}
