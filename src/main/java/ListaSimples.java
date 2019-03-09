import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListaSimples {
    

        private List<Integer> lista;
        private ArrayList fila;
       

	/**
	 * Constra uma ListaSimples de números inteiros, iniciando o atributo lista com
	 * uma lista vazia.
	 */
	public ListaSimples() {
	
         
         
        }
        

	/**
	 * Insere um número inteiro no fim da lista.
	 * 
	 * @param valor O número inteiro a ser inserido.
	 */
	public void insere(Integer valor) {
            
            Collection<String> num = new Arraylist();
            
            num.add("10");
            num.add("30");
            num.add("7");
            num.add("25");
            num.add("9");
            
            System.out.println("Lista de números:" + num);
            
	}

	/**
	 * Insere um número inteiro no início da lista.
	 * 
	 * @param valor O número inteiro a ser inserido.
	 */
	public void insereInicio(Integer valor) {
            
            Collection<String> num = new Arraylist();
            
            num.add("7");
            num.add("9");
            num.add("10");
            num.add("25");
            num.add("30");
            
            System.out.println("Lista de números" + num);
            
                        
	}

	/**
	 * Insere um número inteiro no Indice especificado.
	 * 
	 * @param valor  O nÃºmero inteiro a ser inserido.
	 * @param indice O Ã­ndice especificado.
	 */
	public void insereIndice(Integer valor, int indice) {
            
            Collection<String> num = new Arraylist();
            
            num.add("25");
            
            System.out.println("Lista de números" + num);
	}

	/**
	 * Remove um número inteiro da lista.
	 * 
	 * @param valor O valor a ser removido.
	 */
	public void remove(Integer valor) {
            
            Collection<Integer> fila = new ArrayList();
            
                fila.add(10);
                fila.add(25);
                
                System.out.println("Valores da fila" + fila);
                
                fila.remove(25);
                
                System.out.println("Valores atualizados da fila" + fila);
                    
       }

	/**
	 * Remove o número inteiro localizado no índice especificado.
	 * 
	 * @param valor O Ã­ndice do nÃºmero inteiro a ser removido.
	 */
	public void removeIndice(int indice) {
            
            fila.remove(25);
            
            System.out.println("Lista de números" + fila);
	}

	/**
	 * Verifica se um número está¡ presente na lista.
	 * 
	 * @param valor O nÃºmero a ser verificado.
	 * @return true se o nÃºmero estiver presente.
	 */
	public boolean existe(Integer valor) {
           
            Collection<String> num = new Arraylist();
            
            num.add("30");
            num.add("7");
            num.add("25");
            num.add("9");
            num.add("34");
            
            System.out.println("Contém o número 34?" + num);
            System.out.println("Lista de números" + num);
            
            
            return false;
            
                    
                    
	}
        

	/**
	 * Recupera o número localizado no indice especificado.
	 * 
	 * @param indice O indice especificado.
	 * @return O nÃºmero localizado no Ã­ndice especificado.
	 */
	public Integer recuperar(int indice) {
            
           Arraylist  num = new Arraylist();
            
            
            
             num.add("34");
             
             int i;
             
             System.out.println("Percorrendo o ArrayList(Usando o indice)\n");
             
             int n = num.size();
             for(i=0; i<n;i++){
                 System.out.println("Posisão %d- %s\n",i,num.get(i));
             }
              
             
            return null;
            
                           
	}

	/**
	 * Recupera o indice de um número inteiro na lista.
	 * 
	 * @param valor O número inteiro a ser pesquisado.
	 * @return O indice do elemento, caso ele esteja presente na lista. -1, caso nÃ£o esteja presente.
	 */
	public Integer recuperarPosicao(Integer valor) {
            
            
            Arraylist  num = new Arraylist();
            
            
            
             num.add("34");
             
             int i;
             
             System.out.println("Percorrendo o ArrayList(Usando o indice)\n");
             
             int n = num.size();
             for(i=0; i<n;i++){
                 System.out.println("Posisão %d- %s\n",i,num.get(i));
                   
                     
                     
	}
            return null;
        }

	/**
	 * Recupera o tamanho da lista.
	 * @return
	 */
	public int recuperarTamanho() {
            
            int tamanho;
            int[] ArrayList = {7,9,10,25,30};
            tamanho = ArrayList.length;
            
            for(int i = 0; i<ArrayList.length;i++){
                
                System.out.println("Lista de números: \d\n" + ArrayList[i]);
            }
            
            System.out.println("Tamanho do ArrayList: %d" + tamanho);
        
            
            
                   return tamanho;
            
	}

	/**
	 * Representação da lista em uma String.
     * @return 
	 */
        @Override
        
	public String toString() {
            
            
            ArrayList lista = new ArrayList();
            
            String lista = lista.next();
            
            if(lista.startsWith("30"))
                
                        
                     return null;
            return null;
	}
        

    private static class Arraylist implements Collection<String> {

        public Arraylist() {
            
        }

        @Override
        public int size() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean isEmpty() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean contains(Object o) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Iterator<String> iterator() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Object[] toArray() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public <T> T[] toArray(T[] ts) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean add(String e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean remove(Object o) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean containsAll(Collection<?> clctn) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean addAll(Collection<? extends String> clctn) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean removeAll(Collection<?> clctn) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean retainAll(Collection<?> clctn) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void clear() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
