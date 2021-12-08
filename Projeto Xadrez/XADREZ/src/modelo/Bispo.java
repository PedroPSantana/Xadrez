package modelo;

public class Bispo extends Peca {

    public Bispo(EnumCor cor, Integer linha, Integer coluna) {
        super(cor, linha, coluna, "D:/Projeto Xadrez/XADREZ/src/figs/BISPO" + cor + ".gif");
    }

    public Bispo(EnumCor cor, Integer linha, Integer coluna, String imagem) {
        super(cor, linha, coluna, imagem);
    }

    @Override
    public Boolean validaMovimento(Integer linhaDestino, Integer colunaDestino) {
        return true;
    }

}
