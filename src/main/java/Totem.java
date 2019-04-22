import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Totem {

	/**
	 * Constante que indica o prefixo das senhas normais/nÃ£o prioritÃ¡rias.
	 */
	public static final String PREFIXO_SENHA_NORMAL = "N";

	/**
	 * Constante que indica o prefixo das senhas prioritÃ¡rias.
	 */
	public static final String PREFIXO_SENHA_PRIORIDADE = "P";

	private static Totem instance;
	private List<Senha> filaNormal;
	private List<Senha> filaPrioridade;

	private Totem() {
		this.filaNormal = new ArrayList<Senha>();
		this.filaPrioridade = new ArrayList<Senha>();
	}

	/**
	 * Retorna uma instÃ¢ncia Ãºnica de Totem.
	 * 
	 * @return uma instÃ¢ncia Ãºnica de Totem.
	 */
	public static Totem getInstance() {
		if (instance == null) {
			instance = new Totem();
		}

		return instance;
	}

	/**
	 * Reinicia o Totem, limpando/zerando todas as filas que ele gerencia.
	 */
	public void reiniciar() {
	}

	/**
	 * Gera e adiciona no final da estrutura de dados correspondente uma nova senha
	 * de atendimento que pode ser prioritÃ¡ria se o valor de prioridade for
	 * <b>true</b>, ou nÃ£o prioritÃ¡ria se o valor de prioridade for <b>false</b>.
	 * 
	 * @param prioridade o parÃ¢metro que indica se a senha que serÃ¡ gerada Ã©
	 *                   prioritÃ¡ria ou nÃ£o.
	 * @return a senha gerada.
	 */
	public Senha gerarSenha(boolean prioridade) {
           
		return null;
	}

	private Senha gerarSenhaPrioridade() {
            Scanner senha = new Scanner(System.in);
            Senha scan = new Senha();
           String[] letras ={"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
            String b = "";
            System.out.print("Digite a  senha:");
            int num = scan.nexInt();
            for(int i = 0; i <num; i++){
                int a = scan.nextInt(letras.length);
                b+=letras[a];
            }
            
            System.out.print("Senha gerada:" + b);
            
            String senhaString = Totem.PREFIXO_SENHA_PRIORIDADE + (this.filaPrioridade.size() + 1);
		return new Senha(senhaString, true);
	}

	private Senha gerarSenhaNormal() {
            
                  String[] carct ={"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
                  
                  String senha="";
                  
                  for(int i=0; i<10; i++){
                      int j = (int) (Math.random()*carct.length);
                      senha += carct[j];
                  }
                  
                  System.out.println("Senha gerada:" +senha);
                  
		String senhaString = Totem.PREFIXO_SENHA_NORMAL + (this.filaNormal.size() + 1);
		return new Senha(senhaString, false);
	}

	/**
	 * Chama a prÃ³xima senha para atendimento. O critÃ©rio de ordem de chamada da
	 * senha se define por: enquanto a fila de prioridade tiver senhas ainda nÃ£o
	 * atendidas, a senha retornada serÃ¡ da fila de prioridade. Se a fila de
	 * prioridade nÃ£o tiver senhas ainda nÃ£o atendidas, ou seja, se estiver vazia, a
	 * senha retornada serÃ¡ da fila normal.
	 * 
	 * @return a senha que serÃ¡ atendida.
	 */
	public Senha chamarSenha() {
           int qtdeCaracteres = 8;
            String[] carct ={"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		
            StringBuilder senha = new StringBuilder();

           for(int i=0; i<qtdeCaracteres; i++){
                int posicao = (int) (Math.random() * caracteres.lenght);
                 senha.append(caracteres[posicao]);
           }
           
         
              
           
            return null;
	}

	/**
	 * Apenas verifica a prÃ³xima senha que serÃ¡ atendida.
	 * 
	 * @return a prÃ³xima senha que serÃ¡ atendida.
	 */
	public Senha verificarProximaSenha() {
            
            LinkList<String> fila;
            String senha;
            
            if(contador.equals(3) || prioritaria.isEmpty()){
                fila = normal;
                contador = 0;
                
            }else {
                fila = prioritaria;
                contador++;
            }
            senha = fila.removeFist();
            
            
		return null;
	}

	/**
	 * Retorna o tamanho da fila de prioridade.
	 * 
	 * @return o tamanho da fila de prioridade.
	 */
	public Integer getTamanhoFilaPrioridade() {
		return null;
	}

	/**
	 * Retorna o tamanho da fila normal.
	 * 
	 * @return o tamanho da fila normal.
	 */
	public Integer getTamanhoFilaNormal() {
            
            return this.filaNormal.size();
		
	}

	public List<Senha> getFilaNormal() {
		return filaNormal;
	}

	public void setFilaNormal(List<Senha> filaNormal) {
		this.filaNormal = filaNormal;
	}

	public List<Senha> getFilaPrioridade() {
		return filaPrioridade;
	}

	public void setFilaPrioridade(List<Senha> filaPrioridade) {
		this.filaPrioridade = filaPrioridade;
	}

}
