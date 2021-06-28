import  java.util.Scanner;


public class LDP7141 {
	 
                      private static Scanner entrada = new Scanner(System.in);
	
	
	              public static void main(String[] args) {
		      
		                          int x = entrada.nextInt();
		                          int multa;
		                          int excedente;
		                          if(x <= 50)  {
			                                  System.out.println("excedente = 0");
			                                  System.out.println("multa = 0");
			
	                                  }     else {	
			                                       multa = (-50 + x) * 4;
			                                       excedente = (-50 + x);
	                                                       System.out.println("excedente = "+ excedente);    
	                                                       System.out.println("multa = " + multa);
	           	  	}
      
			}

              }
