import java.util.Scanner;

public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);
		public static void main(String[] args) {
		int num, ver = 1, maior = 0;
			laco1:while (ver != 0){
				maior = entrada.nextInt();
				for (int i = 0; i <= 3; i++) {
					num = entrada.nextInt();
					if (num != 0) {
						if (num >= maior) {
							maior = num;
						}
					}
					else if (num == 0) {
						ver = 0;
						maior = 0;
						break laco1;
					}
				}		
				System.out.println("maior = "+ maior);
			}
			System.out.println("maior = "+ maior);
		}
	
}
