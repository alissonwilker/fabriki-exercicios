import java.util.Scanner;

public class LDP7251 {
	private static Scanner entrada = new Scanner(System.in);
		public static void main(String[] args) {
		int num, ver = 1, maior;
			laco1:while (ver != 0){
				maior = 0;
				for (int i = 0; i <= 4; i++) {
					System.out.print("Oi! Digite o "+(i+1)+"° número:");
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
			if (ver == 0) {
				maior = 0;
				System.out.println("maior = "+ maior);

			}
		}
	
}
