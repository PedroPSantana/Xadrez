package visao;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import java.awt.Color;

public class JCelula extends JPanel {

    private JPeca jPeca;
    private Integer linha, coluna;

    public JCelula(Integer linha, Integer coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    public JCelula(JPeca jPeca) {
        this.jPeca = jPeca;
        this.linha = jPeca.getPeca().getLinha();
        this.coluna = jPeca.getPeca().getColuna();
        this.add(jPeca);
        if ((jPeca.getPeca() != null) && jPeca.getPeca().isSelecionada()) {
            this.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
        }
    }

     public int getLinha() {
         return this.linha;
     }

     public int getColuna() {
        return this.coluna;
     }

}
