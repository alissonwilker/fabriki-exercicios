package xadrez;

/**
 * Representa as possiveis situacoes do jogo de Xadrez.
 *
 */
public enum Situacao {
    Brancas_em_xeque("Brancas em xeque"), Pretas_em_xeque("Pretas em xeque"), Brancas_em_xeque_mate(
        "Brancas em xeque-mate"), Pretas_em_xeque_mate("Pretas em xeque-mate"), Empate, Em_andamento("Em andamento");

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
