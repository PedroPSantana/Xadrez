package modelo;

public class Cavalo extends Peca {

    public Cavalo(EnumCor cor, Integer linha, Integer coluna) {
        super(cor, linha, coluna, "D:/Projeto Xadrez/XADREZ/src/figs/CAVALO" + cor + ".gif");
    }
    public Cavalo(EnumCor cor, Integer linha, Integer coluna, String imagem) {
        super(cor, linha, coluna, imagem);
    }

    @Override
    public Boolean validaMovimento(Integer linhaDestino, Integer colunaDestino) {
        return true;
    }

}
