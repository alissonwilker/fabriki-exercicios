import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
	
		List<Integer> notas = new ArrayList<>();
		List<String> xxx = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		double soma=0;
		int qtdeNotas = scanner.nextInt();
		
		        for (int i=0; i<qtdeNotas; i++ ) {
			          int n = scanner.nextInt();
			          notas.add(n);			
			          soma += notas.get(i);
		              }
		        
		        int indice= notas.size() + 1;
		    
                
		        for (int f=1; f<indice; f++) {
                	
                	xxx.add("nota "+f);
                }
		 
		       
		        double media = soma / qtdeNotas;
		  
		        NumberFormat formatador = NumberFormat.getInstance(new Locale("pt", "BR"));

		        formatador.setMinimumFractionDigits(1);

		        formatador.setMaximumFractionDigits(1);
		        System.out.println("media = " + formatador.format(media));
		    
		        for (int h=0; h<notas.size(); h++){
		        	
		        	  System.out.println(xxx.get(h) +  " = " + formatador.format(notas.get(h)));
		             }
		        }
		       
	}


