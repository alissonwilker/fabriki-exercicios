public class LDP7141 {
	
	private static Scanner entrada = new scanner(System.in);
	private static PrintStream = new scanner = System.out;
	
	public static void main(String[] args)   Scanner input = new Scanner(System.in); 
    System.out.println("Digite o seu Peso:");//mostrando na tela

 
    float peso = Float.parseFloat(input.nextLine());

  
    float excesso = peso - 50;
    if(excesso > 0) {                
        float multa = excesso * 4 ;
        
        System.out.printf("O valor que passou foi:%.2f KG%nO valor da multa é:%.2f Reais%n" , excesso , multa);
    } else {   
        System.out.printf("Não houve excesso.");
    }
}