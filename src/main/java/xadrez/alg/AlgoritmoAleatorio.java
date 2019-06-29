package xadrez.alg;

import java.util.List;

import xadrez.Xadrez;
import xadrez.pecas.Peca;

public class AlgoritmoAleatorio implements AlgoritmoXadrez {
    private Integer profundidade = 0;

    public Integer getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(Integer profundidade) {
        this.profundidade = profundidade;
    }

    @Override
    public void setParametros(Object... params) {
        if (params != null && params.length == 1 && params[0] != null) {
            profundidade = (Integer) params[0];
        }
    }

    @Override
    public String procurarMelhorMovimento(Xadrez xadrez) {
        return procurarMovimentoAleatorio(xadrez);
    }
    
    protected String procurarMovimentoAleatorio(Xadrez xadrez) {
        List<Peca> pecasDoTurno = xadrez.recuperarPecasDoTurno();
        
        String movimentoValido = null;
        while (movimentoValido == null) {
            Peca peca = (Peca)escolherAleatoriamente(pecasDoTurno);
            List<String> movimentosValidos = peca.getMovimentosValidos(xadrez);
            if (movimentosValidos.size() > 0) {
                movimentoValido = (String)escolherAleatoriamente(movimentosValidos);
            }
        }
        
        return movimentoValido;
    }

    protected Object escolherAleatoriamente(List<? extends Object> lista) {
        int numeroAleatorio = (int) (Math.random() * lista.size());
        Object objeto = lista.get(numeroAleatorio);
        return objeto;
    }
}
