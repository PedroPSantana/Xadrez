package modelo;

public class Rei extends Peca {

    public Rei(EnumCor cor, Integer linha, Integer coluna) {
        super(cor, linha, coluna, "D:/Projeto Xadrez/XADREZ/src/figs/REI" + cor + ".gif");
    }
    public Rei(EnumCor cor, Integer linha, Integer coluna, String imagem) {
        super(cor, linha, coluna, imagem);
    }

    @Override
    public Boolean validaMovimento(Integer linhaDestino, Integer colunaDestino) {
        return true;
    }

}
