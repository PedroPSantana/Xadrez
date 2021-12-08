package modelo;

public class Rainha extends Peca {

    public Rainha(EnumCor cor, Integer linha, Integer coluna) {
        super(cor, linha, coluna, "D:/Projeto Xadrez/XADREZ/src/figs/RAINHA" + cor + ".gif");
    }

    public Rainha(EnumCor cor, Integer linha, Integer coluna, String imagem) {
        super(cor, linha, coluna, imagem);
    }

    @Override
    public Boolean validaMovimento(Integer linhaDestino, Integer colunaDestino) {
        return true;
    }

}
