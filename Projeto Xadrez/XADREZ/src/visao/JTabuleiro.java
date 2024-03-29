package visao;

import javax.swing.JPanel;
import javax.swing.text.AttributeSet.ColorAttribute;

import modelo.Peca;
import modelo.Tabuleiro;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JTabuleiro extends JPanel implements MouseListener{

    private Tabuleiro tabuleiro;

    public JTabuleiro(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        this.desenhaTabuleiro();
    }

    public void desenhaTabuleiro() {
        this.removeAll();
        this.setLayout(new GridLayout(8,8));
        for (Integer i = 0; i < 8; i++) {
            for (Integer j = 0; j < 8; j++) {
                JCelula jCelula;
                Peca peca = this.tabuleiro.getPeca(i, j);
                if (peca == null) {
                    jCelula = new JCelula(i, j);
                } else {
                    jCelula = new JCelula(new JPeca(peca));
                }
                if ((i + j) % 2 == 0) {
                    jCelula.setBackground(Color.WHITE);
                } else {
                    jCelula.setBackground(Color.BLUE);
                }
                this.add(jCelula);
                jCelula.addMouseListener(this);
            }
        }
        this.revalidate();
    }

   public Tabuleiro getTabuleiro() {
       return this.tabuleiro;
   }

    @Override
    public void mouseClicked(MouseEvent e) {
         JCelula jCelula = (JCelula) e.getSource();
         this.tabuleiro.realizaJogada(jCelula.getLinha(), jCelula.getColuna());
         this.desenhaTabuleiro();
    }

    @Override
    public void mousePressed(MouseEvent e) {
   
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
