package modelo;

public class Torre extends Peca {

    public Torre(EnumCor cor, Integer linha, Integer coluna) {
        super(cor, linha, coluna, "D:/Projeto Xadrez/XADREZ/src/figs/TORRE" + cor + ".gif");
    }
    
    public Torre(EnumCor cor, Integer linha, Integer coluna, String imagem) {
        super(cor, linha, coluna, imagem);
    }

    @Override
    public Boolean validaMovimento(Integer linhaDestino, Integer colunaDestino) {
        return true;
    }

}
