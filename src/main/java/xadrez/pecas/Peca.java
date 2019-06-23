package xadrez.pecas;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import xadrez.Xadrez;
import xadrez.movimentos.Movimento;

/**
 * Representa uma peca do tabuleiro.
 *
 */
@JsonDeserialize(using = PecaDeserializer.class)
public abstract class Peca {
    private static final String PNG = ".png";
    private Tipo tipo;
    protected Cor cor;
    protected List<Movimento> movimentos = new ArrayList<>();
    private String idCasa;
    protected static final String IMAGES_DIR = "src/main/resources/img/";

    public enum Tipo {
        Peao, Torre, Cavalo, Bispo, Dama, Rei;
    }

    public enum Cor {
        BRANCA, PRETA;
    }

    public Peca(Tipo tipo, Cor cor, String idCasa) {
        this.tipo = tipo;
        this.cor = cor;
        this.idCasa = idCasa;
    }

    protected void adicionar(Movimento movimento) {
        movimentos.add(movimento);
    }

    public Tipo getTipo() {
        return tipo;
    }

    /**
     * Recupera a cor da peca (branca ou preta).
     * 
     * @return a cor da peca.
     */
    public Cor getCor() {
        return cor;
    }

    public List<Movimento> getMovimentos() {
        return movimentos;
    }
    
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public void setMovimentos(List<Movimento> movimentos) {
        this.movimentos = movimentos;
    }

    @Override
    public String toString() {
        String representacao = tipo.name().substring(0, 1);
        return cor == Cor.BRANCA ? representacao.toUpperCase() : representacao.toLowerCase();
    }

    public boolean validarMovimento(String idCasaDestino, Xadrez xadrez) {
        if (xadrez.getCasasQueAmeacamRei().size() > 1 && getTipo() != Tipo.Rei) {
            return false;
        }

        for (Movimento movimento : movimentos) {
            if (movimento.validar(getIdCasa(), idCasaDestino, xadrez)) {
                return true;
            }
        }

        return false;
    }

    public boolean verificarAmeaca(Cor corAmeacada, String idCasaDestino, Xadrez xadrez) {
        Peca pecaDestino = xadrez.get(idCasaDestino);

        if ((pecaDestino != null && pecaDestino.getCor() == getCor())
            || (corAmeacada != null && corAmeacada == getCor())) {
            return false;
        }

        for (Movimento movimento : movimentos) {
            if (movimento.validarDeslocamento(getIdCasa(), idCasaDestino, xadrez)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Recupera os movimentos validos de uma peca.
     * 
     * @param xadrez
     *            O jogo de xadrez.
     * @return A lista de movimentos validos da peca a partir da casa de origem. Um exemplo de movimento
     *         pode ser a String "A7B8", em que "A7" representa a casa de origem e "B8" representa a
     *         casa de destino da peca.
     */
    public List<String> getMovimentosValidos(Xadrez xadrez) {
        if (xadrez.getCasasQueAmeacamRei().size() > 1 && getTipo() != Tipo.Rei) {
            return new ArrayList<>();
        }

        List<String> movimentosValidos = new ArrayList<>();
        for (Movimento movimento : movimentos) {
            movimentosValidos.addAll(movimento.getMovimentosValidos(getIdCasa(), xadrez));
        }

        return movimentosValidos;
    }

    public List<String> getCasasIntermediarias(String idCasaDestino, Xadrez xadrez) {
        List<String> casasIntermediarias = new ArrayList<>();
        for (Movimento movimento : movimentos) {
            casasIntermediarias.addAll(movimento.getCasasIntermediarias(getIdCasa(), idCasaDestino, xadrez));
        }
        return casasIntermediarias;
    }

    public static Peca criar(String representacaoPeca, String idCasa) {
        switch (representacaoPeca) {
        case "t":
            return new Torre(Cor.PRETA, idCasa);
        case "c":
            return new Cavalo(Cor.PRETA, idCasa);
        case "b":
            return new Bispo(Cor.PRETA, idCasa);
        case "d":
            return new Dama(Cor.PRETA, idCasa);
        case "r":
            return new Rei(Cor.PRETA, idCasa);
        case "p":
            return new Peao(Cor.PRETA, idCasa);
        case "T":
            return new Torre(Cor.BRANCA, idCasa);
        case "C":
            return new Cavalo(Cor.BRANCA, idCasa);
        case "B":
            return new Bispo(Cor.BRANCA, idCasa);
        case "D":
            return new Dama(Cor.BRANCA, idCasa);
        case "R":
            return new Rei(Cor.BRANCA, idCasa);
        case "P":
            return new Peao(Cor.BRANCA, idCasa);
        }
        return null;
    }

    public void setIdCasa(String idCasa) {
        this.idCasa = idCasa;
    }

    public String getIdCasa() {
        return this.idCasa;
    }

    public abstract String getFenCode();

    public String getImagem() {
        if (cor == Cor.BRANCA) {
            return IMAGES_DIR + "w" + getFenCode().toUpperCase() + PNG;
        } else {
            return IMAGES_DIR + "b" + getFenCode().toUpperCase() + PNG;
        }
    }

    public static Peca criar(Tipo tipo, Cor cor, String idCasa) {
        switch (tipo) {
        case Peao:
            return Peca.criar(cor == Cor.BRANCA ? "P" : "p", idCasa);
        case Torre:
            return Peca.criar(cor == Cor.BRANCA ? "T" : "t", idCasa);
        case Cavalo:
            return Peca.criar(cor == Cor.BRANCA ? "C" : "c", idCasa);
        case Bispo:
            return Peca.criar(cor == Cor.BRANCA ? "B" : "b", idCasa);
        case Dama:
            return Peca.criar(cor == Cor.BRANCA ? "D" : "d", idCasa);
        case Rei:
            return Peca.criar(cor == Cor.BRANCA ? "R" : "r", idCasa);
        }
        return null;
    }

}
