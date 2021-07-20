public class LDP7251 {
  public static void main(String[] args) {
    int i = 0; // declaração da variável de iteração
    laco: while (i < 100) { // condição de execução do laço
            System.out.println(i); // imprime o valor de "i"
            if (i > 100) {
                break laco; // quebra o laço
            }
            i += 2; // incremento de 2 em 2
    }
  }
}
