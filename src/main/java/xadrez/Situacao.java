package xadrez;

/**
 * Representa as possiveis situacoes do jogo de Xadrez.
 *
 */
public enum Situacao {
    Xeque_Brancas("Brancas em xeque"), Xeque_Pretas("Pretas em xeque"), Xeque_Mate_Brancas(
        "Brancas em xeque-mate"), Xeque_Mate_Pretas("Pretas em xeque-mate"), Empate, Em_Andamento("Em andamento");

    private String descricao;

    private Situacao() {
    }

    private Situacao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao != null ? descricao : name();
    }
}
