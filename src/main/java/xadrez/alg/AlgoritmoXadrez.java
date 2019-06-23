package xadrez.alg;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import xadrez.Xadrez;

@JsonDeserialize(using = AlgoritmoDeserializer.class)
public interface AlgoritmoXadrez {
    default public void setParametros(Object... params) {
        // nao faz nada nessa implementacao default
    }
    
    default public Integer getProfundidade() {
        return 0;
    }

    default public void setProfundidade(Integer profundidade) {
        // nao faz nada nessa implementacao default
    }

    
    public String procurarMelhorMovimento(Xadrez xadrez);
}
