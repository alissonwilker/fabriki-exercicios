public class Fatorial {

	public static void main(String[] args) {
        int num, fat = 1;
        int cont = 1;

        do{           
            num = ent.nextInt();
            
            for(int i = 1;i <= num; i++){
                fat = fat * i;
            }
            
            System.out.println( num + " = " + fat);
            cont++;
            
        }
        	while(cont < 2);
    	
		}

	}
