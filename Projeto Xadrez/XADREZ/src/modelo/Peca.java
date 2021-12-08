package modelo;

public abstract class Peca {

    private EnumCor cor;
    private Integer linha, coluna;
    private String imagem;
    private Boolean eliminada = false;
    private Boolean selecionada = false;
    private Tabuleiro tabuleiro;

    public Peca(EnumCor cor, Integer linha, Integer coluna, String imagem) {
        this.cor = cor;
        this.linha = linha;
        this.coluna = coluna;
        this.imagem = imagem;
    }

    public abstract Boolean validaMovimento(Integer linhaDestino, Integer colunaDestino);

    public Integer getLinha() {
        return this.linha;
    }

    public void setLinha(Integer linha) {
        this.linha = linha;
    }

    public Integer getColuna() {
        return this.coluna;
    }

    public void setColuna(Integer coluna) {
        this.coluna = coluna;
    }

    public void setTabuleiro(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public Tabuleiro getTabuleiro() {
        return this.tabuleiro;
    }

    public Boolean isSelecionada() {
        return this.selecionada;
    }

    public void setSelecionada(Boolean selecionada) {
        this.selecionada = selecionada;
    }

    public String getImagem() {
        return this.imagem;
    }

    public EnumCor getCor() {
        return this.cor;
    }

}