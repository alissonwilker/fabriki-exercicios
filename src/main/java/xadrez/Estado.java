package xadrez;

import java.util.Set;

import xadrez.movimentos.RoqueDto;
import xadrez.pecas.Peca;
import xadrez.pecas.Peca.Cor;

public class Estado {
    private int contadorMovimentosSemCapturaOuMovimentoPeao;
    private int contadorJogadasCompletas;
    private boolean damaPretaCapturada = true;
    private boolean damaBrancaCapturada = true;
    private boolean roqueAlaReiBrancoPossivel = true;
    private boolean roqueAlaDamaBrancaPossivel = true;
    private boolean roqueAlaReiPretoPossivel = true;
    private boolean roqueAlaDamaPretaPossivel = true;
    private String idCasaPeaoEnPassant;
    private String idCasaReiBranco = null;
    private String idCasaReiPreto = null;
    private String idCasaOrigem;
    private String idCasaDestino;
    private String posicaoAtual;
    private Cor turno;
    private Situacao situacao;
    private String ultimoMovimento = null;

    private Peca peaoEnPassant;
    private Peca pecaOrigem;
    private Peca pecaDestino;
    private RoqueDto roque;
    private Set<String> casasQueAmeacamRei;

    public int getContadorMovimentosSemCapturaOuMovimentoPeao() {
        return contadorMovimentosSemCapturaOuMovimentoPeao;
    }

    public void setContadorMovimentosSemCapturaOuMovimentoPeao(int contadorMovimentosSemCapturaOuMovimentoPeao) {
        this.contadorMovimentosSemCapturaOuMovimentoPeao = contadorMovimentosSemCapturaOuMovimentoPeao;
    }

    public boolean isDamaPretaCapturada() {
        return damaPretaCapturada;
    }

    public void setDamaPretaCapturada(boolean damaPretaCapturada) {
        this.damaPretaCapturada = damaPretaCapturada;
    }

    public boolean isDamaBrancaCapturada() {
        return damaBrancaCapturada;
    }

    public void setDamaBrancaCapturada(boolean damaBrancaCapturada) {
        this.damaBrancaCapturada = damaBrancaCapturada;
    }

    public boolean isRoqueAlaReiBrancoPossivel() {
        return roqueAlaReiBrancoPossivel;
    }

    public void setRoqueAlaReiBrancoPossivel(boolean roqueAlaReiBrancoPossivel) {
        this.roqueAlaReiBrancoPossivel = roqueAlaReiBrancoPossivel;
    }

    public boolean isRoqueAlaDamaBrancaPossivel() {
        return roqueAlaDamaBrancaPossivel;
    }

    public void setRoqueAlaDamaBrancaPossivel(boolean roqueAlaDamaBrancaPossivel) {
        this.roqueAlaDamaBrancaPossivel = roqueAlaDamaBrancaPossivel;
    }

    public boolean isRoqueAlaReiPretoPossivel() {
        return roqueAlaReiPretoPossivel;
    }

    public void setRoqueAlaReiPretoPossivel(boolean roqueAlaReiPretoPossivel) {
        this.roqueAlaReiPretoPossivel = roqueAlaReiPretoPossivel;
    }

    public boolean isRoqueAlaDamaPretaPossivel() {
        return roqueAlaDamaPretaPossivel;
    }

    public void setRoqueAlaDamaPretaPossivel(boolean roqueAlaDamaPretaPossivel) {
        this.roqueAlaDamaPretaPossivel = roqueAlaDamaPretaPossivel;
    }

    public String getIdCasaPeaoEnPassant() {
        return idCasaPeaoEnPassant;
    }

    public void setIdCasaPeaoEnPassant(String idCasaPeaoEnPassant) {
        this.idCasaPeaoEnPassant = idCasaPeaoEnPassant;
    }

    public String getIdCasaReiBranco() {
        return idCasaReiBranco;
    }

    public void setIdCasaReiBranco(String idCasaReiBranco) {
        this.idCasaReiBranco = idCasaReiBranco;
    }

    public String getIdCasaReiPreto() {
        return idCasaReiPreto;
    }

    public void setIdCasaReiPreto(String idCasaReiPreto) {
        this.idCasaReiPreto = idCasaReiPreto;
    }

    public String getIdCasaOrigem() {
        return idCasaOrigem;
    }

    public void setIdCasaOrigem(String idCasaOrigem) {
        this.idCasaOrigem = idCasaOrigem;
    }

    public String getIdCasaDestino() {
        return idCasaDestino;
    }

    public void setIdCasaDestino(String idCasaDestino) {
        this.idCasaDestino = idCasaDestino;
    }

    public String getPosicaoAtual() {
        return posicaoAtual;
    }

    public void setPosicaoAtual(String posicaoAtual) {
        this.posicaoAtual = posicaoAtual;
    }

    public Cor getTurno() {
        return turno;
    }

    public void setTurno(Cor turno) {
        this.turno = turno;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public Peca getPeaoEnPassant() {
        return peaoEnPassant;
    }

    public void setPeaoEnPassant(Peca peaoEnPassant) {
        this.peaoEnPassant = peaoEnPassant;
    }

    public Peca getPecaOrigem() {
        return pecaOrigem;
    }

    public void setPecaOrigem(Peca pecaOrigem) {
        this.pecaOrigem = pecaOrigem;
    }

    public Peca getPecaDestino() {
        return pecaDestino;
    }

    public void setPecaDestino(Peca pecaDestino) {
        this.pecaDestino = pecaDestino;
    }

    public RoqueDto getRoque() {
        return roque;
    }

    public void setRoque(RoqueDto roque) {
        this.roque = roque;
    }

    public Set<String> getCasasQueAmeacamRei() {
        return casasQueAmeacamRei;
    }

    public void setCasasQueAmeacamRei(Set<String> casasQueAmeacamRei) {
        this.casasQueAmeacamRei = casasQueAmeacamRei;
    }
    
    public int getContadorJogadasCompletas() {
        return contadorJogadasCompletas;
    }

    public void setContadorJogadasCompletas(int contadorJogadasCompletas) {
        this.contadorJogadasCompletas = contadorJogadasCompletas;
    }

    public String getUltimoMovimento() {
        return ultimoMovimento;
    }

    public void setUltimoMovimento(String ultimoMovimento) {
        this.ultimoMovimento = ultimoMovimento;
    }

}
